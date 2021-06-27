import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private String id;
	private String name;
	
	public User(String id, String name) throws HeadlessException {
		super();
		this.id = id;
		this.name = name;
		
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("USER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(62, 78, 206, 36);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrAsd = new JTextArea();
		txtrAsd.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd.setBounds(62, 125, 206, 36);
		contentPane.add(txtrAsd);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(316, 78, 206, 36);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrAsd_1 = new JTextArea();
		txtrAsd_1.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_1.setBounds(316, 125, 326, 36);
		contentPane.add(txtrAsd_1);
		
		JLabel lblNewLabel_2 = new JLabel("DATE UPDATED");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(676, 78, 206, 36);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrAsd_2 = new JTextArea();
		txtrAsd_2.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_2.setBounds(676, 125, 206, 36);
		contentPane.add(txtrAsd_2);
		
		JTextArea txtrAsd_2_1 = new JTextArea();
		txtrAsd_2_1.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_2_1.setBounds(676, 299, 206, 36);
		contentPane.add(txtrAsd_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SALARY");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(423, 296, 206, 36);
		contentPane.add(lblNewLabel_1_1);
		
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login_frame().setVisible(true);
			}
		});
		btnBack.setBackground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(62, 350, 134, 36);
		contentPane.add(btnBack);
		
		Compute_Salary obj = new Compute_Salary();
		try {
			txtrAsd.setText(id);
			txtrAsd_1.setText(name);
			int ID = Integer.parseInt(id);
			txtrAsd_2.setText(obj.get_calculate_date(ID));
			String temp = String.valueOf(obj.get_calculate_Total(ID));
			txtrAsd_2_1.setText(temp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		
	}
}
