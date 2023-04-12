package by.tut.extraworck;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JButton okButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel panel;

    public Example() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(okButton, "Hello " + textField1.getText());
                System.out.println("someone clicked");
            }
        });
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.setTitle("This is my app");
        example.setContentPane(example.panel);
        example.setSize(300, 200);
        example.setDefaultCloseOperation(EXIT_ON_CLOSE);
        example.setVisible(true);

    }
}
