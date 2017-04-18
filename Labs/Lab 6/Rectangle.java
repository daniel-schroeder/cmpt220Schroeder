/**
 * Daniel Schroeder
 * 4/18/2107
 * Section 201
 * Lab 6
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class Rectangle {

  public static double width = 1.0;
  public static double height = 1.0;

  public Rectangle(){}

  public Rectangle(double w, double h) {
    width = w;
    height = h;
  }

  public static void main (String[] args) {
    Rectangle r1 = new Rectangle(4, 40);
    System.out.println("The width of r1 is " + r1.width);
    System.out.println("The height of r1 is " + r1.height);
    System.out.println("The area of r1 is " + r1.getArea());
    System.out.println("The perimeter of r1 is " + r1.getPerimeter());
    Rectangle r2 = new Rectangle(3.5, 35.9);
    System.out.println("The width of r2 is " + r2.width);
    System.out.println("The height of r2 is " + r2.height);
    System.out.println("The area of r2 is " + r2.getArea());
    System.out.println("The perimeter of r2 is " + r2.getPerimeter());
  }

  public static double getArea() {
    double area = (width * height);
    return area;
  }

  public static double getPerimeter() {
    double perimeter = (width + height);
    return perimeter;
  }

}
