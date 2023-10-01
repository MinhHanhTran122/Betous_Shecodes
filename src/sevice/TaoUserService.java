/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import duanmau_my.bee.jdbcCulti;
import java.sql.Connection;
import java.util.ArrayList;

import model.User;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Login;

        

/**
 *
 * @author Legion 5
 */
public class TaoUserService implements TaoUserImterface{
    PreparedStatement ps = null;
   

    @Override
    public boolean add(User s) {// tạo user ở trên này
        
        Connection conn=jdbcCulti.getConnection();
        String sql="INSERT INTO DangNhap (Username,Password,Email)VALUES(?,?,?)";
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, s.getUser());
            ps.setString(2, s.getPass());
            
            ps.setString(3, s.getEmail());
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

    
      public static boolean isValidEmail(String email) {// đây là phần validate
        // Định dạng regex cho địa chỉ email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";// check du lieu đầu vào email
        // nó có như này thôi
        
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
      public  boolean  checkUser(String user){
          ArrayList<User>list=new ArrayList<>();
          for(User u:list){
              if(u.getUser().equalsIgnoreCase(user)){
                  System.out.println("user da ton tai");
                  return false;
              }
              add(u);
              return true;
          }
          return false;
      }

    
}
   

