/**
 * Daniel Schroeder
 * 2/20/2107
 * Section 201
 * Lab 3
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class Palindrome {
  //prompts the user to enter a number then calls the isPalindrome() function
  //then prints out whether or not the given number is a palindrome
  //after recieving a value from isPalindrome()
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer ");
    int givenNumber = input.nextInt();
    if (isPalindrome(givenNumber)) {
      System.out.println("The given number is a palindrome");
    }
    else {
      System.out.println("The given number is not a palindrome");
    }
  }
 
  //returns true if number is a palindrome 
  //calls the reverse function to check
  public static boolean isPalindrome(int number) {
    if (reverse(number) == number) {
      return true;
    }
    else {
      return false;
    }
  }
  
  //returns the reverse of number i.e. reverse(456) returns 654
  public static int reverse (int number) {
    String reversedNumberString = "";
    while (number > 0) {
      reversedNumberString = reversedNumberString + number % 10;
      number /= 10;
    }
    int reversedNumber = Integer.parseInt(reversedNumberString);
    return reversedNumber;
  }
}
  
