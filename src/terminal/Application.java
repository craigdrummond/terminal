package terminal;

/*	To move code into its own project:
		1. Checkout the branch that has the code that will be a new project
		2. Copy the code to a new directory is not already being tracked with git
		3. create new repository on Stash
		4. In Terminal
			a. change to the new directory
			b. git init
			c. git add --all
			d. git commit -m "initial commit"
			e. git remote add origin <remote>
			f. git push origin master
		5. In Eclipse
			a. import project
				1. Edit the package on all source files (if name changed)
				2. Save all files
				3. (in terminal) commit the change
			b. right click on project | Select Team | Disconnect
			c. right click on project | Select Team | Share Project
			d. Connect to the .git in the current directory
*/

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
