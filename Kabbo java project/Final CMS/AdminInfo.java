import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminInfo extends JFrame implements ActionListener
{
    ImageIcon img;
    JLabel l1;
    JPanel p1;
	JButton b1;

    AdminInfo() {
        super(" Go To Meeting Packages ");
        this.setSize(971, 575);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        p1 = new JPanel();
        p1.setLayout(null);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Dosis",Font.BOLD,15));
		b1.setBackground(new Color(66, 95, 236));
		b1.setForeground(Color.white);
		b1.setBounds(360,500,150,30);
		b1.addActionListener(this);
		b1.setBorder(null);
		p1.add(b1);
		
        img = new ImageIcon(getClass().getResource("/Images/Admin Info.PNG"));
        l1 = new JLabel(img);
        l1.setBounds(0, 0, 971, 575);
        p1.add(l1);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int X = (int) screenSize.getWidth() / 2;
        int Y = (int) screenSize.getHeight() / 2;
        int x = X - getWidth() / 2;
        int y = Y - getHeight() / 2;
        setLocation(x, y);
        setResizable(false);
        this.add(p1);
    }
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			AdminPanal s= new AdminPanal();
			dispose();
			s.show();
		}
	}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdminInfo info = new AdminInfo();
            info.setVisible(true);
        });
    }
}
