package com.testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private Connection get_db_Connection() {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            System.out.println("Database is connected.");
        }
        catch (ClassNotFoundException ce){
            System.out.println(ce.getMessage());
        }
        catch (SQLException se) {
            se.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }









    public static void main(String[] args) {
//        int i = 10;
//        if (i > 0) {
//            System.out.println("i > 0");
//            for (int j = 0; j < 5; j++) {
//
//            }
//            int[] k = new int[10];
//            for (int a : k) {
//
//            }
//        }

        //1. Connection
        Main m = new Main();
        Connection con = m.get_db_Connection();
        try{
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //2. Statement
        //3. Resultset
        //4. Close


    }


}