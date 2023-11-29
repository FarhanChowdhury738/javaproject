import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ThankYou extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c0,c1,c2,c3,c4;
		
		ThankYou(){
			
			super("Go To Meeting");
			
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
    }
   
    private void initializeComponents() {
        this.panel = new JPanel (null);
        this.panel.setBackground(Color.decode("#CDFFFF"));

        //  label Thank You

        this.thanks = new JLabel ("CONFIRM");
        this.thanks.setBounds(200, 150, 500, 70);
        this.thanks.setFont(new Font("Segoe UI Black", Font.BOLD, 70));
        this.thanks.setForeground(Color.LIGHT_GRAY);
       
        this.panel.add(this.thanks);

        //Home Button
        this.buttonHome = new JButton("BACK");
        this.buttonHome.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        this.buttonHome.setBounds(700, 335, 150, 50);
        this.buttonHome.setBackground(Color.DARK_GRAY);
        this.buttonHome.setForeground(Color.WHITE);
        this.panel.add(this.buttonHome);

        this.buttonHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String buttonBack = event.getActionCommand();
                if(buttonBack.equals("Home")) {
                    setVisible(false);
                    new Welcome();
                }
            }
        });

        this.add(this.panel);
    }