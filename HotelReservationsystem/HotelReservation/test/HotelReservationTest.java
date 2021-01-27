package com.samplesuc9;

import org.junit.Test ;

import com.samplesuc6.Hotel;

import org.junit.Assert ;
import java.time.* ;
import java.util.Scanner;
public class HotelReservationTest {

//	@Test	
//	public void givenHotel_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
//		HotelReservation hotelReservation = new HotelReservation();
//		hotelReservation.addHotel("Lakewood", 110);
//		hotelReservation.addHotel("Bridegewood", 100);
//		boolean result = hotelReservation.addHotel("Ridgewood", 110);
//		Assert.assertEquals( result, result );
//	}    	
//	
//	@Test
//	public void givenDateRange_ShouldReturnCheapestHotel() {
//		HotelReservation hotelReservation = new HotelReservation();
//		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10) ;
//		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11) ;
//		hotelReservation.addHotel("Lakewood", 110);
//		hotelReservation.addHotel("Bridegewood", 168);
//		hotelReservation.addHotel("Ridgewood", 1000);
//		Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
//		Assert.assertEquals( "Lakewood", cheapestHotel.getName() );
//		
//		
//	}
	
//	@Test	
//	public void givenWeekDayAndWeekenedRates_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
//		HotelReservation hotelReservation = new HotelReservation();
//		hotelReservation.addHotel("Lakewood", 110, 90);
//		hotelReservation.addHotel("Bridegewood", 150, 50);
//		boolean result = hotelReservation.addHotel("Ridgewood", 220, 150);
//		Assert.assertEquals( result, result );
//	}    	
//	
//y	@Test
//	public void givenDateRangeBasedOnWeekDayAndWeekened_ShouldReturnCheapestHotel() {
//		HotelReservation hotelReservation = new HotelReservation();
//		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10) ;
//		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 12) ;
//		hotelReservation.addHotel("Lakewood", 110, 90);
//		hotelReservation.addHotel("Bridegewood", 150, 50);
//		hotelReservation.addHotel("Ridgewood", 220, 150);
//		Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
//		Assert.assertEquals( "Lakewood", cheapestHotel.getName() );
//		
//		
//	}
//	
//	@Test	
//	public void givenRating_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
//		HotelReservation hotelReservation = new HotelReservation();
//		hotelReservation.addHotel("Lakewood", 110, 90, 3);
//		hotelReservation.addHotel("Bridegewood", 150, 50, 4);
//		boolean result = hotelReservation.addHotel("Ridgewood", 220, 150, 5);
//		Assert.assertEquals( result, result );
//	}    		
	
//	@Test
//	public void givenDateRangeBasedOnRating_ShouldReturnCheapestHotel() {
//		HotelReservation hotelReservation = new HotelReservation();
//		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11) ;
//		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 12) ;
//		hotelReservation.addHotel("Lakewood", 230, 90, 3);
//		hotelReservation.addHotel("Bridegewood", 200, 50, 4);
//		hotelReservation.addHotel("Ridgewood", 220, 150, 5);
//		Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
//		Assert.assertEquals( "Lakewood", cheapestHotel.getName() );
//		
//		
//	}
	
//	@Test
//	public void givenDateRangeBasedOnBestRating_ShouldReturnCheapestHotel() {
//		HotelReservation hotelReservation = new HotelReservation();
//		Scanner scn = new  Scanner(System.in) ;
//		int startingDay = scn.nextInt() ;
//		int lastDay = scn.nextInt();
//		try {
//		   LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, startingDay) ;
//		   LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, lastDay) ;
//		   hotelReservation.addHotel("Lakewood", 230, 90, 3);
//		   hotelReservation.addHotel("Bridegewood", 200, 50, 4);
//		   hotelReservation.addHotel("Ridgewood", 220, 150, 5);
//		   Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
//		   Assert.assertEquals( "Lakewood", cheapestHotel.getName() );
//		} catch (Exception e) {
//			throw new HotelReservationException(e.getMessage());
//		}
//		
//		
//	}
	
	
//	@Test	
//	public void givenSpecialRates_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
//		HotelReservation hotelReservation = new HotelReservation();
//		hotelReservation.addHotel("Lakewood", 80, 80, 3);
//		hotelReservation.addHotel("Bridegewood", 110, 50, 4);
//		boolean result = hotelReservation.addHotel("Ridgewood", 100, 40, 5);
//		Assert.assertEquals( result, result );
//	}    	
//	
	@Test	
	public void givenDateRangeForARewardCustomerToFindCheapHotel_ShouldReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		Scanner scn = new  Scanner(System.in) ;
		int startingDay = scn.nextInt() ;
		int lastDay = scn.nextInt();
		try {
		   LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, startingDay) ;
		   LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, lastDay) ;
		   hotelReservation.addHotel("Lakewood", 230, 90, 3);
		   hotelReservation.addHotel("Bridegewood", 200, 50, 4);
		   hotelReservation.addHotel("Ridgewood", 220, 150, 5);
		   Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
		   Assert.assertEquals( "Lakewood",  cheapestHotel.getName() );
		} catch (Exception e) {
			throw new HotelReservationException(e.getMessage());
		}
		
	}
	
	

}

