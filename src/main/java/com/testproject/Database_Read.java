package com.testproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database_Read {
    private Connection con;

    public Database_Read(Connection con) {
        this.con = con;
    }

    protected void read(){
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM offices WHERE country = ?");  //user input -> ? (It protects SQL injection)
            ps.setString(1,"USA");
            ResultSet rs = ps.executeQuery(); // This is used for those which do not return results, like insert, update
            while (rs.next()){
                System.out.print(rs.getInt(1));
                System.out.print("|");
                System.out.println(rs.getString("city"));
                System.out.println();
            }
            rs.close();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
