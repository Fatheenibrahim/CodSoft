package codsoft_tasks;

//libraries
import java.util.*;
import java.util.random.*;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------  WELCOME TO NUMBER GUESSING GAME  ----------------------\n");
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		int rand_no = rand.nextInt(100);
		
		int attempt = 1;
		int rounds = 1;
		int score = 0;
		
		while(rounds != 4) {
			System.out.println("---- ROUND " + rounds + " ----");
			System.out.println();
			for(int i=0; i<3; i++)
			{
				System.out.println("\nAttempt = "+attempt);
				System.out.println();
				System.out.println("Guess the Number : ");
				int num = scan.nextInt();
				
				if(num == rand_no)
				{
					score ++;
					System.out.println("You Guessed Correctly\n\n");
					break;
				}
				else if(num > rand_no) {
					System.out.println("Your Guessing is too High\n\n");
				}
				else{
					System.out.println("Your Guessing is too low\n\n");
				}
				attempt ++;
			}
			rounds ++;
		}
		System.out.println("Score = " + score);
		
	}

}
