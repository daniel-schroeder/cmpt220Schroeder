/**
 * Daniel Schroeder
 * 3/8/2107
 * Section 201
 * Project 1
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;

public class Driver_prj1 {
  /*This method takes input from the user for the size of two arrays and then 
  what will be in the arrays. It fills arr1 first then arr2 using user input
  It then calls convolveVectors and prints out the resulting array.*/
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double [] arr1 = new double[(int) input.nextDouble()];
    double [] arr2 = new double[(int) input.nextDouble()];
      
    //fills arr1
    for (int n = 0; n < arr1.length; n++) {
      arr1[n] = input.nextDouble();
    }
    //fills arr2
    for (int n = 0; n < arr2.length; n++) {
      arr2[n] = input.nextDouble();
    }
     
    //calls convolveVectors
    double [] answer = convolveVectors(arr1,arr2);
    
    //prints out the resulting array 
    for (int i = 0; i < answer.length; i++) {
      System.out.print(Math.round(answer[i]) + " ");
    }
  }  
  
  /*this method flips vSecond and then shifts it along vFirst multiplying 
  corresponding indicies and adding them together. It then takes the result and 
  places it at position index in vResult*/  
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    double [] flipped = new double[vSecond.length];
    
    //flips vSecond
    for (int i = 0; i < flipped.length; i++) {
      flipped[i] = vSecond[vSecond.length - 1 - i];
    }
    
    for (int index = 0; index < vResult.length; index++) {
      
      //initializes the index to 0
      vResult[index] = 0;
      
      for (int shift = 0; shift < vSecond.length; shift++) {
        
        /*the if statement ensures that only indicies within vFirst and vSecond
        are multiplied and there are no out of bounds errors*/
        if (index - shift < vFirst.length && index - shift >= 0) {
          vResult[index] += vFirst[index - shift] * vSecond[shift];
        }
      }
    }
  
    return vResult;  
    
  }

}
