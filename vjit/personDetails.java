package vjit;

public class personDetails {
	String firstname;
	String lastname;
	char gender;
	int age;
	double weight;
	
	personDetails()
	{
		firstname="Divya";
		lastname="Bharathi";
		gender='F';
		age=20;
		weight=85.55;
	}
	
	public static void main(String[] args) {
		personDetails p1=new personDetails();
System.out.println("First Name:"+p1.firstname+"\nLast Name:"+p1.lastname+"\nGender:"+p1.gender+"\nAge:"+p1.age+"\nWeigt:"+p1.weight);
}

}