/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import duanmau_my.bee.jdbcCulti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.datlich;

/**
 *
 * @author Legion 5
 */
public class datLichService {
    public boolean add(datlich s) {// tạo user ở trên này
        
        Connection conn=jdbcCulti.getConnection();
        String sql="INSERT INTO DatLich (gio,ngay)VALUES(?,?)";
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, s.getGio());
             ps.setDate(2, new java.sql.Date(s.getNgay().getTime()));
            
            
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            if (e.getSQLState().equals("23000")) {
                System.out.println("User already exists.");
            } else {
                e.printStackTrace();
            }
        }
        return false;
    }
}
