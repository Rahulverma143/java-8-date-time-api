package localdateandtime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTimeExample02 {
	public static void main(String[] args) {

		// 1️ Current Date & Time
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current DateTime : " + now);

		// 2️ Create Custom DateTime
		LocalDateTime dt1 = LocalDateTime.of(2024, 5, 20, 10, 30, 45);
		System.out.println("Custom DateTime : " + dt1);

		// 3️ Create using Month Enum
		LocalDateTime dt2 =
				LocalDateTime.of(2023, Month.DECEMBER, 25, 9, 0);
		System.out.println("Using Month Enum : " + dt2);

		// 4️ Parse DateTime from String
		LocalDateTime dt3 =
				LocalDateTime.parse("2022-08-15T18:45:20");
		System.out.println("Parsed DateTime : " + dt3);

		// 5️ Getter Methods
		System.out.println("Year   : " + now.getYear());
		System.out.println("Month  : " + now.getMonth());
		System.out.println("Day    : " + now.getDayOfMonth());
		System.out.println("Hour   : " + now.getHour());
		System.out.println("Minute : " + now.getMinute());
		System.out.println("Second : " + now.getSecond());

		// 6️ Plus Methods
		System.out.println("Plus Days   : " + now.plusDays(5));
		System.out.println("Plus Months : " + now.plusMonths(1));
		System.out.println("Plus Years  : " + now.plusYears(1));
		System.out.println("Plus Hours  : " + now.plusHours(2));
		System.out.println("Plus Minutes: " + now.plusMinutes(30));

		// 7️ Minus Methods
		System.out.println("Minus Days   : " + now.minusDays(3));
		System.out.println("Minus Hours  : " + now.minusHours(1));
		System.out.println("Minus Minutes: " + now.minusMinutes(15));

		// 8️ With Methods (Modify fields)
		System.out.println("With Year  : " + now.withYear(2030));
		System.out.println("With Month : " + now.withMonth(12));
		System.out.println("With Day   : " + now.withDayOfMonth(1));
		System.out.println("With Hour  : " + now.withHour(9));

		// 9️ Comparison Methods
		System.out.println("Is Before dt1 : " + now.isBefore(dt1));
		System.out.println("Is After dt1  : " + now.isAfter(dt1));
		System.out.println("Is Equal dt1  : " + now.equals(dt1));

		// 10 Convert to LocalDate & LocalTime
		System.out.println("Only Date : " + now.toLocalDate());
		System.out.println("Only Time : " + now.toLocalTime());

		// 1️1️ MIN and MAX
		System.out.println("Min DateTime : " + LocalDateTime.MIN);
		System.out.println("Max DateTime : " + LocalDateTime.MAX);

		// 1️2️ Formatting LocalDateTime
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		System.out.println("Formatted DateTime : " + now.format(formatter));
	}
}
