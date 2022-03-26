package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void negativetest() {
		JunitTesting test = new JunitTesting();
		test.divide(10, 0);
		
		//Exception exception = assertThrows(
				//ArithemeticException.class,
				//() -> test.divide(1, 0));
		
	//assertEquals("/ by zero", exception.getMessage());
		
		//assertTrue(exception.getMessage().contains("zero"));
				
			}

	@Test
	void posidtiveTest() {
		JunitTesting test = new JunitTesting();
		double positiveOutput = test.divide(20, 2);
		assertEquals(10,positiveOutput);
	}
}
