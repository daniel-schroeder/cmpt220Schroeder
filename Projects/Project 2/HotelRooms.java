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
  int dateOfArrival;

  public HotelRooms() {}

  public boolean singleRoomAvailable(int numRoomsNeeded) {
    if (singleRoomsAvailable.size() < numRoomsNeeded) {
      return false;
    }
    return true;
  }

  public boolean doubleRoomAvailable(int numRoomsNeeded) {
    if (doubleRoomsAvailable.size() < numRoomsNeeded) {
      return false;
    }
    return true;
  }

  public boolean penthouseAvailable(int numRoomsNeeded) {
    if (penthouseRoomsAvailable.size() < numRoomsNeeded) {
      return false;
    }
    return true;
  }
}
