package quiz.application;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

    JButton Rules, Back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("image/Quiz_Time.jpg"));
        JLabel j1 = new JLabel(icon);
        j1.setBounds(0, 0, 600, 500);
        add(j1);

        JLabel Heading = new JLabel("Quiz Question");
        Heading.setBounds(740, 60, 300, 45);
        Heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        Heading.setForeground(Color.red);
        add(Heading);

        JLabel Name = new JLabel("Enter your Name : ");
        Name.setBounds(780, 150, 300, 20);
        Name.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
        Name.setForeground(Color.blue);
        add(Name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(tfname);

        Rules = new JButton("Rules");
        Rules.setBounds(735, 270, 120, 25);
        Rules.setBackground(Color.PINK);
        Rules.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
        Rules.setForeground(Color.white);
        Rules.addActionListener(this);
        add(Rules);

        Back = new JButton("Back");
        Back.setBounds(915, 270, 120, 25);
        Back.setBackground(Color.PINK);
        Back.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);

        setVisible(true);
        setSize(1400, 550);
        setLocation(200, 150);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        } else if (e.getSource() == Back) {
            setVisible(false);
        }
    }
}
