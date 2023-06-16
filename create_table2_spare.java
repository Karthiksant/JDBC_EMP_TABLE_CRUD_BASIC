package employeetable;
import java.sql.*;
public class create_table2_spare
{
	public static void main(String[]args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url_link="jdbc:mysql://localhost:3306/jdbc";
			String user_name="root";
			String password="Karthiksant143";	
			Connection con=DriverManager.getConnection(url_link,user_name,password);
			Statement st=con.createStatement();
			boolean table=st.execute("create table employe_spare(id int primary key,ename varchar(20),ephone bigInt(10))");
			//("create table emp1 (id int primary key, ename varchar(45), Mobile_num bigint(10))");
			if(table==false)
			{
				System.out.println("table created");
			}
			else
			{
				System.out.println("table not created");
			}
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}
	}



