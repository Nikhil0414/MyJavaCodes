import java.sql.*;

public class SecJDBC {
    public static void main(String[] args) {
        // connecting to the database
        String serverName = "localhost";
        String myDatabase = "world";
        final String url = "jdbc:mysql://" + serverName + "/" + myDatabase;

        // initializing ResultSet
        ResultSet rs = null;

        // username and password
        final String username = "root";
        final String password = "Nikhil";

        try {
            // using static method of DriverManager
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Success: Database connection. " + connection);

            // creating statement object
            // TYPE_SCROLL_SENSITIVE - The cursor can scroll forward and backward, and the result set
            // is sensitive to changes made by others to the database that occur after the result set
            // was created
            // CONCUR_READ_ONLY - Creates a read-only resultset. This is the default.
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            // executing SELECT query and returning ResultSet
            rs = stmt.executeQuery("SELECT * FROM city");

            // displaying results column wise
            System.out.println("id\t" + "name\t\t\t" + "countrycode\t\t\t" + "district\t\t\t" + "population\t\t");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String countrycode = rs.getString("countrycode");
                String district = rs.getString("district");
                String population = rs.getString("population");

                // updating row if id is 14
                if(id == 14){
                    rs.updateString("name","ravi");
                    rs.updateRow();
                }
                System.out.println(id + "\t" + name + "\t\t\t" + countrycode + "\t\t\t" + district + "\t\t\t\t\t" + population + "\t\t\t");
            }

        } catch(SQLException e){
            System.out.println("Error: Couldn't connect to database " + e);
        }
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