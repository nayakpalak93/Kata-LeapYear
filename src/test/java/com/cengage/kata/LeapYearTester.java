package com.cengage.kata;
import org.junit.Assert;
import org.junit.Test;

import com.cengage.kata.LeapYear;

public class LeapYearTester {


	@Test
	public void verifyIfInputIsNumberWithValidInput() {
		String year = "2000";
		
		Assert.assertTrue(LeapYear.checkIfInputIsInteger(year)); //This should Pass
	}

	@Test
	public void verifyIfInputIsNumberWithInValidInput() {
		String year = "hb";
		Assert.assertFalse(LeapYear.checkIfInputIsInteger(year)); 	
	}

	@Test
	public void verifyIfNumberIsDivisibleByFour() {
		int number = 1900;
		Assert.assertTrue(LeapYear.checkIfNumberisDivisibleByFour(number)); 	
	}
	
	@Test
	public void verifyIfNumberisNotDivisibleByFour() {
		int number = 1901;
		Assert.assertFalse(LeapYear.checkIfNumberisDivisibleByFour(number)); 	
	}
	
	@Test
	public void verifyIfNumberisDivisibleByHundred() {
		int number = 100;
		Assert.assertTrue(LeapYear.checkIfNumberisDivisibleByHundred(number)); 	
	}
	
	@Test
	public void verifyIfNumberisNotDivisibleByHundred() {
		int number = 101;
		Assert.assertFalse(LeapYear.checkIfNumberisDivisibleByHundred(number)); 	
	}
	
	@Test
	public void verifyIfNumberisDivisibleByFourHundred() {
		int number = 400;
		Assert.assertTrue(LeapYear.checkIfNumberisDivisibleByFourHundred(number)); 	
	}
	
	@Test
	public void verifyIfNumberisNotDivisibleByFourHundred() {
		int number = 401;
		Assert.assertFalse(LeapYear.checkIfNumberisDivisibleByFourHundred(number)); 	
	}
	
}
