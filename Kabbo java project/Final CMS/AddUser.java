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


public class AddUser extends JFrame implements ActionListener{
    
    JFrame AddUser ;
    JPanel mainPane ;
    JLabel lblUser,  lblPhone , lblEmail ,lblAddress , lblFullName , lblCompany, lblNid, lblPass , lblConfirm, lblLogo,l1;
    JTextField tUserName , tPhone, tEmail,tCompany, tFullName, tDateOfBirth, tNid,tAddress, tPass, tConfirm;
    JButton AddUserBtn , backBtn , b3;
    JRadioButton rAddUserBtn, rbackBtn, rb3;
    
    public AddUser()

    {
    super(" Add User ");
    
        this.setSize(1366,768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        

    
    mainPane = new JPanel();
    mainPane.setSize(new Dimension(1366, 768));
    mainPane.setLayout(null);
    this.add(mainPane);
    


        l1 = new JLabel("Create new user");
        l1.setFont(new Font("Century",Font.BOLD,35));
        l1.setForeground(Color.white);
        l1.setBounds(520,20,400,50);
        mainPane.add(l1);



    
    lblFullName = new JLabel("Full Name :");
    lblFullName.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblFullName.setForeground(Color.white);
    lblFullName.setBounds(750,120,150,35);
    mainPane.add(lblFullName);

    
    lblUser = new JLabel();
    lblUser.setText("User name :");  
    lblUser.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblUser.setForeground(Color.white);
    lblUser.setBounds(750,170,150,35);
    mainPane.add(lblUser);
    

    lblEmail = new JLabel("Email :");
    lblEmail.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblEmail.setForeground(Color.white);
    lblEmail.setBounds(750,220,150,35);
    mainPane.add(lblEmail);


    lblPhone = new JLabel();
    lblPhone.setText("Phone No :");  
    lblPhone.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblPhone.setForeground(Color.white);
    lblPhone.setBounds(750,270,150,35);
    mainPane.add(lblPhone);
    

    lblNid = new JLabel("Nid No :");
    lblNid.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblNid.setForeground(Color.white);
    lblNid.setBounds(750,320,150,35);
    mainPane.add(lblNid);
    

    lblCompany = new JLabel("Company :");
    lblCompany.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblCompany.setForeground(Color.white);
    lblCompany.setBounds(750,370,150,35);
    mainPane.add(lblCompany);


    lblAddress = new JLabel("Address :");
    lblAddress.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblAddress.setForeground(Color.white);
    lblAddress.setBounds(750,420,150,35);
    mainPane.add(lblAddress);
    

    lblPass = new JLabel("New Password :");
    lblPass.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblPass.setForeground(Color.white);
    lblPass.setBounds(750,470,150,35);
    mainPane.add(lblPass);

    
    lblConfirm = new JLabel("Confirm Password :");
    lblConfirm.setFont(new Font("Cooper Black MS",Font.BOLD,16));
    lblConfirm.setForeground(Color.white);
    lblConfirm.setBounds(750,520,190,35);
    mainPane.add(lblConfirm);
    

    
    tFullName = new JTextField();
    tFullName.setBounds(950,120,250,35);
    mainPane.add(tFullName);
    

    tUserName = new JTextField();
    tUserName.setBounds(950,170,250,35);
    mainPane.add(tUserName);


    tEmail = new JTextField();
    tEmail.setBounds(950,220,250,35);
    mainPane.add(tEmail);


    tPhone = new JTextField();
    tPhone.setBounds(950,270,250,35);
    mainPane.add(tPhone); 


    tNid = new JTextField();
    tNid.setBounds(950,320,250,35);
    mainPane.add(tNid);


    tCompany = new JTextField();
    tCompany.setBounds(950,370,250,35);
    mainPane.add(tCompany);


    tAddress = new JTextField();
    tAddress.setBounds(950,420,250,35);
    mainPane.add(tAddress);


    tPass = new JTextField();
    tPass.setBounds(950,470,250,35);
    mainPane.add(tPass);
    

    tConfirm = new JTextField();
    tConfirm.setBounds(950,520,250,35);
    mainPane.add(tConfirm);

    

    ButtonGroup g1 = new ButtonGroup();
    g1.add(rAddUserBtn);
    g1.add(rbackBtn);
    g1.add(rb3);


    // Set the button's background color
    Color skyBlue = new Color(255, 255, 255);

    
    
    AddUserBtn = new JButton("Create");
    AddUserBtn.setFont(new Font("Arial",Font.BOLD,18));
    AddUserBtn.setForeground(Color.black);
    AddUserBtn.setBackground(skyBlue);
    AddUserBtn.setBounds(1100,640,125,40);
    AddUserBtn.setFocusable(false);
    AddUserBtn.setBorder(null);
    AddUserBtn.addActionListener(this);
    AddUserBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
            
            AddUserBtn.setBackground(Color.GRAY);  
              
        }   
        @Override
        public void mouseExited(MouseEvent evt){
            
            AddUserBtn.setBackground(skyBlue); 
            
        }
    });
    mainPane.add(AddUserBtn);
    
    
    backBtn = new JButton("Back");
    backBtn.setFont(new Font("Arial",Font.BOLD,18));
    backBtn.setForeground(Color.white);
    backBtn.setBackground(skyBlue);
    backBtn.setBounds(945,640,125,40);
    backBtn.setFocusable(false);
    backBtn.setBorder(null);
    backBtn.addActionListener(this);
    backBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
            
            backBtn.setBackground(Color.GRAY);  
              
        }   
        @Override
        public void mouseExited(MouseEvent evt){
            
            backBtn.setBackground(skyBlue); 
            
        }
    });
    mainPane.add(backBtn);




    ImageIcon img = new ImageIcon("Images/RegistrationPage.png");
        Image i= img.getImage();
        Image new_img = i.getScaledInstance(1366,768,Image.SCALE_SMOOTH);
        img = new ImageIcon(new_img);
        lblLogo = new JLabel("",img,JLabel.CENTER);
        lblLogo.setBounds(0,0,1366,768);
        mainPane.add(lblLogo);
    
    
    }
    
	
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==AddUserBtn)
        {
            String fullName = tFullName.getText();
            String userEmail = tEmail.getText();
            String userName = tUserName.getText();
            String Nid = tNid.getText();
            String userPassword = tPass.getText();
            String userPasswordConfirm = tConfirm.getText();

            if(fullName.isEmpty() ||  Nid.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fill your informations", "MISSING INFORMATION",JOptionPane.WARNING_MESSAGE);
            }
            else if(!userPassword.equals(userPasswordConfirm))
            {
				JOptionPane.showMessageDialog(null, "Passwords do not match.", "Warning!",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				try 
                {
                    File file = new File(".\\Data\\user_data.txt");
                    if (!file.exists()) 
                    {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                    String timeAndDate = myDateObj.format(myFormatObj);

                    pw.println("User Name   : " + fullName);
                    pw.println("Password    : " + userPassword);
                    pw.println("Email       : " + userEmail);
                    pw.println("Time & Date : " + timeAndDate);
                    pw.println("***********************************************");
                    pw.close();
                }
                catch (Exception ex) 
                {
                    System.out.print(ex);
                }
				JOptionPane.showMessageDialog(null,"Successfully Registration Complete");


				
                
				
				this.setVisible(false);
				Login l1 = new Login();
				l1.setVisible(true);
				
            }

            
        }
        else if(ae.getSource()==backBtn)
        {
            this.setVisible(false);
			AdminUserInfo l1 = new AdminUserInfo();
			l1.setVisible(true);
        }
    }
	
	public static void main (String args[])
	{
		AddUser s= new AddUser();
		s.show();
	}
	
}
