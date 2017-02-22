/**
 * Daniel Schroeder
 * 2/21/2107
 * Section 201
 * Lab 4
 * version 1
 * Software Developement 1
 */
import java.util.Scanner;
public class ConvertBetweenFAndC {
  //prints out a list from 30-40 degrees celcius and the corresponding fahrenheits
  //and also prints out list from 30-120 degrees fahrenheit by 10's and corresponding
  //celcius values
  public static void main (String [] args) {
    System.out.println("Celcius       |           Fahrenheit");    
    int i = 40;
    while (i > 30) {
      System.out.println(i + "            |            " + celciusToFahrenheit(i));
      i--;
    }
    System.out.println();
    System.out.println("Fahrenheit    |            Celcius");
    int n = 120;
    while (n >= 30) {
      System.out.println(n + "            |            " + fahrenheitToCelcius(n));
      n = n - 10;
    }
  }
  
  //converts from celcius to fahrenheit
  public static double celciusToFahrenheit(double celcius) {
    double fahrenheit = (Math.round(((9.0/5.0) * celcius + 32) * 100) / 100.0);
    return fahrenheit;
  }
  
  //converts from fahrenheit to celcius
  public static double fahrenheitToCelcius(double fahrenheit) {
    double celcius = (Math.round(((5.0/9.0) * (fahrenheit - 32)) * 100) / 100.0);
    return celcius;
  }
}