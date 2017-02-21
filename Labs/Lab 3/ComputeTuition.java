/**
 * Daniel Schroeder
 * 2/20/2107
 * Section 201
 * Lab 3
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class ComputeTuition {
  public static void main (String [] args) {
    double tuition = 10000;
    double totalTuition = 0;
    for (int i = 0; i < 10; i++) {
      tuition = tuition + (tuition * .05);
    }
    System.out.println("The tuition in ten years will be " + (Math.round(100*tuition)/100.0));
    for (int n = 0; n < 4; n++) {
      totalTuition += tuition;
    }
    System.out.println("The total tuition for 4 years of college is " + (Math.round(100*totalTuition)/100.0));
  }
}