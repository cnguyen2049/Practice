
public class NumGame {
	/*
	 * NumGame
	 * It's a game where each player can take pieces of a stack
	 * 1,2,3 pieces
	 * stack can be N high
	 * Assume player 1 (you) go first. 
	 * We want to determine if you will win if stack is N high
	 */
	
	public boolean gameWinner(int high){
		//Is player 1 going to win?
		if(high % 4 == 0){
			return false;
		}
		return true;
	}
	
	/*
	 * Play the game for a bit
	 * 
	 */
	// Winner is the one who take the last piece
	
	/*
	 * 3 pieces I take 3 first turn I win
	 * 4 pieces I take any number I lose ***
	 * 6 pieces ? 2 1 3 Player 1 wins
	 * Pattern is divisible by 4 we will lose 
	 */
	
	
	public static void main(String [] args){
		NumGame tester = new NumGame();
		System.out.println(tester.gameWinner(4)); //false
		System.out.println(tester.gameWinner(6)); //true
		
		//You most probably need to test against 50+ cases to be confident on assessment.
		
	}
}



















