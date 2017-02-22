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
  //sorts an array given by the user
  public static void main (String [] args) {
    double [] enteredArr = new double[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers:");
    
    //puts the numbers entered in an array
    for (int i = 0; i < 10; i++) {
      enteredArr [i] = input.nextDouble();
    }
    
    double [] sortedArr = bubbleSort(enteredArr);
    
    //prints out each element of the sorted array
    for (int n = 0; n < sortedArr.length; n++) {
      System.out.print(sortedArr[n] + " ");
    }
  }
  
  //goes through the array checking each pair of numbers
  //and swapping them if necessary to order them from
  //least to greatest
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