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
    createHotel();
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
      this.reservation();
    }
    else {
      System.out.println("Have a nice day! We hope to see you again soon.");
      System.exit(0);
    }
  }

  public void reservation() {
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

    roomSelection1();
  }

  public void roomSelection1() {
    Scanner input = new Scanner(System.in);

    System.out.println("What type of room would you like? Enter 1 for a single,"
      + " 2 for a double, or 3 for a penthouse. If you need more than one type"
      + " enter the first now and then you'll have a chance to add another");
    int requestedRoomType = input.nextInt();

    System.out.println("How many rooms of this type would you like?");
    int numRoomsRequested = input.nextInt();

    if (requestedRoomType == 1) {
      if(!singleRoomAvailable(numRoomsRequested)) {
        System.out.println("Sorry there are " + singleRoomsAvailable.size()
          + " rooms of this type left \n");
        roomSelection1();
      }
      else {
        roomType = requestedRoomType;
        numRooms = numRoomsRequested;
        while (numRoomsRequested > 0) {
          singleRoomsAvailable.remove(0);
          numRoomsRequested--;
        }
      }
    }
    else if (requestedRoomType == 2) {
      if(!doubleRoomAvailable(numRoomsRequested)) {
        System.out.println("Sorry there are " + doubleRoomsAvailable.size()
          + " rooms of this type left \n");
        roomSelection1();
      }
      else {
        roomType = requestedRoomType;
        numRooms = numRoomsRequested;
        while (numRoomsRequested > 0) {
          doubleRoomsAvailable.remove(0);
          numRoomsRequested--;
        }
      }
    }
    else {
      if (!penthouseAvailable(numRoomsRequested)) {
        System.out.println("Sorry there are " + penthouseRoomsAvailable.size()
          + " rooms of this type left \n");
        roomSelection1();
      }
      else {
        roomType = requestedRoomType;
        numRooms = numRoomsRequested;
        while (numRoomsRequested > 0) {
          penthouseRoomsAvailable.remove(0);
          numRoomsRequested--;
        }
      }
    }
    roomSelection2();
  }

  public void roomSelection2() {
    Scanner input = new Scanner(System.in);

    System.out.println("Would you like another type of room? Enter 0 for no"
      + " other rooms, 1 for a single, 2 for a double, or 3 for a penthouse");
    int requestedRoomType2 = input.nextInt();

    if (requestedRoomType2 != 0) {
      System.out.println("How many rooms of this type would you like?");
      int numRoomsRequested2 = input.nextInt();

      if (requestedRoomType2 == 1) {
        if(!singleRoomAvailable(numRoomsRequested2)) {
          System.out.println("Sorry there are " + singleRoomsAvailable.size()
            + " rooms of this type left \n");
          roomSelection2();
        }
        else {
          roomType2 = requestedRoomType2;
          numRooms2 = numRoomsRequested2;
          while (numRoomsRequested2 > 0) {
            singleRoomsAvailable.remove(0);
            numRoomsRequested2--;
          }
        }
      }
      else if (requestedRoomType2 == 2) {
        if(!doubleRoomAvailable(numRoomsRequested2)) {
          System.out.println("Sorry there are " + doubleRoomsAvailable.size()
            + " rooms of this type left \n");
          roomSelection2();
        }
        else {
          roomType2 = requestedRoomType2;
          numRooms2 = numRoomsRequested2;
          while (numRoomsRequested2 > 0) {
            doubleRoomsAvailable.remove(0);
            numRoomsRequested2--;
          }
        }
      }
      else {
        if (!penthouseAvailable(numRoomsRequested2)) {
          System.out.println("Sorry there are " + penthouseRoomsAvailable.size()
            + " rooms of this type left \n");
          roomSelection2();
        }
        else {
          roomType2 = requestedRoomType2;
          numRooms2 = numRoomsRequested2;
          while (numRoomsRequested2 > 0) {
            penthouseRoomsAvailable.remove(0);
            numRoomsRequested2--;
          }
        }
      }
      roomSelection3();
    }
    else {
      finishReservation();
    }
  }

  public void roomSelection3() {
    Scanner input = new Scanner(System.in);

    System.out.println("Would you like another type of room? Enter 0 for no"
      + " other rooms, 1 for a single, 2 for a double, or 3 for a penthouse");
    int requestedRoomType3 = input.nextInt();

    if (requestedRoomType3 != 0) {
      System.out.println("How many rooms of this type would you like?");
      int numRoomsRequested3 = input.nextInt();

      if (requestedRoomType3 == 1) {
        if(!singleRoomAvailable(numRoomsRequested3)) {
          System.out.println("Sorry there are " + singleRoomsAvailable.size()
            + " rooms of this type left \n");
          roomSelection3();
        }
        else {
          roomType3 = requestedRoomType3;
          numRooms3 = numRoomsRequested3;
          while (numRoomsRequested3 > 0) {
            singleRoomsAvailable.remove(0);
            numRoomsRequested3--;
          }
        }
      }
      else if (requestedRoomType3 == 2) {
        if(!doubleRoomAvailable(numRoomsRequested3)) {
          System.out.println("Sorry there are " + doubleRoomsAvailable.size()
            + " rooms of this type left \n");
          roomSelection3();
        }
        else {
          roomType3 = requestedRoomType3;
          numRooms3 = numRoomsRequested3;
          while (numRoomsRequested3 > 0) {
            doubleRoomsAvailable.remove(0);
            numRoomsRequested3--;
          }
        }
      }
      else {
        if (!penthouseAvailable(numRoomsRequested3)) {
          System.out.println("Sorry there are " + penthouseRoomsAvailable.size()
            + " rooms of this type left \n");
          roomSelection3();
        }
        else {
          roomType3 = requestedRoomType3;
          numRooms3 = numRoomsRequested3;
          while (numRoomsRequested3 > 0) {
            penthouseRoomsAvailable.remove(0);
            numRoomsRequested3--;
          }
        }
      }
    }
    else {
      finishReservation();
    }
    finishReservation();
  }

  public void finishReservation() {
    Scanner input = new Scanner(System.in);
    System.out.println("Thank you for your reservation. Would you like to pay" +
      " now or upon arrival? Enter 1 for now and 2 for upon arrival.");
    int choice = input.nextInt();
    if (choice == 1) {
      makePayment(this.reservationName);
    }
    else {
      this.mainMenu();
    }
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

      for (int i = 0; i < guests.size(); i++) {
        if (guests.get(i).guestName.equals(lastName)) {
          int j = guests.get(i).roomType;
          if (j == 1) {
            while (numRooms > 0) {
              singleRoomsAvailable.add(new SingleRoom());
              numRooms--;
            }
          }
          else if (j == 2) {
            while (numRooms > 0) {
              doubleRoomsAvailable.add(new DoubleRoom());
              numRooms--;
            }
          }
          else {
            while (numRooms > 0) {
              penthouseRoomsAvailable.add(new PenthouseRoom());
              numRooms--;
            }
          }

          int m = guests.get(i).roomType2;
          if (m == 1) {
            while (numRooms2 > 0) {
              singleRoomsAvailable.add(new SingleRoom());
              numRooms2--;
            }
          }
          else if (m == 2) {
            while (numRooms2 > 0) {
              doubleRoomsAvailable.add(new DoubleRoom());
              numRooms2--;
            }
          }
          else {
            while (numRooms2 > 0) {
              penthouseRoomsAvailable.add(new PenthouseRoom());
              numRooms2--;
            }
          }

          int n = guests.get(i).roomType3;
          if (n == 1) {
            while (numRooms3 > 0) {
              singleRoomsAvailable.add(new SingleRoom());
              numRooms3--;
            }
          }
          else if (n == 2) {
            while (numRooms3 > 0) {
              doubleRoomsAvailable.add(new DoubleRoom());
              numRooms3--;
            }
          }
          else {
            while (numRooms3 > 0) {
              penthouseRoomsAvailable.add(new PenthouseRoom());
              numRooms3--;
            }
          }
          guests.remove(i);
        }
      }
      System.out.println("Your reservation has been cancelled. We hope to see "
        + "you soon \n");
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
