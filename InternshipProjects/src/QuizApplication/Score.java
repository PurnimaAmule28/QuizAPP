package QuizApplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener  {
    
	Score(String name,int score){
		setBounds(400,150,750,500);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		 
		JLabel heading=new JLabel("Thankyou "+name+"for playing Quize time");
		heading.setBounds(100,100,600,50);
		heading.setFont(new Font ("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel lblscore=new JLabel("Your score is "+score);
		lblscore.setBounds(150,200,600,50);
		lblscore.setFont(new Font ("Tahoma",Font.PLAIN,26));
		add(lblscore);
		
		   JButton sbmt=new  JButton("Play Again");
	       sbmt.setBounds(400,300,120,30);
	       sbmt.setBackground(Color.BLUE);
	       sbmt.setForeground(Color.WHITE);
	       sbmt.addActionListener(this);
		   add(sbmt);
		   
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}
	
	public static void main(String[] args) {
	new Score("User",0);
	
	}

}
