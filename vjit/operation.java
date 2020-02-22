package vjit;
import java.util.*;

public class operation {

	public static String op1(String str)
	{
		String s1=str.concat(str);
		return s1;
	}

	public static void  op2(String str)
	{
		String s2 = str;
		
		for(int i=0;i<s2.length();i+=2)
		{
			//s2 = str.replace(s2.charAt(i),'#');
		//	s5 = str.substring(0, i);
			//System.out.println(s5);
		//	s5 = s5 + '#';
			//System.out.println(s5);
		//	s5 = s5 + str.substring(i+1);
			//System.out.println(s5);
			//str = s5;
			
			s2=s2.replace(s2.charAt(i), '#');
		}
		System.out.println(s2);
	}
	

public static void op3(String str) {
	
		String s3 = str;
		
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=0;j<=i;j++) {
			if(s3.charAt(i)==s3.charAt(j)) 
			{
			s3=s3.replace(s3.charAt(i), s3.charAt(i+1));
			}
			}
			
		}
	
		System.out.println(s3);
	}
public static void op4(String str)
{
	String s4=str;
	for(int i=0;i<s4.length();i+=2)
	{
		char ch=str.charAt(i);
		char c=Character.toUpperCase(ch);
	 s4=s4.replace(str.charAt(i), c);
	 
	}
	System.out.println(s4);
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
 String str=sc.next();
// int n=sc.nextInt();
String answer=op1(str);
System.out.println(answer);
 op2(str);
op3(str);
op4(str);
	}

}
