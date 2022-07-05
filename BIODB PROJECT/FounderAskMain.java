import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JOptionPane;

class FounderAsk implements ActionListener{
	JFrame f1;
	JLabel l1,l2;
	JButton b1,b2,b3;
	public FounderAsk(){
	
		f1=new JFrame();
		f1.setSize(2055,2055);
		
		l1=new JLabel("Hi Founder.....");
		l2=new JLabel("What You wanna Do?");
		b1=new JButton("Search Record");
		b2=new JButton("Insert Record");
		//b3=new JButton("Modify Record");
		
		f1.add(l1);
		f1.add(l2);
		f1.add(b1);
		f1.add(b2);
		//f1.add(b3);
		
		l1.setBounds(600,50,300,50);
		l2.setBounds(700,150,250,45);
		b1.setBounds(700,250,150,45);
		b2.setBounds(700,450,150,45);
		//b3.setBounds(700,650,150,45);
		
		l1.setFont(new Font("TimesRoman",Font.BOLD,40));
		l2.setFont(new Font("TimesRoman",Font.ITALIC,20));
		
		f1.setTitle("Decession Page!");
		f1.setLayout(null);
		f1.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		//b3.addActionListener(this);
	
	
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"Directing to Search Record Page");
			new SearchingRecord21();
		}
		
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null,"Directing to Insert Record Page");
			new Insert();
		}
		/*
		if(e.getSource()==b3)
		{
			JOptionPane.showMessageDialog(null,"Directing to Modify Record Page");
			//new Project12();
		}*/
	
	
	}

}
class FounderAskMain{

	public static void main(String arg[]){
		FounderAsk p5=new FounderAsk();
	}
	

}