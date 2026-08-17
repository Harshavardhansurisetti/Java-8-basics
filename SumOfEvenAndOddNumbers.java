package com.tasks;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int even = 0;
		int odd =0;
		for(int i =1; i<=num;i++) {
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
		}
		System.out.println("Even numbers sum : "+ even);
		System.out.println("Odd numbers sum : "+ odd);
		sc.close();
	}

}
