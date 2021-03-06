import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterAppTest {

	@Test
	void testGreet1() {
			Greeter testGreet1 = new Greeter("Hello");
			String expected = "Hello, Tristan!";
			String actual = testGreet1.greet("Tristan");
			assertEquals(expected, actual);
		}
	
	@Test 
	void testGreet2() {
			Greeter testGreet2 = new Greeter("Hiya");
			String expected = "Hiya, Triscuit!";
			String actual = testGreet2.greet("Triscuit");
			assertEquals(actual, expected);
	}
	
	@Test
	void testSimon1() {
		JavaScriptGreeter testSimon1 = new JavaScriptGreeter("Hello");
		String expected = "\"Simon says \"Hello, Tristan!\"\"";
		String actual = testSimon1.greet("Tristan");
		assertEquals(actual, expected);
	}
	
	@Test
	void testSimon2() {
		JavaScriptGreeter testSimon2 = new JavaScriptGreeter("Hiya");
		String expected = "\"Simon says \"Hiya, Triscuit!\"\"";
		String actual = testSimon2.greet("Triscuit");
		assertEquals(actual, expected);
	}
	
	@Test
	void testLoud1() {
		LoudGreeter testLoud1 = new LoudGreeter("Hello");
		String expected = "Hello, Tristan!!";
		String actual = testLoud1.greet("Tristan");
		assertEquals(expected, actual);
	}

	@Test
	void testLoud2() {
		LoudGreeter testLoud2 = new LoudGreeter("Hello");
		testLoud2.addVolume();
		String expected = "Hello, Tristan!!!";
		String actual = testLoud2.greet("Tristan");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoud3() {
		LoudGreeter testLoud3 = new LoudGreeter("Hello");
		testLoud3.addVolume();
		testLoud3.addVolume();
		testLoud3.addVolume();
		String expected = "Hello, Tristan!!!!!";
		String actual = testLoud3.greet("Tristan");
		assertEquals(expected, actual);
	}
	
	@Test
	void testHtml1() {
		HtmlGreeter testHtml1 = new HtmlGreeter("Hello");
		String expected = "<h1>Hello, Tristan!</h1>";
		String actual = testHtml1.greet("Tristan");
		assertEquals(expected, actual);
	}
	
	@Test
	void testHtml2() {
		HtmlGreeter testHtml2 = new HtmlGreeter("Hiya", "body");
		String expected = "<body>Hiya, Triscuit!</body>";
		String actual = testHtml2.greet("Triscuit");
		assertEquals(expected, actual);
	}
}
