package vjit;
import java.util.*;
public class SavingsAccount extends Account {
	double bal;
	final double  minbal=500;
	
	@Override
	
	public void withdraw(double amount1)
	{
		if(getBalance() >=amount1)
		{
	      amount1=getBalance()-amount1;
	      if(amount1>minbal)
	      setBalance(amount1);
	      else
	    	  System.out.println("min balance of 500 is to be maintained");

		}
		else
			System.out.println("insufficient amount : Balance ="+getBalance());
		}
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
SavingsAccount s1=new SavingsAccount();
System.out.println("enter amount to deposit");
  double amount=sc.nextDouble();
  s1.deposit(amount);
 
  
 System.out.println("enter amount to withdraw");
  double amount1=sc.nextInt();
  s1.withdraw(amount1); 
 
  
  
  }

}
