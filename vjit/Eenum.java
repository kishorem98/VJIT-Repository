package vjit;

enum Gender {
	m, f ;
}

public class Eenum{
String firstname;
String lastname;

 Gender gender;
long phoneno;
	
	
	Eenum()
	{
		firstname="venkat";
		lastname="rao";
		gender=gender.m;
		phoneno=9949576662L;
	}
	Eenum(String firstname,String lastname, Gender gender, long phoneno)
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
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public long getnumber() {
			return phoneno;
		}
		public void setnumber(long phoneno) {
			this.phoneno = phoneno;
		}
	
		 
}
