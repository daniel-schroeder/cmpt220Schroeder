/**
 * Daniel Schroeder
 * 2/7/2107
 * Section 201
 * Lab 2
 * version 1
 */
import java.util.Scanner;
public class DisplayNumberOfDays {
  //this method displays the number of days in a given month
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    String month = "";
    int days = -1;
    System.out.print("Please enter a month number and a year: ");
    int monthNumber = input.nextInt();
    int year = input.nextInt();
    switch (monthNumber) {
      case 1: month = "January"; days = 31; break;
      case 2: month = "February"; days = 28; break;
      case 3: month = "March"; days = 31; break;
      case 4: month = "April"; days = 30; break;
      case 5: month = "May"; days = 31; break;
      case 6: month = "June"; days = 30; break;
      case 7: month = "July"; days = 31; break;
      case 8: month = "August"; days = 31; break;
      case 9: month = "September"; days = 30; break;
      case 10: month = "October"; days = 31; break;
      case 11: month = "November"; days = 30; break;
      case 12: month = "December"; days = 31; break;
    }
    System.out.println(month + " " + year + " had " + days + " days." );
  }
}