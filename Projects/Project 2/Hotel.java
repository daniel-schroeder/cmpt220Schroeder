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

  public static int availableRooms = 60;
  public static int availableSingles = 25;
  public static int availableDoubles = 25;
  public static int availabalePenthouses = 10;

  public static ArrayList<SingleRoom> singleRoomsAvailable = new ArrayList<SingleRoom>();
  public static ArrayList<DoubleRoom> doubleRoomsAvailable = new ArrayList<DoubleRoom>();
  public static ArrayList<PenthouseRoom> penthouseRoomsAvailable = new ArrayList<PenthouseRoom>();
  public static ArrayList<Guest> guests = new ArrayList<Guest>();

  public Hotel() {}

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
