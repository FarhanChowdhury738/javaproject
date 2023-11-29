import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BkashPayment1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c0,c1,c2,c3,c4;
		
		BkashPayment1(){
			
			super(" Go To Meeting ");
			
		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
		ImageIcon img = new ImageIcon("Images/BkashPayment.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(0,0,1366,768);
		
		t1 = new JTextField();
		t1.setBounds(490,250,300,25);
		this.add(t1);
		t2 = new JPasswordField();
		t2.setBounds(490,380,300,25);
		this.add(t2);
		
		
		this.add(l1);
		
		
		// Set the button's background color
    	Color skyBlue = new Color(0, 176, 240);
		

        b1 = new JButton("Back");
		b1.setFont(new Font("Arial",Font.BOLD,18));
		b1.setBackground(skyBlue);
		b1.setForeground(Color.white);
		b1.setBounds(1000,640,125,40);
		b1.addActionListener(this);
		this.add(b1);
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Arial",Font.BOLD,18));
		b2.setBackground(skyBlue);
		b2.setForeground(Color.white);
		b2.setBounds(1160,640,125,40);
		b2.addActionListener(this);
		this.add(b2);
			
		
		this.add(l1);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String MobileNumber = t1.getText();
			String Pin = t2.getText();
		
			if(ae.getSource()==b1)
			{
				PaymentPage1 f = new PaymentPage1();
				this.setVisible(false);
				f.setVisible(true);
		}
		else if(ae.getSource()==b2)
			{
				if (MobileNumber.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Invalid Phone number ");
				}

				else if (Pin.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Invalid  Pin");
				}

				else
				{
					JOptionPane.showMessageDialog(null, "Payment Successful :) \nThank you For Being With Us.");
					WelcomePage T= new WelcomePage();
					this.setVisible(false);
					T.setVisible(true);
				}
		}
		}
		
		public static void main (String args [])
		{
			BkashPayment1 b= new BkashPayment1();
			b.show();
			
		}
}