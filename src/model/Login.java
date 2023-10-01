/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Legion 5
 */
public class Login {
    private String id;
    private String tk;
    private String pass;
    

    public Login() {
    }

    public Login(String tk, String pass) {
        
        this.tk = tk;
        this.pass = pass;
    }

   
    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}