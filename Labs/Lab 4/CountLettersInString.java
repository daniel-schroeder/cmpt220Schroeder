/**
 * Daniel Schroeder
 * 2/21/2107
 * Section 201
 * Lab 4
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class CountLettersInString {
  //counts the letters in a given string not including spaces
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    System.out.println("The number of letters in the string is "
      + CountLetters(input.nextLine()));
  }
  
  //goes through the string counting letters
  public static int CountLetters(String s) {
    int numLetters = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        numLetters ++;
      }
    }
    return numLetters;
  }
}