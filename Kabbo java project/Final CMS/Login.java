import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Login extends JFrame implements ActionListener{
	
	JFrame Login ;
	JPanel mainPane  ;
	JLabel lblUser, lblPass,lblPhoto, lblLogo;
	JTextField ut ;
	JButton btnLogin , btnSignup , btnBack;
	JPasswordField pf;
	JRadioButton r1, r2;
	public static String Un;
	
	public  Login()
	{
	
	
	super(" Log In ");


		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
		
		ImageIcon img = new ImageIcon("Images/LoginPage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
		lblLogo = new JLabel("",img,JLabel.CENTER);
		lblLogo.setBounds(0,0,1366,768);
		
		this.add(lblLogo);
	
	 // Set the text color
    Color LightYellow = new Color(240, 162, 46);
    // Set the button's background color
    Color skyBlue = new Color(0, 176, 240);

	
		lblUser = new JLabel();
		lblUser.setText("Username:");  //set text of label
		lblUser.setFont(new Font("Bahnschrift Light Condensed",Font.PLAIN,25));
		lblUser.setOpaque(false);
		lblUser.setForeground(LightYellow);
		lblUser.setBounds(800,375,300,40);
		this.add(lblUser);
	
	
		lblPass = new JLabel();
		lblPass.setText("Password:");  //set text of label
		lblPass.setFont(new Font("Bahnschrift Light Condensed",Font.PLAIN,25));
		lblPass.setForeground(LightYellow);
		lblPass.setBounds(800,475,300,40);
		this.add(lblPass);
		
		
		ut = new JTextField();
		ut.setBounds(960,375,300,40);
		this.add(ut);
		
		
		pf = new JPasswordField();
		pf.setBounds(960,475,300,40);		
		this.add(pf);


        r1 = new JRadioButton("Admin LogIn");
        r1.setBounds(960, 320, 150, 20);
        r1.setFont(new Font("Arial", Font.BOLD, 15));
        r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r1.setForeground(Color.white);
        r1.setBorderPainted(false);
        r1.setContentAreaFilled(false);
        r1.setFocusPainted(false);
        this.add(r1);

        r2 = new JRadioButton("User LogIn");
        r2.setBounds(1110, 320, 150, 20);
        r2.setFont(new Font("Arial", Font.BOLD, 15));
        r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r2.setForeground(Color.white);
        r2.setBorderPainted(false);
        r2.setContentAreaFilled(false);
        r2.setFocusPainted(false);
        this.add(r2);
		
		ButtonGroup gender=new ButtonGroup();
		gender.add(r1);
		gender.add(r2);
		



		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Arial",Font.BOLD,18));
		btnLogin.setForeground(Color.white);
		btnLogin.setBackground(skyBlue);
		btnLogin.setBounds(1120,580,110,38);
		btnLogin.addActionListener(this);

		btnLogin.addMouseListener(new MouseAdapter()
		{
	        @Override
	        public void mouseEntered(MouseEvent evt)
	        {
				
			    btnLogin.setBackground(Color.GRAY);  
			  
			}	
       
        	@Override
        	public void mouseExited(MouseEvent evt)
        	{
			
				btnLogin.setBackground(skyBlue); 
			
			}
    	});
	
	
		this.add(btnLogin);
	
	
	btnSignup = new JButton("Register");
	btnSignup.setFont(new Font("Arial",Font.BOLD,18));
	btnSignup.setForeground(Color.white);
	btnSignup.setBackground(skyBlue);
	btnSignup.setBounds(990,580,110,38);


	btnSignup.addActionListener(this);
	btnSignup.addMouseListener(new MouseAdapter()
	{
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    btnSignup.setBackground(Color.GRAY);  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			btnSignup.setBackground(skyBlue); 
			
		}
    });
	
        
	this.add(btnSignup);
	
	
	this.add(lblLogo);
	
	
	
	}
	
	public void actionPerformed(ActionEvent ae) {
    String userName = ut.getText();
    String userPassword = pf.getText();

    if (ae.getSource() == btnLogin) {
        if (userName.isEmpty() || userPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\User_data.txt"))) {
                String userNameS = "User Name   : " + userName;
                String passwordS = "Password    : " + userPassword;

                int totalLines = 0;
                while (reader.readLine() != null) {
                    totalLines++;
                }

                reader.close();

                for (int i = 0; i < totalLines; i++) {
                    String line = Files.readAllLines(Paths.get(".\\Data\\User_data.txt")).get(i);
                    if (line.equals(userNameS)) {
                        String line2 = Files.readAllLines(Paths.get(".\\Data\\User_data.txt")).get((i + 1));
                        if (line2.equals(passwordS)) {
                            JOptionPane.showMessageDialog(null, "Login Successful.");
                            // dispose() the correct frame here
                            SelectPackage s = new SelectPackage();
                            s.setVisible(true);
                            dispose();
                        }
                    }
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (userName.equals("Admin") || userName.equals("admin") || userPassword.equals("Admin") || userPassword.equals("admin")) {
            AdminPanal s= new AdminPanal();
			s.show();
        }
    } else if (ae.getSource() == btnSignup) {
        Signup s = new Signup();
        s.setVisible(true);
        dispose();
    }
}

public static void main(String[] args) {
    Login l = new Login();
    l.setVisible(true);
}


}
