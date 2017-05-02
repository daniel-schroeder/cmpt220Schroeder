/**
 * Daniel Schroeder
 * 4/30/2107
 * Section 201
 * Project 2
 * version 1
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Guest extends HotelRooms {

  String guestName = "";
  String reservationName = "";
  int numRooms = 0;
  int roomType = 0;
  int numRooms2 = 0;
  int roomType2 = 0;
  int numRooms3 = 0;
  int roomType3 = 0;
  int roomFloor = 1;
  int arrivalMonth = 0;
  int departureMonth = 0;
  int arrivalDay = 0;
  int departureDay = 0;
  int arrivalYear = 0;
  int departureYear = 0;

  public Guest() {}

  public Guest (String lastName) {
    guestName = lastName;
    reservationName = lastName;
  }
}
