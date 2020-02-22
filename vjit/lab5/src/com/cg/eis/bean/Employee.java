package com.cg.eis.bean;

import java.io.Serializable;

public class Employee implements Serializable {
private int id;
private String name;
private double sal;
private String designation;
private String inscheme;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInscheme() {
	return inscheme;
}
public void setInscheme(String inscheme) {
	this.inscheme = inscheme;
}
}
