package defaultPackage;

public class worksheet3HW {

	public static void main(String[] args) {
		// 1
		
		int[] numbers = {3,4,5,2,3,6,7,0,9}; // init an array with given numbers
		
		int positionOfSmallestElement = positionOfSmallestElement(numbers); // pass in the given array to find the smallest number and return it
		
		System.out.print(positionOfSmallestElement); // Print the smallest number
		
		
		// 2 find average of elements
		double averageOfElements = calcAvg(numbers);
		
		System.out.print(averageOfElements);
		
		
		// 3 
	AnimalShelter v1 = new AnimalShelter();
	
	
		// overloaded method adding a dog
		AnimalShelter.addAnimal("Fluffy", 5);
		AnimalShelter.addAnimal("Puggy", 7); 

		
		v1.displayInfo();
		
		AnimalShelter.removeAnimal("Bob"); // No dog name matched this name
		
		AnimalShelter.removeAnimal("Fluffy"); // Should be removed and list is updated
		
		
		
		//10: 
		// Correct structure: a,b,f
		
		//11 
		// a- true, b- false, c - true, d - true, e- false, f -true, g- true, h-false
		
		
		//12
		// a = Overloading, b = method overloading, c = method overriding
		

	}

	public static int positionOfSmallestElement(int[] numbers) {
		int smallestNumberFound = numbers[0];
		for (int i = 0; i <numbers.length; i++) {
			if (numbers[i] < smallestNumberFound) {
				smallestNumberFound = numbers[i];
			}
			
		}
		return smallestNumberFound;
	}

	public static double calcAvg(int[] numbers) {
		
		double average = 0;
		
		int sumNumber= numbers[0];
		
		int numbersLength = numbers.length; // In a separate variable as it is used in multiple instances
		
		for (int i = 0; i <numbersLength; i++) {
			sumNumber += numbers[i]; // keep adding to the sum in the for loop till it reaches the limit of the array length
		}
		
		average = sumNumber/numbersLength;
		
		return average;
	}
	
}
