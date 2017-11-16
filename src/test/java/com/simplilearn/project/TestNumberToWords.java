package com.simplilearn.project;


import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class TestNumberToWords extends TestCase{
	
	private NumberToWords numberWords ;


    public TestNumberToWords() {
       numberWords = new NumberToWords() ;
    }
	
	
	@Test
	public void testNegative() {
		int number = -10;
		String numName="Minus Ten";
		String msg = numberWords.convert(number);
		Assert.assertEquals( numName, numName, msg) ;
	}
	
	@Test
	public void testTens() {
		int number = 79;
		String numName="Seventy Nine";
		Assert.assertEquals( numName, numName, numberWords.convert(number) ) ;
	}
	
	@Test
	public void testHundred() {
		int number = 145;
		String numName="One Hundred Forty Five";
		Assert.assertEquals( numName, numName, numberWords.convert(number) ) ;
	}
	
	@Test
	public void testThousand() {
		int number = 1245;
		String numName="One Thousand Two Hundred Forty Five";
		Assert.assertEquals(numName , numName, numberWords.convert(number) ) ;
	}
	
	@Test
	public void testLakhs() {
		int number = 100002;
		String numName="One Lakh Two";
		Assert.assertEquals(numName, numName, numberWords.convert(number) ) ;
	}
	
	@Test
	public void testCrores() {
		int number = 53231234;
		String numName = "Five Crore Thirty Two Lakh Thirty One Thousand Two Hundred Thirty Four";
		Assert.assertEquals( numName, numName, numberWords.convert(number) ) ;
	}

	// Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
    
}
