import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import java.sql.*;




class RoleFirst implements ActionListener{
	JFrame f1;
	JLabel l1;
	JButton b1,b2,b3;
	
	public RoleFirst(){
		
		f1=new JFrame();
		f1.setSize(2070,2070);
		l1=new JLabel("IN WHICH DOMAIN YOU WANT TO ADD RECORD.............?");
		b1=new JButton("Insert into Employee");
		b2=new JButton("Insert into Criminal");
		b3=new JButton("Insert into Police");
		
		
		f1.setBackground(Color.RED);
		f1.add(l1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		
		l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b1.setFont(new Font("Georgia",Font.ITALIC,20));
		b2.setFont(new Font("Georgia",Font.ITALIC,20));
		b3.setFont(new Font("Georgia",Font.ITALIC,20));
		f1.setTitle("Inserting Record!*-|-*");
		
		
		f1.setVisible(true);
		f1.setLayout(null);
		
		l1.setBounds(550,100,550,60);
		b1.setBounds(650,250,300,50);
		b2.setBounds(650,450,300,50);
		b3.setBounds(650,650,300,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(null,"ARE YOU A FARMER?");
			//new Project7();
		}	
		
		if(e.getSource()==b2){
			JOptionPane.showMessageDialog(null,"ARE YOU A MIDDLEMAN?");
			//new Project8();
		}
		
		if(e.getSource()==b3){
			JOptionPane.showMessageDialog(null,"ARE YOU AN ADMIN");
			//new Project9();
		}
	
	
	
	
	}




}


class Project10Demo{

	public static void main(String arg[]){
	
		RoleFirst obj=new RoleFirst();
		
	
	}



}