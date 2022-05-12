
public class HtmlGreeter extends Greeter{
	
	private String tagName;

	public HtmlGreeter(String greeting) {
		super(greeting);
		tagName = "h1";
		
	}
	
	public HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		this.tagName = tagName;		
	}

	@Override
	public String greet(String name) {
		
		return "<" + tagName + ">" + super.greet(name) + "</" + tagName + ">";
	}
	
	
}
