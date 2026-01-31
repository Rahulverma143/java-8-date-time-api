package localdateandtime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample01 {
	public static void main(String[] args) {

		// 1️ Two Dates
		LocalDate birthDate = LocalDate.of(2000, 5, 10);
		LocalDate today = LocalDate.now();

		// 2️ Find Period between two dates
		Period period = Period.between(birthDate, today);

		System.out.println("Age Calculation");
		System.out.println("Years  : " + period.getYears());
		System.out.println("Months : " + period.getMonths());
		System.out.println("Days   : " + period.getDays());

		// 3️ Create Period manually
		Period p1 = Period.of(1, 2, 15);
		System.out.println("Custom Period : " + p1);

		// 4️ Using ofDays / ofMonths / ofYears
		Period days = Period.ofDays(10);
		Period months = Period.ofMonths(6);
		Period years = Period.ofYears(2);

		System.out.println("10 Days Period   : " + days);
		System.out.println("6 Months Period  : " + months);
		System.out.println("2 Years Period   : " + years);

		// 5️ Add Period to Date
		LocalDate futureDate = today.plus(p1);
		System.out.println("Future Date (+Period) : " + futureDate);

		// 6️ Subtract Period from Date
		LocalDate pastDate = today.minus(p1);
		System.out.println("Past Date (-Period) : " + pastDate);

		// 7️ isNegative & isZero
		System.out.println("Is Zero Period : " + period.isZero());
		System.out.println("Is Negative    : " + period.isNegative());
	}
}
