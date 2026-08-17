package com.tasks;

import java.util.Scanner;

public class EightMaySecondTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] student = new int[5][3];
		
		for(int i = 0;i<student.length;i++) {
			System.out.println("Enter 3 subject marks for student "+(i+1));
			for(int j = 0;j<student[i].length;j++) {
				student[i][j]= sc.nextInt();
			}
			
		}
		EightMaySecondTask em= new EightMaySecondTask();
		em.displayStudentAverages(student);
		em.findTopStudent(student);
		sc.close();
	}
	
	void displayStudentAverages(int[][] stud) {
		
		
		for(int i = 0;i<stud.length;i++) {
			int total = 0;
			for(int j = 0;j<stud[i].length;j++) {
				total += stud[i][j];
			}
			
		    int average = total/stud[i].length;
			System.out.println("Average of student "+(i+1)+" is "+average);
		}
	}
	
	void findTopStudent(int[][] stud) {
		int topperMarks = 0;
		
		int topper = 0;
		for(int i = 0;i<stud.length;i++) {
			int total = 0;
			for(int j = 0;j<stud[i].length;j++) {
				total += stud[i][j];	
			}
			
			if(total>topperMarks) {
				topperMarks = total;
				topper = i+1;
			}
			
		}
		System.out.println("Topper of the student is student "+ topper);
	}

}
