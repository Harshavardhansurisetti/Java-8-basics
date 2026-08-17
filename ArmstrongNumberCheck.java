package com.tasks;
import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number!");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        
        int n = String.valueOf(number).length(); // Count digits

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n); // Raise digit to the power of n
            number /= 10;
        }

        return result == originalNumber;
    }
}
