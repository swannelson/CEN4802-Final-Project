package square;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;


public class numberTest {

	@Test
	public void test() {
		int x = 3;
		number test = new number();
		int outputSquare = test.squared(x);
		assertEquals(9, outputSquare);
		boolean outputDiv = test.isDivisibleBy10(x);
		assertEquals(false, outputDiv);
		
		int y = 20;
		number test2 = new number();
		int output2Square = test2.squared(y);
		assertEquals(400, output2Square);
		boolean output2Div = test2.isDivisibleBy10(y);
		assertEquals(true, output2Div);
		
		int z = 405;
		number test3 = new number();
		int output3Square = test3.squared(z);
		assertEquals(164025, output3Square);
		boolean output3Div = test3.isDivisibleBy10(z);
		assertEquals(false, output3Div);
	}

}
