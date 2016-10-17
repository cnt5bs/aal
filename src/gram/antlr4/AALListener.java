// Generated from ../gram/antlr4/AAL.g4 by ANTLR 4.5.3
package gram.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AALParser}.
 */
public interface AALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AALParser#adaptiveAutomaton}.
	 * @param ctx the parse tree
	 */
	void enterAdaptiveAutomaton(AALParser.AdaptiveAutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#adaptiveAutomaton}.
	 * @param ctx the parse tree
	 */
	void exitAdaptiveAutomaton(AALParser.AdaptiveAutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(AALParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(AALParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(AALParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(AALParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(AALParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(AALParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(AALParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(AALParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#stimuli}.
	 * @param ctx the parse tree
	 */
	void enterStimuli(AALParser.StimuliContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#stimuli}.
	 * @param ctx the parse tree
	 */
	void exitStimuli(AALParser.StimuliContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void enterSimbolo(AALParser.SimboloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void exitSimbolo(AALParser.SimboloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(AALParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(AALParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#transPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterTransPreAdaptive(AALParser.TransPreAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#transPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitTransPreAdaptive(AALParser.TransPreAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#transPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterTransPostAdaptive(AALParser.TransPostAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#transPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitTransPostAdaptive(AALParser.TransPostAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#argLst}.
	 * @param ctx the parse tree
	 */
	void enterArgLst(AALParser.ArgLstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#argLst}.
	 * @param ctx the parse tree
	 */
	void exitArgLst(AALParser.ArgLstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#submachines}.
	 * @param ctx the parse tree
	 */
	void enterSubmachines(AALParser.SubmachinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#submachines}.
	 * @param ctx the parse tree
	 */
	void exitSubmachines(AALParser.SubmachinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#submachine}.
	 * @param ctx the parse tree
	 */
	void enterSubmachine(AALParser.SubmachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#submachine}.
	 * @param ctx the parse tree
	 */
	void exitSubmachine(AALParser.SubmachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(AALParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(AALParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(AALParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(AALParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(AALParser.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(AALParser.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(AALParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(AALParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(AALParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(AALParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#adaptiveAction}.
	 * @param ctx the parse tree
	 */
	void enterAdaptiveAction(AALParser.AdaptiveActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#adaptiveAction}.
	 * @param ctx the parse tree
	 */
	void exitAdaptiveAction(AALParser.AdaptiveActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#paramLst}.
	 * @param ctx the parse tree
	 */
	void enterParamLst(AALParser.ParamLstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#paramLst}.
	 * @param ctx the parse tree
	 */
	void exitParamLst(AALParser.ParamLstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AALParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AALParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(AALParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(AALParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterGenerator(AALParser.GeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitGenerator(AALParser.GeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AALParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AALParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#actionPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterActionPreAdaptive(AALParser.ActionPreAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#actionPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitActionPreAdaptive(AALParser.ActionPreAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#actionPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterActionPostAdaptive(AALParser.ActionPostAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#actionPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitActionPostAdaptive(AALParser.ActionPostAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#argAction}.
	 * @param ctx the parse tree
	 */
	void enterArgAction(AALParser.ArgActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#argAction}.
	 * @param ctx the parse tree
	 */
	void exitArgAction(AALParser.ArgActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AALParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(AALParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AALParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(AALParser.ArgContext ctx);
}