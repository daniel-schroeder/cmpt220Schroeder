/**
 * Daniel Schroeder
 * 3/21/2107
 * Section 201
 * Lab 5
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class SelectionSort {
  //Sorts an array entered by the user using the selection sort style
  public static void main (String [] args) {
    double [] enteredArr = new double[10];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers:");
    
    //puts the numbers entered in an array
    for (int i = 0; i < 10; i++) {
      enteredArr [i] = input.nextDouble();
    }
    
    double [] sortedArr = selectionSort(enteredArr);
    
    //prints out each element of the sorted array
    for (int n = 0; n < sortedArr.length; n++) {
      System.out.print(sortedArr[n] + " ");
    }
  }
  
  //sorts the array by finding the smallest number of the array and placing
  //it in the next smallest index
  public static double [] selectionSort(double [] array) {
    for (int i = 0; i < array.length - 1; i++) {
      double largest = array[i];
      int indexOfLargest = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] > largest) {
          largest = array[j];
          indexOfLargest = j;
        }
      }
      if (indexOfLargest != i) {
        array[indexOfLargest] = array[i]; 
        array[i] = largest;
      }
    }
    return array;
  }
}