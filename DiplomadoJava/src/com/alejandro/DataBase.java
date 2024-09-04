package com.alejandro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class DataBase{
    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Compuconnect", "postgres", "admin");
            System.out.println("Exito en la conexion");
        } catch (SQLException e) {
            System.out.println("no dio");
        }
    }
}
