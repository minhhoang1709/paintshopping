package com.paintshopping.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class PsStringToDate {
	public Date stringToDate(String sDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		Date date = new Date();
		try {
			
			date = formatter.parse(sDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public String dateToString(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		String sDate = formatter.format(date);
		return sDate;
	}
	
}
