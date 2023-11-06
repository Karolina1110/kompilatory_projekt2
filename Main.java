// Intro to ANTLR+LLVM
// sawickib, 2014-04-26

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;


public class Main {
    public static void main(String[] args) throws Exception {
        //File f = new File("D:\\studia\\magisterka\\sem1\\JFiK\\projekt2_v1\\realcalc2018\\realcalc\\test.x");
        File f = new File("/mnt/d/studia/magisterka/sem1/JFiK/projekt2_v1/realcalc2018/proj2_v1_KTujaka_ASzmygin/test.x");
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(f));

        DemoLexer lexer = new DemoLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DemoParser parser = new DemoParser(tokens);

        ParseTree tree = parser.prog(); 

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}
