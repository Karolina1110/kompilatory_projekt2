
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;


enum VarType{ INT, REAL, STRING, BOOL, UNKNOWN }

enum Var2Type {VAR, TAB}

class Value{
    public String name;
    public VarType type;
    public Var2Type type2;
    public Integer size;
    public Boolean global;
    public Value( String name, VarType type, Var2Type type2, Integer size, Boolean global){
        this.name = name;
        this.type = type;
        this.type2 = type2;
        this.size = size;
        this.global = global;
    }
}



public class LLVMActions extends DemoBaseListener {

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    HashMap<String, Integer> varstrlen = new HashMap();
    HashMap<String, Value> vartab = new HashMap<>();
    HashMap<String, VarType> varfunc = new HashMap<String, VarType>();
    HashMap<String, Boolean> isGlobal = new HashMap<String, Boolean>();
    //HashSet<String> names = new HashSet<String>();
    Stack<Value> stack = new Stack<Value>();
    Boolean global;
    String func;


    //@Override
    //public void exitProg(DemoParser.ProgContext ctx) {System.out.println( LLVMGenerator.generate() );}


    @Override
    public void enterProg(DemoParser.ProgContext ctx) {
        global = true;
    }

    @Override
    public void exitProg(DemoParser.ProgContext ctx) {
        LLVMGenerator.close_main();
        System.out.println( LLVMGenerator.generate() );
    }

    @Override
    public void exitAssign(DemoParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        boolean defined = false;

        if(v.type2 == Var2Type.VAR) {

            if (variables.containsKey(ID)) {
                defined = true;
                if(v.type != variables.get(ID)){
                    //error(ctx.getStart().getLine(), "This variable is already defined and has diffrent type");
                    if(v.type == VarType.INT){
//                       LLVMGenerator.fptosi( v.name );
//                       v = new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global);
                        variables.put(ID, v.type);
                        varstrlen.put(ID, v.name.length() - 1);
                        isGlobal.put(ID, v.global);
                        //LLVMGenerator.declare_i32(ID, v.global);
                    }
                    else if (v.type == VarType.REAL){
//                       LLVMGenerator.sitofp( v.name );
//                       v = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
                        variables.put(ID, v.type);
                        varstrlen.put(ID, v.name.length() - 1);
                        isGlobal.put(ID, v.global);
                        //LLVMGenerator.declare_double(ID, v.global);
                    }
                }
            }else{
                variables.put(ID, v.type);
                varstrlen.put(ID, v.name.length() - 1);
                isGlobal.put(ID, v.global);
            }

            if (v.type == VarType.INT) {
                if (defined == false) {
                    LLVMGenerator.sitofp( v.name );
                    v = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
                    //LLVMGenerator.declare_i32(ID, v.global);
                    LLVMGenerator.declare_double(ID, v.global);
                    LLVMGenerator.assign_double(ID, v.name, v.global);
                }
                else{
                    LLVMGenerator.sitofp( v.name );
                    v = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
                    //LLVMGenerator.assign_i32(ID, v.name, v.global);
                    LLVMGenerator.assign_double(ID, v.name, v.global);
                }

            }
            else if (v.type == VarType.REAL) {
                if (defined == false) {
                    LLVMGenerator.declare_double(ID, v.global);
                }
                LLVMGenerator.assign_double(ID, v.name, v.global);
            }
            else if (v.type == VarType.STRING) {
                LLVMGenerator.assign_string(ID, v.name, v.global);
            }
            else {
                error(ctx.getStart().getLine(), "variable type mismatch");
            }
        }
        else if(v.type2 == Var2Type.TAB){
            vartab.put(ID, v);
            isGlobal.put(ID, v.global);

            if (v.type == VarType.INT) {
                LLVMGenerator.declare_i32_tab(ID, v.size, v.global);
            }
            else if (v.type == VarType.REAL) {
                LLVMGenerator.declare_double_tab(ID, v.size, v.global);
            }
            else {
                error(ctx.getStart().getLine(), "tab type mismatch");
            }
        }
        else {
            error(ctx.getStart().getLine(), "assign type mismatch");
        }
    }


    @Override
    public void exitAssignTabElem(DemoParser.AssignTabElemContext ctx){
        String ID = ctx.tabelem().ID().getText();
        Value v = vartab.get(ID);

        int i = Integer.parseInt(ctx.tabelem().INT().getText());
        if (i <= v.size && i>0){

            if (v.type == VarType.INT && ctx.value().INT() != null) {
                String elem = ctx.value().INT().getText();
                LLVMGenerator.assign_i32_tab(ID, v.size, i, elem);
                //LLVMGenerator.assign_i32_tab(ID, v.size, i, elem, v.global);
            }
            else if (v.type == VarType.INT && ctx.value().INT() == null){
                error(ctx.getStart().getLine(), "tab element type mismatch, expecting int");
            }
            if (v.type == VarType.REAL && ctx.value().REAL() != null) {
                String elem = ctx.value().REAL().getText();
                LLVMGenerator.assign_double_tab(ID, v.size, i, elem);
                //LLVMGenerator.assign_double_tab(ID, v.size, i, elem, v.global);
            }
            else if (v.type == VarType.REAL && ctx.value().REAL() == null){
                error(ctx.getStart().getLine(), "tab element type mismatch, expecting real");
            }
        }
        else {
            error(ctx.getStart().getLine(), "index out of range");
        }
    }

    @Override
    public void exitValue(DemoParser.ValueContext ctx) {
        if (ctx.INT() != null) {
            stack.push(new Value(ctx.INT().getText(), VarType.INT, Var2Type.VAR, 0, global));
        }
        else if (ctx.REAL() != null) {
            stack.push(new Value(ctx.REAL().getText(), VarType.REAL, Var2Type.VAR, 0, global));
        }
        else {
            error(ctx.getStart().getLine(), "value type mismatch");
        }
    }

    @Override
    public void exitId(DemoParser.IdContext ctx){
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        Boolean glob = isGlobal.get(ID);

        if(type != null && (glob==global || (!global && glob))){
            if( type == VarType.INT ) {
                //LLVMGenerator.load_i32(ID);
                //LLVMGenerator.load_i32(ID, glob);
                LLVMGenerator.load_double(ID, glob);
                LLVMGenerator.fptosi( "%"+(LLVMGenerator.reg-1) );
                //stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global) );
                stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR,0, global));
            }
            else if( type == VarType.REAL ) {
                //LLVMGenerator.load_double(ID);
                LLVMGenerator.load_double(ID, glob);
                stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR,0, global));
            }
            else {
                error(ctx.getStart().getLine(), "value type mismatch");
            }
        }
        else {
            error(ctx.getStart().getLine(), ID+" not exist");
        }
    }

    @Override
    public void exitElement(DemoParser.ElementContext ctx){
        String ID = ctx.tabelem().ID().getText();
        Integer i = Integer.parseInt(ctx.tabelem().INT().getText());
        Value v = vartab.get(ID);
        Boolean glob = isGlobal.get(ID);

        if (i <= v.size && i>0) {
            if (v.type != null) {
                if (v.type == VarType.INT) {
                    LLVMGenerator.load_tabi32(ID, v.size, i);
                    //LLVMGenerator.load_tabi32(ID, v.size, i, glob);
                    stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global));
                }
                else if (v.type == VarType.REAL) {
                    LLVMGenerator.load_tabdouble(ID, v.size, i);
                    //LLVMGenerator.load_tabdouble(ID, v.size, i, glob);
                    stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global));
                }
                else {
                    error(ctx.getStart().getLine(), "tab element type mismatch");
                }
            } else {
                error(ctx.getStart().getLine(), ID + " not exist");
            }
        }
        else {
            error(ctx.getStart().getLine(), "index out of range");
        }
    }

    @Override
    public void exitString(DemoParser.StringContext ctx) {
        if (ctx.STRING() != null) {
            stack.push(new Value(ctx.STRING().getText(), VarType.STRING, Var2Type.VAR, 0, global));
        }
        else {
            error(ctx.getStart().getLine(), "string type mismatch");
        }
    }


    @Override
    public void exitTab(DemoParser.TabContext ctx) {
        if (ctx.TTAB() != null) {
            if(ctx.TINT() != null) {
                stack.push(new Value("", VarType.INT, Var2Type.TAB, Integer.parseInt(ctx.INT().getText()), global));
            }
            else if(ctx.TREAL() != null) {
                stack.push(new Value("", VarType.REAL, Var2Type.TAB, Integer.parseInt(ctx.INT().getText()), global));
            }
            else {
                error(ctx.getStart().getLine(), "tab type mismatch");
            }
        }
        else {
            error(ctx.getStart().getLine(), "tab error");
        }
    }

    @Override
    public void exitAdd(DemoParser.AddContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();

        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global) );
            }
            else if( v1.type == VarType.REAL ){
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
            }
            else {
                error(ctx.getStart().getLine(), "add type mismatch");
            }
        }
        else if(v1.type == VarType.INT && v2.type == VarType.REAL){
            LLVMGenerator.sitofp( v1.name );
            v1 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.add_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else if (v2.type == VarType.INT && v1.type == VarType.REAL){
            LLVMGenerator.sitofp( v2.name );
            v2 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.add_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else {
            error(ctx.getStart().getLine(), "add different types");
        }
    }

    @Override
    public void exitSub(DemoParser.SubContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.sub_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global) );
            }
            else if( v1.type == VarType.REAL ){
                LLVMGenerator.sub_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
            }
            else {
                error(ctx.getStart().getLine(), "sub type mismatch");
            }
        }
        else if(v1.type == VarType.INT && v2.type == VarType.REAL){
            LLVMGenerator.sitofp( v1.name );
            v1 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.sub_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else if (v2.type == VarType.INT && v1.type == VarType.REAL){
            LLVMGenerator.sitofp( v2.name );
            v2 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.sub_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else {
            error(ctx.getStart().getLine(), "sub different types");
        }
    }

    @Override
    public void exitMult(DemoParser.MultContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global) );
            }
            else if( v1.type == VarType.REAL ){
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
            }
            else {
                error(ctx.getStart().getLine(), "mult type mismatch");
            }
        }
        else if(v1.type == VarType.INT && v2.type == VarType.REAL){
            LLVMGenerator.sitofp( v1.name );
            v1 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.mult_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else if (v2.type == VarType.INT && v1.type == VarType.REAL){
            LLVMGenerator.sitofp( v2.name );
            v2 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.mult_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else {
            error(ctx.getStart().getLine(), "mult different types");
        }
    }

    @Override
    public void exitDiv(DemoParser.DivContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.div_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global) );
            }
            else if( v1.type == VarType.REAL ){
                LLVMGenerator.div_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
            }
            else {
                error(ctx.getStart().getLine(), "div type mismatch");
            }
        }
        else if(v1.type == VarType.INT && v2.type == VarType.REAL){
            LLVMGenerator.sitofp( v1.name );
            v1 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.div_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else if (v2.type == VarType.INT && v1.type == VarType.REAL){
            LLVMGenerator.sitofp(v2.name );
            v2 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
            LLVMGenerator.div_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
        }
        else {
            error(ctx.getStart().getLine(), "div different types");
        }
    }

    @Override
    public void exitToint(DemoParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi( v.name );
        stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global) );
    }

    @Override
    public void exitToreal(DemoParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp( v.name );
        stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global) );
    }

    @Override
    public void exitPrint(DemoParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        Value v = vartab.get(ID);
        Boolean glob = isGlobal.get(ID);

        if( type != null && (glob==global || (!global && glob))) {
            if (type == VarType.INT) {
                LLVMGenerator.load_double(ID, glob);
                LLVMGenerator.fptosi( "%"+(LLVMGenerator.reg-1) );
                //LLVMGenerator.fptosi( v.name );
                //v = new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR, 0, global);
                LLVMGenerator.printf_i32(""+(LLVMGenerator.reg-1), false);
            }
            else if (type == VarType.REAL) {
                LLVMGenerator.printf_double(ID, glob);
            }
            else if (type == VarType.STRING) {
                LLVMGenerator.printf_string(ID, varstrlen.get(ID));
            }
            else {
                error(ctx.getStart().getLine(), "print type mismatch");
            }
        }
        else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);
        }
    }

    @Override
    public void exitPrintTabElem(DemoParser.PrintTabElemContext ctx) {
        String ID = ctx.tabelem().ID().getText();
        //VarType type = variables.get(ID);
        Value v = vartab.get(ID);

        if (v.type2 == Var2Type.TAB) {
            if (v.type == VarType.INT) {
                LLVMGenerator.printf_tabi32(ID, ctx.tabelem().INT(), v.size);
            }
            else if (v.type == VarType.REAL) {
                LLVMGenerator.printf_tabdouble(ID, ctx.tabelem().INT(), v.size);
            }
            else {
                error(ctx.getStart().getLine(), "tab element type mismatch");
            }
        }
        else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);
        }
    }

    @Override
    public void exitRead(DemoParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        if (! variables.containsKey(ID)) {
            if (ctx.valuet().TINT() != null ){
                variables.put(ID, VarType.INT);
                LLVMGenerator.declare_i32(ID, global);
                LLVMGenerator.scanf_i32(ID);
            }
            else if (ctx.valuet().TREAL() != null ){
                variables.put(ID, VarType.REAL);
                LLVMGenerator.declare_double(ID, global);
                LLVMGenerator.scanf_double(ID);
            }
            else {
                error(ctx.getStart().getLine(), "read name of type mismatch");
            }
        }
        else {
            error(ctx.getStart().getLine(), ID+" already exist");
        }
    }

    @Override
    public void exitCnt(DemoParser.CntContext ctx) {
        if( ctx.ID() != null ){
            String ID = ctx.ID().getText();
            VarType type = variables.get(ID);
            Boolean glob = isGlobal.get(ID);

            if(type != null){
                if( type == VarType.INT ) {
                    //LLVMGenerator.load_i32(ID, glob);
                    //LLVMGenerator.load_i32(ID, glob);
                    //stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR,0, global));
                    LLVMGenerator.load_double(ID, glob);
                    LLVMGenerator.fptosi( "%"+(LLVMGenerator.reg-1) );
                    stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR,0, global));
                }
                else {
                    error(ctx.getStart().getLine(), "cnt type mismatch");
                }
            }
            else {
                error(ctx.getStart().getLine(), ID+" not exist");
            }

        }
        if( ctx.INT() != null ){
            stack.push(new Value(ctx.INT().getText(), VarType.INT, Var2Type.VAR, 0, global));
        }
    }


    @Override
    public void exitRep(DemoParser.RepContext ctx) {
        Value v = stack.pop();
        global = false;
        LLVMGenerator.forstart(v.name);
    }


    @Override
    public void exitBlock2(DemoParser.Block2Context ctx) {
        if( ctx.getParent() instanceof DemoParser.ForContext ){
            LLVMGenerator.forend();
            global = true;
        }
    }

    @Override
    public void exitIf(DemoParser.IfContext ctx) {
    }

    @Override
    public void enterBlockif(DemoParser.BlockifContext ctx) {
        global = false;
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitBlockif(DemoParser.BlockifContext ctx) {
        LLVMGenerator.ifend();
        global = true;
    }


    @Override
    public void exitCond(DemoParser.CondContext ctx){

        if (ctx.sign() != null) {
            Value v2 = stack.pop();
            Value v1 = stack.pop();

            if (v1.type != v2.type){
                if (v1.type == VarType.INT && v2.type == VarType.REAL){
                    LLVMGenerator.sitofp( v1.name );
                    v1 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
                }
                else if (v2.type == VarType.INT && v1.type == VarType.REAL){
                    LLVMGenerator.sitofp( v2.name );
                    v2 = new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR, 0, global);
                }
            }


            if (v1.type == VarType.INT) {
                if (ctx.sign().EQUALL() != null) {
                    LLVMGenerator.icmp_i32(v1.name, v2.name, "eq");
                } else if (ctx.sign().NOTEQUAL() != null) {
                    LLVMGenerator.icmp_i32(v1.name, v2.name, "ne");
                } else if (ctx.sign().GREATER() != null) {
                    LLVMGenerator.icmp_i32(v1.name, v2.name, "sgt");
                } else if (ctx.sign().LESS() != null) {
                    LLVMGenerator.icmp_i32(v1.name, v2.name, "slt");
                } else if (ctx.sign().GREATER_EQUAL() != null) {
                    LLVMGenerator.icmp_i32(v1.name, v2.name, "sge");
                } else if (ctx.sign().LESS_EQUAL() != null) {
                    LLVMGenerator.icmp_i32(v1.name, v2.name, "sle");
                }
            } else if (v1.type == VarType.REAL) {
                if (ctx.sign().EQUALL() != null) {
                    LLVMGenerator.fcmp_double(v1.name, v2.name, "oeq");
                } else if (ctx.sign().NOTEQUAL() != null) {
                    LLVMGenerator.fcmp_double(v1.name, v2.name, "one");
                } else if (ctx.sign().GREATER() != null) {
                    LLVMGenerator.fcmp_double(v1.name, v2.name, "ogt");
                } else if (ctx.sign().LESS() != null) {
                    LLVMGenerator.fcmp_double(v1.name, v2.name, "olt");
                } else if (ctx.sign().GREATER_EQUAL() != null) {
                    LLVMGenerator.fcmp_double(v1.name, v2.name, "oge");
                } else if (ctx.sign().LESS_EQUAL() != null) {
                    LLVMGenerator.fcmp_double(v1.name, v2.name, "ole");
                }
            }
        }



    }

//    @Override
//    public void exitParam(DemoParser.ParamContext ctx) {
//        String ID = ctx.ID().getText();
//        varfunc.add(ID);
//        func = ID;
//        LLVMGenerator.funcstart(ID);
//    }

    @Override
    public void enterFunc(DemoParser.FuncContext ctx) {
        String ID = ctx.ID().getText();

        func = ID;

        if(ctx.type().TINT() != null){
            varfunc.put(ID, VarType.INT);
            LLVMGenerator.funcstart_i32(ID);
        }
        else if (ctx.type().TREAL() != null){
            varfunc.put(ID, VarType.REAL);
            LLVMGenerator.funcstart_double(ID);
        }

        global = false;
    }

    @Override
    public void exitFunc(DemoParser.FuncContext ctx) {
        String ID = ctx.ret().ID().getText();
        //VarType type = variables.get(ID);
        //VarType type = varfunc.get(ID);

        if(ctx.type().TINT() != null){
            LLVMGenerator.funcend_i32(ID);
        }
        else if (ctx.type().TREAL() != null){
            LLVMGenerator.funcend_double(ID);
        }

        global = true;
    }

//    @Override
//    public void enterBlockfunc(Demoif( ! varfunc.contains(func) ){
////            error(ctx.getStart().getLine(), "function "+func+" not exist");
////        }
////        LLVMGenerator.load_i32( func, global );
////        LLVMGenerator.funcend();
////        //names = new HashSet<String>();
////        global = true;
// Parser.BlockfuncContext ctx) {
//        global = false;
//    }

//    @Override
//    public void exitBlockfunc(DemoParser.BlockfuncContext ctx) {
//
//    }

    @Override
    public void exitDoFunc(DemoParser.DoFuncContext ctx) {
        String ID = ctx.ID().getText();


        if (varfunc.containsKey(ID)){
            VarType type = varfunc.get(ID);
            if(type == VarType.INT){
                LLVMGenerator.doFunc_i32(ctx.ID().getText());
                stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.INT, Var2Type.VAR,0, global));
            }
            else if(type == VarType.REAL){
                LLVMGenerator.doFunc_double(ctx.ID().getText());
                stack.push(new Value("%"+(LLVMGenerator.reg-1), VarType.REAL, Var2Type.VAR,0, global));
            }
        }
        else{
            error(ctx.getStart().getLine(), "function "+ID+" not exist");
        }

    }


    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }
}