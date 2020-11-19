/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dals;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lrandom
 */
public class Conn {
    public static final String DB_URI = "jdbc:mysql://localhost:3306/tonglao";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "koodinh";
    public static final String DB_CLASS_NAME ="com.mysql.cj.jdbc.Driver";
    private Connection conn;
    public Conn(){
        try {
            Class.forName(DB_CLASS_NAME);
            conn = DriverManager.getConnection(DB_URI,DB_USER,DB_PASS);
        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.conn;
    }
    
    public boolean closeConnect(){
        try {
            this.conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
