package defaultPackage;

import java.util.ArrayList;


public class AnimalShelter {
	static ArrayList<Dog> dogArray = new ArrayList<>();
	
	static int numberOfAnimals = 0;
	


// Adding dog to the array list
	public static void addAnimal(Dog dog) {
		dogArray.add(dog);
	
		numberOfAnimals ++; // Increase the counter
		
		System.out.println(numberOfAnimals);
		
		
	}
	
	
	// Overloaded version of adding dog in array list and also creating an instance of it
	
	public static void addAnimal(String name, int age) {
		Dog dog = new Dog(name,age); // init the dog object with given params 
		
		addAnimal(dog); // add to array
		
		numberOfAnimals ++; // increment counter
		
		System.out.println(numberOfAnimals);
	}
	
	
	
	// Removing an animal by name
	
	public static boolean removeAnimal(String name) {
		// Basically looping through the list and grabbing the dog object's name and checking if it equals to the params name given. This rule allows to check if it matches the requested dog
		// When that name is found, remove it from the list and return true, else return false.
		for(int i = 0; i <dogArray.size(); i++) {
		if(dogArray.get(i).name.equalsIgnoreCase(name)) {
			Dog removedDogName = dogArray.remove(i); // Remove that current dog out the list
				System.out.print("\nRemoved, " + removedDogName);
				return true;
			} 
		}
		System.out.print("\nNo dog equal to given name");
		return false;
	}

	// Looping through the dog list array and print each dog object within the list
	public void displayInfo() {
		for (Dog dog : dogArray) {
			System.out.print(dog + "\n");
		}
	}
	

}
