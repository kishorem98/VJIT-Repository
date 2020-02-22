package com.cg.eis.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.cg.eis.bean.Employee;

class ExceptionCheck {

	@Test (expected=EmployeeException.class)
	public void ckeck()
	{
		Employee e=new Employee();
		e.setSal(5000);
	}
	


	

}
