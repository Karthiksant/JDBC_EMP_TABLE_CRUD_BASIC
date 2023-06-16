package employeetable;
import java.sql.*;
import java.util.Scanner;
public class update_table_row
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
		  System.out.println("asdfghjk");
		 // Scanner sc=new Scanner(System.in);
		//  String tn=sc.next();
		 boolean table=st.execute("update emp15 set ename='asdf' where id=1 ");
		  if(table==false)
			{
				System.out.println("table updated");
			}
			else
			{
				System.out.println("table not updated");
			}
		  con.close();
		}
		catch(ClassNotFoundException | SQLException obj)
		{
			obj.printStackTrace();
		}
	}

}
