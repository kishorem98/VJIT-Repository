package com.cg.eis.service;
import com.cg.eis.bean.Employee;

public interface EmployeeService {

	public String calculate(double sal, String desig);
	public void intoFile(Employee e);
	public Object readFrom();
}
