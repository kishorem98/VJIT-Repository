

public class PersonNew{
String firstname;
String lastname;
char gender;
long phoneno;
	
	
	PersonNew()
	{
		firstname="venkat";
		lastname="rao";
		gender='m';
		phoneno=9949576662L;
	}
	PersonNew(String firstname,String lastname, char gender, long phoneno)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.gender=gender;
		this.phoneno=phoneno;
	}

	public void display()
	{
		System.out.println("First Name:"+getFirstname());
		System.out.println("Last Name:"+getLastname());
		System.out.println("gender:"+getGender());
		System.out.println("phone number:"+getnumber());
		
		
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
		public long getnumber() {
			return phoneno;
		}
		public void setnumber(long phoneno) {
			this.phoneno = phoneno;
		}
	
		 
}
