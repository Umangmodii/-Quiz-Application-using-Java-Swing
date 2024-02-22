package quiz.application;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String username, int score) {
        setBounds(400, 150, 750, 550); // set the size of the window to 800x600
        setLayout(null);
        // getContentPane().setBackground(Color.WHITE);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel j1 = new JLabel(i3);
        j1.setBounds(0, 200, 300, 250);
        add(j1);

        JLabel no = new JLabel("Thank You " + username + " for playing us.");
        no.setBounds(45, 30, 700, 30);
        no.setFont(new Font("Mongolian Baiti", Font.PLAIN, 26));
        add(no);

        JLabel lscore = new JLabel("Your Score is : " + score);
        lscore.setBounds(350, 200, 300, 30);
        lscore.setFont(new Font("Mongolian Baiti", Font.PLAIN, 26));
        add(lscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

    }

    public static void main(String[] args) {
        new Score("User", 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
}
