package localdateandtime;

import java.time.Instant;
import java.time.Duration;

public class InstantExample01 {
	public static void main(String[] args) {

		// 1️ Current Instant (UTC)
		Instant now = Instant.now();
		System.out.println("Current Instant : " + now);


		// 42 Plus Methods
		Instant plusSeconds = now.plusSeconds(10);
		System.out.println("Plus 10 Seconds : " + plusSeconds);

		Instant plusMillis = now.plusMillis(500);
		System.out.println("Plus 500 Millis : " + plusMillis);

		// 53 Minus Methods
		Instant minusSeconds = now.minusSeconds(5);
		System.out.println("Minus 5 Seconds : " + minusSeconds);

		// 4 Compare Instants
		System.out.println("Is After : " + plusSeconds.isAfter(now));
		System.out.println("Is Before: " + minusSeconds.isBefore(now));

		// 5 Difference Between Two Instants
		Duration duration = Duration.between(now, plusSeconds);
		System.out.println("Difference in Seconds : " + duration.getSeconds());

		// 6 MIN and MAX
		System.out.println("Min Instant : " + Instant.MIN);
		System.out.println("Max Instant : " + Instant.MAX);
	}
}
