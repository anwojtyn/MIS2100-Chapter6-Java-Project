package Wojtyna.Aliyah.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SImpleMathTest {

	
	@Test
	public void TestThatZeroNumeratorReturnsZero() {
		SimpleMath math = new SimpleMath();
		assertEquals(0, math.Divide(0,7),.001);
	}


	@Test
	public void TestThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath math = new SimpleMath();
		assertEquals(.25, math.Divide(1,4),.001);
	}
	
	@Test(expected=ArithmeticException.class)
	public void TestThatZeroDenominatorThrowsException() {
		SimpleMath math = new SimpleMath();
		math.Divide(6,0);
	}
	
	
	
}
