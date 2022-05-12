
public class JavaScriptGreeter extends Greeter {

	public JavaScriptGreeter(String greeting) {
		super(greeting);

	}
	
	@Override
	public String greet(String name) {
		
		return "\"Simon says \"" + super.greet(name) + "\"\"";
	}

}
