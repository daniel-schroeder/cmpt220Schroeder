/**
 * Daniel Schroeder
 * 2/8/2107
 * Section 201
 * Project 2
 * version 1
 */
import java.util.Scanner;
import java.util.ArrayList;
public class HotelRooms extends Hotel {

  boolean isOccupied = false;
  int floorNumber = 0;
  int dateOfArrival;

  public HotelRooms() {}

  public HotelRooms(int floorNum) {
    floorNumber = floorNum;
  }

  public boolean singleRoomAvailable(int date) {
    if (singleRoomsAvailable.isEmpty()) {
      return false;
    }
    return true;
  }

  public boolean doubleRoomAvailable(int date) {
    if (doubleRoomsAvailable.isEmpty()) {
      return false;
    }
    return true;
  }

  public boolean penthouseAvailable(int date) {
    if (penthouseRoomsAvailable.isEmpty()) {
      return false;
    }
    return true;
  }
}
