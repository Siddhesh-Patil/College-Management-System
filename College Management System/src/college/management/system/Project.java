
package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1000, 700);
        setLocation(200,100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/c4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JLabel h = new JLabel("College Management System");
        h.setBounds(150,100, 1800, 60);
        h.setFont(new Font("Serif", Font.BOLD,50));
        h.setForeground(Color.BLACK);
        image.add(h);
        
        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.YELLOW);
        image.add(mb);
        
        // New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        newInformation.setFont(new Font("Serif", Font.BOLD, 20));
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        // Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        details.setFont(new Font("Serif", Font.BOLD, 20));
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        
        
        // Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        exam.setFont(new Font("Serif", Font.BOLD, 20));
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        updateInfo.setFont(new Font("Serif", Font.BOLD, 20));
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        fee.setFont(new Font("Serif", Font.BOLD, 20));
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
           
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("Serif", Font.BOLD, 20));
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
            setVisible(false);
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
            setVisible(false);
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
            setVisible(false);
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
            setVisible(false);
        }else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
            setVisible(false);
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
            setVisible(false);
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
            setVisible(false);
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
            setVisible(false);
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
            setVisible(false);
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
