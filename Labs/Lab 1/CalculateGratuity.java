/**
 * Daniel Schroeder
 * 1/24/2107
 * Section 201
 * Lab 1
 * version 1
 */
import java.util.Scanner;//imports the Scanner class from the java.util package
public class CalculateGratuity {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in); //creates a new scanner object    
    //asks the user to input a subtotal and gratuity rate
    System.out.print("Enter the subtotal and gratuity rate in percent: "); 
    double subtotal = input.nextDouble(); //creates a double using user input 
    double gratuityRate = input.nextDouble(); //creates a double using user input 
    double gratuity = (gratuityRate / 100) * subtotal; //calculates the gratuity
    double total = subtotal + gratuity; //calculates the total
    //prints out total and gratuity
    System.out.println("Your gratuity is " + gratuity + " and your total is " + total); 
  }
}