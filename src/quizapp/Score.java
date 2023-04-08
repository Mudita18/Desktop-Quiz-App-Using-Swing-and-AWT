package quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        setBounds(280,80,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i1 = ic.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel image = new JLabel(i2);
        image.setBounds(0,230,300,250);
        add(image);
     
        JLabel heading = new JLabel("Thankyou " + name +" for playing Tricky Treat");
        heading.setBounds(130,50,700,30);
        heading.setFont(new Font("MONSERRAT",Font.BOLD,26));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel fscore = new JLabel("Your score is " +score);
        fscore.setBounds(250,150,700,30);
        fscore.setFont(new Font("TAHOMA",Font.PLAIN,28));
        fscore.setForeground(Color.BLACK);
        add(fscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(270,200,150,35);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);   
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String [] args){
        new Score("User",0);
    }
}
