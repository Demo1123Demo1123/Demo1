package com.ramusoft.automatio.utilitis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface Datetimeuttilits {
	
	
	public static LocalDate getLcalDate()
	{
		
		LocalDate localdate=LocalDate.now();
		return localdate;
	}
	
	public static LocalDateTime getlocalDateTime() 
	{
		
		LocalDateTime localdatetime= LocalDateTime.now();
		return localdatetime;
		
	}
	public static LocalTime getLocalTime() {
		
		LocalTime localtime=LocalTime.now();
		return localtime;
		
	}
	public static int getTodayDate()
	{
		LocalDate getlocaldate=getLcalDate();
		String localdatestring= getlocaldate.toString();
		String[] str=localdatestring.split("-");
		String currentdate=str[2];
		int date= Integer.parseInt(currentdate);
		return date;
		
	}
	public static int getPastDate(int daysToSubtract)
	{
		LocalDate getlocaldate=getLcalDate();
		getlocaldate.minusDays(daysToSubtract);
		String localdatestring= getlocaldate.toString();
		String[] str=localdatestring.split("-");
		String currentdate=str[2];
		int date= Integer.parseInt(currentdate);
		return date;
		
	}
	public static int getFutureDate(int daysToAdd)
	{
		LocalDate getlocaldate=getLcalDate();
		getlocaldate.plusDays(daysToAdd);
		String localdatestring= getlocaldate.toString();
		String[] str=localdatestring.split("-");
		String currentdate=str[2];
		int date= Integer.parseInt(currentdate);
		return date;
		
	}
	public static int getCurrentMonth()
	{
		LocalDate getlocaldate=getLcalDate();
		String localdatestring= getlocaldate.toString();
		String[] str=localdatestring.split("-");
		String currentmonth=str[1];
		int month= Integer.parseInt(currentmonth);
		return month;
		
	}
	public static int getCurrentYear()
	{
		LocalDate getlocaldate=getLcalDate();
		String localdatestring= getlocaldate.toString();
		String[] str=localdatestring.split("-");
		String currentyear=str[0];
		int year= Integer.parseInt(currentyear);
		return year;
		
	}


}
