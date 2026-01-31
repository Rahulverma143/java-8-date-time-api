package localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateExample02 {
	public static void main(String[] args) {

		// 1️ Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date : " + today);

		// 2️ Create Custom Date
		LocalDate date1 = LocalDate.of(2024, 5, 20);
		System.out.println("Custom Date : " + date1);

		// 3️ Create Date using Month enum
		LocalDate date2 = LocalDate.of(2023, Month.DECEMBER, 25);
		System.out.println("Using Month Enum : " + date2);

		// 4️ Parse Date from String
		LocalDate date3 = LocalDate.parse("2022-08-15");
		System.out.println("Parsed Date : " + date3);

		// 5️ Getter Methods
		System.out.println("Year  : " + today.getYear());
		System.out.println("Month : " + today.getMonth());
		System.out.println("Day   : " + today.getDayOfMonth());
		System.out.println("Day of Week : " + today.getDayOfWeek());
		System.out.println("Day of Year : " + today.getDayOfYear());

		// 6️ Plus Methods
		System.out.println("Plus Days   : " + today.plusDays(10));
		System.out.println("Plus Months : " + today.plusMonths(2));
		System.out.println("Plus Years  : " + today.plusYears(1));

		// 7️ Minus Methods
		System.out.println("Minus Days   : " + today.minusDays(5));
		System.out.println("Minus Months : " + today.minusMonths(1));
		System.out.println("Minus Years  : " + today.minusYears(2));

		// 8️ With Methods (Modify date)
		System.out.println("With Day    : " + today.withDayOfMonth(1));
		System.out.println("With Month : " + today.withMonth(12));
		System.out.println("With Year  : " + today.withYear(2030));

		// 9️ Comparison Methods
		System.out.println("Is Before date1 : " + today.isBefore(date1));
		System.out.println("Is After date1  : " + today.isAfter(date1));
		System.out.println("Is Equal date1  : " + today.equals(date1));

		// 10 Leap Year Check
		System.out.println("Is Leap Year : " + today.isLeapYear());

		// 1️1 Length of Month
		System.out.println("Length of Month : " + today.lengthOfMonth());

		// 1️2 MIN and MAX
		System.out.println("Min Date : " + LocalDate.MIN);
		System.out.println("Max Date : " + LocalDate.MAX);

		// 1️3 Format LocalDate
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Formatted Date : " + today.format(formatter));
	}
}
