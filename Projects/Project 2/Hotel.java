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

  public static void main(String[] args) {
    singleRoomsAvailable.add(new SingleRoom(1));
    singleRoomsAvailable.add(new SingleRoom(1));
    singleRoomsAvailable.add(new SingleRoom(1));
    singleRoomsAvailable.add(new SingleRoom(1));
    singleRoomsAvailable.add(new SingleRoom(1));
    singleRoomsAvailable.add(new SingleRoom(2));
    singleRoomsAvailable.add(new SingleRoom(2));
    singleRoomsAvailable.add(new SingleRoom(2));
    singleRoomsAvailable.add(new SingleRoom(2));
    singleRoomsAvailable.add(new SingleRoom(2));
    singleRoomsAvailable.add(new SingleRoom(3));
    singleRoomsAvailable.add(new SingleRoom(3));
    singleRoomsAvailable.add(new SingleRoom(3));
    singleRoomsAvailable.add(new SingleRoom(3));
    singleRoomsAvailable.add(new SingleRoom(3));
    singleRoomsAvailable.add(new SingleRoom(4));
    singleRoomsAvailable.add(new SingleRoom(4));
    singleRoomsAvailable.add(new SingleRoom(4));
    singleRoomsAvailable.add(new SingleRoom(4));
    singleRoomsAvailable.add(new SingleRoom(4));
    singleRoomsAvailable.add(new SingleRoom(5));
    singleRoomsAvailable.add(new SingleRoom(5));
    singleRoomsAvailable.add(new SingleRoom(5));
    singleRoomsAvailable.add(new SingleRoom(5));
    singleRoomsAvailable.add(new SingleRoom(5));
    doubleRoomsAvailable.add(new DoubleRoom(1));
    doubleRoomsAvailable.add(new DoubleRoom(1));
    doubleRoomsAvailable.add(new DoubleRoom(1));
    doubleRoomsAvailable.add(new DoubleRoom(1));
    doubleRoomsAvailable.add(new DoubleRoom(1));
    doubleRoomsAvailable.add(new DoubleRoom(2));
    doubleRoomsAvailable.add(new DoubleRoom(2));
    doubleRoomsAvailable.add(new DoubleRoom(2));
    doubleRoomsAvailable.add(new DoubleRoom(2));
    doubleRoomsAvailable.add(new DoubleRoom(2));
    doubleRoomsAvailable.add(new DoubleRoom(3));
    doubleRoomsAvailable.add(new DoubleRoom(3));
    doubleRoomsAvailable.add(new DoubleRoom(3));
    doubleRoomsAvailable.add(new DoubleRoom(3));
    doubleRoomsAvailable.add(new DoubleRoom(3));
    doubleRoomsAvailable.add(new DoubleRoom(4));
    doubleRoomsAvailable.add(new DoubleRoom(4));
    doubleRoomsAvailable.add(new DoubleRoom(4));
    doubleRoomsAvailable.add(new DoubleRoom(4));
    doubleRoomsAvailable.add(new DoubleRoom(4));
    doubleRoomsAvailable.add(new DoubleRoom(5));
    doubleRoomsAvailable.add(new DoubleRoom(5));
    doubleRoomsAvailable.add(new DoubleRoom(5));
    doubleRoomsAvailable.add(new DoubleRoom(5));
    doubleRoomsAvailable.add(new DoubleRoom(5));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
    penthouseRoomsAvailable.add(new PenthouseRoom(6));
  }
}
