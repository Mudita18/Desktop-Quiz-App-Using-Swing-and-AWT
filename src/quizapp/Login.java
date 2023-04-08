package quizapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField tfname;
    Login(){
        //JFrame contains a class called ImageIcon
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(ic);
        image.setBounds(0,0,400,500);
        add(image);
        
        JLabel heading = new JLabel("Tricky Treat");
        heading.setBounds(530,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,45));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(610,140,500,120);
        name.setFont(new Font("Mongolian baiti",Font.BOLD,18));
        name.setForeground(Color.BLACK);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(530,220,300,25);
        tfname.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(530,270,120,25);
        rules.setBackground(Color.BLACK);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(710,270,120,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,500);
        setLocation(150,100);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
    
}
