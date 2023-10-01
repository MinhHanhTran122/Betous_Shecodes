/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Legion 5
 */
public class User {
    private String user;
    private String pass;
    private int role;
    private String email;

    public User() {
    }

    public User(String user, String pass, int role, String email) {
        this.user = user;
        this.pass = pass;
        this.role = role;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
   
    
    public  String getrole(){
        if(this.getRole()==1){
            return "admin";
        }
        
            return "user";
        
    }
    
}
