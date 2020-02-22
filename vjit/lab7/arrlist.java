package vjit.lab7;
import java.util.*;
public class arrlist {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
ArrayList<String> al=new ArrayList<String>();
al.add("phone");
al.add("laptop");
al.add("pen");
Collections.sort(al);
System.out.println("before sorting");
for(String str: al)
{
	System.out.println(str);
}
System.out.println("after sorting");
for(String str: al)
{
	System.out.println(str);
}
	
	

	}

}
