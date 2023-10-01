/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import java.sql.Connection;
import duanmau_my.bee.jdbcCulti;
import java.util.ArrayList;
import model.Login;
import java.sql.*;
import javax.swing.JOptionPane;
import view.Java_View_Login;
/**
 *
 * @author Legion 5
 */
public class LoginService {
    public ArrayList<Login>getall(){
        ArrayList<Login>list=new ArrayList<>();
        try{
        String sql="Select * from DangNhap";
        Connection conn=jdbcCulti.getConnection();
        PreparedStatement ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            String tk=rs.getString(1);
            String pass=rs.getString(2);
        
            Login l=new Login(tk, pass);
            list.add(l);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public  boolean  checklogin(String tk,String pass){
        ArrayList<Login>list=this.getall();
        for(Login l:list){
            if(l.getTk().equals(tk)&&l.getPass().equals(pass)){
//                if(l.isRole()==true){
//                    Java_View_Login r=new Java_View_Login();
//                    r.setVisible(false);
//                    System.out.println("admin");
////                    ViewStudents s=new ViewStudents();
//                    
////                    s.setVisible(true);
//                    return true;
//                }else{
//                   
//                    Java_View_Login r=new Java_View_Login();
//                    r.setVisible(false);
//                        System.out.println("gv");
////                    ViewDiemStudents s=new ViewDiemStudents();
////                    s.setVisible(true);
                  
                return  true;
                
                  
                
            }
        }
        return false;
    }
}
