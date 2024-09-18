package defaultPackage;

public class Dog {
	String name;
	
	int age;


	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "\nDog name = " + name + " age = " + age;
	}
	
	
	
}
