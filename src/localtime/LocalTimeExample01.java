package localtime;

import java.time.LocalTime;

public class LocalTimeExample01 {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);

	}
}

/*
 * LocalTime represents time only, without date and without time-zone. 
 * -> Hour
 * -> Minute 
 * -> Second 
 * -> Nanosecond
 * 
 * -> No date 
 * -> No timezone
 * 
 * -> Package name is (java.time.LocalTime)
 */