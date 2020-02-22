package vjit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Personagemain {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter first name");
String firstname=sc.nextLine();
System.out.println("enter lastname");
String lastname=sc.nextLine();
System.out.println("enter dob in dd-mm-yyyy format");
String dob=sc.nextLine();

System.out.println("enter gender :m or f");
char gender=sc.next().charAt(0);

 Personage p=new Personage(firstname,lastname,gender,dob);
  String answer= p.getFullname(firstname, lastname);
   System.out.println("Full Name:"+answer+"\nGender:"+gender);
   p.calculateage(dob);
   
	}

}
