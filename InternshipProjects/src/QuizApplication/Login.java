package QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
	JButton rules,back;
	JTextField tfname;
	
	Login(){
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
        JLabel heading =new JLabel("Quiz Time");
		heading.setBounds(260,10,500,100);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,45));
		heading.setForeground(Color.blue);
		add(heading);
		
		
		JLabel name =new JLabel("Enter your name : ");
		name.setBounds(300,100,300,18);
		name.setFont(new Font("Mongolian Baiti ",Font.BOLD,18));
		name.setForeground(Color.blue);
		add(name);
		
		
		tfname=new JTextField();
		tfname.setBounds(250,150,300,25);
		tfname.setFont(new Font("Times new Roman",Font.BOLD,20));
		add(tfname);
		
		rules=new JButton("Rules");
		rules.setBounds(235,220,120,25);
		rules.setBackground(Color.blue);
		rules.setForeground(Color.white);
		rules.addActionListener(this);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(435,220,120,25);
		back.setBackground(Color.blue);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		setVisible(true);
		setSize(800,500);
		setLocation(200,200);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==rules) {
			String name=tfname.getText();	
			setVisible(false);
			new Rules(name);
			
		}else if(ae.getSource()==back) {
			setVisible(false);
		}
	}
	
	public static void main(String [] args) {
		new Login();
	}
}
