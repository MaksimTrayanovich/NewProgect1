package by.tut.extraworck.Parts2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {
    private JPanel panel1;
    private JLabel label;
    private JButton backToMenuButton;
    private LoginForm loginForm;

    public HelloForm(LoginForm loginForm, String text) {
        this.setTitle("This is my app");
        this.setContentPane(this.panel1);
        this.setSize(300, 100);
        this.setResizable(false);
        this.setLocation(650, 380);
        this.label.setText(text);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.loginForm = loginForm;
        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelloForm.super.setVisible(false);
                loginForm.setVisible(true);
            }
        });
    }
}
