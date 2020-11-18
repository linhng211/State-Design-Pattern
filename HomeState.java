/**
 * 
 * @author Linh Nguyen
 * This is when the user on the home screen
 */
public class HomeState implements State {
	private GameConsole gameConsole;
	/**
	 * Constructor that set the gameConsole
	 * @param gameConsole
	 */
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	/**
	 * Display the message let the user know that they already on the home screen
	 */
	public void pressHomeButton() {
		System.out.println("You are already on the home screen");
		//gameConsole.setState(gameConsole.getHomeState());
	}
	/**
	 * Go to the Nintendo state
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	/**
	 * Go to the xBox state
	 */
	public void pressXBoxButton() {
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	/**
	 * Display a message let the user know that they need to pick xbox or nintendo to play
	 */
	public void pressGameButton() {
		System.out.println("You have to pick a gaming system to play");
	}
}
