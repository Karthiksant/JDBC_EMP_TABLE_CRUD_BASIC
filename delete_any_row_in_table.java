package employeetable;
import java.sql.*;
public class delete_any_row_in_table 
{
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String name="root";
			String password="Karthiksant143";
			Connection con=DriverManager.getConnection(url,name,password);
			Statement st=con.createStatement();
			boolean res=st.execute("delete from employe_spare where id=5");
			if(res==false)
			{
				System.out.println("table id deleted");
			}
			else
			{
				System.out.println("table id not deleted");
			}
			con.close();
		}
		catch(ClassNotFoundException | SQLException obj)
		{
			obj.printStackTrace();
		}
	}

}
