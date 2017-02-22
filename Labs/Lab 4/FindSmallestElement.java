/**
 * Daniel Schroeder
 * 2/21/2107
 * Section 201
 * Lab 4
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class FindSmallestElement {
  //finds the smallest element in an array given by the user
  public static void main (String [] args) {
    double [] enteredArr = new double[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers:");
    
    //puts the numbers entered in an array
    for (int i = 0; i < 10; i++) {
      enteredArr [i] = input.nextDouble();
    }
    System.out.println("The minimun number is " + min(enteredArr));
  }
  
  //finds the minimum double in array by comparing each
  //element to the smallest founnd so far
  public static double min (double [] array) {
    double min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }
}