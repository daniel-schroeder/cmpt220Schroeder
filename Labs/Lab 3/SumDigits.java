/**
 * Daniel Schroeder
 * 2/20/2107
 * Section 201
 * Lab 3
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class SumDigits {
  //prompts the user to enter a number then calls the sumDigits() function
  //then prints out the sum after recieving a value from sumDigits()
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer ");
    int givenNumber = input.nextInt();
    System.out.println("The sum of the digits is " + sumDigits(givenNumber));
  }  
  
  //sums the digits of n and returns that sum
  public static int sumDigits(long n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}