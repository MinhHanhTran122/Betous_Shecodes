/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import duanmau_my.bee.jdbcCulti;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author Legion 5
 */
public class PasswordUpdateApp extends JFrame {

    private JTextField usernameTextField;
    private JPasswordField newPasswordField;
    private JButton updateButton;

    public PasswordUpdateApp() {
        setTitle("Password Update App");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        usernameTextField = new JTextField(15);
        newPasswordField = new JPasswordField(15);
        updateButton = new JButton("Update Password");

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePassword();
            }
        });

        setLayout(new GridLayout(3, 2));
        add(new JLabel("Username:"));
        add(usernameTextField);
        add(new JLabel("New Password:"));
        add(newPasswordField);
        add(updateButton);

        setVisible(true);
    }

    private void updatePassword() {// code java swing 
        String username = usernameTextField.getText();
        String newPassword = new String(newPasswordField.getPassword());
        Connection conn = jdbcCulti.getConnection();
        String query = "UPDATE DangNhap SET password = ? WHERE username = ?";
        // Perform database update using JDBC
        try {
            // Replace with your database URL, username, and password
            

            
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);
            int rowsAffected = preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Password updated successfully!");
                setVisible(false);
                Java_View_Login j=new Java_View_Login();
                j.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "User not found or password not updated.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating password");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PasswordUpdateApp();
            }
        });
    }
}