import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class ConfirmPaymentPage1 extends JFrame {

    private Container c;
	private JLabel l1;
    private ImageIcon icon, logo;
    private JLabel label0, label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JComboBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    ConfirmPaymentPage1() {
        	super(" Go To Meeting ");
			
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);
		
		ImageIcon img = new ImageIcon("Images/ConfirmPaymentPage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1550,850,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(-300,-700,1919,1079);
			
			
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Abadi",Font.BOLD,40));
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.black);
		b1.setBounds(100,720,160,40);
		b1.addActionListener(this);
		this.add(b1);
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Abadi",Font.BOLD,40));
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.black);
		b2.setBounds(450,720,160,40);
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
				PaymentPage3 f = new PaymentPage3();
				this.setVisible(false);
				f.setVisible(true);
		}
		
		}
	public static void main (String args [])
	{
		
		ConfirmPaymentPage1 c = new ConfirmPaymentPage1();
		c.show();
		
	}
}