package com.blz.hotelreservation;

import java.util.*;

public class HotelReservationMain {
	
	public static void main(String[] args) {
		System.out.println("Wlcm To Hotel Reservation Program");
		
		HotelReservation hotelReservation = new HotelReservation();
		
		HotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80, 3);
		HotelReservation.addHotelDetails("Bridgewood", 110, 110, 60, 50, 4);
		HotelReservation.addHotelDetails("Ridgewood", 100, 110, 150, 40, 5);


		
	}

}
