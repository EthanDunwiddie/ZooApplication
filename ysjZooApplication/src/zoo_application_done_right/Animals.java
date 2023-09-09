package zoo_application_done_right;
import java.util.ArrayList;

public class Animals {
	// Holds the animals in the zoo
	static ArrayList<String> animals = new ArrayList<String>();
	static ArrayList<String> type = new ArrayList<String>();
	static ArrayList<String> desc = new ArrayList<String>();
	static ArrayList<String> food = new ArrayList<String>();
	static ArrayList<String> environment = new ArrayList<String>();
	
	// Holds the new lists created by the user (e.g. might hold a list of mammals if the user sorts by type)
	static ArrayList<String> tempAnimals = new ArrayList<String>();
	static ArrayList<String> tempType = new ArrayList<String>();
	static ArrayList<String> tempDesc = new ArrayList<String>();
	static ArrayList<String> tempFood = new ArrayList<String>();
	static ArrayList<String> tempEnvironment = new ArrayList<String>();
	
	public void addAnimal(String tempAnimal) {
		animals.add(tempAnimal);
	}
	
	public void addType(String tempType) {
		type.add(tempType);
	}
	
	public void addDesc(String tempDesc) {
		desc.add(tempDesc);
	}
	
	public void addFood(String tempFood) {
		food.add(tempFood);
	}
	
	public void addEnvironment(String tempEnv) {
		environment.add(tempEnv);
	}
	
/*
  ---------  
   Setters
  ---------
*/	
	
	// Sets animals by  chosen by user
	public void setTempAnimal(String input) {
									
		for(int i=0; i<type.size(); i++) {
			if(input.equalsIgnoreCase(animals.get(i))) {
				tempAnimals.add(animals.get(i));
				tempType.add(type.get(i));
				tempDesc.add(desc.get(i));
				tempFood.add(food.get(i));
				tempEnvironment.add(environment.get(i));
			}
		}			
	}
	
	// Sets animals by type chosen by user
	public void setTempType(String input) {
								
		for(int i=0; i<type.size(); i++) {
			if(input.equalsIgnoreCase(type.get(i))) {
				tempAnimals.add(animals.get(i));
				tempType.add(type.get(i));
				tempDesc.add(desc.get(i));
				tempFood.add(food.get(i));
				tempEnvironment.add(environment.get(i));
			}
		}				
	}
	
	// Sets animals by type chosen by user
	public void setTempEnv(String input) {
									
		for(int i=0; i<environment.size(); i++) {
			if(input.equalsIgnoreCase(environment.get(i))) {
				tempAnimals.add(animals.get(i));
				tempType.add(type.get(i));
				tempDesc.add(desc.get(i));
				tempFood.add(food.get(i));
				tempEnvironment.add(environment.get(i));
			}
		}				
	}
	
	
/*
  ---------  
   Getters
  ---------
*/		
	// pretty sure getters usually don't do the printing of information but this one does
	
	// Prints full list of animals
	public void printList() {
		
		for(int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i)
					+ "\n" + type.get(i)
					+ "\n" + desc.get(i)
					+ "\n" + food.get(i)
					+ "\n" + environment.get(i) +"\n");
		}
	}
	
	// Prints the new list of animals
	public void printTempList() {
		
		for(int i=0; i<tempAnimals.size(); i++) {
			System.out.println(tempAnimals.get(i) 
					+ "\n" + tempType.get(i)  
					+ "\n" + tempDesc.get(i) 
					+ "\n" + tempFood.get(i) 
					+ "\n" + tempEnvironment.get(i)
					+ "\n");
		}
		
		// Empty the temporary list
		for(int i=0; i<tempAnimals.size(); i++) {
			tempAnimals.clear(); 
			tempType.clear(); 
			tempDesc.clear(); 
			tempFood.clear(); 
			tempEnvironment.clear(); 
		}
	}
	
	
}
