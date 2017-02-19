/**
 * Daniel Schroeder
 * 2/19/2107
 * Section 201
 * Lab 3
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class CountNumbers {
  //takes input from the user and calculates the number of positives, number
  //of negatives, the sum, and the average.
  public static void main (String [] args) {
    double sum = 0;
    int numPositives = 0;
    int numNegatives = 0;
    double totalNumber = 0;
    int intEnteredByUser;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an interger, the input ends if it is 0: ");
    intEnteredByUser = input.nextInt();
    do {
      //adds one to the total number of positives if number entered is positive
      if (intEnteredByUser > 0) {
        numPositives ++;
      }
      //adds one to the total number of negatives if number entered is negative
      else if (intEnteredByUser < 0) {
        numNegatives ++;
      }
      else if (intEnteredByUser == 0) {
        System.out.print("No numbers are entered except for 0");
        return;
      }
      //adds one to the total number
      totalNumber ++;
      //adds the number entered to the total
      sum += intEnteredByUser;
      intEnteredByUser = input.nextInt();
    } while (intEnteredByUser != 0);
    
    double average = sum / totalNumber;
    
    System.out.println("The number of positives is " + numPositives);
    System.out.println("The number of negatives is " + numNegatives);
    System.out.println("The sum is " + sum);
    System.out.println("The average is " + average);
  }
}