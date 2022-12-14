package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
                
                // Todo 7: Create two classes for Freshman and Senior 
                
                // ToDo 8: The senior class should have a minimum of 85 credits  
		
		// ToDo 9: Add a toString method for Freshman class
		
                // ToDo 10: Add a toString method for Senior class
                
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
				
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
                
                //Using polymorphism to create new Student std1 but as a Freshman
                Student std1 = new Freshman("James", 20, 12); // name, age, credits
                
                //Using polymorphism to create new Student std2 but as a Senior
                Student std2 = new Senior("John", 30, 90);
                
                //Print the data for std1 and std2
                System.out.println(std1);
                System.out.println(std2);
                
                //Creating a new Senior that has less than 85 credits - will throw an IllegalArgumentException
                //Student std3 = new Senior("Melanie", 30, 80);
                //System.out.println(std3);
                
                //Entering the GPAs for std1 and std2 for ToDo 11
                System.out.println("Enter std1 GPA: ");
                Scanner s = new Scanner(System.in);
                int gpa1 = s.nextInt();
                std1.setGPA(gpa1);
                
                System.out.println("Enter std2 GPA: ");
                int gpa2 = s.nextInt();
                std2.setGPA(gpa2);
                
                //Printing the GPAs that the user entered for ToDo 11
                System.out.println("std1 gpa: " + std1.getGPA());
                System.out.println("std2 gpa: " + std2.getGPA());
                
                
	}

}