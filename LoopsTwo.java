package com.tasks;

import java.util.Scanner;

public class LoopsTwo {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            double a = in.nextDouble();
	            double b = in.nextDouble();
	            double n = in.nextDouble();
	            for(double j = 0;j<n;j++){
	                double s =a;
	                int result =0;
	                for(double k = 0;k<=j;k++){
	                    double pow = Math.pow(2,k);
	                     s +=(pow*b);
	                      result = (int)s;
	                }
	                System.out.print(result+" ");
	            }
	            System.out.println();
	        }
	        in.close();

	}

}
