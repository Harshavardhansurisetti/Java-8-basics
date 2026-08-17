package com.tasks;

import java.util.Scanner;

public class UserNameValidation {

	 public static String validateUsername(String username) {
	        if (username.length() < 5) 
	        	return "Invalid username";

	        char firstChar = username.charAt(0);
	        if (!Character.isLetter(firstChar)) 
	        	return "Invalid username";

	        if (username.contains(" ")) 
	        	return "Invalid username";

	        boolean hasDigit = false;

	        for (int i = 0; i < username.length(); i++) {
	            char ch = username.charAt(i);

	            if (!Character.isLetterOrDigit(ch)) 
	            	return "Invalid username";

	            if (Character.isDigit(ch)) 
	            	hasDigit = true;
	        }

	        if (!hasDigit) 
	        	return "Invalid username";

	        return "Valid username";
	    }

	    public static void main(String[] args) {
	        //String[] testUsernames = {"Harsha123", "123Harsha", "Har 123", "Ha123", "Harsha!", "Harsha", "H@1234", "H1234"};

//	        for (String username : testUsernames) {
//	            System.out.println("Username: " + username + " => " + validateUsername(username));
//	        }
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the user name: ");
	    	String username = sc.nextLine();
	    	
	    	String result = UserNameValidation.validateUsername(username);
	    	System.out.println(result);
	    	sc.close();
	    }

}
