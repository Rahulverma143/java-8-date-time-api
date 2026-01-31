package localdate;

import java.time.LocalDate;

public class LocalDateExample01 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate date = LocalDate.of(2024, 5, 20);
		System.out.println(date);

		LocalDate date1 = LocalDate.parse("2023-08-15");
		System.out.println(date1);

	}
}

/*
 * -> LocalDate represents only a DATE. without a time Zone 
 * -> Month 
 * -> Day 
 * -> No time 
 * -> No timezone -> package name is (java.time.LocalDate)
 */