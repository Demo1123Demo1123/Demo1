package com.ramusoft.automatio.utilitis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegexUtilitties {
	
	
  public static boolean isvallidphonenumber(String phonenumber) {
	  
	  boolean valid = true;
	  Pattern pattern= Pattern.compile("(0|[+]91)?[6789][0-9]{9}");	
		Matcher macher = pattern.matcher(phonenumber);
		if (macher.find()&&macher.group().equalsIgnoreCase(phonenumber)) {
			
			System.out.println("it is vallid phonenumber");
		}
		else
		{
			System.out.println("it is not vallid phonenumber");
			
			valid =false;
		}
	  
	  return valid;
   }

}
