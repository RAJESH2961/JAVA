import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "bala7699";

        try {
            // 1. Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // 3. Create Statement Object
            Statement stmt = conn.createStatement();

            // 4. Create a New Database
            String createDatabase = "CREATE DATABASE IF NOT EXISTS SampleDB";
            stmt.executeUpdate(createDatabase);

            // Connect to the new database
            conn = DriverManager.getConnection(url + "SampleDB", user, password);

            // 5. Create a New Table
            String createTable = "CREATE TABLE IF NOT EXISTS Students (" +
                                 "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "name VARCHAR(50), " +
                                 "age INT)";
            stmt.executeUpdate(createTable);

            // 6. Insert Data into the Table
            String insertData = "INSERT INTO Students (name, age) VALUES ('Alice', 22), ('Bob', 24)";
            stmt.executeUpdate(insertData);

            System.out.println("Database and table created successfully!");

            // Close connection
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
