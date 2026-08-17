package com.tasks;

import java.util.Scanner;

public class PalindromeNumberFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("Please enter number greater than 0");
			
		}
		int rev = 0;
		int temp =num;
		while(num>0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		
		if(rev == temp) {
			System.out.println("It is a palindrome number");
		}else {
			System.out.println("It is not a palindrome number");
		}
		
		sc.close();

	}

}
