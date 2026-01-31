package localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample02 {
	public static void main(String[] args) {

		// 1 Current Time
		LocalTime now = LocalTime.now();
		System.out.println("Current Time : " + now);

		// 2️ Create Custom Time
		LocalTime time1 = LocalTime.of(10, 30, 45);
		System.out.println("Custom Time : " + time1);

		// 3️ Parse Time from String
		LocalTime time2 = LocalTime.parse("18:45:20");
		System.out.println("Parsed Time : " + time2);

		// 4️ Getter Methods
		System.out.println("Hour   : " + time1.getHour());
		System.out.println("Minute : " + time1.getMinute());
		System.out.println("Second : " + time1.getSecond());
		System.out.println("Nano   : " + time1.getNano());

		// 5️ Plus Methods
		System.out.println("Plus Hours   : " + time1.plusHours(2));
		System.out.println("Plus Minutes : " + time1.plusMinutes(15));
		System.out.println("Plus Seconds : " + time1.plusSeconds(10));

		// 6️ Minus Methods
		System.out.println("Minus Hours   : " + time1.minusHours(1));
		System.out.println("Minus Minutes : " + time1.minusMinutes(20));

		// 7️ With Methods (Modify specific field)
		System.out.println("With Hour   : " + time1.withHour(5));
		System.out.println("With Minute : " + time1.withMinute(2));
		System.out.println("With Second : " + time1.withSecond(4));

		// 8️ Comparison Methods
		LocalTime officeTime = LocalTime.of(10, 0);
		System.out.println("Is Before Office Time : " + time1.isBefore(officeTime));
		System.out.println("Is After Office Time  : " + time1.isAfter(officeTime));
		System.out.println("Is Equal              : " + time1.equals(officeTime));

		// 9️ MIN and MAX
		System.out.println("Min Time : " + LocalTime.MIN);
		System.out.println("Max Time : " + LocalTime.MAX);

		//  Formatting LocalTime
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println("Formatted Time : " + now.format(formatter));
	}
}
