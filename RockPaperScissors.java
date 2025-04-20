package day5;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	
	{
	
		System.out.println("Welcome to the Rock,Paper,Scissors Game!");
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("0: Rock, 1:: Paper, 2: Scissors");
			int userChoice = scanner.nextInt();
			;
	
			//validate input 
			
			if (userChoice<0 || userChoice>2)
			{
				System.out.println("invalid choice. Please run the program again and enter 0, 1 or 2.");
				return; 
			}
			int computerChoice = (int) (Math.random()*3);
			System.out.println(computerChoice);
			
			//determine winner
			
			if (userChoice==computerChoice)
			{
				System.out.println("Its a tie!");
				
			}
			else if ((userChoice==0 && computerChoice == 2) ||
					(userChoice==1 && computerChoice ==0) ||
					(userChoice==2 && computerChoice ==1))
				
			{
				System.out.println("You win! - Congratualtions");
			}
			else
			{System.out.println("Computer wins");
			}
			scanner.close();
			
	}


}
