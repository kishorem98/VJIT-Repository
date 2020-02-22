package com.cg.eis.exception;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

import java.util.*;
class EmployeeException extends Exception{
	EmployeeException(String s)
	{
		super(s);
	}
}
public class CheckException {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Employee e1=new Employee();
		Service s=new Service();
		System.out.println("enter salary");
		double sal1=sc.nextDouble();
		e1.setSal(sal1);
		try
		{
			if(sal1<3000)
			{
				throw new EmployeeException(" Salary is below 3000");
			}
			else
			{
				System.out.println("salary= "+sal1);
			//	s.calculate(sal1);
			}
		}
			catch(EmployeeException e)
			{
				System.out.println(e);
			}
		}
	}

