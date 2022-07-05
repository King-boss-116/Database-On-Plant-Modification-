
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;




class UpdateName implements ActionListener{
	
	JFrame f1;
	JLabel l1,l2;
	JButton b1;
	JTextField t1,t2;
	
	public UpdateName(){
		
		f1=new JFrame();
		f1.setSize(2055,2055);
		f1.setTitle("Updating Microbe Name As Admin");
		
		l2=new JLabel("Write the Microbe Id");
		t2=new JTextField(); 
		l1=new JLabel("Write the New Updated Value for Microbe Name");
		t1=new JTextField();
		b1=new JButton("Modify");
		
		
		l2.setBounds(600,200,200,50);
		t1.setBounds(800,200,200,50);
		l1.setBounds(500,300,300,50);
		b1.setBounds(700,400,100,50);
		t2.setBounds(800,300,200,50);
		
		f1.add(l1);
		f1.add(l2);
		f1.add(b1);
		f1.add(t1);
		f1.add(t2);
		
		b1.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1)
		{
			int a1=Integer.parseInt(t1.getText());
			String b1=t2.getText();
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bioproject?user=root&password=");
				String qry="update microbes set Microbe_Name=? where Microbe_Id=?";
				PreparedStatement ps=con.prepareStatement(qry);
							
				ps.setString(1,b1);
				ps.setInt(2,a1);
				
				
				int a=ps.executeUpdate();
				
				if(a==1){
					System.out.println("Record updated");
					}
				else
					System.out.println("Record not updated");
			}
			catch(Exception e1)
			{
					System.out.println(e1);
			}
			JOptionPane.showMessageDialog(null,"Record Updated Successfully");
		}
		
	} 







}



class UpdateNameMain{

	public static void main(String arg[]){
	
		UpdateName p16=new UpdateName();
		
	
	}


}