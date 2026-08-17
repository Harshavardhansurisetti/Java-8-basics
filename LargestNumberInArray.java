package com.tasks;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int length = sc.nextInt();
		LargestNumberInArray ls = new LargestNumberInArray();
		int [] arr = new int[length];
		
		for(int i =0; i<arr.length;i++) {
			System.out.println("Enter number for place "+ (i+1));
			arr[i] = sc.nextInt();			
		}
		
		
		ls.findLargestAndSmallest(arr);
		sc.close();
		

	}
	void findLargestAndSmallest(int[] arr) {
		
		int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
		
		
		
	}
}
