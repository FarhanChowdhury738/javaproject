

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.table.DefaultTableModel;

public class AdminUserInfo extends JFrame implements ActionListener
{
    JScrollPane scroll;
    JTable table;
	ImageIcon img1,img2;
	JLabel l1;
	JButton n1;
    JButton n2;
    JButton n3;
    DefaultTableModel model;
    JPanel p1;

    public AdminUserInfo() {
        super("User Information");
        this.setSize(1367, 769);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setSize(new Dimension(1367, 769));
        p1.setLayout(null);

        String[] column = { "User Name", "Password", "Email", "Date & Time" };
        String[] rows = new String[4];
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        Font f3 = new Font("Segoe UI", Font.PLAIN, 20);
        table.setModel(model);
        table.setFont(f3);
        table.setShowGrid(true);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(185);
        table.getColumnModel().getColumn(1).setPreferredWidth(185);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(100, 80, 1000, 450);
        scroll.setBackground(Color.WHITE);
        p1.add(scroll);

        String file = "./Data/User_data.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("***********************************************")) {
                    rows[0] = reader.readLine().substring(13); // User Name
                    rows[1] = reader.readLine().substring(13); // Password
                    rows[2] = reader.readLine().substring(13); // Email
                    rows[3] = reader.readLine().substring(14); // Date and Time
                    model.addRow(rows);
                }
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		
		n1 = new JButton("Back");
		n1.setBounds(300,630,210,42);
		n1.addActionListener(this);
		p1.add(n1);

        n2 = new JButton("Add");
		n2.setBounds(510,630,210,42);
		n2.addActionListener(this);
		p1.add(n2);

        
        ActionListener addUserListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddUser adduser = new AddUser();
                adduser.setVisible(true);
                dispose();
            }
        };

        n2.addActionListener(addUserListener);

        n3 = new JButton("Remove");
		n3.setBounds(720,630,210,42);
		n3.addActionListener(this);
		p1.add(n3);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if(selectedRow !=  -1)
                {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(selectedRow);

                    table.revalidate();
                    table.repaint();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Select user to delete.", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }
        };

        n3.addActionListener(actionListener);

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
		if (ae.getSource() == n1)
		{
			AdminPanal s= new AdminPanal();
			dispose();
			s.show();
		}
	}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdminUserInfo info = new AdminUserInfo();
            info.setVisible(true);
        });
    }
}
