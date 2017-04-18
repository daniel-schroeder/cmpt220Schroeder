/**
 * Daniel Schroeder
 * 4/18/2107
 * Section 201
 * Lab 6
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class Location {

  public static int row = 0;
  public static int column = 0;
  public static double maxValue = 0;

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

    Location location = LocateLargest(enteredArr);
    System.out.println("The location of the largest element is " +
      location.maxValue + " (" + location.row + ", " + location.column + ")");
  }

  public static Location LocateLargest(double[][] arr) {
    Location loc = new Location();

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] > loc.maxValue) {
          loc.maxValue = arr [i][j];
          loc.row = i;
          loc.column = j;
        }
      }
    }

    return loc;
  }
}
