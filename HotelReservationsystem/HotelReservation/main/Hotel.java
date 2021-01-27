package com.samplesuc9;

public class Hotel {
	public String name  ;
	public int weekDayRate ;
	public int weekenedRate ;
	public int rating ;
	
	
	public Hotel(String name,  int weekDayRate, int weekenedRate , int rating ) {
		this.name = name ;
		this.weekDayRate = weekDayRate;
		this.weekenedRate = weekenedRate ;
		this.rating = rating ;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name ;
	}
	
	public void setWeekDayRate(int weekDayrate) {
		this.weekDayRate = weekDayRate ;
	}
	public int getWeekDayRate() {
		return weekDayRate ;
	}
	
	public void setWeekenedRate(int weekenedRate) {
		this.weekenedRate = weekenedRate ;
	}
	public int getWeekenedRate() {
		return weekenedRate ;
	}
	
	
	
	public void setRating(int rating) {
		this.rating = rating ;
	}
	public int getRating() {
		return rating ;
	}

}
