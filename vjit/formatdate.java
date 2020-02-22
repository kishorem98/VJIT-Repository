package vjit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class formatdate {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
		DateTimeFormatter into = DateTimeFormatter.ofPattern("yy-mm-dd");
		LocalDate today=LocalDate.parse(s, into);
		System.out.println(today);
	}
}
