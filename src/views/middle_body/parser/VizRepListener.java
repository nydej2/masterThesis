// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VizRepParser}.
 */
public interface VizRepListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VizRepParser#commandChain}.
	 * @param ctx the parse tree
	 */
	void enterCommandChain(VizRepParser.CommandChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#commandChain}.
	 * @param ctx the parse tree
	 */
	void exitCommandChain(VizRepParser.CommandChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(VizRepParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(VizRepParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relMiddle}.
	 * @param ctx the parse tree
	 */
	void enterRelMiddle(VizRepParser.RelMiddleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relMiddle}.
	 * @param ctx the parse tree
	 */
	void exitRelMiddle(VizRepParser.RelMiddleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(VizRepParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(VizRepParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(VizRepParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(VizRepParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(VizRepParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(VizRepParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(VizRepParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(VizRepParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(VizRepParser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(VizRepParser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseCommand}.
	 * @param ctx the parse tree
	 */
	void enterElseCommand(VizRepParser.ElseCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseCommand}.
	 * @param ctx the parse tree
	 */
	void exitElseCommand(VizRepParser.ElseCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(VizRepParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(VizRepParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#shapeCommand}.
	 * @param ctx the parse tree
	 */
	void enterShapeCommand(VizRepParser.ShapeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#shapeCommand}.
	 * @param ctx the parse tree
	 */
	void exitShapeCommand(VizRepParser.ShapeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#styleCommand}.
	 * @param ctx the parse tree
	 */
	void enterStyleCommand(VizRepParser.StyleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#styleCommand}.
	 * @param ctx the parse tree
	 */
	void exitStyleCommand(VizRepParser.StyleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relCommandFrom}.
	 * @param ctx the parse tree
	 */
	void enterRelCommandFrom(VizRepParser.RelCommandFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relCommandFrom}.
	 * @param ctx the parse tree
	 */
	void exitRelCommandFrom(VizRepParser.RelCommandFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relCommandTo}.
	 * @param ctx the parse tree
	 */
	void enterRelCommandTo(VizRepParser.RelCommandToContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relCommandTo}.
	 * @param ctx the parse tree
	 */
	void exitRelCommandTo(VizRepParser.RelCommandToContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#cube}.
	 * @param ctx the parse tree
	 */
	void enterCube(VizRepParser.CubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#cube}.
	 * @param ctx the parse tree
	 */
	void exitCube(VizRepParser.CubeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relCube}.
	 * @param ctx the parse tree
	 */
	void enterRelCube(VizRepParser.RelCubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relCube}.
	 * @param ctx the parse tree
	 */
	void exitRelCube(VizRepParser.RelCubeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifCube}.
	 * @param ctx the parse tree
	 */
	void enterIfCube(VizRepParser.IfCubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifCube}.
	 * @param ctx the parse tree
	 */
	void exitIfCube(VizRepParser.IfCubeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseCube}.
	 * @param ctx the parse tree
	 */
	void enterElseCube(VizRepParser.ElseCubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseCube}.
	 * @param ctx the parse tree
	 */
	void exitElseCube(VizRepParser.ElseCubeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#sphere}.
	 * @param ctx the parse tree
	 */
	void enterSphere(VizRepParser.SphereContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#sphere}.
	 * @param ctx the parse tree
	 */
	void exitSphere(VizRepParser.SphereContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relSphere}.
	 * @param ctx the parse tree
	 */
	void enterRelSphere(VizRepParser.RelSphereContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relSphere}.
	 * @param ctx the parse tree
	 */
	void exitRelSphere(VizRepParser.RelSphereContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifSphere}.
	 * @param ctx the parse tree
	 */
	void enterIfSphere(VizRepParser.IfSphereContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifSphere}.
	 * @param ctx the parse tree
	 */
	void exitIfSphere(VizRepParser.IfSphereContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseSphere}.
	 * @param ctx the parse tree
	 */
	void enterElseSphere(VizRepParser.ElseSphereContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseSphere}.
	 * @param ctx the parse tree
	 */
	void exitElseSphere(VizRepParser.ElseSphereContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#plane}.
	 * @param ctx the parse tree
	 */
	void enterPlane(VizRepParser.PlaneContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#plane}.
	 * @param ctx the parse tree
	 */
	void exitPlane(VizRepParser.PlaneContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relPane}.
	 * @param ctx the parse tree
	 */
	void enterRelPane(VizRepParser.RelPaneContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relPane}.
	 * @param ctx the parse tree
	 */
	void exitRelPane(VizRepParser.RelPaneContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifPlane}.
	 * @param ctx the parse tree
	 */
	void enterIfPlane(VizRepParser.IfPlaneContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifPlane}.
	 * @param ctx the parse tree
	 */
	void exitIfPlane(VizRepParser.IfPlaneContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elsePlane}.
	 * @param ctx the parse tree
	 */
	void enterElsePlane(VizRepParser.ElsePlaneContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elsePlane}.
	 * @param ctx the parse tree
	 */
	void exitElsePlane(VizRepParser.ElsePlaneContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(VizRepParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(VizRepParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#relText}.
	 * @param ctx the parse tree
	 */
	void enterRelText(VizRepParser.RelTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#relText}.
	 * @param ctx the parse tree
	 */
	void exitRelText(VizRepParser.RelTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifText}.
	 * @param ctx the parse tree
	 */
	void enterIfText(VizRepParser.IfTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifText}.
	 * @param ctx the parse tree
	 */
	void exitIfText(VizRepParser.IfTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseText}.
	 * @param ctx the parse tree
	 */
	void enterElseText(VizRepParser.ElseTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseText}.
	 * @param ctx the parse tree
	 */
	void exitElseText(VizRepParser.ElseTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(VizRepParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(VizRepParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifLine}.
	 * @param ctx the parse tree
	 */
	void enterIfLine(VizRepParser.IfLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifLine}.
	 * @param ctx the parse tree
	 */
	void exitIfLine(VizRepParser.IfLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseLine}.
	 * @param ctx the parse tree
	 */
	void enterElseLine(VizRepParser.ElseLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseLine}.
	 * @param ctx the parse tree
	 */
	void exitElseLine(VizRepParser.ElseLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#pen}.
	 * @param ctx the parse tree
	 */
	void enterPen(VizRepParser.PenContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#pen}.
	 * @param ctx the parse tree
	 */
	void exitPen(VizRepParser.PenContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifPen}.
	 * @param ctx the parse tree
	 */
	void enterIfPen(VizRepParser.IfPenContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifPen}.
	 * @param ctx the parse tree
	 */
	void exitIfPen(VizRepParser.IfPenContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elsePen}.
	 * @param ctx the parse tree
	 */
	void enterElsePen(VizRepParser.ElsePenContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elsePen}.
	 * @param ctx the parse tree
	 */
	void exitElsePen(VizRepParser.ElsePenContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(VizRepParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(VizRepParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifColor}.
	 * @param ctx the parse tree
	 */
	void enterIfColor(VizRepParser.IfColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifColor}.
	 * @param ctx the parse tree
	 */
	void exitIfColor(VizRepParser.IfColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseColor}.
	 * @param ctx the parse tree
	 */
	void enterElseColor(VizRepParser.ElseColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseColor}.
	 * @param ctx the parse tree
	 */
	void exitElseColor(VizRepParser.ElseColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(VizRepParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(VizRepParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#ifMap}.
	 * @param ctx the parse tree
	 */
	void enterIfMap(VizRepParser.IfMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#ifMap}.
	 * @param ctx the parse tree
	 */
	void exitIfMap(VizRepParser.IfMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link VizRepParser#elseMap}.
	 * @param ctx the parse tree
	 */
	void enterElseMap(VizRepParser.ElseMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link VizRepParser#elseMap}.
	 * @param ctx the parse tree
	 */
	void exitElseMap(VizRepParser.ElseMapContext ctx);
}