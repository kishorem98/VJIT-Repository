package vjit;

public class personMain {

	public static void main(String[] args) {
person p=new person("kiran","kuamr",'m');
System.out.println("First Name:"+p.getFirstname());
System.out.println("Last Name:"+p.getLastname());
System.out.println("First Name:"+p.getGender());
System.out.println("..................");
person p1=new person();
System.out.println("First Name:"+p1.getFirstname());
System.out.println("Last Name:"+p1.getLastname());
System.out.println("First Name:"+p1.getGender());
	}

}
