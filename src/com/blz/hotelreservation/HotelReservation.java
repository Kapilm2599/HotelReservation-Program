package com.blz.hotelreservation;

public class HotelReservation {
	
	public void addHotelDetails(String hotelName, int weekdayRateForRegular, int weekendRateForRegular, int weekdayRateForReward,
			int weekendRateForReward, int hotelRatings) {
		
			Hotel hotel = new Hotel(hotelName, weekdayRateForRegular, weekendRateForRegular, weekdayRateForReward,
									weekendRateForReward, hotelRatings);
		
			hotelDetails.add(hotel);
		}
		
		public void gethotelDetails() {
			System.out.println(hotelDetails);
			
		}
		
		
	}

}
