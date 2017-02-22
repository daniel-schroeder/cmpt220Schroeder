/**
 * Daniel Schroeder
 * 2/21/2107
 * Section 201
 * Lab 4
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class BubbleSort {
  public static void main (String [] args) {
    double [] enteredArr = new double[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers:");
    for (int i = 0; i < 10; i++) {
      enteredArr [i] = input.nextDouble();
    }
    double [] sortedArr = bubbleSort(enteredArr);
    for (int n = 0; n < sortedArr.length; n++) {
      System.out.print(sortedArr[n] + " ");
    }
  }
  
  public static double [] bubbleSort(double [] array) {
    for (int j = 0; j < array.length; j++) {
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i+1]) {
          double temp = array[i+1];
          array[i+1] = array[i];
          array[i] = temp;
        }
      }
    }
    return array;
  }
}