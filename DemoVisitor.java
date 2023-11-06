// Generated from D:/studia/magisterka/sem1/JFiK/projekt2_v1/realcalc2018/realcalc\Demo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DemoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignTabElem}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignTabElem(DemoParser.AssignTabElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DemoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DemoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printTabElem}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintTabElem(DemoParser.PrintTabElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readInt}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInt(DemoParser.ReadIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readReal}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadReal(DemoParser.ReadRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readString}
	 * labeled alternative in {@link DemoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadString(DemoParser.ReadStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intreal}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntreal(DemoParser.IntrealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DemoParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tab0}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab0(DemoParser.Tab0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code single}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(DemoParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DemoParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(DemoParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(DemoParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(DemoParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code val}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(DemoParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DemoParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code element}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(DemoParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(DemoParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToreal(DemoParser.TorealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(DemoParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#tabelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabelem(DemoParser.TabelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DemoParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#tab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab(DemoParser.TabContext ctx);
}