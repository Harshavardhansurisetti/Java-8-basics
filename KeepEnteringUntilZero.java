package com.tasks;

import java.util.Scanner;

public class KeepEnteringUntilZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int result = 0;
		while(num!=0) {
			result += num;
			num = sc.nextInt();
		}
		
		System.out.println("Result : "+ result);
		sc.close();
	}

}
