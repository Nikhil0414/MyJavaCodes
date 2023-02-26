import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3 
{
	public static void main(String[] args) 
	{
// STEP 1

		final String url = "jdbc:mysql://localhost/new1";
		ResultSet rs = null;
		
//STEP 2 CREDENTIALS
		
		final String username = "root";
		final String password = "Nikhil";
		
// STEP 3 OPEN A CONNECTION
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Success: Database connection. " + connection);

//STEP 4 EXECUTE A QUERY
			
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT * FROM new1.tab1;");
			System.out.println("id\t" + "name\t\t" + "address\t\t\t\t\t" + "phone_no\t\t" + "DOB\t");

//STEP 5 EXTRACT DATA
			
				while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int phone_no = rs.getInt("phone_no");
				int DOB = rs.getInt("DOB");
				System.out.println(id+ "\t" + name + "\t\t" + address + "\t" + phone_no + "\t\t" + DOB + "\t");
			}

		} catch(SQLException e){
			System.out.println("Error: Couldn't connect to database " + e);
		}
		
//STEP 6 CLEAN UP ENVIRONMENT
		
		finally{
			if(rs != null){
				try{
					rs.close();
				} catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}