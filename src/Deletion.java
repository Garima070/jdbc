import com.mysql.jdbc.Driver;

import java.sql.*;

public class Deletion {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/garima","root","");
        Statement stmt=con.createStatement();
        String sql="delete from new where age=3";
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
        ps.executeUpdate();
        con.close();
    }
}
