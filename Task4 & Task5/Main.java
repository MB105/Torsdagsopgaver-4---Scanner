
import java.util.ArrayList;

import java.util.Scanner;

public class Main{
	public static void main(String[]args){

		ArrayList<String> actions = new ArrayList<>();

		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu gameMenu = new GameMenu(actions);

        // Display menu
		gameMenu.displayMenu();


        // Get the users input
		
		String userChoice=gameMenu.getAction();

		// convert userinput from String to integer

		int action=Integer.parseInt(userChoice);


		Main.doAction(action);

		
	}


		//Do action 

		public static void doAction(int action){

		switch(action){

			case 1: 
				System.out.println( "1:Starting the game now");
				break;

			case 2: 
				System.out.println( "2:Fetching previously saved game data");
				break;

			case 3: 
				System.out.println( "3:Game paused");
				break;

			case 4: 
				System.out.println( "4:Ending game");
				break; 
			}


		}

	}

