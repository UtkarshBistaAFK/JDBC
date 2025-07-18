package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
String url="jdbc:postgresql://localhost:5432/Demo";
String username="postgres";
String pass="tsukuyomi";

Class.forName("org.postgresql.Driver");
Connection con= DriverManager.getConnection(url,username,pass);
        System.out.println("Connection Established");
    }
}
