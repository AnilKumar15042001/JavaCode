package string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertStringToDate {

	public static void main(String[] args) {
		
		String str="2000-06-22";
		LocalDate date=LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
		System.out.println(date);
		
		String str2="July 25, 2017";
		DateTimeFormatter format=DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date2=LocalDate.parse(str2, format);
		System.out.println(date2);
	}
}
