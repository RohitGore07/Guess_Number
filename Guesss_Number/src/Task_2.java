import java.util.Random;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader =new Scanner(System.in);
		String play ="yes";
		
		
		while(play.equals("yes"))
		{
			Random ra =new Random();
			int raNum =ra.nextInt(100);
			int guess =-1;
			int tries =0;
			
			
			
			
			while(guess != raNum) {
				
				
				System.out.println("Guess a number between 1 and 100: ");
				
				guess = reader.nextInt();
				tries++;
				
				
				if(guess == raNum) {
					System.out.println("AWESOME!! You Guessed the number!");
					System.out.println("It Only took you " + tries + " guesses!");
					System.out.println("\n");
					System.out.println("Would you like to play again? YES or NO: ");
					
					play = reader.next().toLowerCase();
				}
				
				else if(guess > raNum) {
					System.out.println("Your guess is too high, try again. ");
				}
				else {
					System.out.println("Your guess is too low try again.");
				}
				
				
			}
		}
        reader.close();
        

	}

}


