package com.cg.eis.pl;
import java.io.Serializable;
import java.util.*;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class Details implements Serializable{

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println(" sal-> >5k and <20k then desig=system associate");
System.out.println(" sal-> >=20k and <40k then desig=programmer");
System.out.println(" sal-> >=40 then desig=manager");
System.out.println(" else clerk");

System.out.println("enter id, name, sal , designation accordingly");
int id1=sc.nextInt();
String name1=sc.next();
double sal1=sc.nextDouble();
sc.nextLine();

String designation=sc.nextLine();
Employee e1=new Employee();

e1.setId(id1);
e1.setName(name1);
e1.setSal(sal1);
e1.setDesignation(designation);

		/*
		 * System.out.println("enter id , name, sal of first employee"); int
		 * id2=sc.nextInt(); String name2=sc.next(); double sal2=sc.nextDouble();
		 * 
		 * Employee e2=new Employee ();
		 * 
		 * e2.setId(id2); e2.setName(name2); e2.setSal(sal2);
		 */
Service s=new Service();

String d=s.calculate(e1.getSal(), e1.getDesignation());
//s.calculate(sal2);
e1.setInscheme(d);
System.out.println("employee 1: ID="+e1.getId()+" \nNAME "+e1.getName()+"\n SAL "+e1.getSal()+"\n Designation= "+e1.getDesignation()+"\nScheme= "+e1.getInscheme());

		
System.out.println(".......................\n.....................");
		 
s.intoFile(e1);

System.out.println(".......................\n.....................");

		  Employee er=(Employee)s.readFrom();
		  System.out.println("NAme from file ="+er.getName());
		  System.out.println("id from file ="+er.getId());
		 System.out.println("sal from file ="+er.getSal());
		 System.out.println("desig from file ="+er.getDesignation());
		 System.out.println("scheme from file ="+er.getInscheme());
		  
		 
//System.out.println("NAme from file ="+er.getDesignation());
//System.out.println("NAme from file ="+er.getInscheme());
}

}
