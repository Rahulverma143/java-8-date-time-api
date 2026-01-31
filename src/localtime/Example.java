
package localtime;
/*
 =========================================================
   JAVA 8 DATE & TIME API – ALL MAIN CLASSES (DEFINITION)
 =========================================================
 Package : java.time
 Purpose : Modern, immutable, thread-safe Date & Time API
*/

/* 
 Java 8 Date & Time API provides immutable, 
 thread-safe classes to handle date, time, timezone, duration, 
 and formatting clearly and efficiently.
*/

/* ======================================================
   1. LocalDate
 ====================================================== */
class LocalDateInfo {

	/*
	 What it represents:
	 - Only DATE
	 - Year, Month, Day
	 - No time, no timezone
	*/

	/*
	 Important Methods:
	 - now()              → current date
	 - of()               → create custom date
	 - parse()            → convert String to LocalDate
	 - getYear()
	 - getMonth()
	 - getMonthValue()
	 - getDayOfMonth()
	 - getDayOfWeek()
	 - getDayOfYear()
	 - plusDays(), plusMonths(), plusYears()
	 - minusDays(), minusMonths(), minusYears()
	 - withDayOfMonth(), withMonth(), withYear()
	 - isBefore(), isAfter(), equals()
	 - isLeapYear()
	 - lengthOfMonth(), lengthOfYear()
	 - MIN, MAX
	*/
}

/* ======================================================
   2. LocalTime
 ====================================================== */
class LocalTimeInfo {

	/*
	 What it represents:
	 - Only TIME
	 - Hour, Minute, Second, Nano
	 - No date, no timezone
	*/

	/*
	 Important Methods:
	 - now()
	 - of()
	 - parse()
	 - getHour()
	 - getMinute()
	 - getSecond()
	 - getNano()
	 - plusHours(), plusMinutes(), plusSeconds(), plusNanos()
	 - minusHours(), minusMinutes(), minusSeconds()
	 - withHour(), withMinute(), withSecond()
	 - isBefore(), isAfter(), equals()
	 - MIN, MAX
	*/
}

/* ======================================================
   3. LocalDateTime
 ====================================================== */
class LocalDateTimeInfo {

	/*
	 What it represents:
	 - DATE + TIME
	 - No timezone
	*/

	/*
	 Important Methods:
	 - now()
	 - of()
	 - parse()
	 - getYear(), getMonth(), getDayOfMonth()
	 - getHour(), getMinute(), getSecond()
	 - plusDays(), plusMonths(), plusYears()
	 - plusHours(), plusMinutes()
	 - minusDays(), minusHours()
	 - withYear(), withMonth(), withDayOfMonth(), withHour()
	 - isBefore(), isAfter(), equals()
	 - toLocalDate()
	 - toLocalTime()
	 - MIN, MAX
	*/
}

/* ======================================================
   4. ZonedDateTime
 ====================================================== */
class ZonedDateTimeInfo {

	/*
	 What it represents:
	 - DATE + TIME + TIMEZONE
	*/

	/*
	 Important Methods:
	 - now()
	 - now(ZoneId)
	 - of()
	 - getYear(), getMonth(), getDayOfMonth()
	 - getHour(), getMinute()
	 - getZone()
	 - getOffset()
	 - plusDays(), plusHours()
	 - minusDays(), minusHours()
	 - withYear(), withHour()
	 - withZoneSameInstant()
	 - toLocalDateTime()
	*/
}

/* ======================================================
   5. ZoneId
 ====================================================== */
class ZoneIdInfo {

	/*
	 What it represents:
	 - Timezone ID
	 - Example: Asia/Kolkata, America/New_York
	*/

	/*
	 Important Methods:
	 - of()
	 - systemDefault()
	 - getId()
	 - getRules()
	 - getAvailableZoneIds()
	*/
}

/* ======================================================
   6. Instant
 ====================================================== */
class InstantInfo {

	/*
	 What it represents:
	 - A point on timeline (UTC)
	 - Machine timestamp
	*/

	/*
	 Important Methods:
	 - now()
	 - ofEpochSecond()
	 - ofEpochMilli()
	 - getEpochSecond()
	 - toEpochMilli()
	 - plusSeconds(), plusMillis()
	 - minusSeconds()
	 - isBefore(), isAfter()
	 - MIN, MAX
	*/
}

/* ======================================================
   7. Period
 ====================================================== */
class PeriodInfo {

	/*
	 What it represents:
	 - Date-based amount of time
	 - Years, Months, Days
	*/

	/*
	 Important Methods:
	 - between()
	 - of()
	 - ofDays(), ofMonths(), ofYears()
	 - getYears()
	 - getMonths()
	 - getDays()
	 - isZero()
	 - isNegative()
	*/
}

/* ======================================================
   8. Duration
 ====================================================== */
class DurationInfo {

	/*
	 What it represents:
	 - Time-based amount
	 - Hours, Minutes, Seconds, Nanos
	*/

	/*
	 Important Methods:
	 - between()
	 - ofHours(), ofMinutes(), ofSeconds()
	 - toHours()
	 - toMinutes()
	 - toMillis()
	 - getSeconds()
	 - plusMinutes(), minusSeconds()
	 - isZero()
	 - isNegative()
	*/
}

/* ======================================================
   9. DateTimeFormatter
 ====================================================== */
class DateTimeFormatterInfo {

	/*
	 What it represents:
	 - Formatting & parsing date/time
	*/

	/*
	 Important Methods:
	 - ofPattern()
	 - format()
	 - parse()
	 - ISO_DATE
	 - ISO_TIME
	 - ISO_DATE_TIME
	*/
}
