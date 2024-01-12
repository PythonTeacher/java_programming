package org.dimigo.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticBlockTest {
	private static String date = "";
	
	static {
		System.out.println("static block started");
		
		/*Calendar c = Calendar.getInstance();
		
		date += c.get(Calendar.YEAR);
		date += (c.get(Calendar.MONTH) + 1);
		date += c.get(Calendar.DATE);*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		date = sdf.format(new Date());
	}
	
	public static void main(String[] args) {
		System.out.println(date);
	}
	
}
