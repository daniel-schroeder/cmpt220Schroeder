/**
 * Daniel Schroeder
 * 2/8/2107
 * Section 201
 * Project 2
 * version 1
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Hotel {

  public static ArrayList<SingleRoom> singleRoomsAvailable = new ArrayList<SingleRoom>();
  public static ArrayList<DoubleRoom> doubleRoomsAvailable = new ArrayList<DoubleRoom>();
  public static ArrayList<PenthouseRoom> penthouseRoomsAvailable = new ArrayList<PenthouseRoom>();
  public static ArrayList<Guest> guests = new ArrayList<Guest>();

  public Hotel() {}

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

  public static void createHotel() {
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    singleRoomsAvailable.add(new SingleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    doubleRoomsAvailable.add(new DoubleRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
    penthouseRoomsAvailable.add(new PenthouseRoom());
  }
}
