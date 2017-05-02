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
      + " How can we help you today? Enter\n1 for main menu\n2 to exit.");
    int menu = input.nextInt();
    if (menu == 1) {
      HotelReservations hr = new HotelReservations();
      hr.mainMenu();
    }
    else {
      System.out.println("\nHave a nice day! We hope to see you again soon.");
      return;
    }
  }

  public void mainMenu() {
    Scanner input = new Scanner(System.in);
    System.out.println("\nWhat would you like to do? Enter\n1 for make payment\n2"
      + " for cancel reservation\n3 to make a new reservation\n0 to exit.");
    int action = input.nextInt();
    if (action == 1) {
      System.out.println("\nWhat is your reservation last name?");
      String name = input.next();
      for (int i = 0; i < guests.size(); i++) {
        if (guests.get(i).guestName.equals(name)) {
          this.makePayment(name);
        }
      }
      System.out.println("\nNo reservation found under this name\n");
      mainMenu();
    }
    else if (action == 2) {
      System.out.println("\nWhat is your reservation last name?");
      String name = input.next();
      for (int i = 0; i < guests.size(); i++) {
        if (guests.get(i).guestName.equals(name)) {
          this.cancelReservation(name);
        }
      }
      System.out.println("\nNo reservation found under this name\n");
      mainMenu();
    }
    else if (action == 3) {
      if (singleRoomsAvailable.size() == 0 &&
        doubleRoomsAvailable.size() == 0 &&
        penthouseRoomsAvailable.size() == 0) {
          System.out.println("\nSorry there are no rooms available at this time. "
            + "We hope to see you soon\n");
        mainMenu();
        }
      System.out.println("\nPlease enter your last name.");
      String name = input.next();
      HotelReservations guest = new HotelReservations(name);
      guests.add(guest);
      guest.reservation();
    }
    else {
      System.out.println("\nHave a nice day! We hope to see you again soon.\n");
      System.exit(0);
    }
  }

  public void reservation() {
    Scanner input = new Scanner(System.in);

    System.out.println("\nEnter arrival date (MM/DD/YYYY):");
    String givenArrivalDate = input.next();

    arrivalMonth = Integer.parseInt(givenArrivalDate.substring(0,2));
    arrivalDay = Integer.parseInt(givenArrivalDate.substring(3,5));
    arrivalYear = Integer.parseInt(givenArrivalDate.substring(6,10));

    System.out.println("\nEnter departure date (MM/DD/YYYY):");
    String givenDepartureDate = input.next();

    departureMonth = Integer.parseInt(givenDepartureDate.substring(0,2));
    departureDay = Integer.parseInt(givenDepartureDate.substring(3,5));
    departureYear = Integer.parseInt(givenDepartureDate.substring(6,10));

    roomSelection1();
  }

  public void roomSelection1() {
    Scanner input = new Scanner(System.in);

    System.out.println("\nWhat type of room would you like? Enter\n1 for a single"
      + " ($100)\n2 for a double ($150)\n3 for a penthouse ($200)\nIf you need"
      + " more than one type enter the first now and then you'll have a chance"
      + " to add another.");
    int requestedRoomType = input.nextInt();

    System.out.println("\nHow many rooms of this type would you like?");
    int numRoomsRequested = input.nextInt();

    if (requestedRoomType == 1) {
      if(!singleRoomAvailable(numRoomsRequested)) {
        System.out.println("\nSorry there are " + singleRoomsAvailable.size()
          + " rooms of this type left");
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
        System.out.println("\nSorry there are " + doubleRoomsAvailable.size()
          + " rooms of this type left");
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
        System.out.println("\nSorry there are " + penthouseRoomsAvailable.size()
          + " rooms of this type left ");
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

    System.out.println("\nWould you like another type of room? Enter\n0 for no"
      + " other rooms\n1 for a single ($100)\n2 for a double ($150)\n3 for a"
      + " penthouse ($200)");
    int requestedRoomType2 = input.nextInt();

    if (requestedRoomType2 != 0) {
      System.out.println("\nHow many rooms of this type would you like?");
      int numRoomsRequested2 = input.nextInt();

      if (requestedRoomType2 == 1) {
        if(!singleRoomAvailable(numRoomsRequested2)) {
          System.out.println("\nSorry there are " + singleRoomsAvailable.size()
            + " rooms of this type left");
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
          System.out.println("\nSorry there are " + doubleRoomsAvailable.size()
            + " rooms of this type left");
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
          System.out.println("\nSorry there are " + penthouseRoomsAvailable.size()
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

    System.out.println("\nWould you like another type of room? Enter\n0 for no"
      + " other rooms\n1 for a single ($100)\n2 for a double ($150)\n3 for a"
      + " penthouse ($200)");
    int requestedRoomType3 = input.nextInt();

    if (requestedRoomType3 != 0) {
      System.out.println("\nHow many rooms of this type would you like?");
      int numRoomsRequested3 = input.nextInt();

      if (requestedRoomType3 == 1) {
        if(!singleRoomAvailable(numRoomsRequested3)) {
          System.out.println("\nSorry there are " + singleRoomsAvailable.size()
            + " rooms of this type left ");
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
          System.out.println("\nSorry there are " + doubleRoomsAvailable.size()
            + " rooms of this type left");
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
          System.out.println("\nSorry there are " + penthouseRoomsAvailable.size()
            + " rooms of this type left");
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
    System.out.println("\nThank you for your reservation. Would you like to pay" +
      " now or upon arrival? Enter\n1 for pay now\n2 for pay upon arrival.");
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
    System.out.println("\nType \"CONFIRM\" to confirm your cancelation"
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
      System.out.println("\nYour reservation has been cancelled. We hope to see "
        + "you soon");
      mainMenu();
    }
    else {
      System.out.println("\nSorry that was not a valid response.");
      cancelReservation(lastName);
    }
  }

  public void makePayment(String lastName) {
    Scanner input = new Scanner(System.in);
    int price = 0;

    int i = this.roomType;
    if (i == 1) {
      price = price + 100 * numRooms;
    }
    else if (i == 2) {
      price = price + 150 * numRooms;
    }
    else {
      price = price + 200 * numRooms;
    }

    int m = this.roomType2;
    if (m == 1) {
      price = price + 100 * numRooms2;
    }
    else if (m == 2) {
      price = price + 150 * numRooms2;
    }
    else {
      price = price + 200 * numRooms2;
    }

    int j = this.roomType3;
    if (j == 1) {
      price = price + 100 * numRooms3;
    }
    else if (j == 2) {
      price = price + 150 * numRooms3;
    }
    else {
      price = price + 200 * numRooms3;
    }
    System.out.println("\nThe price is $" + price);
    System.out.println("\nHow would you like to pay? Enter\n1 for credit/debit"
      + " card\n2 for paypal");
    int paymentMethod = input.nextInt();
    if (paymentMethod == 1) {
      System.out.println("\nEnter the name on the card");
      String name = input.next();

      System.out.println("\nEnter the card number (just numbers)");
      String  cardNum = input.next();

      System.out.println("\nEnter the expiration date");
      String expireDate = input.next();

      System.out.println("\nEnter the security code");
      int securityCode = input.nextInt();

      System.out.println("\nEnter the billing address (Street, City, State, Zip)");
      String address = input.next();

      System.out.println("\nYour reservation has been paid for. Thank you");
      mainMenu();
    }
    else {
      System.out.println("\nEnter paypal username");
      String username = input.next();

      System.out.println("\nEnter paypal password");
      String password = input.next();
    }
    mainMenu();
  }
}
