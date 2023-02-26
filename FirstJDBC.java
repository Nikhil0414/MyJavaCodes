import java.sql.*;

public class FirstJDBC 
{
	public static void main(String[] args) 
	{
// STEP 1

		final String url = "jdbc:mysql://localhost/Employee";
		ResultSet rs = null;
		
//STEP 2 CREDENTIALS
		
		final String username = "root";
		final String password = "root";
		
// STEP 3 OPEN A CONNECTION
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Success: Database connection. " + connection);

//STEP 4 EXECUTE A QUERY
			
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Employee WHERE designation='supervisor' OR salary>80000;");
			System.out.println("employee_no\t" + "name\t\t" + "designation\t\t" + "data_of_joining\t\t" + "salary\t");

//STEP 5 EXTRACT DATA
			
				while(rs.next()){
				int employee_no = rs.getInt("employee_no");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				int data_of_joining = rs.getInt("data_of_joining");
				int salary = rs.getInt("salary");
				System.out.println(employee_no + "\t" + name + "\t\t" + designation + "\t\t" + data_of_joining + "\t\t" + salary + "\t");
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