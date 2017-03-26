/**
 * Daniel Schroeder
 * 3/21/2107
 * Section 201
 * Lab 5
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class Merge {
  //Sorts an array entered by the user using the selection sort style
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 sorted arrays. The first entered number"
      + "represents size of array.");
    
    int [] enteredArr1 = new int [input.nextInt()];
    
    //puts the numbers entered in an array
    for (int i = 0; i < enteredArr1.length; i++) {
      enteredArr1 [i] = input.nextInt();
    }
    
    int [] enteredArr2 = new int [input.nextInt()];
    
    //puts the numbers entered in an array
    for (int i = 0; i < enteredArr2.length; i++) {
      enteredArr2 [i] = input.nextInt();
    }
    
    int [] mergedArr = merge(enteredArr1, enteredArr2);
    
    //prints out each element of the sorted array
    for (int n = 0; n < mergedArr.length; n++) {
      System.out.print(mergedArr[n] + " ");
    }
  }
  
  //merges list1 and list2
  public static int[] merge(int [] list1, int [] list2) {
    int [] mergedArr = new int [list1.length + list2.length];
    int index1 = 0;
    int index2 = 0;
    
    
    for (int i = 0; i < mergedArr.length; i++) {
      //makes sure there is no Out of Bounds errors
      if (index1 < list1.length && index2 < list2.length) {
       
       //compares the next number in the two arrays
        if (list1[index1] <= list2[index2]) {
          mergedArr[i] = list1[index1];
          index1++;          
        }
        
        else {
          if (list2[index2] < list1[index1]) {
            mergedArr[i] = list2[index2];
            index2++;
          }
        }
      }
    }
    
    //finishes filling up mergedArr with whichever list was not fully used
    if (index1 == list1.length) {
      for (int i = index1 + index2; i < mergedArr.length; i++) {
        mergedArr[i] = list2[index2];
        index2 ++;
      }
    }
    
    if (index2 == list2.length) {
      for (int i = index1 + index2; i < mergedArr.length; i++) {
        mergedArr[i] = list1[index1];
        index1 ++;
      }
    }
  return mergedArr;
  }
} 