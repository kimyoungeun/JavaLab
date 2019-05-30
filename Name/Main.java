//Create a class "Name" that include setName and getName methods.
//If setName method get a blank, program ask name again.

//All instance variables in Name class must be private!

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String name= "\n";
		Scanner keyboard = new Scanner(System.in);
		Name N = new Name();
		int n;
		// Input name while length of name is not 0.
  		// Your code here
  		// Use print function as below.
  
        do {
          System.out.print("Input your name: ");
  		    name = keyboard.nextLine();
  		    n = name.length();
        }
  		  while(n  <= 1);
  		  
  		N.setdata(name);
  	
		System.out.println("My name is "+ N.getName());
		keyboard.close();

  }
}
