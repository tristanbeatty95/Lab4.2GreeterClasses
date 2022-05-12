import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//greeting
		System.out.println("What would you like to be greeted with? (type out a greeting)");
		String greeting = scan.nextLine();
		
		//name
		System.out.println("Please enter your name:");
		String name = scan.nextLine();
		
		JavaScriptGreeter simonGreet = new JavaScriptGreeter(greeting);
		System.out.println(simonGreet.greet(name));
		
		
	}

}
