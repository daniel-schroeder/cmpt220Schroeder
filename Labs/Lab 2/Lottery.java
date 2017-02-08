/**
 * Daniel Schroeder
 * 2/7/2107
 * Section 201
 * Lab 2
 * version 1
 */
import java.util.Scanner;
public class Lottery {
  //this method generates a random number and asks the user to input a number as well
  //and then compares the two to see if they match at all
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    int lotteryNumber = (int) (Math.random() * 1000);
    System.out.print("Please enter your guess (three digits): ");
    int guess = input.nextInt();
    int numberMatching = 0;
    int guessCopy = guess;
    int lotteryNumberCopy = lotteryNumber;
    int guessDigit3 = guessCopy % 10;
    guessCopy /= 10;
    int guessDigit2 = guessCopy % 10;
    guessCopy /= 10;
    int guessDigit1 = guessCopy % 10;
    int lotteryDigit3 = lotteryNumberCopy % 10;
    lotteryNumberCopy /= 10;
    int lotteryDigit2 = lotteryNumberCopy % 10;
    lotteryNumberCopy /= 10;
    int lotteryDigit1= lotteryNumberCopy % 10;
    if (guess == lotteryNumber) {
      numberMatching = 3;
    }
    else if ((guessDigit1 == lotteryDigit2
          || guessDigit1 == lotteryDigit3)
          && (guessDigit2 == lotteryDigit1
          || guessDigit2 == lotteryDigit3)
          && (guessDigit3 == lotteryDigit1
          || guessDigit3 == lotteryDigit2)) {
            numberMatching = 2;
          }
    else if (guessDigit1 == lotteryDigit1
          || guessDigit1 == lotteryDigit2
          || guessDigit1 == lotteryDigit3
          || guessDigit2 == lotteryDigit1
          || guessDigit2 == lotteryDigit2
          || guessDigit2 == lotteryDigit3
          || guessDigit3 == lotteryDigit1
          || guessDigit3 == lotteryDigit2
          || guessDigit3 == lotteryDigit3) {
            numberMatching = 1;
          }
    switch (numberMatching) {
      case 0: System.out.print("Sorry try again!"); break;
      case 1: System.out.print("Matched one digit! You win $1,000!"); break;
      case 2: System.out.print("Matched all three digits! You win $3,000!"); break;
      case 3: System.out.print("Exact match! You win $10,000!"); break;
    }
  }
}