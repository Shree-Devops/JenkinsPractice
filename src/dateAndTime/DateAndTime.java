package dateAndTime;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.util.TimeZone;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateAndTime {

	public static void main(String[] args) {
		//check if the given date is yesterday date.
//		LocalDate today = LocalDate.now();
//		LocalDate givenDate =  LocalDate.of(2023, 9, 19);
//		Period period = Period.between(givenDate, today);
//		
//		Predicate<Period> pred1 = period1 -> period1.getYears()==0;
//		Predicate<Period> pred2 = period2 -> period2.getMonths()==0;
//		Predicate<Period> pred3 = period3 -> period3.getDays()==1;
//		
//		boolean result = pred1.and(pred2).and(pred3).test(period);
//		
//		if(result)
//		{
//			System.out.println("given date is yesterday date.");
//		}
//		else
//			System.out.println("given date is not yesterday date.");
//		
		
		Function <LocalDate, Integer> function = birthday -> {
			Period period = Period.between(birthday, LocalDate.now());
			int years = period.getYears();
			return years;};
		LocalDate birthday = LocalDate.of(1994, 12, 13);
		System.out.println("For Birthday : " + birthday + " , Age is: " + function.apply(birthday));
	}

}
