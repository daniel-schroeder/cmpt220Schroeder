/**
 * Daniel Schroeder
 * 2/7/2107
 * Section 201
 * Lab 2
 * version 1
 */
import java.util.Scanner;
public class AreaOfRegularPolygon {
  //computes the area of a polygon based on user inputted side numbers and length
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    double numSides = input.nextDouble();
    System.out.print("Enter the side length: ");
    double sideLength = input.nextDouble();
    double area = (numSides * Math.pow(sideLength, 2)) 
      / (4 * Math.tan((Math.PI/numSides)));
    System.out.print("The area of the polygon is " + area);
  }
}