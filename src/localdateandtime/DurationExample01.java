package localdateandtime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class DurationExample01 {
	public static void main(String[] args) {

		// 1️ Using LocalTime
		LocalTime start = LocalTime.of(10, 30);
		LocalTime end = LocalTime.of(12, 45);

		Duration duration1 = Duration.between(start, end);

		System.out.println("Using LocalTime");
		System.out.println("Hours   : " + duration1.toHours());
		System.out.println("Minutes : " + duration1.toMinutes());
		System.out.println("Seconds : " + duration1.getSeconds());

		// 2️ Using Instant
		Instant begin = Instant.now();

		// Simulate delay
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Instant finish = Instant.now();

		Duration duration2 = Duration.between(begin, finish);

		System.out.println("\nUsing Instant");
		System.out.println("Millis : " + duration2.toMillis());
		System.out.println("Seconds: " + duration2.getSeconds());

		// 3️ Create Duration manually
		Duration d1 = Duration.ofHours(2);
		Duration d2 = Duration.ofMinutes(30);
		Duration d3 = Duration.ofSeconds(45);

		System.out.println("\nManual Duration");
		System.out.println("2 Hours  : " + d1);
		System.out.println("30 Min   : " + d2);
		System.out.println("45 Sec   : " + d3);

		// 4️ Plus & Minus
		System.out.println("\nPlus / Minus");
		System.out.println("Plus 10 Min  : " + d2.plusMinutes(10));
		System.out.println("Minus 5 Sec  : " + d3.minusSeconds(5));

		// 5️ Checks
		System.out.println("\nChecks");
		System.out.println("Is Zero     : " + d1.isZero());
		System.out.println("Is Negative : " + d1.isNegative());
	}
}
