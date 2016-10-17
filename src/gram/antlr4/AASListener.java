// Generated from ../gram/antlr4/AAS.g4 by ANTLR 4.5.3
package gram.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AASParser}.
 */
public interface AASListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AASParser#adaptiveAutomaton}.
	 * @param ctx the parse tree
	 */
	void enterAdaptiveAutomaton(AASParser.AdaptiveAutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#adaptiveAutomaton}.
	 * @param ctx the parse tree
	 */
	void exitAdaptiveAutomaton(AASParser.AdaptiveAutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(AASParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(AASParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(AASParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(AASParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(AASParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(AASParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(AASParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(AASParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#stimuli}.
	 * @param ctx the parse tree
	 */
	void enterStimuli(AASParser.StimuliContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#stimuli}.
	 * @param ctx the parse tree
	 */
	void exitStimuli(AASParser.StimuliContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void enterSimbolo(AASParser.SimboloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#simbolo}.
	 * @param ctx the parse tree
	 */
	void exitSimbolo(AASParser.SimboloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(AASParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(AASParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#transPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterTransPreAdaptive(AASParser.TransPreAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#transPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitTransPreAdaptive(AASParser.TransPreAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#transPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterTransPostAdaptive(AASParser.TransPostAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#transPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitTransPostAdaptive(AASParser.TransPostAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#argLst}.
	 * @param ctx the parse tree
	 */
	void enterArgLst(AASParser.ArgLstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#argLst}.
	 * @param ctx the parse tree
	 */
	void exitArgLst(AASParser.ArgLstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#submachines}.
	 * @param ctx the parse tree
	 */
	void enterSubmachines(AASParser.SubmachinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#submachines}.
	 * @param ctx the parse tree
	 */
	void exitSubmachines(AASParser.SubmachinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#submachine}.
	 * @param ctx the parse tree
	 */
	void enterSubmachine(AASParser.SubmachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#submachine}.
	 * @param ctx the parse tree
	 */
	void exitSubmachine(AASParser.SubmachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(AASParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(AASParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(AASParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(AASParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(AASParser.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(AASParser.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(AASParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(AASParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(AASParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(AASParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#adaptiveAction}.
	 * @param ctx the parse tree
	 */
	void enterAdaptiveAction(AASParser.AdaptiveActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#adaptiveAction}.
	 * @param ctx the parse tree
	 */
	void exitAdaptiveAction(AASParser.AdaptiveActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#paramLst}.
	 * @param ctx the parse tree
	 */
	void enterParamLst(AASParser.ParamLstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#paramLst}.
	 * @param ctx the parse tree
	 */
	void exitParamLst(AASParser.ParamLstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AASParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AASParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(AASParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(AASParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterGenerator(AASParser.GeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitGenerator(AASParser.GeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AASParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AASParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#actionPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterActionPreAdaptive(AASParser.ActionPreAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#actionPreAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitActionPreAdaptive(AASParser.ActionPreAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#actionPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void enterActionPostAdaptive(AASParser.ActionPostAdaptiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#actionPostAdaptive}.
	 * @param ctx the parse tree
	 */
	void exitActionPostAdaptive(AASParser.ActionPostAdaptiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#argAction}.
	 * @param ctx the parse tree
	 */
	void enterArgAction(AASParser.ArgActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#argAction}.
	 * @param ctx the parse tree
	 */
	void exitArgAction(AASParser.ArgActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AASParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(AASParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AASParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(AASParser.ArgContext ctx);
}