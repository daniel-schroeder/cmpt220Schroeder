/**
 * Daniel Schroeder
 * 4/30/2107
 * Section 201
 * Project 2
 * version 1
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Guest extends Hotel {

  String guestName = "";
  int reservationID = 0;
  String reservationName = "";

  public Guest (String lastName) {
    guestName = lastName;
    reservationID = guests.indexOf(this);
    reservationName = lastName;
  }
}
