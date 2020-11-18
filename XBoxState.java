/**
 * 
 * @author Linh Nguyen
 *	This is when the user on the xbox state
 */
public class XBoxState implements State {
	private GameConsole gameConsole;
	String[] games = new String[] {"Forza Horizon", "Ori and the Blind Forest", "Red Dead Redemption", "Fortnite", "Gears", "Cuphead"};
	/**
	 * Constructor that set the gameConsole
	 * @param gameConsole
	 */
	public XBoxState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	/**
	 * Go back to the home screen
	 */
	public void pressHomeButton() {
		System.out.println("Display Home Screen.");
		gameConsole.setState(gameConsole.getHomeState());
	}
	/**
	 * Go to the Nintendo state
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	/**
	 * Display the message let the user know that they already on the xbox state
	 */
	public void pressXBoxButton() {
		System.out.println("You are already viewing XBox");
	}
	/**
	 * Display all the game on the xbox
	 */
	public void pressGameButton() {
		System.out.println("You have the following games: ");
		for(int i = 0; i < games.length; i++) {
			if(i == games.length - 1) {
				System.out.println(games[i] + "\n");
			}
			else {
				System.out.println(games[i]);
			}
		}
	}
}
