/**
 * Daniel Schroeder
 * 2/20/2107
 * Section 201
 * Lab 3
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class FindLargestN {
  //finds the largest n such that n cubed is less than 12000
  public static void main (String [] args) {
    int n = 0;
    while (n * n * n < 12000) {
      n++;
    }
    System.out.println("The largest n such that n cubed is less than 12000 is " + (n - 1));
  }
}