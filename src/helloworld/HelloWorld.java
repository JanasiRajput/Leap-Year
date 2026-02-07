package helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello World!");
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a year
        System.out.println("Enter a year to check if it's a leap year (NetBeans demo): ");   
        int year = scanner.nextInt();
        
        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.println("Hello World! Welcome to NetBeans Git Workflow!");
             
        scanner.close();
    }

    /**
     * Function to check if a year is a leap year
     * @param year
     */
    public static boolean isLeapYear(int year) {
        // Leap year rules:
        // 1. Divisible by 4 AND
        // 2. Not divisible by 100 OR divisible by 400
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
