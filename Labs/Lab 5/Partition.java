/**
 * Daniel Schroeder
 * 3/21/2107
 * Section 201
 * Lab 5
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class Partition {
  
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an array. The first entered number"
      + "represents size of array.");
    
    int [] enteredArr = new int [input.nextInt()];
    
    //puts the numbers entered in an array
    for (int i = 0; i < enteredArr.length; i++) {
      enteredArr [i] = input.nextInt();
    }
    
    int [] partitionedArr = partition(enteredArr);
    
    System.out.print("The array after the partition is: ");
    for (int n = 0; n < partitionedArr.length; n++) {
      System.out.print(partitionedArr[n] + " ");
    }
  }
  
  public static int [] partition (int[] list) {
    int pivot = list[0];
    int[] partitionedArr = new int[list.length];
    int partitionedIndex = 0;
    
    for (int i = 0; i < list.length; i++) {
      if (list[i] < pivot) {
        partitionedArr[partitionedIndex] = list[i];
        partitionedIndex ++;
      }
    }
    
    partitionedArr[partitionedIndex] = pivot;
    partitionedIndex++;
    
    for (int i = 0; i < list.length; i++) {
      if (list[i] > pivot) {
        partitionedArr[partitionedIndex] = list[i];
        partitionedIndex ++;
      }
    }
    
    return partitionedArr;
  }
}