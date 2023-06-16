package employeetable;
import java.sql.*;
import java.util.Scanner;
public class update_scanner_looping
{
	public static void main(String []args)
	{
		try 
		{ Class.forName("com.mysql.cj.jdbc.Driver");
		  String url="jdbc:mysql://localhost:3306/jdbc";
		  String name="root";
		  String pwd="Karthiksant143";
		  Connection con=DriverManager.getConnection(url,name,pwd);
		  Statement st=con.createStatement();
		  System.out.println("enter table name to update");
		  Scanner sc=new Scanner(System.in);
		  String tn=sc.next();
		  boolean b=true;
		  do {
		  System.out.println("enter which id to update");
		  String in=sc.next();
		  System.out.println("enter ename to update");
		  String en=sc.next();
		 boolean table=st.execute("update "+tn+" set ename='"+en+"' where id="+in+" ");
		 System.out.println("to update another row enter yes or no ");
		  String up=sc.next();
		  if(up.equals("yes"))
		  { b=true;}
		  else { b=false;}
		  } while(b);
		  con.close();
		}
		catch(ClassNotFoundException | SQLException obj)
		{
			obj.printStackTrace();
		}
	}

}
