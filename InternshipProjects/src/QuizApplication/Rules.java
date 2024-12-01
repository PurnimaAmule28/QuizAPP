package QuizApplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
	
     String name;
     JButton back,start;
     
	Rules(String name){
		this.name=name;
	 getContentPane().setBackground(Color.WHITE);
	 setLayout(null);
	 
	 JLabel heading =new JLabel("Welcome "+name+" to the Quiz Time");
   	 heading.setBounds(50,50,650,40);
	 heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
	 heading.setForeground(Color.blue);
	 add(heading);
	 
	 JLabel rules =new JLabel();
	 rules.setBounds(30,90,700,350);
	 rules.setFont(new Font("Tahoma",Font.PLAIN,16));
	 rules.setText(
			 "<html>"+
	            "1.Each question has a strict time limit"+"<br><br>"+
			    "2.Participants must submit their answers before the timer runs out."+"<br><br>"+
	            "3.Incorrect answers or failure to answer results in no points for that question."+"<br><br>"+
			    "4.Ensure to be ready and attentive when the game begins."+"<br><br>"+
	            "5.Answers submitted after the timer ends will not be accepted."+"<br><br>"+ 
			    "6.Good luck."+"<br><br>"+
	            "<html>"
			 );
	 add(rules);
		
		back=new JButton("Back");
		back.setBounds(200,500,100,30);
		back.setBackground(Color.blue);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);

		start=new JButton("Start");
		start.setBounds(350,500,100,30);
		start.setBackground(Color.blue);
		start.setForeground(Color.white);
		start.addActionListener(this);
		add(start);
		
	 setSize(600,625);
	 setLocation(350,100);
	 setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==start) {
		setVisible(false);
		new Quiz(name);
			
		}else {
			setVisible(false);
			new Login();
		}
	}
	
	public static void main(String[] args) {
		new Rules("User");

	}

}
