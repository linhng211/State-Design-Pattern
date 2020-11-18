/**
 * 
 * @author Linh Nguyen
 *	This is the game console generate all the state
 */
public class GameConsole {
	private State HomeState;
	private State NintendoState;
	private State XBoxState;
	private State state;
	/**
	 * Constructor set all the possible states , set the default state to the home screen state 
	 * and display a starting message
	 */
	public GameConsole() {
		HomeState = new HomeState(this);
		NintendoState = new NintendoState(this);
		XBoxState = new XBoxState(this);
		state = HomeState;
		System.out.println("Starting up the Game Console\n");
	}
	/**
	 * Calls press home button on the state variable
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	/**
	 * Calls press nintendo button on the state variable
	 */
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	/**
	 * Calls press xBox button on the state variable
	 */
	public void pressXBoxButton() {
		state.pressXBoxButton();
	}
	/**
	 *  Calls press game button on the state variable
	 */
	public void pressGameButton() {
		state.pressGameButton();
	}
	/**
	 * Changes the state accordingly
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}
	/**
	 * return to the home state
	 * @return State
	 */
	public State getHomeState() {
		return HomeState;
	}
	/**
	 * return the nintendo state
	 * @return State
	 */
	public State getNintendoState() {
		return NintendoState;
	}
	/**
	 * return the xbox state
	 * @return state
	 */
	public State getXBoxState() {
		return XBoxState;
	}
}
