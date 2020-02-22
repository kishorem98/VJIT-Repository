package vjit;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.*;
public class Zonetime {
	public static void find (String s)
	{
		ZonedDateTime time = ZonedDateTime.now(ZoneId.of(s));
		System.out.println(" Date and time in the given zone is"+time);
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		find(s);
		
	//	ZonedDateTime here=ZonedDateTime.now();
	//	System.out.println("Time in india is "+here);
		
	//	ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("America/New_York"));
	//	ZonedDateTime newyork = here.withZoneSameInstant(ZoneId.of("America/New_York"));
		
	
		
	}

}
