package vjit;

public class person {
String firstname;
String lastname;
char gender;
	
	
	person ()
	{
		firstname="kishore";
		lastname="kumar";
		gender='m';
	}
	person(String firstname,String lastname, char gender)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.gender=gender;
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
