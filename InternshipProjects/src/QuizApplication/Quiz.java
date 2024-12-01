package QuizApplication;

import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Quiz extends JFrame implements ActionListener{
	
	JLabel qno,question;
	JRadioButton opt1,opt2,opt3,opt4;
	JButton nxt,lifeline,sbmt;
	String[][] useranswers=new String[10][1];
	String questions[][]= new String [10][5];
	String answers[][]=new String[10][2];
	ButtonGroup goption;
	public static int timer=15;
	public static int ans_given=0;
	public static int count=0;
	public static int score=0;
	
	String name;
	
	Quiz(String name){
		this.name=name;
		setBounds(200,0,950,700);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		qno=new JLabel();
		qno.setBounds(100,100,50,30);
		qno.setFont(new Font ("Tahoma",Font.PLAIN,24));
		add(qno);
		
		question=new JLabel();
		question.setBounds(150,100,900,30);
		question.setFont(new Font ("Tahoma",Font.PLAIN,24));
		add(question);
		
		questions[0][0] = "Who invented java programming.?";
        questions[0][1] = "James Gosling ";
        questions[0][2] = "Guido van rossum";
        questions[0][3] = "Bjarne stroustrup";
        questions[0][4] = "Dennis Ritchie";

        questions[1][0] = "Which of the following is not a java feature?";
        questions[1][1] = "Use of Pointers";
        questions[1][2] = "Object-oriented";
        questions[1][3] = "Dynamic and extensible";
        questions[1][4] = "Portable";

        questions[2][0] = "Java is case sensitive?";
        questions[2][1] = "Ture";
        questions[2][2] = "False";
        questions[2][3] = "May true or false ";
        questions[2][4] = "Depends on compiler";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";	
        
        answers[0][1] = "Jams Bosling";
        answers[1][1] = "Use of pointers";
        answers[2][1] = "true";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
		
        opt1=new JRadioButton();
        opt1.setBounds(100,170,500,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);
        
        opt2=new JRadioButton();
        opt2.setBounds(100,210,500,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);
        
        opt3=new JRadioButton();
        opt3.setBounds(100,250,500,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);
        
        opt4=new JRadioButton();
        opt4.setBounds(100,290,500,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);
        
       goption=new ButtonGroup();
       goption.add(opt1);
       goption.add(opt2);
       goption.add(opt3);
       goption.add(opt4);
        

       nxt=new  JButton("Next");
       nxt.setBounds(200,350,150,40);
       nxt.setBackground(Color.BLUE);
       nxt.setForeground(Color.WHITE);
       nxt.setFont(new Font("Tahhoma",Font.PLAIN,25));
       nxt.addActionListener(this);
       add(nxt);
       
       lifeline=new  JButton("Lifeline");
       lifeline.setBounds(400,350,150,40);
       lifeline.setBackground(Color.BLUE);
       lifeline.setForeground(Color.WHITE);
       lifeline.setFont(new Font("Tahhoma",Font.PLAIN,25));
       lifeline.addActionListener(this);
       add(lifeline);
       
       sbmt=new  JButton("Submit");
       sbmt.setBounds(600,350,150,40);
       sbmt.setBackground(Color.BLUE);
       sbmt.setForeground(Color.WHITE);
       sbmt.setFont(new Font("Tahhoma",Font.PLAIN,25));
       sbmt.setEnabled(false);
       sbmt.addActionListener(this);
       add(sbmt);
       
       
       start(count);
       
       
        setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	         
		if(e.getSource()==nxt) {
		repaint();
		
		opt1.setEnabled(true);
    	opt2.setEnabled(true);
    	opt3.setEnabled(true);
    	opt4.setEnabled(true);
		
		ans_given=1;
		if(goption.getSelection()==null) {
    		useranswers[count][0]="";
    	}
    	else {
    		useranswers[count][0]=goption.getSelection().getActionCommand();
    	}
		
		if(count==8) {
			nxt.setEnabled(false);
			sbmt.setEnabled(true);
		}
		
		count++;
		start(count);
		}
		else if(e.getSource()==lifeline) {
			if(count==2 || count==4 || count==6 || count==8 || count==9)
			{
				opt2.setEnabled(false);
				opt3.setEnabled(false);
			}
			else {
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			lifeline.setEnabled(false);
			
		}
		else if(e.getSource()==sbmt){
			ans_given=1;
			if(goption.getSelection()==null) {
	    		useranswers[count][0]="";
	    	}
	    	else {
	    		useranswers[count][0]=goption.getSelection().getActionCommand();
	    	}
    		
    		for(int i=0; i<useranswers.length;i++) {
    			if(useranswers[i][0].equals(answers[i][1])) {
    				score+=10;
    			}
    			else {
    				score+=0;
    			}
    			
    		}
    		setVisible(false);
    		new Score(name,score);
    	}
	}
	

	public void paint(Graphics g) {
		super.paint(g);
		String time="Time left "+timer+" seconds";
	    g.setColor(Color.RED);
	    g.setFont(new Font("Tahoma",Font.BOLD,22));
	    
	    
	    if(timer>0) {
	    	g.drawString(time, 690, 550);
	    	
	    }
	    else {
	    	g.drawString("Times up!!", 690, 550);
	    }
	    timer--;
	    try {
	    	Thread.sleep(1000);
	    	repaint();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    if(ans_given==1) {
	    	ans_given=0;
	    	timer=15;
	    }
	    else if(timer<0) {
	    	timer=15;
	    	opt1.setEnabled(true);
	    	opt2.setEnabled(true);
	    	opt3.setEnabled(true);
	    	opt4.setEnabled(true);
	    	
	    	if(count==8) {
				nxt.setEnabled(false);
				sbmt.setEnabled(true);
			}
	    	
	    	if(count==9) {//Submit button
	    		
	    		if(goption.getSelection()==null) {
		    		useranswers[count][0]="";
		    	}
		    	else {
		    		useranswers[count][0]=goption.getSelection().getActionCommand();
		    	}
	    		
	    		for(int i=0; i<useranswers.length;i++) {
	    			if(useranswers[i][0].equals(answers[i][1])) {
	    				score+=10;
	    			}
	    			else {
	    				score+=0;
	    			}
	    			
	    		}
	    		setVisible(false);
	    		new Score(name,score);
	    	}
	    	else { //nxt button
	    	
	    	if(goption.getSelection()==null) {
	    		useranswers[count][0]="";
	    	}
	    	else {
	    		useranswers[count][0]=goption.getSelection().getActionCommand();
	    	}
	    	count++;
	    	start(count);
	    }
	    }
	}
	
	
	public void  start(int count) {
		qno.setText(""+(count + 1)+". ");
		question.setText(questions[count][0]);
		opt1.setText(questions[count][1]);
		opt1.setActionCommand(questions[count][0]);
		
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		
		opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        goption.clearSelection();
	}
	
public static void main(String[] args) {
	new Quiz("User");
}


}

