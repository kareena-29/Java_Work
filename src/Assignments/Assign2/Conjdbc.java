package Assignments.Assign2;

import java.sql.*;
import java.lang.*;

public class Conjdbc {
    static String url = "jdbc:mysql://localhost:3306/assignment";
    static String uname = "root";
    static String pass = "Tkareena@sql29";
    static Connection con = null;

    public static Connection getConnection() {
        if (con != null) return con;

        return getConnection(url, uname, pass);
    }

    private static Connection getConnection(String url, String uname, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pass);
        } catch (Exception ee) {
            ee.printStackTrace();
        }

        return con;
    }
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
////        jdbc:mysql://localhost:3306/databasename
//        String url = "jdbc:mysql://localhost:3306/assignment";
//        String uname = "root";
//        String pass = "Tkareena@sql29";
//        String query = "select bname from book where bid=1";
//
////        Class.forName("com.mysql.jdbc.Driver");
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con;
//        con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(query);
//
//        rs.next();
//        String name = rs.getString("bname");
//        System.out.println(name);
//
//        st.close();
//        con.close();

//}
}
