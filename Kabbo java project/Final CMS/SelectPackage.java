import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SelectPackage extends JFrame implements ActionListener
{
		JLabel o1,l1,l2,l3,l4,l5,l6;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c1,c2,c3,c4;
		
		SelectPackage()
		{
			
			super(" Go To Meeting Packages ");
			
		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
		ImageIcon img = new ImageIcon("Images/SelectPackage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(0,0,1366,768);


		o1 = new JLabel("Select your Package");
        o1.setFont(new Font("Biome",Font.BOLD,35));
        o1.setForeground(Color.black);
        o1.setBounds(175,110,425,85);
        this.add(o1);
        

        // Set the button's background color
    Color skyBlue = new Color(0, 176, 240);

		
		b1 = new JButton("Back");
		b1.setFont(new Font("Arial",Font.BOLD,18));
		b1.setBackground(skyBlue);
		b1.setForeground(Color.black);
		b1.setBounds(1100,640,125,40);
		b1.addActionListener(this);
		
		 b2 = new JButton("Small Package (1 Day)");
		b2.setFont(new Font("Calibri",Font.PLAIN,25));
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(125,225,425,70);
		b2.addActionListener(this);
	     this.add(b2);
		 
		 b3 = new JButton("Medium Package (7 Day's)");
		b3.setFont(new Font("Calibri",Font.PLAIN,25));
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(125,320,425,70);
		b3.addActionListener(this);
	     this.add(b3);

		b4 = new JButton("Large Package (30 Day's)");
		b4.setFont(new Font("Calibri",Font.PLAIN,25));
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(125,415,425,70);
		b4.addActionListener(this);
	     this.add(b4);
		 
		b5 = new JButton("Customize Package");
		b5.setFont(new Font("Calibri",Font.PLAIN,25));
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.setBounds(125,510,425,70);
		b5.addActionListener(this);
	     this.add(b5);
		 
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
			else if(ae.getSource()==b2)
			{
				SmallPackage f = new SmallPackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				MediumPackage f = new MediumPackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				LargePackage f = new LargePackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b5)
			{
				
				CustomizePage f = new CustomizePage();
				this.setVisible(false);
				f.setVisible(true);
			}
			}
		public static void main(String args [])
		{
			SelectPackage s= new SelectPackage();
			s.show();
			
			
		}		
		
}