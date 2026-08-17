package com.conditonalstatments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void countCharacters(String input) {
       Map<Character, Integer> charCount = new LinkedHashMap<>();
       System.out.println(input.toCharArray());
       for(char c:input.toCharArray()) {
 //   	   if(c==' ') 
//    		   continue;
    	   charCount.put(c, charCount.getOrDefault(c, 0)+1);
       }
       
       System.out.println("character counts in \""+input+"\":");
       for(Map.Entry<Character,Integer> entry : charCount.entrySet()) {
    	   System.out.println(entry.getKey()+"->"+entry.getValue());
       }
       System.out.println(charCount);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string:");
        String input = sc.nextLine();
        countCharacters(input);
        sc.close();
    }
}