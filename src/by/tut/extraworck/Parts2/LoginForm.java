package by.tut.extraworck.Parts2;

import by.tut.extraworck.Example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField textField1;
    private JButton loginButton;
    private JPanel panel;
    private HelloForm helloForm;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                LoginForm.super.setVisible(false);
                helloForm = new HelloForm(LoginForm.this,getDoctorByPlan(text));
            }
        });
    }

    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.setTitle("This is my app");
        form.setContentPane(form.panel);
        form.setSize(300, 100);
        form.setResizable(false);
        form.setLocation(650, 380);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);

    }
    private static String getDoctorByPlan(String plan){
        if (plan.equals("1"))return "You need to visit our Terapist";
        if (plan.equals("2"))return "You need to visit our Dentist";
        if (plan.equals("3"))return "You need to visit our Surgeon";
        return "you need to go Okulist,there is not correct option";
    }
}
