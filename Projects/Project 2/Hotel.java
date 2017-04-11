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

  public static ArrayList<Hotel> rooms = new ArrayList<Hotel>();
  public static ArrayList<Hotel> guests = new ArrayList<Hotel>();

  public static void main(String[] args) {
    rooms.add(new SingleRoom(1));
    rooms.add(new SingleRoom(1));
    rooms.add(new SingleRoom(1));
    rooms.add(new SingleRoom(1));
    rooms.add(new SingleRoom(1));
    rooms.add(new SingleRoom(2));
    rooms.add(new SingleRoom(2));
    rooms.add(new SingleRoom(2));
    rooms.add(new SingleRoom(2));
    rooms.add(new SingleRoom(2));
    rooms.add(new SingleRoom(3));
    rooms.add(new SingleRoom(3));
    rooms.add(new SingleRoom(3));
    rooms.add(new SingleRoom(3));
    rooms.add(new SingleRoom(3));
    rooms.add(new SingleRoom(4));
    rooms.add(new SingleRoom(4));
    rooms.add(new SingleRoom(4));
    rooms.add(new SingleRoom(4));
    rooms.add(new SingleRoom(4));
    rooms.add(new SingleRoom(5));
    rooms.add(new SingleRoom(5));
    rooms.add(new SingleRoom(5));
    rooms.add(new SingleRoom(5));
    rooms.add(new SingleRoom(5));
    rooms.add(new DoubleRoom(1));
    rooms.add(new DoubleRoom(1));
    rooms.add(new DoubleRoom(1));
    rooms.add(new DoubleRoom(1));
    rooms.add(new DoubleRoom(1));
    rooms.add(new DoubleRoom(2));
    rooms.add(new DoubleRoom(2));
    rooms.add(new DoubleRoom(2));
    rooms.add(new DoubleRoom(2));
    rooms.add(new DoubleRoom(2));
    rooms.add(new DoubleRoom(3));
    rooms.add(new DoubleRoom(3));
    rooms.add(new DoubleRoom(3));
    rooms.add(new DoubleRoom(3));
    rooms.add(new DoubleRoom(3));
    rooms.add(new DoubleRoom(4));
    rooms.add(new DoubleRoom(4));
    rooms.add(new DoubleRoom(4));
    rooms.add(new DoubleRoom(4));
    rooms.add(new DoubleRoom(4));
    rooms.add(new DoubleRoom(5));
    rooms.add(new DoubleRoom(5));
    rooms.add(new DoubleRoom(5));
    rooms.add(new DoubleRoom(5));
    rooms.add(new DoubleRoom(5));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
    rooms.add(new PenthouseRoom(6));
  }
}
