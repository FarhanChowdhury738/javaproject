import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SmallPackage extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c1,c2,c3,c4;
		
		SmallPackage(){
			
			super(" Go To Meeting ");
			
		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
			this.setResizable(false);
		
		ImageIcon img = new ImageIcon("Images/SmallPackage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(0,0,1366,768);
		
		
		l11 = new JLabel("Small Package (1Day)");
		l11.setFont(new Font("Dosis",Font.PLAIN,29));
		l11.setForeground(Color.black);
		l11.setBounds(145,0,300,200);
		this.add(l11);
		
		
		l12 = new JLabel("1 Small Conference Room");
		l12.setFont(new Font("Dosis",Font.PLAIN,29));
		l12.setForeground(Color.black);
		l12.setBounds(80,120,400,100);
		this.add(l12);
		
		
		l13 = new JLabel("1 Waiting Room");
		l13.setFont(new Font("Dosis",Font.PLAIN,29));
		l13.setForeground(Color.black);
		l13.setBounds(80,123,400,200);
		this.add(l13);
		
		l14 = new JLabel("Washroom");
		l14.setFont(new Font("Dosis",Font.PLAIN,29));
		l14.setForeground(Color.black);
		l14.setBounds(80,165,400,200);
		this.add(l14);
		
		l15 = new JLabel("Air Condition");
		l15.setFont(new Font("Dosis",Font.PLAIN,29));
		l15.setForeground(Color.black);
		l15.setBounds(80,205,400,200);
		this.add(l15);
		
		l16 = new JLabel("Multi-Media Facilities");
		l16.setFont(new Font("Dosis",Font.PLAIN,29));
		l16.setForeground(Color.black);
		l16.setBounds(80,245,400,200);
		this.add(l16);
		
		l17 = new JLabel("Water Bottle & Tissue");
		l17.setFont(new Font("Dosis",Font.PLAIN,29));
		l17.setForeground(Color.black);
		l17.setBounds(80,285,400,200);
		this.add(l17);
		
		l18 = new JLabel("Food Item (Dessert)");
		l18.setFont(new Font("Dosis",Font.PLAIN,29));
		l18.setForeground(Color.black);
		l18.setBounds(80,325,400,200);
		this.add(l18);
		
		l19 = new JLabel("Cost:35000/-");
		l19.setFont(new Font("Dosis",Font.PLAIN,29));
		l19.setForeground(Color.black);
		l19.setBounds(150,450,400,200);
		this.add(l19);
		
		
	


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
			if(ae.getSource()==b1)
			{
				SelectPackage f = new SelectPackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				ConfirmPaymentPage1 f = new ConfirmPaymentPage1();
				this.setVisible(false);
				f.setVisible(true);
			}
		}

public static void main(String args [])
{
	SmallPackage m = new SmallPackage();
	m.show();
}

}