package com.cg.eis.bean;
import java.util.*;

public class EmployeeHash {
	public static void addEmp(Employee e,HashMap h)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter key");
		String key=s.nextLine();
		
		h.put(key, e);

	}
	public static void delete(HashMap h)
	{
			String k="kishore";
			h.remove(k);
			Set s1=h.entrySet();
			Iterator i=s1.iterator();
			while(i.hasNext())
			{
				Map.Entry m=(Map.Entry)i.next();
				System.out.println();
			}
			
	}
public static void main(String args[])
{
	HashMap<String, Employee> h=new HashMap<String,Employee>();
	//EmployeeHash eh=new EmployeeHash();
	Scanner sc=new Scanner(System.in);
    Employee e1=new Employee();
    e1.setId(101);
    e1.setName("kishore");
    e1.setSal(19000);
  
    System.out.println("enter insurance..i.e schemec");
    String in=sc.nextLine();
    e1.setInscheme(in);
    addEmp(e1,h);
    //System.out.println(h);
    Employee e2=new Employee();
    e2.setId(102);
    e2.setName("vinay");
    e2.setSal(35000);
   
    System.out.println("enter insurance..i.e schemeB");
    String in1=sc.nextLine();
    e2.setInscheme(in1);
    addEmp(e2,h);
    Set s=h.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		Map.Entry me=(Map.Entry)i.next();
		if(me.getValue()==e1)
		{
			Employee em=(Employee)me.getValue();
					System.out.println(em.getId()+" "+" "+em.getName()+" "+em.getSal()+" "+em.getInscheme());
		}
		if(me.getValue()==e2)
		{
			Employee em=(Employee)me.getValue();
					System.out.println(em.getId()+" "+" "+em.getName()+" "+em.getSal()+" "+em.getInscheme());
		}
	}
	//System.out.println(h);
	
	
}
}