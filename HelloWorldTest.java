import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld test = new HelloWorld();
		assertEquals(test.printStr, "Hello World!");
	}

}
