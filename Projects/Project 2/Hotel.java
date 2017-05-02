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

  public static int availableRooms;
  public static int availableSingles = 25;
  public static int availableDoubles = 25;
  public static int availabalePenthouses = 10;

  public static ArrayList<Hotel> roomsAvailable = new ArrayList<Hotel>();
  public static ArrayList<Guest> guests = new ArrayList<Guest>();

  public Hotel() {}

  public static void main(String[] args) {
    roomsAvailable.add(new SingleRoom(1));
    roomsAvailable.add(new SingleRoom(1));
    roomsAvailable.add(new SingleRoom(1));
    roomsAvailable.add(new SingleRoom(1));
    roomsAvailable.add(new SingleRoom(1));
    roomsAvailable.add(new SingleRoom(2));
    roomsAvailable.add(new SingleRoom(2));
    roomsAvailable.add(new SingleRoom(2));
    roomsAvailable.add(new SingleRoom(2));
    roomsAvailable.add(new SingleRoom(2));
    roomsAvailable.add(new SingleRoom(3));
    roomsAvailable.add(new SingleRoom(3));
    roomsAvailable.add(new SingleRoom(3));
    roomsAvailable.add(new SingleRoom(3));
    roomsAvailable.add(new SingleRoom(3));
    roomsAvailable.add(new SingleRoom(4));
    roomsAvailable.add(new SingleRoom(4));
    roomsAvailable.add(new SingleRoom(4));
    roomsAvailable.add(new SingleRoom(4));
    roomsAvailable.add(new SingleRoom(4));
    roomsAvailable.add(new SingleRoom(5));
    roomsAvailable.add(new SingleRoom(5));
    roomsAvailable.add(new SingleRoom(5));
    roomsAvailable.add(new SingleRoom(5));
    roomsAvailable.add(new SingleRoom(5));
    roomsAvailable.add(new DoubleRoom(1));
    roomsAvailable.add(new DoubleRoom(1));
    roomsAvailable.add(new DoubleRoom(1));
    roomsAvailable.add(new DoubleRoom(1));
    roomsAvailable.add(new DoubleRoom(1));
    roomsAvailable.add(new DoubleRoom(2));
    roomsAvailable.add(new DoubleRoom(2));
    roomsAvailable.add(new DoubleRoom(2));
    roomsAvailable.add(new DoubleRoom(2));
    roomsAvailable.add(new DoubleRoom(2));
    roomsAvailable.add(new DoubleRoom(3));
    roomsAvailable.add(new DoubleRoom(3));
    roomsAvailable.add(new DoubleRoom(3));
    roomsAvailable.add(new DoubleRoom(3));
    roomsAvailable.add(new DoubleRoom(3));
    roomsAvailable.add(new DoubleRoom(4));
    roomsAvailable.add(new DoubleRoom(4));
    roomsAvailable.add(new DoubleRoom(4));
    roomsAvailable.add(new DoubleRoom(4));
    roomsAvailable.add(new DoubleRoom(4));
    roomsAvailable.add(new DoubleRoom(5));
    roomsAvailable.add(new DoubleRoom(5));
    roomsAvailable.add(new DoubleRoom(5));
    roomsAvailable.add(new DoubleRoom(5));
    roomsAvailable.add(new DoubleRoom(5));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
    roomsAvailable.add(new PenthouseRoom(6));
  }
}
