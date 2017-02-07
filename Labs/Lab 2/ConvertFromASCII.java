/**
 * Daniel Schroeder
 * 2/7/2107
 * Section 201
 * Lab 2
 * version 1
 */
import java.util.Scanner;
public class ConvertFromASCII {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int aSCIICode = input.nextInt();
    char character = (char) aSCIICode;
    System.out.print("The character for ASCII code " + aSCIICode + " is " + character);
  }
}