package vjit;
import java.util.*; 
public class Checkstr {
public static boolean find (String str)
{
	int n=str.length();
	char c[]=new char[n];
	for(int i=0;i<n;i++)
	{
		c[i]=str.charAt(i);
	}
	Arrays.sort(c);
	 for(int i=0;i<n;i++)
	 {
		 if(c[i]!=str.charAt(i))
			 return false;
	 }
	return true;

}
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		if(find(str))
	System.out.println("positive  string");
		else
			System.out.println("negative  string");

}
}