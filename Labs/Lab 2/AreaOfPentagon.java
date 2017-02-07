/**
 * Daniel Schroeder
 * 2/7/2107
 * Section 201
 * Lab 2
 * version 1
 */
import java.util.Scanner;
public class AreaOfPentagon {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please provide the length from the center to a vertex: ");
    double r = input.nextDouble();
    double s = 2 * r * Math.sin((Math.PI/5));
    double area = Math.round((5 * Math.pow(s, 2)) / (4 * Math.tan((Math.PI/5))) * 100) / 100.0;
    System.out.print("The area of the pentagon is " + area);
  }
}