
public class Greeter {
	//instance variables
	private String greeting;
	
	//constructor
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
	
	//get
	public String getGreeting() {
		return greeting;
	}
	
	//set
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	//greet method
	public String greet(String name) {
		
		return greeting + ", " + name + "!";
	}
}
