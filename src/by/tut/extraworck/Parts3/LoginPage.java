package by.tut.extraworck.Parts3;

import by.tut.Lesson11.MyBestException;
import by.tut.Lesson11.WrongLoginException;
import by.tut.Lesson11.WrongPasswordException;

import javax.security.auth.login.LoginException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.security.MessageDigest;

public class LoginPage extends JFrame {
    private JPanel panel;
    private JTextField LoginField1;
    private JPasswordField passwordField;
    private JButton button1;

    public LoginPage() {
        button1.addComponentListener(new ComponentAdapter() {
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCredentials(LoginField1.getText(), passwordField.getText());
                    JOptionPane.showMessageDialog(LoginPage.this, "Login and password are correct");
                } catch (LoginException ex) {
                    JOptionPane.showMessageDialog(LoginPage.this,ex.getMessage(),"Oops login",JOptionPane.ERROR_MESSAGE);
                } catch (WrongPasswordException ex) {
                    JOptionPane.showMessageDialog(LoginPage.this,ex.getMessage(),"Oops password",JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(LoginPage.this,ex.getMessage(),"Access denied",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        LoginPage form = new LoginPage();
        form.setTitle("This is my app");
        form.setContentPane(form.panel);
        form.setSize(240, 120);
        form.setResizable(false);
        form.setLocation(650, 380);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }

    private static boolean checkCredentials(String login, String password) throws Exception {
        String correctLogin = "Super";
        String correctPassword = "Puper";
        if (login.length() < 3) throw new WrongLoginException("Login is too short");
        if (password.length() < 3) throw new WrongPasswordException("Password is too short");
        if (login.equals(correctLogin) && password.equals(correctPassword)) return true;
        throw new Exception("Login or password incorrect");
    }
}
