package edu.grinnell.csc207.nguyenti.utils;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testConstruction() throws Exception {
		// TEST BASIC EZ STUFF
		Fraction newFracZ = new Fraction(BigInteger.valueOf(5),
				BigInteger.valueOf(2));
		// assertEquals("from string", new Fraction(BigInteger.valueOf(1),
		// BigInteger.valueOf(6)), new Fraction("1/6"));
		// assertSame("from double", newFracZ, new Fraction(2.5));
	}

	@Test
	public void testToString() throws Exception {
		Fraction newFrac = new Fraction(BigInteger.valueOf(1),
				BigInteger.valueOf(6));
		Fraction newFrac1 = new Fraction(BigInteger.valueOf(-1),
				BigInteger.valueOf(6));
		Fraction newFrac2 = new Fraction(BigInteger.valueOf(1),
				BigInteger.valueOf(-6));
		Fraction newFrac3 = new Fraction(BigInteger.valueOf(-1),
				BigInteger.valueOf(-6));
		Fraction newFrac4 = new Fraction(1, 6);
		Fraction newFrac5 = new Fraction(2.5);

		assertEquals("natural numerator + denom", "1/6", newFrac.toString());
		assertEquals("negative numerator", "-1/6", newFrac1.toString());
		assertEquals("negative denom", "-1/6", newFrac2.toString());
		assertEquals("negative numerator and denom", "1/6", newFrac3.toString());
		assertEquals("negative denom", "1/6", newFrac4.toString());
		assertEquals("from double test", "5/2", newFrac5.toString());
	}

	@Test
	public void testAdd() throws Exception {
		System.out.println(new Fraction(2, 3));
		// fail("Not yet implemented");
	}

	@Test
	public void testDoubleValue() {
		// fail("Not yet implemented");
	}

	@Test
	public void testZeroDenominator() {
		try {
			new Fraction(1, 0);
			fail("Zero denominator did not throw an exception");
		} catch (Exception e) {

		} // try/catch
	} // testZeroDenominator
} // FractionTest
