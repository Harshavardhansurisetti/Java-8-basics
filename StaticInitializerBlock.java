package com.tasks;

import java.util.Scanner;

public class StaticInitializerBlock {
	 public static boolean flag = intitializeClassVariable();
	    static int B;
	    static int H;
	    static boolean intitializeClassVariable(){
	        Scanner sc = new Scanner(System.in);
	         B = sc.nextInt();
	         H = sc.nextInt();
	         
	            if(B>0 && H>0){
	                return true;
	            }
	            else{
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	            return false;
	         }
	         
	    }
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}

}
