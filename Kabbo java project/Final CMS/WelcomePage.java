import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4,t5,t6;
		JButton b1,b2,b3,b5; 
		JPanel p1,p2;
		ButtonGroup bg1;
		JRadioButton c1,c2,c3,c4;
		
		WelcomePage(){
			
			super(" Go To Meeting ");
			
		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		
		
		ImageIcon img = new ImageIcon("Images/WelcomePage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(100,100,1366,768);
		

		 // Set the button's background color
        Color skyBlue = new Color(0, 176, 240);


		b1 = new JButton("Next");
		b1.setFont(new Font("Arial",Font.BOLD,18));
		b1.setBackground(skyBlue);
		b1.setForeground(Color.white);
		b1.setBounds(1170,580,100,38);
		b1.addActionListener(this);
	    this.add(b1);
	    this.add(l1);


		}
		

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				Login f = new Login();
				this.setVisible(false);
				f.setVisible(true);
			}
		}
		
		public static void main (String args[])
		{
			WelcomePage w = new WelcomePage();
			w.show();
			
		}
		
}
		
		
		