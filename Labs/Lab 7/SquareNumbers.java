/**
 * Daniel Schroeder
 * 4/18/2107
 * Section 201
 * Lab 7
 * version 1
 * Software Developement 1
 */
import java.util.ArrayList;
import java.math.*;
public class SquareNumbers {
  public static void main(String[] args) {
    BigDecimal i = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal n = new BigDecimal(start);
    int count = 0;
    while (count < 10) {
      BigDecimal squared = n.multiply(n);
      if (squared.compareTo(i) > 0) {
        count++;
        System.out.println(count + ": " + squared);
      }
      n = n.add(BigDecimal.ONE);
    }
  }
}
