import java.sql.*;

public class Main {

    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER= "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {

        Connection conn = null;


        try {
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = conn.createStatement();

            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO employees (employee_name,employee_position,employee_salary) VALUES (?,?,?)");

            preparedStatement.setString(1,"Anthony Hopkins");
            preparedStatement.setString(2,"Chief");
            preparedStatement.setDouble(3,10000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1,"Darth Vader");
            preparedStatement.setString(2,"Actor");
            preparedStatement.setDouble(3,5000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1,"Frodo");
            preparedStatement.setString(2,"Ring");
            preparedStatement.setDouble(3,100);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1,"Harry Potter");
            preparedStatement.setString(2,"Wizard");
            preparedStatement.setDouble(3,2500);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1,"Süleyman Kayır");
            preparedStatement.setString(2,"Recruiter");
            preparedStatement.setDouble(3,20000);
            preparedStatement.executeUpdate();

            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");
            System.out.println("  EMPLOYEE LIST");
            while(resultSet.next()) {
                System.out.println("------------------");
                System.out.println("EMPLOYEE ID: " + resultSet.getInt("employee_id"));
                System.out.println("EMPLOYEE NAME: " + resultSet.getString("employee_name"));
                System.out.println("EMPLOYEE POSTION: " + resultSet.getString("employee_position"));
                System.out.println("EMPLOYEE SALARY: " + resultSet.getDouble("employee_salary"));


            }
            preparedStatement.close();
            st.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}