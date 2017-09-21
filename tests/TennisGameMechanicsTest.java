import org.junit.Test;

public class TennisGameMechanicsTest {
	
	@Test (expected = TennisGameException.class)
	public void testPlayer1Scored_gameEnded_throwError() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		//Act
		//This statement should cause an exception
		game.player1Scored();
	}
	
	@Test (expected = TennisGameException.class)
	public void testPlayer2Scored_gameEnded_throwError() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		//Act
		//This statement should cause an exception
		game.player2Scored();
	}
}
