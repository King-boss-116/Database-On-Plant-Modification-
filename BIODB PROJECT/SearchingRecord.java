import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.*;
import java.awt.*;



class SearchingRecord1 implements ActionListener {
	
	JFrame f1;
	JLabel l1;
	JButton b1;
	JTextField t1;
	Choice c1;
	
	
	public SearchingRecord1(){
		
		f1=new JFrame();
		f1.setSize(2080,2080);
		f1.setBackground(Color.RED);
		l1=new JLabel("Enter the Record Id");
		t1=new JTextField();
		b1=new JButton("SEARCH");
		c1=new Choice();
		
		b1.setFont(new Font("Georgia",Font.BOLD,20));
		l1.setFont(new Font("TimesNewRoman",Font.ITALIC,32));
		t1.setFont(new Font("Georgia",Font.ITALIC,30));
		c1.setFont(new Font("Georgia",Font.BOLD,20));

		f1.add(l1);
		f1.add(b1);
		f1.add(t1);
		
		f1.setTitle("Searching Record!*-|-*");
		
		l1.setBounds(400,150,500,50);
		b1.setBounds(650,350,300,50);
		t1.setBounds(1000,150,200,50);
		c1.setBounds(20,500,1500,50);
		
		
		b1.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"We are processing your request");
			int a1=Integer.parseInt(t1.getText());
			try{	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bioproject?user=root&password=");
				String qry="select * from microbes";
				PreparedStatement ps=con.prepareStatement(qry);
				
				ResultSet rs=ps.executeQuery();//object of resultset will store the information of execute query interface
				while(rs.next()){//it points toward the record till the time the pointer points towards the null reference
					
					int E_Id=rs.getInt(1);
					String E_Name,E_State,E_Crime_Record,E_Current_Status;
					int E_Age;
					String Age,Id;
					if(E_Id==a1)
					{
						System.out.println("Found");
						System.out.println("Employee Id is "+E_Id);
						Id=Integer.toString(E_Id);
						E_Name=rs.getString(2);
						System.out.println("Employee Name is "+E_Name);
						E_State=rs.getString(3);
						System.out.println("Employee State is "+E_State);
						/*E_Age=rs.getInt(4);
						Age=Integer.toString(E_Age);
						System.out.println("Employee Age is "+E_Age);*/
						E_Crime_Record=rs.getString(4);
						System.out.println("Employee Crime_Record is "+E_Crime_Record);
						/*E_Current_Status=rs.getString(6);
						System.out.println("Employee Current_Status is "+E_Current_Status);*/
						JOptionPane.showMessageDialog(null,"Record Successfully Found");
						c1.add("Microbe Id is "+Id);
						c1.add("Microbe Name is "+E_Name);
						//c1.add("Employee Age is "+Age);
						c1.add("Microbe Origin is "+E_State);
						c1.add("Microbe Functions are: "+E_Crime_Record);
						//c1.add("Employee Current_Status is "+E_Current_Status);
						f1.add(c1);
					
					}
					
					
				}
			}
		
			catch(Exception e1)
			{
				
			}
		}
			
	}
	
}



class SearchingRecord{

	public static void main(String arg[]){
		SearchingRecord1 sr1=new SearchingRecord1();
	}


}