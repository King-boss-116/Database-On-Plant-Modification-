import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;


class Delete implements ActionListener{
	
	JFrame f1;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	
	public Delete(){
		
		f1=new JFrame();
		f1.setSize(2070,2070);
		f1.setBackground(Color.BLUE);
		f1.setTitle("Deleting Microbe Record As Admin");
		
		l1=new JLabel("Write the Id for Microbe");
		t1=new JTextField();
		/*l2=new JLabel("Write the Case_Involved_Id for Police");
		t2=new JTextField();*/
		
		b1=new JButton("Delete");
		
		f1.add(l1);
		f1.add(t1);
		f1.add(b1);
		/*f1.add(l2);
		f1.add(t2);*/
		
		l1.setBounds(600,200,200,50);
		t1.setBounds(800,200,200,50);
		/*l2.setBounds(550,400,300,50);
		t2.setBounds(800,400,200,50);	*/	
		b1.setBounds(750,600,100,50);
		
		b1.addActionListener(this);
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1){
			int a1=Integer.parseInt(t1.getText());
			//int b1=Integer.parseInt(t2.getText());
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bioproject?user=root&password=");
				String qry="delete from microbes where Microbe_Id=?";
				PreparedStatement ps=con.prepareStatement(qry);
				
				ps.setInt(1,a1);
				//ps.setInt(2,b1);
				
				
				int a=ps.executeUpdate();
				
				if(a==1){
					System.out.println("Record deleted");
					}
				else
					System.out.println("Record not deleted");
			}
			catch(Exception e1)
			{
					System.out.println(e1);
			}
			JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
			
		}
	}



}


class DeleteDemo{

	public static void main(String arg[]){
	
		Delete p43=new Delete();
		
	
	
	}



}