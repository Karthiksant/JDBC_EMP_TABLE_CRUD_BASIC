package employeetable;
import java.sql.*;
import java.util.Scanner;
public class insert 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		boolean b=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String pwd="Karthiksant143";
			Connection con=DriverManager.getConnection(url, user, pwd);
			Statement st=con.createStatement();
			do 
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter the ename");
				String name=sc.next();
				System.out.println("enter the mobile ephone");
				long phno=sc.nextLong();
				i=i+st.executeUpdate("insert into karthik values("+id+",'"+name+"',"+phno+")");
				System.out.println("do you want to insert one more row \n enter Yes or no");
				String res=sc.next();
				if (!(res.equalsIgnoreCase("yes")))
				{
					b=true;
					
				}
			}
			while(!b);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i>0) 
		{
			System.out.println("number of rows inserted are"+i);
		}
		else {
			System.out.println("no rows inserted");
		}
		
		
	
	}

}





