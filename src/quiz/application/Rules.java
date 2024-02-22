package quiz.application;

import java.awt.Color;
// import java.awt.Frame;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton Start, Back;

    String username;

    Rules(String name) {

        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel Heading = new JLabel("Welcome " + name);
        Heading.setBounds(90, 30, 800, 30);
        Heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        Heading.setForeground(Color.red);
        add(Heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Mongolian Baiti", Font.PLAIN, 23));

        rules.setText(
                "<html>"
                        + "1. The game is divided into rounds, each consisting of a set of questions. " + "<br><br>"
                        + "2. Players or teams participate in each round. " + "<br><br>"
                        + "3. Questions can be multiple-choice, true/false, or open-ended. " + "<br><br>"
                        + "4. Correct answers earn points, and incorrect answers may result in a deduction or no points. "
                        + "<br><br>"
                        + "5. You can have different point values for each question, depending on difficulty. "
                        + "<br><br>"
                        + "<html>");

        add(rules);

        Back = new JButton("Back");
        Back.setBounds(250, 500, 100, 30);
        Back.setBackground(Color.PINK);
        Back.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);

        Start = new JButton("Start");
        Start.setBounds(400, 500, 100, 30);
        Start.setBackground(Color.PINK);
        Start.setFont(new Font("Mongolian Baiti", Font.BOLD, 23));
        Start.setForeground(Color.white);
        Start.addActionListener(this);
        add(Start);

        setVisible(true);
        setSize(1200, 650);
        setLocation(200, 150);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Start) {
            setVisible(false);
            new Quiz(username);

        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
