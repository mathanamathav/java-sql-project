import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete_Employee_frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Employee_frame frame = new Delete_Employee_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Delete_Employee_frame() {
		this.setResizable(false);
		setTitle("Delete Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterEmployeeId = new JLabel("Enter Employee ID");
		lblEnterEmployeeId.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEnterEmployeeId.setBounds(156, 76, 206, 36);
		contentPane.add(lblEnterEmployeeId);
		
		JTextArea txtrAsd = new JTextArea();
		txtrAsd.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd.setBounds(421, 79, 361, 36);
		contentPane.add(txtrAsd);
		
		JButton btnNewButton = new JButton("SUMBIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtrAsd.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Enter All Fields");
				}
				else
				{
					String temp = txtrAsd.getText().trim();
					int id = Integer.parseInt(temp);
					
					Delete_Employee obj = new Delete_Employee();
					//View_Employee ob = new View_Employee();
					try {
						obj.delete(id);
					}catch(Exception f){System.out.println(f);}
					
					
					JOptionPane.showMessageDialog(null,"Deleted Successfuly");
					dispose();
					new Admin_Menu().setVisible(true);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(648, 189, 134, 36);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admin_Menu().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(156, 189, 134, 36);
		contentPane.add(btnBack);
	}
}
