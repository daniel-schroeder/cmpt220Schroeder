/**
 * Daniel Schroeder
 * 2/20/2107
 * Section 201
 * Lab 3
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class FindSmallestN {
  //finds the smallest n such that n squared is greater than 12000
  public static void main (String [] args) {
    int n = 0;
    while (n * n < 12000) {
      n++;
    }
    System.out.println("The smallest n such that n squared is greater than 12000 is " + n);
  }
}