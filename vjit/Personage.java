package vjit;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Personage {
String firstname;
String lastname;
char gender;
String dob;

	
	
	Personage ()
	{
		firstname="kishore";
		lastname="kumar";
		gender='m';
	}
	Personage(String firstname,String lastname, char gender, String dob)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.gender=gender;
		this.dob=dob;
	}
	
	void calculateage(String dob)
	{
		 DateTimeFormatter into=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 LocalDate f=LocalDate.parse(dob,into);
		 LocalDate d=LocalDate.now();
		 Period a=f.until(d);
		  System.out.println("age="+a.getYears()+" years and "+a.getMonths()+" months and "+a.getDays()+" days");
		 
	}
	 
	public String getFullname(String firstname, String lastname){
		
		return firstname+lastname;
	}
	

	 public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
	
		 
}
