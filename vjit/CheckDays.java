package vjit;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CheckDays {
/*	public static void find(LocalDate start)
	{
	System.out.println("days="+p.getDays());
		System.out.println("months="+p.get(ChronoUnit.MONTHS));
		System.out.println("years="+p.get(ChronoUnit.YEARS));
	}
*/	
	public static void main(String[] args) {
		
		LocalDate now=LocalDate.now();
		LocalDate start=LocalDate.of(1998,07,20);
		
		Period p=start.until(now);
		
		System.out.println(now);
		System.out.println(start);
		//find(start);
		
	System.out.println("days="+p.getDays());
	System.out.println("months="+p.getMonths());
	System.out.println("years="+p.getYears());
       
	}

}
 