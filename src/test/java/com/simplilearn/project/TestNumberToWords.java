package com.simplilearn.project;

import static org.junit.Assert.*;

import java.text.NumberFormat;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestNumberToWords extends TestCase{
	
	@BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }
	
	/**
    * @return the suite of tests being tested
    */
   public static TestSuite suite()
   {
       return new TestSuite( TestNumberToWords.class );
   }

	
	@Test
	public void testNegative() {
		int number = -10;
		String sNumber = NumberToWords.convert(number);
//		System.out.println(NumberFormat.getInstance().format(number) + "='" + sNumber + "'");
		assertTrue(sNumber.equalsIgnoreCase("Minus Ten"));
	}
	
	@Test
	public void testTens() {
		int number = 79;
		String sNumber = NumberToWords.convert(number);
		assertTrue(sNumber.equalsIgnoreCase("Seventy Nine"));
	}

	@Test
	public void testHundred() {
		int number = 145;
		String sNumber = NumberToWords.convert(number);
		assertTrue(sNumber.equalsIgnoreCase("One Hundred Forty Five"));		
	}
	
	@Test
	public void testThousand() {
		int number = 1245;
		String sNumber = NumberToWords.convert(number);
		assertTrue(sNumber.equalsIgnoreCase("One Thousand Two Hundred Forty Five"));	
	}
	
	@Test
	public void testLakhs() {
		int number = 100002;
		String sNumber = NumberToWords.convert(number);
		assertTrue(sNumber.equalsIgnoreCase("One Lakh Two"));	
	}
	
	@Test
	public void testCrores() {
		int number = 53231234;
		String sNumber = NumberToWords.convert(number);
		assertTrue(sNumber.equalsIgnoreCase("Five Crore Thirty Two Lakh Thirty One Thousand Two Hundred Thirty Four"));	
	}

	// Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
}
