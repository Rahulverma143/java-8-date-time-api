package localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample03 {
	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println("Current Time : " + now);

		LocalTime afterTwoHours = now.plusHours(2);
		System.out.println("After 2 Hours : " + afterTwoHours);

		LocalTime loginTime = LocalTime.of(9, 45);
		LocalTime officeTime = LocalTime.of(10, 0);

		if (loginTime.isBefore(officeTime)) {
			System.out.println("Employee is On Time");
		} else {
			System.out.println("Employee is Late");
		}

			LocalTime time = LocalTime.of(15, 30, 45);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

			System.out.println("Formatted Time : " + time.format(formatter));

			LocalTime meetingTime = LocalTime.of(16, 0);

			System.out.println("Is Meeting After Current Time : " + meetingTime.isAfter(time));
		}
	}

