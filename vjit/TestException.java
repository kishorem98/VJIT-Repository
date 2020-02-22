package vjit;
class NoNameException extends Exception{
	NoNameException(String s)
	{
		
		//super(s);
	}
}
public class TestException extends person{

	public static void main(String[] args) {
		person p=new person("","",'m');
try {
	if(p.firstname==""|| p.lastname=="")
	throw new NoNameException(" Blank name ");
	else 
		System.out.println(p.firstname+p.lastname);
    }
catch(Exception e){
	System.out.println("caught "+e); 
     }
	}

}
