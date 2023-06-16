package employeetable;
import java.sql.*;
public class while_access_each
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
			ResultSet rs=st.executeQuery("select * from employe_spare");
			while(rs.next())
			{
				int id=rs.getInt(1);
				String ename=rs.getString(2);
				long ph=rs.getLong(3);
				System.out.println(id+" | "+ename+" | "+ph);
			}
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}
	}





