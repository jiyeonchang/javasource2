package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
   //���� ��¥ �˾ƺ��� 
		Date date = new Date();
		System.out.println(date);
		
		
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		LocalTime currtime = LocalTime.now();
		System.out.println(currtime);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy�� MM�� E dd�� hh�� mm�� ss�� ");
		System.out.println(sdf.format(date));
		

	}

}
