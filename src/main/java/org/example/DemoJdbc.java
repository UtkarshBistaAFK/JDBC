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
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String username = "postgres";
        String pass = "tsukuyomi";
        String query = "select * from student";

//Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, username, pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
//        rs.next();
//        String name=rs.getString("sname");
//        System.out.println(name);
        // rs.next() will check the next row
        while(rs.next()){
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2)+" ");
            System.out.println(rs.getInt(3));



        }
        con.close();


    }
}
