
package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    
    Splash(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setTitle("College Management System");
        
        JLabel h = new JLabel("COLLEGE MANAGEMENT SYSTEM");
        h.setBounds(70,10, 1800, 60);
        h.setFont(new Font("serif", Font.PLAIN,50));
        h.setForeground(Color.BLUE);
        add(h);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/c1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 900,430);
        add(image);
        
        JButton con = new JButton("CLICK HERE TO CONTINUE");
        con.setBounds(330,380,300,40);
        con.setBackground(Color.YELLOW);
        con.setForeground(Color.BLACK);
        con.addActionListener(this);
        image.add(con);
        
        
        
        setSize(1000,600);
        setLocation(100, 100);
        setVisible(true);
        
//        while(true){
//            h.setVisible(false);
//            try{
//                Thread.sleep(700);
//            }catch (Exception e){
//                
//            }
//            
//            h.setVisible(true);
//            try{
//                Thread.sleep(700);
//            }catch (Exception e){
//                
//            }
//        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]){
        new Splash();
    }
}

