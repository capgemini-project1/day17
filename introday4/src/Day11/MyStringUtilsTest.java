package Day11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStringUtilsTest {
	@Test
  public void stringTest() {
	 MyStringUtils msu = new MyStringUtils();
	String actualOutput = msu.greet("hello");
	assertEquals("Good Morning hello", actualOutput);
	
  }
}

