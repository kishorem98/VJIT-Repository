public class EmployeeDetails {
    String Empname;
    int Empid;
    float sal;
    EmployeeDetails(){
    }
    EmployeeDetails(String Empname,int Empid,float sal){
    this.Empname=Empname;
    this.Empid=Empid;
    this.sal=sal;
    }
    public void calculateSalary(){
    System.out.println("Employee salary:"+(sal+2000));
    }
public static void main(String[] args) {

     EmployeeDetails e=new EmployeeDetails();
     e.calculateSalary();
}

}
