/**
 * Daniel Schroeder
 * 2/8/2107
 * Section 201
 * Project 2
 * version 1
 */
import java.util.Scanner;
import java.util.ArrayList;
public class HotelReservations extends Hotel {

  int reservationID = 0;
  String reservationName = "";
  int numRooms = 0;
  int roomType = 0;
  int numRooms2 = 0;
  int roomType2 = 0;
  int numRooms3 = 0;
  int roomType3 = 0;
  int roomFloor = 1;
  int arrivalMonth = 0;
  int departureMonth = 0;
  int arrivalDay = 0;
  int departureDay = 0;
  int arrivalYear = 0;
  int departureYear = 0;

  public HotelReservations(String lastName) {
    reservationID = guests.indexOf(this);
    reservationName = lastName;
  }

  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Dans Super Cool Hotel for Super Cool People!"
      + " How can we help you today? Enter 1 for main menu or 2 to exit.");
    int menu = input.nextInt();
    if (menu == 1) {
      System.out.println("Please enter your last name.");
      HotelReservations hR = new HotelReservations(input.next());
      guests.add(hR);
      hR.mainMenu();
    }
    else {
      System.out.println("Have a nice day! We hope to see you again soon.");
      return;
    }
  }

  public void mainMenu() {
    Scanner input = new Scanner(System.in);
    System.out.println("What would you like to do? Enter 1 for make payment, 2"
      + " for cancel reservation, 3 for make a new reservation, or 0 to exit.");
    int action = input.nextInt();
    if (action == 1) {
      System.out.println("What is your reservation ID number?");
      this.makePayment(input.nextInt());
    }
    else if (action == 2) {
      System.out.println("What is your reservation ID number?");
      this.cancelReservation(input.nextInt());
    }
    else if (action == 3) {
      this.reserveRooms();
    }
    else {
      System.out.println("Have a nice day! We hope to see you again soon.");
      return;
    }
  }

  public void reserveRooms() {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter arrival date (MM/DD/YYYY):");
    String givenArrivalDate = input.next();

    arrivalMonth = Integer.parseInt(givenArrivalDate.substring(0,2));
    arrivalDay = Integer.parseInt(givenArrivalDate.substring(3,5));
    arrivalYear = Integer.parseInt(givenArrivalDate.substring(6,10));

    System.out.println("Enter departure date (MM/DD/YYYY):");
    String givenDepartureDate = input.next();

    departureMonth = Integer.parseInt(givenDepartureDate.substring(0,2));
    departureDay = Integer.parseInt(givenDepartureDate.substring(3,5));
    departureYear = Integer.parseInt(givenDepartureDate.substring(6,10));

    System.out.println("Which floor would you like to be on? Enter 1-6 please:");
    roomFloor = input.nextInt();

    System.out.println("What type of room would you like? Enter 1 for a single,"
      + " 2 for a double, or 3 for a penthouse. If you need more than one type"
      + " enter the first now and then you'll have a chance to add another");
    roomType = input.nextInt();

    System.out.println("How many rooms of this type would you like?");
    numRooms = input.nextInt();

    System.out.println("Would you like another type of room? Enter 0 for no"
      + " other rooms, 1 for a single, 2 for a double, or 3 for a penthouse");
    roomType2 = input.nextInt();

    if (roomType2 != 0) {
      System.out.println("How many rooms of this type would you like?");
      numRooms2 = input.nextInt();

      System.out.println("Would you like another type of room? Enter 0 for no"
        + " other rooms, 1 for a single, 2 for a double, or 3 for a penthouse");
      roomType3 = input.nextInt();

      if (roomType3 != 0) {
        System.out.println("How many rooms of this type would you like?");
        numRooms3 = input.nextInt();
      }
    }

    System.out.println("Thank you. Your reservation ID number is " + this.reservationID);
    System.out.println("");

    this.mainMenu();
  }

  public void cancelReservation(int reservationID) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type \"CONFIRM\" to confirm your cancelatiom"
      + "or \"CANCEL\" to go back.");
    String confirmation = input.next();
    if (confirmation.equals("CANCEL")) {

    }
    else if (confirmation.equals("CONFIRM")) {

    }
    else {
      System.out.println("Sorry that was not a valid response. Please type"
       + " \"CONFIRM\" to confirm your cancelation or \"CANCEL\" to go back.");
    }
  }

  public void makePayment(int reservationID) {

  }
}