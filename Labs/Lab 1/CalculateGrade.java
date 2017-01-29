/**
 * Daniel Schroeder
 * 1/29/2107
 * Section 201
 * Lab 1
 * version 1
 */
import java.util.Scanner;//imports the Scanner class from the java.util package
public class CalculateGrade {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in); //creates a new scanner object
    System.out.println("Please Enter the Following as a Percentage: ");
    System.out.print("Midterm Exam: ");
    double midtermGrade = input.nextInt();//creates a double using user input
    System.out.print("Final Exam: ");
    double finalGrade = input.nextInt();//creates a double using user input
    System.out.print("Projects: ");
    double projectGrade = input.nextInt();//creates a double using user input
    System.out.print("Homework and Labs: ");
    double homeworkAndLabGrade = input.nextInt();//creates a double using user input
    //the next two lines calculate the grade in the class
    double gradeInClass = (midtermGrade * .2) + (finalGrade * .2) +
                          (projectGrade *.2) + (homeworkAndLabGrade * .4);
    System.out.println("Your grade in the class is " + gradeInClass + "%");
  }
}
