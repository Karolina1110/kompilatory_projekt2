// Generated from Demo.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DemoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DemoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DemoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DemoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(DemoParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(DemoParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(DemoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(DemoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doFunc}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDoFunc(DemoParser.DoFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doFunc}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDoFunc(DemoParser.DoFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignTabElem}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignTabElem(DemoParser.AssignTabElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignTabElem}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignTabElem(DemoParser.AssignTabElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DemoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DemoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DemoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DemoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printTabElem}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintTabElem(DemoParser.PrintTabElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printTabElem}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintTabElem(DemoParser.PrintTabElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(DemoParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(DemoParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#block2}.
	 * @param ctx the parse tree
	 */
	void enterBlock2(DemoParser.Block2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#block2}.
	 * @param ctx the parse tree
	 */
	void exitBlock2(DemoParser.Block2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(DemoParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(DemoParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(DemoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(DemoParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DemoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DemoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(DemoParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(DemoParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DemoParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DemoParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#blockfunc}.
	 * @param ctx the parse tree
	 */
	void enterBlockfunc(DemoParser.BlockfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#blockfunc}.
	 * @param ctx the parse tree
	 */
	void exitBlockfunc(DemoParser.BlockfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intreal}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterIntreal(DemoParser.IntrealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intreal}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitIntreal(DemoParser.IntrealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterString(DemoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitString(DemoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tab0}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterTab0(DemoParser.Tab0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tab0}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitTab0(DemoParser.Tab0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterReturn(DemoParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitReturn(DemoParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle(DemoParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle(DemoParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(DemoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(DemoParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DemoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DemoParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSub(DemoParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSub(DemoParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(DemoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(DemoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code val}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterVal(DemoParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code val}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitVal(DemoParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterId(DemoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitId(DemoParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code element}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterElement(DemoParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code element}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitElement(DemoParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(DemoParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(DemoParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(DemoParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(DemoParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(DemoParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(DemoParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(DemoParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(DemoParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(DemoParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(DemoParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#cnt}.
	 * @param ctx the parse tree
	 */
	void enterCnt(DemoParser.CntContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#cnt}.
	 * @param ctx the parse tree
	 */
	void exitCnt(DemoParser.CntContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(DemoParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(DemoParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#tabelem}.
	 * @param ctx the parse tree
	 */
	void enterTabelem(DemoParser.TabelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#tabelem}.
	 * @param ctx the parse tree
	 */
	void exitTabelem(DemoParser.TabelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DemoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DemoParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#valuet}.
	 * @param ctx the parse tree
	 */
	void enterValuet(DemoParser.ValuetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#valuet}.
	 * @param ctx the parse tree
	 */
	void exitValuet(DemoParser.ValuetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(DemoParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(DemoParser.TabContext ctx);
}