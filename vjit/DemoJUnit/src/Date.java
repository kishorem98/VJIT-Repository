
public class Date {
int intDate,intMonth, intYear;
Date(int intDate,int intMonth,int intYear)
{
	this.intDate=intDate;
	this.intMonth=intMonth;
	this.intYear=intYear;
}
public int getIntDate() {
	return intDate;
}
public void setIntDate(int intDate) {
	this.intDate = intDate;
}
public int getIntMonth() {
	return intMonth;
}
public void setIntMonth(int intMonth) {
	this.intMonth = intMonth;
}
public int getIntYear() {
	return intYear;
}
public void setIntYear(int intYear) {
	this.intYear = intYear;
}
public String toString()
{
	return "Date is " +intDate+"/"+intMonth+"/"+intYear;
}
	/*
	 * public static void main(String a[]) { Date d=new Date(20,07,1998); String
	 * s=d.toString(); System.out.println(s); }
	 */
}
