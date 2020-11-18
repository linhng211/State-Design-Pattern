/**
 * 
 * @author Linh Nguyen
 *	This is when the user on Nintendo state
 */
public class NintendoState implements State {
	private GameConsole gameConsole;
	String[] games = new String[] {"The Legends of Zelda", "Super Smash Bros", "Super Mario", "Mario Kart", "Animal Crossing", "Pokemon"};
	/**
	 * Constructor that set the gameConsole
	 * @param gameConsole
	 */
	public NintendoState(GameConsole gameConsole) {
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
	 * Display the message let the user know that they already on the nintendo state
	 */
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo");
	}
	/**
	 * Go to the xBox state
	 */
	public void pressXBoxButton() {
		System.out.println("Starting XBox...");	
		gameConsole.setState(gameConsole.getXBoxState());
	}
	/**
	 * Display all the game on the nintendo
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
