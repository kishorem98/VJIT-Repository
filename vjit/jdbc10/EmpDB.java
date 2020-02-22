package jdbc10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;
public class EmpDB {

	public static void main(String[] args) {
	
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","kishore");
		System.out.println("connected to database");
		con.setAutoCommit(true);
		//Statement st=con.createStatement();
		/*String query="create table emp(id integer, name varchar2(15),sal number)";
		int i=st.executeUpdate(query);
		System.out.println("table created"+i);*/
		Scanner br=new Scanner(System.in );
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("do you want to add values ? y or n");
		char ch='y';
		ch=(char)br.next().charAt(0);
		while (ch=='y'||ch=='Y')
		{
			PreparedStatement pt=con.prepareStatement("insert into emp values(?,?,?)");
		//	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter id");
			int i=br.nextInt();
			br.nextLine();
		//	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter name");
			String name=br.next();
			System.out.println("enter sal");
		//	BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
			double sal=br.nextDouble();
			pt.setInt(1,i);
			pt.setString(2, name);
			pt.setDouble(3, sal);
			int count=pt.executeUpdate();
			System.out.println(count+" rows inserted");
			con.setAutoCommit(true);
			System.out.println("want to insert other row? enter y or n");
		//	BufferedReader br7=new BufferedReader(new InputStreamReader(System.in));
			ch=br.next().charAt(0);
		}
		
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from emp");
		System.out.println("id   name    sal");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
	//	BufferedReader br4=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("do you want to delete a row? y or n");
	
		char c=br.next().charAt(0);
		while(c=='y'||c=='Y')
		{
			PreparedStatement p1=con.prepareStatement("delete from emp where id=?");
			System.out.println("enter the id you want to delete");
		//	BufferedReader br5=new BufferedReader(new InputStreamReader(System.in));
			int i=br.nextInt();
			p1.setInt(1, i);
				p1.executeUpdate();
				System.out.println("do you want to delete an other row? y or n ");
				//BufferedReader br6=new BufferedReader(new InputStreamReader(System.in));
				c=br.next().charAt(0);
		}
		Statement st1=con.createStatement();
		ResultSet rs1=st1.executeQuery("select * from emp");
		System.out.println("after deleting");
		while(rs1.next()){
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getDouble(3));
		}
			
	}
		catch(Exception e)
		{
			System.out.println("caught "+e);
		}

}
}
