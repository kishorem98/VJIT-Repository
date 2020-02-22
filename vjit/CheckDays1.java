package vjit;

import java.time.LocalDate;
import java.time.Period;

public class CheckDays1 {

	public static void main(String[] args) {
		
		LocalDate now=LocalDate.of(2019,07,20);
		LocalDate start=LocalDate.of(2018,07,19);
		
		Period p=Period.between(start,now);
		
		System.out.println(now);
		System.out.println(start);

	System.out.println("days="+p.getDays());
	System.out.println("months="+p.getMonths());
	System.out.println("years="+p.getYears());

	}

}
