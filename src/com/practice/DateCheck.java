package com.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strDate = "01.01.3000 01:00:00";
		SimpleDateFormat fm = new SimpleDateFormat("dd.MM.yyyy HH:mm:SS");
		fm.setLenient(false);
		try {
			fm.parse(strDate);
			System.out.println("valid" + strDate);
		} catch (ParseException e) {
			//throw exception
			System.out.println("invalid  "  + strDate);
			e.printStackTrace();			
		}
	}

}
