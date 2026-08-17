package com.tasks;

import java.util.Scanner;

public class SumOfMultiplesOf3And5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sumOfThree =0;
		int sumOfFive =0;
		for(int i =1;i<=num;i++) {
			if(i%3==0) {
				sumOfThree +=i;
			}
			
		}		
		for(int j =1;j<=num;j++) {
			 if(j%5==0) {
				sumOfFive +=j;
			}
		}
		System.out.println(sumOfThree+sumOfFive);
		sc.close();
	}

}
