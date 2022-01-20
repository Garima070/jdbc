import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/garima","root","");
        Statement smtl=con.createStatement();
        String sql="update new set name='Riya' where  age='19'";
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
        ps.executeUpdate(sql);
        ResultSet rs = ps.executeQuery("select  * from new");
        while (rs.next())
            System.out.println(rs.getString("name")+" "+rs.getInt("age")+" "+rs.getInt("roll no"));
        con.close();
    }
}


