package localdateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample01 {
	public static void main(String[] args) {

		// 1️ Current Zoned DateTime (System Time Zone)
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println("Current ZonedDateTime : " + now);

		// 2️ Current DateTime for Specific Zone
		ZonedDateTime india =
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("India Time : " + india);

		ZonedDateTime usa =
				ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("USA Time : " + usa);

		// 3️ Create Custom ZonedDateTime
		ZonedDateTime custom =
				ZonedDateTime.of(
						2024, 5, 20,
						10, 30, 45, 0,
						ZoneId.of("Asia/Kolkata"));
		System.out.println("Custom ZonedDateTime : " + custom);

		// 4️ Getter Methods
		System.out.println("Year   : " + now.getYear());
		System.out.println("Month  : " + now.getMonth());
		System.out.println("Day    : " + now.getDayOfMonth());
		System.out.println("Hour   : " + now.getHour());
		System.out.println("Minute : " + now.getMinute());
		System.out.println("Zone   : " + now.getZone());
		System.out.println("Offset : " + now.getOffset());

		// 5️ Plus / Minus Methods
		System.out.println("Plus 2 Hours : " + now.plusHours(2));
		System.out.println("Minus 1 Day  : " + now.minusDays(1));

		// 6️ With Methods
		System.out.println("With Year 2030 : " + now.withYear(2030));
		System.out.println("With Hour 9    : " + now.withHour(9));

		// 7️ Comparison
		System.out.println("Is Before custom : " + now.isBefore(custom));
		System.out.println("Is After custom  : " + now.isAfter(custom));

		// 8️ Convert to LocalDateTime
		System.out.println("To LocalDateTime : " + now.toLocalDateTime());

		// 9️ Convert Zone (Same instant, different zone)
		ZonedDateTime london =
				now.withZoneSameInstant(ZoneId.of("Europe/London"));
		System.out.println("London Time : " + london);

		// 10 Formatting
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a z");
		System.out.println("Formatted Time : " + now.format(formatter));
	}
}
