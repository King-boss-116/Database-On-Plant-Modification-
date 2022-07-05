import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JOptionPane;

class Admin implements ActionListener{
	JFrame f1;
	JLabel l1,l2;
	JButton b1,b2,b3;
	public Admin(){
	
		f1=new JFrame();
		f1.setSize(2055,2055);
		
		l1=new JLabel("Hi Admin.....");
		l2=new JLabel("What You wanna Do?");
		b1=new JButton("Add Record");
		b2=new JButton("Delete Record");
		b3=new JButton("Modify Record");
		
		f1.add(l1);
		f1.add(l2);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		
		l1.setBounds(700,50,200,50);
		l2.setBounds(700,150,250,45);
		b1.setBounds(700,250,150,45);
		b2.setBounds(700,450,150,45);
		b3.setBounds(700,650,150,45);
		
		l1.setFont(new Font("TimesRoman",Font.BOLD,40));
		l2.setFont(new Font("TimesRoman",Font.ITALIC,20));
		
		f1.setTitle("Decession Page!");
		f1.setLayout(null);
		f1.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	
	
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"Directing to Add Record Page");
			new Insert();
		}
		
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null,"Directing to Delete Record Page");
			new Delete();
		}
		
		if(e.getSource()==b3)
		{
			JOptionPane.showMessageDialog(null,"Directing to Modify Record Page");
			new Update();
		}
	
	
	}

}
class AdminAsk{

	public static void main(String arg[]){
		Admin p5=new Admin();
	}
	

}