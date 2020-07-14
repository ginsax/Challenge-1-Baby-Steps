package calculator_integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerCalculatorTest {
	
	private IntegerCalculator mCalculator;
	
	
	@BeforeEach
	public void setup() {
		mCalculator = new IntegerCalculator();
	}
	
	@AfterEach
	public void teardown() {
		mCalculator = null;
	}
	
	@Test
	void testAddition_00_00() {
		final int input_0 = 0;
		final int input_1 = 0;
		
		final int expected = 0;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_01() {
		final int input_0 = 0;
		final int input_1 = 1;
		
		final int expected = 1;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_02() {
		final int input_0 = 0;
		final int input_1 = 2;
		
		final int expected = 2;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_03() {
		final int input_0 = 0;
		final int input_1 = 3;
		
		final int expected = 3;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_04() {
		final int input_0 = 0;
		final int input_1 = 4;
		
		final int expected = 4;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_05() {
		final int input_0 = 0;
		final int input_1 = 5;
		
		final int expected = 5;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_06() {
		final int input_0 = 0;
		final int input_1 = 6;
		
		final int expected = 6;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_07() {
		final int input_0 = 0;
		final int input_1 = 7;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_08() {
		final int input_0 = 0;
		final int input_1 = 8;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_00_09() {
		final int input_0 = 0;
		final int input_1 = 9;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_01_00() {
		final int input_0 = 1;
		final int input_1 = 0;
		
		final int expected = 1;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_01() {
		final int input_0 = 1;
		final int input_1 = 1;
		
		final int expected = 2;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_02() {
		final int input_0 = 1;
		final int input_1 = 2;
		
		final int expected = 3;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_03() {
		final int input_0 = 1;
		final int input_1 = 3;
		
		final int expected = 4;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_04() {
		final int input_0 = 1;
		final int input_1 = 4;
		
		final int expected = 5;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_05() {
		final int input_0 = 1;
		final int input_1 = 5;
		
		final int expected = 6;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_06() {
		final int input_0 = 1;
		final int input_1 = 6;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_07() {
		final int input_0 = 1;
		final int input_1 = 7;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_08() {
		final int input_0 = 1;
		final int input_1 = 8;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_01_09() {
		final int input_0 = 1;
		final int input_1 = 9;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_02_00() {
		final int input_0 = 2;
		final int input_1 = 0;
		
		final int expected = 2;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_01() {
		final int input_0 = 2;
		final int input_1 = 1;
		
		final int expected = 3;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_02() {
		final int input_0 = 2;
		final int input_1 = 2;
		
		final int expected = 4;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_03() {
		final int input_0 = 2;
		final int input_1 = 3;
		
		final int expected = 5;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_04() {
		final int input_0 = 2;
		final int input_1 = 4;
		
		final int expected = 6;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_05() {
		final int input_0 = 2;
		final int input_1 = 5;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_06() {
		final int input_0 = 2;
		final int input_1 = 6;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_07() {
		final int input_0 = 2;
		final int input_1 = 7;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_08() {
		final int input_0 = 2;
		final int input_1 = 8;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_02_09() {
		final int input_0 = 2;
		final int input_1 = 9;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_03_00() {
		final int input_0 = 3;
		final int input_1 = 0;
		
		final int expected = 3;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_01() {
		final int input_0 = 3;
		final int input_1 = 1;
		
		final int expected = 4;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_02() {
		final int input_0 = 3;
		final int input_1 = 2;
		
		final int expected = 5;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_03() {
		final int input_0 = 3;
		final int input_1 = 3;
		
		final int expected = 6;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_04() {
		final int input_0 = 3;
		final int input_1 = 4;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_05() {
		final int input_0 = 3;
		final int input_1 = 5;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_06() {
		final int input_0 = 3;
		final int input_1 = 6;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_07() {
		final int input_0 = 3;
		final int input_1 = 7;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_08() {
		final int input_0 = 3;
		final int input_1 = 8;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_03_09() {
		final int input_0 = 3;
		final int input_1 = 9;
		
		final int expected = 12;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_04_00() {
		final int input_0 = 4;
		final int input_1 = 0;
		
		final int expected = 4;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_01() {
		final int input_0 = 4;
		final int input_1 = 1;
		
		final int expected = 5;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_02() {
		final int input_0 = 4;
		final int input_1 = 2;
		
		final int expected = 6;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_03() {
		final int input_0 = 4;
		final int input_1 = 3;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_04() {
		final int input_0 = 4;
		final int input_1 = 4;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_05() {
		final int input_0 = 4;
		final int input_1 = 5;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_06() {
		final int input_0 = 4;
		final int input_1 = 6;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_07() {
		final int input_0 = 4;
		final int input_1 = 7;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_08() {
		final int input_0 = 4;
		final int input_1 = 8;
		
		final int expected = 12;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_04_09() {
		final int input_0 = 4;
		final int input_1 = 9;
		
		final int expected = 13;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_05_00() {
		final int input_0 = 5;
		final int input_1 = 0;
		
		final int expected = 5;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_01() {
		final int input_0 = 5;
		final int input_1 = 1;
		
		final int expected = 6;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_02() {
		final int input_0 = 5;
		final int input_1 = 2;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_03() {
		final int input_0 = 5;
		final int input_1 = 3;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_04() {
		final int input_0 = 5;
		final int input_1 = 4;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_05() {
		final int input_0 = 5;
		final int input_1 = 5;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_06() {
		final int input_0 = 5;
		final int input_1 = 6;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_07() {
		final int input_0 = 5;
		final int input_1 = 7;
		
		final int expected = 12;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_08() {
		final int input_0 = 5;
		final int input_1 = 8;
		
		final int expected = 13;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_05_09() {
		final int input_0 = 5;
		final int input_1 = 9;
		
		final int expected = 14;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_06_00() {
		final int input_0 = 6;
		final int input_1 = 0;
		
		final int expected = 6;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_01() {
		final int input_0 = 6;
		final int input_1 = 1;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_02() {
		final int input_0 = 6;
		final int input_1 = 2;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_03() {
		final int input_0 = 6;
		final int input_1 = 3;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_04() {
		final int input_0 = 6;
		final int input_1 = 4;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_05() {
		final int input_0 = 6;
		final int input_1 = 5;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_06() {
		final int input_0 = 6;
		final int input_1 = 6;
		
		final int expected = 12;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_07() {
		final int input_0 = 6;
		final int input_1 = 7;
		
		final int expected = 13;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_08() {
		final int input_0 = 6;
		final int input_1 = 8;
		
		final int expected = 14;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_06_09() {
		final int input_0 = 6;
		final int input_1 = 9;
		
		final int expected = 15;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_07_00() {
		final int input_0 = 7;
		final int input_1 = 0;
		
		final int expected = 7;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_01() {
		final int input_0 = 7;
		final int input_1 = 1;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_02() {
		final int input_0 = 7;
		final int input_1 = 2;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_03() {
		final int input_0 = 7;
		final int input_1 = 3;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_04() {
		final int input_0 = 7;
		final int input_1 = 4;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_05() {
		final int input_0 = 7;
		final int input_1 = 5;
		
		final int expected = 12;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_06() {
		final int input_0 = 7;
		final int input_1 = 6;
		
		final int expected = 13;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_07() {
		final int input_0 = 7;
		final int input_1 = 7;
		
		final int expected = 14;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_08() {
		final int input_0 = 7;
		final int input_1 = 8;
		
		final int expected = 15;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_07_09() {
		final int input_0 = 7;
		final int input_1 = 9;
		
		final int expected = 16;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_08_00() {
		final int input_0 = 8;
		final int input_1 = 0;
		
		final int expected = 8;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_01() {
		final int input_0 = 8;
		final int input_1 = 1;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_02() {
		final int input_0 = 8;
		final int input_1 = 2;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_03() {
		final int input_0 = 8;
		final int input_1 = 3;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_04() {
		final int input_0 = 8;
		final int input_1 = 4;
		
		final int expected = 12;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_05() {
		final int input_0 = 8;
		final int input_1 = 5;
		
		final int expected = 13;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_06() {
		final int input_0 = 8;
		final int input_1 = 6;
		
		final int expected = 14;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_07() {
		final int input_0 = 8;
		final int input_1 = 7;
		
		final int expected = 15;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_08() {
		final int input_0 = 8;
		final int input_1 = 8;
		
		final int expected = 16;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_08_09() {
		final int input_0 = 8;
		final int input_1 = 9;
		
		final int expected = 17;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
	@Test
	void testAddition_09_00() {
		final int input_0 = 9;
		final int input_1 = 0;
		
		final int expected = 9;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_01() {
		final int input_0 = 9;
		final int input_1 = 1;
		
		final int expected = 10;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_02() {
		final int input_0 = 9;
		final int input_1 = 2;
		
		final int expected = 11;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_03() {
		final int input_0 = 9;
		final int input_1 = 3;
		
		final int expected = 12;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_04() {
		final int input_0 = 9;
		final int input_1 = 4;
		
		final int expected = 13;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_05() {
		final int input_0 = 9;
		final int input_1 = 5;
		
		final int expected = 14;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_06() {
		final int input_0 = 9;
		final int input_1 = 6;
		
		final int expected = 15;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_07() {
		final int input_0 = 9;
		final int input_1 = 7;
		
		final int expected = 16;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_08() {
		final int input_0 = 9;
		final int input_1 = 8;
		
		final int expected = 17;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	@Test
	void testAddition_09_09() {
		final int input_0 = 9;
		final int input_1 = 9;
		
		final int expected = 18;
		final int actual = mCalculator.add(input_0,
		                                   input_1);
		
		final String message = String.format("Tests that [%d + %d = %d]",
		                                     input_0,
		                                     input_1,
		                                     input_0 + input_1);
		assertEquals(expected,
		             actual,
		             message);
	}
	
}
