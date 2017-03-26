/**
 * Daniel Schroeder
 * 3/26/2107
 * Section 201
 * Lab 5
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class LocateLargestElement {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns");
    
    double[][] enteredArr = new double [input.nextInt()][input.nextInt()];
    
    System.out.println("Enter the numbers for the array");
    
    //puts the numbers entered in an array
    for (int i = 0; i < enteredArr.length; i++) {
      for (int j = 0; j < enteredArr[0].length; j++) {
        enteredArr[i][j] = input.nextDouble();
      }
    }
    
    int[] result = LocateLargest(enteredArr);
    System.out.println("The location of the largest element is (" + result[0] + 
      ", " + result[1] + ")");
  }
  
  public static int[] LocateLargest(double[][] arr) {
    int[] result = {0,0};
    double largestSoFar = arr[0][0];
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] > largestSoFar) {
          largestSoFar = arr [i][j];
          result[0] = i;
          result[1] = j;
        }
      }
    }
    
    return result;
  }
}