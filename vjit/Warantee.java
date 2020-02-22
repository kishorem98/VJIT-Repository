package vjit;
import java.util.*;
import java.time.LocalDate;
public class Warantee {

	public static void main(String a[])
	{
		LocalDate purchase=LocalDate.of(2018, 11, 15);
		int waranyears=3;
		int waranmonths=6;
		System.out.println("purchase date="+purchase);
		System.out.println("warranty="+waranyears+" years and "+waranmonths+" months");
		
		LocalDate s=purchase.plusMonths(waranmonths);

	    System.out.println("The warranty will expire on="+s.plusYears(waranyears));
		
	}
}
