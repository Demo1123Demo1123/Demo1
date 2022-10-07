package com.ramusoft.automatio.utilitis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		RegexUtilitties.isvallidphonenumber("9642213220");
		
		
		
		
		
		/*
		 * String phonum="4642213220"; Pattern pattern=
		 * Pattern.compile("(0|[+]91)?[6789][0-9]{9}"); Matcher macher =
		 * pattern.matcher(phonum); if
		 * (macher.find()&&macher.group().equalsIgnoreCase(phonum)) {
		 * 
		 * System.out.println("it is vallid phonenumber"); } else {
		 * System.out.println("it is not vallid phonenumber"); }
		 */
		
		
		
	
		
	/*Pattern pattern = Pattern.compile("[^a-z]");
	Matcher macher = pattern.matcher("@ramujava#rameshsoft");
	
	int Count=0;
	while (macher.find()) {
		
		Count++;
	String str = macher.group();
	int Startdate = macher.start();
	int enddate = macher.end();
		System.out.println(str+"  "+" "+Startdate+" "+enddate);
		
	}
		System.out.println("no of count :"+Count);
	
	*/

	}
}
