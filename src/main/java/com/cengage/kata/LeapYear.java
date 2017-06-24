package com.cengage.kata;
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String year = sc.nextLine();
		if(checkIfLeapYear(year)){
			System.out.println("Year is Leap Year");
		}else{
			System.out.println("Year is not a Leap Year");	
		}	
	}
	public static boolean checkIfInputIsInteger(String numberToCheck) {
		boolean result = false;
		try{
			Integer.parseInt(numberToCheck);
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		return result;
	}
	public static boolean checkIfNumberisDivisibleByFour(int numberToCheck) {
		boolean result = false;
		if(numberToCheck % 4 == 0)
		{
			result = true;
		}
		return result;
	}
	public static boolean checkIfNumberisDivisibleByHundred(int number) {
		boolean result = false;
		if(number % 100 == 0)
		{
			result = true;
		}
		return result;
	}
	public static boolean checkIfNumberisDivisibleByFourHundred(int number) {
		boolean result = false;
		if(number % 400 == 0)
		{
			result = true;
		}
		return result;
	}
	public static boolean checkIfLeapYear(String num) {
		boolean result = true;
		int number = Integer.parseInt(num);
		if(!checkIfInputIsInteger(num)){
			result = false;
		}
		else if(!checkIfNumberisDivisibleByFour(number) || (checkIfNumberisDivisibleByHundred(number) && !checkIfNumberisDivisibleByFourHundred(number))){
			result = false;
		}	
		return result;
	}
}
