package vjit;
import java.util.*;
 abstract class Account extends PersonIn {
protected  long  accNum=105;
 protected double balance;

public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	accNum+=1;
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
 void deposit(double damount)
 {
		balance=damount+balance;
		setBalance(balance);
 }
 abstract void withdraw(double amount) ;

public String  toString()
{
 return "NAME: "+getName()+" ACC Num: "+getAccNum()+" AGE: "+getAge()+" BAl: "+getBalance();
}
 }
	class Accountabstract extends Account{
		
		@Override
		public void withdraw(double amount)
		{
			if(getBalance()>=amount) {
			balance =balance - amount;
			setBalance(balance);
		}
			else
				System.out.println("insufficient balance");
		}
public static void main(String a[])
{
	Scanner sc=new Scanner (System.in);
	
	System.out.println("enter name and deposit amount and age");
	
	String name=sc.nextLine();
	double amount=sc.nextDouble();
	int age=sc.nextInt();
	
	Accountabstract a1=new Accountabstract();
	
	a1.setName(name);
	a1.setBalance(amount);
	a1.setAge(age);
	a1.setAccNum(a1.accNum);
	
	System.out.println("next name and amount and age");
	String name1=sc.next();
	double amount1=sc.nextDouble();
	
	Accountabstract a2=new Accountabstract();
	a2.setName(name1);
	int age1=sc.nextInt();

	a2.setAccNum(a1.accNum);
	a2.setBalance(amount1);
	a2.setAge(age1);
	System.out.println("deposit  in acc1....so enter amount");
	double amount2=sc.nextDouble();
	a1.deposit(amount2);
	
	System.out.println("withdraw  from acc2");
	double amount3=sc.nextDouble();
	a2.withdraw(amount3);
	
	System.out.println("balance in "+a1.getName()+ "account = "+a1.getBalance());
	System.out.println("balance in " +a2.getName() +"account = "+a2.getBalance());
	System.out.println(a1.toString());
	System.out.println(a2.toString());
}
}
