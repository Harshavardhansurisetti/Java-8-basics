package com.tasks;

public class PalindromeFinder {

	public static void main(String[] args) {

		
		 String[] testNames = {"Madam", "Java", "Radar", "Level", "World", "noon"};

        for (String username : testNames) {
        	PalindromeFinder.palindrome(username);
        }

	}
	
	public static void palindrome(String a) {
	//	int a = s.length();
		//String result = "";
	
		
//			for(int i =(a-1);i>=0;i--) {
//				
//				char temp = s.charAt(i);
//				result += temp;
//				
//			}
		StringBuilder sb = new StringBuilder(a);   
        String result = sb.reverse().toString();
		
		
			if(result.equalsIgnoreCase(a)) {
				
				System.out.println(a);
			}
			
			
		
		
	}

}
