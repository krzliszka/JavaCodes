package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/krzysiek/Desktop/EiT/Programy/Java/TestDB/testjava.db");
//             Statement statement = conn.createStatement();{
//             statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/krzysiek/Desktop/EiT/Programy/Java/TestDB/testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                                "(name TEXT, phone INTEGER, email TEXT)");
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                                "VALUES('Chris','43434343','Chris@email.com')");

            statement.close();
            conn.close();

//            Class.forName("org.sql.JDBC");
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
