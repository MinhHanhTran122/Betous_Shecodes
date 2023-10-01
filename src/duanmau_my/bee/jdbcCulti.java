/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duanmau_my.bee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Legion 5
 */
public class jdbcCulti {
     public static Connection getConnection() {
        Connection conn=null;
        try{
        String sql="jdbc:sqlserver://localhost:1433;databaseName=shecodes2023;encrypt=true;trustServerCertificate=true;user=sa;password=123";
        conn=DriverManager.getConnection(sql);
            System.out.println("haha");
                
                
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return conn;
    }
    public static void close(Connection conn) {
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
}
