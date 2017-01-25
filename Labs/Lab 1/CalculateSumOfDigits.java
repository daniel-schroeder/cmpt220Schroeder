/**
 * Daniel Schroeder
 * 1/24/2107
 * Section 201
 * Lab 1
 * version 1
 */
import java.util.Scanner;//imports the Scanner class from the java.util package
public class CalculateSumOfDigits {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in); //creates a new scanner object
    System.out.print("Enter a number between 0 and 1000"); //asks user to give a number
    int givenNumber = input.nextInt(); //creates an int using user input 
    int firstDigit = givenNumber % 10; //creates an int which holds the digit in the ones place
    givenNumber /= 10; //removes the digit in the ones place
    int secondDigit = givenNumber %10; //creates an int which holds the new digit in the ones place
    givenNumber /= 10; //removes the digit in the ones place
    int thirdDigit = givenNumber %10; //creates an int which holds the new digit in the ones place
    int sum = firstDigit + secondDigit + thirdDigit; //calculates the sum of all digits
    System.out.println("The sum of the digits is " + sum); //prints out the sum of the digits
  }
}