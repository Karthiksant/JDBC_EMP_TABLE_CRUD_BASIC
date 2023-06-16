package employeetable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class sql_query_by_string 
{
	public static void main(String[]args)
	{
		try
		{	Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url_link="jdbc:mysql://localhost:3306/jdbc";
			String user_name="root";
			String password="Karthiksant143";	
			Connection con=DriverManager.getConnection(url_link,user_name,password);
			Statement st=con.createStatement();
			System.out.println("enter query");
			String name=sc.nextLine();
			ResultSet rs=st.executeQuery(name);
//st.execute("update "+tn+" set ename='"+en+"' where id="+in+" ");
			//("+id+",'"+name+"',"+phno+")")
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
