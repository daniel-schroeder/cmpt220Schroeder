/**
 * Daniel Schroeder
 * 2/7/2107
 * Section 201
 * Lab 2
 * version 1
 */
import java.util.Scanner;
public class SortIntegers {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int smallestInt = 0;
    int largestInt = 0;
    int middleInt = 0;
    System.out.print("Please enter three integers: ");
    int firstInt = input.nextInt();
    int secondInt = input.nextInt();
    int thirdInt = input.nextInt();
    if (firstInt <= secondInt && firstInt <= thirdInt) {
      smallestInt = firstInt;
    }
    else if (secondInt <= firstInt && secondInt <= thirdInt) {
      smallestInt = secondInt;
    }
    else if (thirdInt <= firstInt && thirdInt <= secondInt) {
      smallestInt = thirdInt;
    }
    if (firstInt >= secondInt && firstInt >= thirdInt) {
      largestInt = firstInt;
    }
    else if (secondInt >= firstInt && secondInt >= thirdInt) {
      largestInt = secondInt;
    }
    else if (thirdInt >= firstInt && thirdInt >= secondInt) {
      largestInt = thirdInt;
    }
    if ((firstInt <= secondInt && firstInt >= thirdInt) 
      || (firstInt >= secondInt && firstInt <= thirdInt)) {
      middleInt = firstInt;
    }
    else if ((secondInt >= firstInt && secondInt <= thirdInt)
          || (secondInt <= firstInt && secondInt >= thirdInt)) {
      middleInt = secondInt;
    }
    else if ((thirdInt <= firstInt && thirdInt >= secondInt)
          || (thirdInt >= firstInt && thirdInt <= secondInt)) {
      middleInt = thirdInt;
    }
    System.out.print(smallestInt + ", " + middleInt + ", " + largestInt);
  }
}