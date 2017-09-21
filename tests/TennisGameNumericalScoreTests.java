import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisGameNumericalScoreTests {
	@Test
	public void testScore_Player1Score1Player2Score1_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "15 - 15", score);
	}
	
	@Test
	public void testScore_Player1Score1Player2Score2_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	
	@Test
	public void testScore_Player1Score1Player2Score3_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	
	
	@Test
	public void testScore_Player1Score2Player2Score1_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	
	@Test
	public void testScore_Player1Score2Player2Score2_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "30 - 30", score);
	}
	
	@Test
	public void testScore_Player1Score2Player2Score3_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "30 - 40", score);
	}
	
	
	@Test
	public void testScore_Player1Score3Player2Score1_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	
	@Test
	public void testScore_Player1Score3Player2Score2_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "40 - 30", score);
	}
	
	@Test
	public void testScore_Player1Score3Player2Score3_correctScore() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "deuce", score);
	}
	

}
