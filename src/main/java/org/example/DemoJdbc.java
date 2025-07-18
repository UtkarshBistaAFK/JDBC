package org.example;

import java.sql.*;

import static java.lang.Class.forName;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*


import package
load and register
create connection
create statement
process the results
close



         */


        int sid = 12;
        String sname ="witch";
        int marks = 90;


        String url = "jdbc:postgresql://localhost:5432/Demo";
        String username = "postgres";
        String pass = "tsukuyomi";

        String sql = "insert into student values(?,?,?)";
//Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, username, pass);
        System.out.println("Connection Established");
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);


        st.execute();


        con.close();


    }
}
