/**
 * Daniel Schroeder
 * 2/8/2107
 * Section 201
 * Project 2
 * version 1
 */
import java.util.Scanner;
import java.util.ArrayList;
public class HotelReservations extends Guest  {

  public HotelReservations() {}

  public HotelReservations(String lastName) {
    super(lastName);
  }

  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Dans Super Cool Hotel for Super Cool People!"
      + " How can we help you today? Enter 1 for main menu or 2 to exit.");
    int menu = input.nextInt();
    if (menu == 1) {
      HotelReservations hr = new HotelReservations();
      hr.mainMenu();
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
      System.out.println("What is your reservation last name?");
      String name = input.next();
      for (int i = 0; i < guests.size(); i++) {
        if (guests.get(i).guestName.equals(name)) {
          this.makePayment(name);
        }
      }
      System.out.println("No reservation found under this name \n");
      mainMenu();
    }
    else if (action == 2) {
      System.out.println("What is your reservation last name?");
      String name = input.next();
      for (int i = 0; i < guests.size(); i++) {
        if (guests.get(i).guestName.equals(name)) {
          this.cancelReservation(name);
        }
      }
      System.out.println("No reservation found under this name \n");
      mainMenu();
    }
    else if (action == 3) {
      System.out.println("Please enter your last name.");
      String name = input.next();
      HotelReservations guest = new HotelReservations(name);
      guests.add(guest);
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
    int requestedRoomType = input.nextInt();

    System.out.println("How many rooms of this type would you like?");
    int numRoomsRequested = input.nextInt();

    if (requestedRoomType == 1) {
      singleRoomAvailable(numRoomsRequested);
    }
    else if (requestedRoomType == 2) {
      doubleRoomAvailable(numRoomsRequested);
    }
    else {
      penthouseAvailable(numRoomsRequested);
    }

    System.out.println("Would you like another type of room? Enter 0 for no"
      + " other rooms, 1 for a single, 2 for a double, or 3 for a penthouse");
    int requestedRoomType2 = input.nextInt();

    if (requestedRoomType2 != 0) {
      System.out.println("How many rooms of this type would you like?");
      int numRoomsRequested2 = input.nextInt();

      if (requestedRoomType2 == 1) {
        singleRoomAvailable(numRoomsRequested2);
      }
      else if (requestedRoomType2 == 2) {
        doubleRoomAvailable(numRoomsRequested2);
      }
      else {
        penthouseAvailable(numRoomsRequested2);
      }

      System.out.println("Would you like another type of room? Enter 0 for no"
        + " other rooms, 1 for a single, 2 for a double, or 3 for a penthouse");
      int requestedRoomType3 = input.nextInt();

      if (requestedRoomType3 != 0) {
        System.out.println("How many rooms of this type would you like?");
        int numRoomsRequested3 = input.nextInt();

        if (requestedRoomType3 == 1) {
          singleRoomAvailable(numRoomsRequested3);
        }
        else if (requestedRoomType3 == 2) {
          doubleRoomAvailable(numRoomsRequested3);
        }
        else {
          penthouseAvailable(numRoomsRequested3);
        }
      }
    }

    System.out.println("Thank you for your reservation");
    System.out.println("");

    this.mainMenu();
  }

  public void cancelReservation(String lastName) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type \"CONFIRM\" to confirm your cancelation"
      + " or \"CANCEL\" to go back.");
    String confirmation = input.next();
    if (confirmation.equals("CANCEL")) {
      mainMenu();
    }
    else if (confirmation.equals("CONFIRM")) {
      System.out.println("Your reservation has been cancelled. We hope to see "
        + "you soon \n");
      for (int i = 0; i < guests.size(); i++) {
        if (guests.get(i).guestName.equals(lastName)) {
          guests.remove(i);
        }
      }
      mainMenu();
    }
    else {
      System.out.println("Sorry that was not a valid response.");
      cancelReservation(lastName);
    }
  }

  public void makePayment(String lastName) {
    mainMenu();
  }
}
