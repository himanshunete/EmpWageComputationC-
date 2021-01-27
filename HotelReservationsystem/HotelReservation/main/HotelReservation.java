package com.samplesuc9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.samplesuc6.Hotel;

public class HotelReservation {
	List<Hotel> hotels =  new ArrayList<Hotel>() ;
	private Scanner scn;
	public boolean addHotel(String name, int weekDayRate, int weekenedRate, int rating) {	
		System.out.println(" Enter Customer Type: ");
		scn = new Scanner(System.in);
		int customerType = scn.nextInt() ;
		int normalCustomer = 0 ;
		int rewardedCustomer = 1 ;
		if ( customerType == normalCustomer ) {
			System.out.println(" Normal Customer:");
            if (hotels.add(new Hotel(name, weekDayRate,  weekenedRate, rating))) {
        	    return true ;
            }
	    }  
		else if ( customerType == rewardedCustomer ){
			System.out.println(" Special Customer:");
            if (hotels.add(new Hotel(name, weekDayRate,  weekenedRate, rating))) {
        	    return true ;
            }
		}
		return false ;
	}
	
	public Hotel getCheapestHotel(LocalDate startDate, LocalDate lastDate ) {
		long between = ChronoUnit.DAYS.between(startDate, lastDate) ;
		Hotel cheapest = null ;
		double cheapRate = 0.0 ;
		double hotelRate = 0 ;
		int day = (int)Math.floor(Math.random() * 10) % 2;
		for (Hotel hotel: hotels) {
			if ( day == 0 ) {
			    hotelRate = hotel.getWeekDayRate()*between ;
			} else {
				hotelRate = hotel.getWeekenedRate()*between ;
			}
			if (cheapRate == 0) {
				cheapRate = hotelRate ;
			}
			if (hotelRate <= cheapRate) {
				cheapest = hotel ;
				cheapRate = hotelRate ;
			}
		}
		return cheapest;
	}

}
