package com.tasks;

import java.util.Scanner;

public class LargestDigitInANumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int num = sc.nextInt();
	        
	        int greater = 0; // stores largest digit
	        
	        while (num > 0) {
	            int digit = num % 10; // get last digit
	            if (digit > greater) {
	                greater = digit;
	            }
	            num = num / 10; // remove last digit
	        }
	        
	        System.out.println(greater);
	        
	        sc.close(); // good practice to close Scanner
	    }
	
	

}
