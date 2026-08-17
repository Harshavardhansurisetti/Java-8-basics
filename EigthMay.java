package com.tasks;

import java.util.Scanner;

public class EigthMay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 integers ");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		EigthMay em = new EigthMay();
		em.findEvenNumbers(arr);
		em.findMaxNumber(arr);
		sc.close();

	}
	
	void findEvenNumbers(int[] arr) {
		System.out.println("Even numbers in the given array: ");
		for(int a:arr) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
	}
	
		
	void findMaxNumber(int[]arr) {
		System.out.println("Largest number in the given array is :");
		int largestNumber = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>largestNumber) {
				largestNumber = arr[i];
			}
		}
		System.out.println(largestNumber);
		
		
		
	}
	

}
