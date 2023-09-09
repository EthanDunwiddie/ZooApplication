package zoo_application_done_right;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	// Deals with inputs
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Animals animal = new Animals();
		InitAnimals animals = new InitAnimals();
		
		animals.add();
		
		while(true) {
			System.out.println("Would you like to continue:"
					+ "\n1:Yes"
					+ "\n2:No");
		
			if(input.nextInt() == 1) {
				System.out.println("Would you like to:"
						+ "\n1.See all animals"
						+ "\n2.Choose animals"
						+ "\n3.Search animals by type"
						+ "\n4.Search animals by environment");
				
			String choice;
				switch(input.nextInt()) {
				// Print out all animals
				case 1:
					
					animal.printList();
					
					break;
				
				// Print out chosen animal
				case 2:
					// Print list of animals
					System.out.println("|Animals|");
					for(int i=0; i<animal.animals.size(); i++) {
						System.out.println(animal.animals.get(i));
					}
					
					input.nextLine();// Consumes the newline character?
					
					// Ask user to pick an animal
					System.out.println("\nPick an animal from the list above \n");
					choice = input.nextLine();
					animal.setTempAnimal(choice); // sets choice from user input
					animal.printTempList(); // prints new list of animals
					
					break;
				
				// Print out list of animals by type
				case 3:
					// Print list of animal types
					System.out.println("|Animal types|");
					for(int i=0; i<animal.animals.size(); i++) {
						System.out.println(animal.type.get(i));
					}
					
					// ask the user to pick a type
					System.out.println("\nPick an animal type from the list above \n");
					choice = input.next();
					animal.setTempType(choice); // creates new list of animals
					animal.printTempList(); // prints new list of animals
					
					break;
					
				// Print out list of animals by environment	
				case 4:
					// Print list of environments
					System.out.println("|Environments|");
					for(int i=0; i<animal.animals.size(); i++) {
						System.out.println(animal.environment.get(i));
					}
					
					input.nextLine();// Consumes the newline character?
					
					// Ask the user to pick an environment 
					System.out.println("\nPick an environment from the list above \n");
					choice = input.nextLine();
					animal.setTempEnv(choice); // creates new list of animals
					animal.printTempList(); // prints new list of animals
					
					break;
				}
				
			}
			else {
				System.out.println("Goodbye");
				break;
			}
		}//end of while
		
		
	}//end of main method

}
