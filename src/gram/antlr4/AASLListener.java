// Generated from ../gram/antlr4/AASL.g4 by ANTLR 4.5.3
package gram.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AASLParser}.
 */
public interface AASLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AASLParser#adaptiveAutomaton}.
	 * @param ctx the parse tree
	 */
	void enterAdaptiveAutomaton(AASLParser.AdaptiveAutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#adaptiveAutomaton}.
	 * @param ctx the parse tree
	 */
	void exitAdaptiveAutomaton(AASLParser.AdaptiveAutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(AASLParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(AASLParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(AASLParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(AASLParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(AASLParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(AASLParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(AASLParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(AASLParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#stimuli}.
	 * @param ctx the parse tree
	 */
	void enterStimuli(AASLParser.StimuliContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#stimuli}.
	 * @param ctx the parse tree
	 */
	void exitStimuli(AASLParser.StimuliContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void enterSimbolo(AASLParser.SimboloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void exitSimbolo(AASLParser.SimboloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(AASLParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(AASLParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#transPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterTransPreAdaptive(AASLParser.TransPreAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#transPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitTransPreAdaptive(AASLParser.TransPreAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#transPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterTransPostAdaptive(AASLParser.TransPostAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#transPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitTransPostAdaptive(AASLParser.TransPostAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#argLst}.
	 * @param ctx the parse tree
	 */
	void enterArgLst(AASLParser.ArgLstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#argLst}.
	 * @param ctx the parse tree
	 */
	void exitArgLst(AASLParser.ArgLstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#submachines}.
	 * @param ctx the parse tree
	 */
	void enterSubmachines(AASLParser.SubmachinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#submachines}.
	 * @param ctx the parse tree
	 */
	void exitSubmachines(AASLParser.SubmachinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#submachine}.
	 * @param ctx the parse tree
	 */
	void enterSubmachine(AASLParser.SubmachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#submachine}.
	 * @param ctx the parse tree
	 */
	void exitSubmachine(AASLParser.SubmachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(AASLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(AASLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(AASLParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(AASLParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(AASLParser.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(AASLParser.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(AASLParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(AASLParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(AASLParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(AASLParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#adaptiveAction}.
	 * @param ctx the parse tree
	 */
	void enterAdaptiveAction(AASLParser.AdaptiveActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#adaptiveAction}.
	 * @param ctx the parse tree
	 */
	void exitAdaptiveAction(AASLParser.AdaptiveActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#paramLst}.
	 * @param ctx the parse tree
	 */
	void enterParamLst(AASLParser.ParamLstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#paramLst}.
	 * @param ctx the parse tree
	 */
	void exitParamLst(AASLParser.ParamLstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AASLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AASLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(AASLParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(AASLParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterGenerator(AASLParser.GeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitGenerator(AASLParser.GeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AASLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AASLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#actionPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterActionPreAdaptive(AASLParser.ActionPreAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#actionPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitActionPreAdaptive(AASLParser.ActionPreAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#actionPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterActionPostAdaptive(AASLParser.ActionPostAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#actionPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitActionPostAdaptive(AASLParser.ActionPostAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#argAction}.
	 * @param ctx the parse tree
	 */
	void enterArgAction(AASLParser.ArgActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#argAction}.
	 * @param ctx the parse tree
	 */
	void exitArgAction(AASLParser.ArgActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(AASLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(AASLParser.ArgContext ctx);
}