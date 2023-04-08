package quizapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setSize(700,600);
        setLocation(400,60);
        setVisible(true);
        
        JLabel heading = new JLabel("Welcome " + name + " To Tricky Treat");
        heading.setBounds(80,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel rules = new JLabel("Rules");
        rules.setBounds(50,80,350,300);
        rules.setFont(new Font("Tahoma",Font.PLAIN,18));
        rules.setForeground(Color.BLACK);
        rules.setText(
            "<html>"+
                    "1. Kindly answer point to point." + "<br><br>"+
                    "2. All the questions are compulsory." + "<br><br>"+
                    "3. There is a 50-50 lifeline provided which can only be used once."+"<br><br>"+
                    "4. Be wise and do not try to cheat." + "<br><br>"+
                    "5. Stay focussed. GOOD LUCK!"+
            "<html>"
        );  
        add(rules);
        
        start = new JButton("Start");
        start.setBounds(100,450,100,30);
        start.setBackground(new Color(30,144,255));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(300,450,100,30);
        back.setBackground(new Color(30,144,255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
       new Rules("User");
    }
}
