/**
 * Daniel Schroeder
 * 2/6/2107
 * Section 201
 * Lab 2
 * version 1
 */
public class RandomMonth {
  //this method generates a random month
  public static void main (String [] args) {
    int month = (int) (Math.random() * 12 + 1.5);
    if (month == 1) {
      System.out.println("January");
    }
    else if (month == 2) {
      System.out.println("February");
    }
    else if (month == 3) {
      System.out.println("March");
    }
    else if (month == 4) {
      System.out.println("April");
    }
    else if (month == 5) {
      System.out.println("May");
    }
    else if (month == 6) {
      System.out.println("June");
    }
    else if (month == 7) {
      System.out.println("July");
    }
    else if (month == 8) {
      System.out.println("August");
    }
    else if (month == 9) {
      System.out.println("September");
    }
    else if (month == 10) {
       System.out.println("October");
    }
    else if (month == 11) {
       System.out.println("November");
    }
    else if (month == 12) {
       System.out.println("December");                  
    }
  }
}