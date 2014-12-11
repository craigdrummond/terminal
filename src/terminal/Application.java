package terminal;

// import java.util.Scanner;
class Person {
	// Classes can contain
	// 1. Data
	// 2. Subroutines (methods)
	//

	// instance variables (data or "state")
	String name;
	int age;

	// methods
	void speak() {
		sayHello();
		System.out.println("My Name is "+ name +" and I am " + age + " years old");
	}
	
	void sayHello(){
		System.out.println("Hello");
	}
	
	int yearsToRetirement(){
		int yearsLeft = 65 - age;
		//System.out.println(yearsLeft);
		return yearsLeft;
	}
	
	int getAge(){
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class Application {
	public static void main(String[] args) {

		// Adding in Chapter 21 This Branch will eventually be merged into master
		// unknown yet

		// Define Variables
		Person person1 = new Person();
		person1.name = "Craig";
		person1.age = 44;
		int years = person1.yearsToRetirement();

		Person person2 = new Person();
		person2.name = "Heather";
		person2.age = 35;

		person1.speak();
		person2.speak();
		
		System.out.println(years + " until you retire!");

		int personAge = person1.getAge();
		String personName = person1.getName();
		
		System.out.println("Name: " + personName);
		System.out.println("Age:  " + personAge);
	}
}
