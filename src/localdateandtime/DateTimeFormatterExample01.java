package localdateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample01 {
	public static void main(String[] args) {

		// 1️ Current Date & Time
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();

		// 2️ Custom Formatter
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");

		// 3️ Formatting
		System.out.println("Formatted Date     : " + date.format(dateFormatter));
		System.out.println("Formatted Time     : " + time.format(timeFormatter));
		System.out.println("Formatted DateTime : " + dateTime.format(dateTimeFormatter));

		// 4️ Parsing String → Date/Time
		LocalDate parsedDate = LocalDate.parse("25-12-2024", dateFormatter);
		System.out.println("Parsed Date : " + parsedDate);

		LocalTime parsedTime = LocalTime.parse("10:30:45 PM", timeFormatter);
		System.out.println("Parsed Time : " + parsedTime);

		LocalDateTime parsedDateTime = LocalDateTime.parse("25/12/2024 10:30:45 PM", dateTimeFormatter);
		System.out.println("Parsed DateTime : " + parsedDateTime);
	}
}
