/**
 * Daniel Schroeder
 * 1/24/2107
 * Section 201
 * Lab 1
 * version 1
 */
import java.util.Scanner;//imports the Scanner class from the java.util package
public class ConvertToFahrenheit {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in); //creates a new scanner object
    System.out.print("Enter a degree in celsius: "); //asks the user to input a degree in celsius
    double celsius = input.nextDouble(); //creates a double using user input 
    double fahrenheit = (9.0 / 5.0) * celsius + 32; //calculates the temp. in fahrenheit
    System.out.println("The temperature in fahrenheit is" + fahrenheit); //prints out new temp
  }
}