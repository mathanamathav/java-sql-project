import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Toolkit;

public class Admin_Menu extends JFrame {

	private JPanel contentPane;
	private JLabel textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnCalculateNumberOf;
	private JButton btnExit;
	private JButton btnViewSalary;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Menu frame = new Admin_Menu();
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
	public Admin_Menu() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width/2 - getSize().width/2, screenSize.height/2 - getSize().height/2);
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JLabel();
		textField.setText("ADMIN");
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(473, 28, 196, 37);
		contentPane.add(textField);
        setTitle("Admin");

		JButton btnNewButton = new JButton("ADD EMPLOYEE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					dispose();
					new Add_Employee_frame().setVisible(true);
					
				}catch(Exception f){System.out.println(f);}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(394, 108, 275, 77);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("DELETE EMPLOYEE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					new Delete_Employee_frame().setVisible(true);
				}catch(Exception f){System.out.println(f);}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(731, 108, 275, 77);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("UPDATE EMPLOYEE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Update_frame().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(394, 244, 275, 77);
		contentPane.add(btnNewButton_2);
		
		btnCalculateNumberOf = new JButton("CALCULATE SALARY");
		btnCalculateNumberOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Calculate_Salary_frame().setVisible(true);
				
			}
		});
		btnCalculateNumberOf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnCalculateNumberOf.setBounds(731, 244, 275, 77);
		contentPane.add(btnCalculateNumberOf);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login_frame().setVisible(true);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(912, 383, 191, 37);
		contentPane.add(btnExit);
		
		btnViewSalary = new JButton("VIEW EMPLOYEE");
		btnViewSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new View_Employee_frame().setVisible(true);
			}
		});
		btnViewSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnViewSalary.setBounds(41, 347, 306, 49);
		contentPane.add(btnViewSalary);
		
		lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(27, 28, 323, 293);
		contentPane.add(lblNewLabel);
	}
}
