package localdateandtime;

import java.time.LocalDateTime;

public class LocalDateAndTimeExample01 {
	public static void main(String[] args) {
		// Current date and time
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Now : " + now);

		// Create custom date & time
		LocalDateTime dt = LocalDateTime.of(2024, 5, 20, 10, 30);
		System.out.println("Custom : " + dt);
		
	}
}

/*
 * LocalDateTime represents DATE + TIME together. Year Month Day Hour Minute
 * Second Nano
 */