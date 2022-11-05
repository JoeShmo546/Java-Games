import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String hint1 = "";
		String hint2 = "";
		String hint3 = "";
	
		
		int strikes = 6;
		System.out.println("This is a guessing game. Player 1 will enter in a word up to 8 letters, and then 3 one letter hints. Player 2 will try to guess the word."
				+ "Player2 will recieve each hint: the first one before his first guess, the second one after his third guess, and the third one before his"
				+ "final guess. He has 7 guesses total. Good Luck!");
		System.out.println("Player1 enter your name: ");
		String player1 = scanner.next();
		
		System.out.println("Player2 enter your name: ");
		String player2 = scanner.next();
		
		System.out.println(player2 + " may now enter in the three hints: ");
		
			System.out.println("hint1: ");
			hint1 = scanner.next();
			
			System.out.println("hint2: ");
			hint2 = scanner.next();
			
			System.out.println("hint3: ");
			hint3 = scanner.next();
			
			System.out.println(player1 + "  may now select a word");
			String word = scanner.next();
		
		
		while(!(word.length() <= 8)) {
			System.out.println("That word is not greater then 8  letters long. Please pick a new word : ");
			word = scanner.next();
		}
		
		System.out.println("Here is your first hint: "+ hint1 + ". " +player2 + " may now guess the word.");
		
		
		for(int i = 1; i <= 8; i++) {
			String guess = scanner.next();
			if(guess.equals(word)) {
				
				System.out.println(guess + " is correct! " + player1 + " wins!");
				
			}else if(i == 3) {
				System.out.println(guess + " Was incorrect. Strike"  + i + "! Here is your second hint: " + hint2 + ".");
			}
			else if(i == 6) {
				System.out.println(" Here is your final hint: " + hint3 + ".");
			}
			else {
				System.out.println(guess + " is incorrect! Strike " + i +"!");
			}
			
		}
		System.out.println(" ");
		System.out.println(player1 + " looses! " + player2 + " wins!");

	}

}

