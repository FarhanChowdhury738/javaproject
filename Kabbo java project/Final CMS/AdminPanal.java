import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminPanal extends JFrame implements ActionListener
{
		JLabel o1,l1,l2,l3;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c1,c2,c3,c4;
		
		AdminPanal()
		{
			
			super(" Go To Meeting Packages ");
			
		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
		ImageIcon img = new ImageIcon("Images/AdminPanal.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(0,0,1366,768);



		o1 = new JLabel("Admin Panal");
        o1.setFont(new Font("Times New Roman",Font.BOLD,36));
        o1.setForeground(Color.black);
        o1.setBounds(240,80,425,85);
        this.add(o1);

	

        // Set the button's background color
   		Color skyBlue = new Color(0, 176, 240);
   		Color LightYellow = new Color(240, 162, 46);

		
		b1 = new JButton("Back");
		b1.setFont(new Font("Arial",Font.BOLD,18));
		b1.setBackground(skyBlue);
		b1.setForeground(Color.black);
		b1.setBounds(1100,640,125,40);
		b1.addActionListener(this);
		this.add(b1);
		
		 
		b2 = new JButton();
		ImageIcon icon = new ImageIcon("Images/userinfo.png");
		b2.setIcon(icon);
		b2.setBounds(270,250,120,120);
		b2.setBackground(LightYellow);
		b2.addActionListener(this);
	    this.add(b2);
		 

		b3 = new JButton();
		ImageIcon icon2 = new ImageIcon("Images/admininfo.png");
		b3.setIcon(icon2);
		b3.setBounds(270,450,120,120);
		b3.setBackground(LightYellow);
		b3.addActionListener(this);
	    this.add(b3);



		l2 = new JLabel();
		l2.setText("User Info"); 
		l2.setFont(new Font("Bahnschrift Light Condensed",Font.PLAIN,18));
		l2.setOpaque(false);
		l2.setForeground(Color.black);
		l2.setBounds(295,370,100,40);
		this.add(l2);



		l3 = new JLabel();
		l3.setText("Admin Info"); 
		l3.setFont(new Font("Bahnschrift Light Condensed",Font.PLAIN,18));
		l3.setOpaque(false);
		l3.setForeground(Color.black);
		l3.setBounds(290,570,100,40);
		this.add(l3);




	     
		this.add(l1);

		
		}
		public void actionPerformed(ActionEvent ae)
		{
        	if(ae.getSource() == b1)
			{
				Login l = new Login();
				dispose();
				l.setVisible(true);
			}
			else if(ae.getSource() == b2)
			{
				AdminUserInfo info = new AdminUserInfo();
				dispose();
				info.setVisible(true);
			}
			else if(ae.getSource() == b3)
			{
				 AdminInfo info = new AdminInfo();
				 dispose();
                info.setVisible(true);
			}
			
		}
			
		public static void main(String args [])
		{
			AdminPanal s= new AdminPanal();
			s.show();
			
			
		}		
		
}