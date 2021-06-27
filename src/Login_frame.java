import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtDssfs;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_frame frame = new Login_frame();
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
	public Login_frame() {
		
		this.setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(screenSize.width/2 - this.getSize().width/2, screenSize.height/2 - this.getSize().height/2);

		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDssfs = new JTextField();
		txtDssfs.setBounds(229, 66, 173, 32);
		contentPane.add(txtDssfs);
		txtDssfs.setColumns(10);
        setTitle("Login Page");

		
		JLabel lblNewLabel = new JLabel("username:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(78, 66, 141, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(78, 114, 141, 26);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(229, 114, 173, 32);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDssfs.getText().isEmpty() || passwordField.getText().isEmpty()){
		            JOptionPane.showMessageDialog(null,"Enter All Fields");
		        }
		        else{
		            String username=txtDssfs.getText().trim();
		            String password=passwordField.getText().trim();
		            Login ob = new Login();
		    		ob.setUsername(username);
		    		ob.setPassword(password);
		    		int y = ob.is(ob.getUsername(),ob.getPassword());
		    		
		    		if(y==1) {
		    			dispose();
		    			new Admin_Menu().setVisible(true);
		    		}else if(y==2) {
		    			dispose();
		    			User obj = new User(username,password);
		    			obj.setVisible(true);
		    			//new User().setVisible(true);
		    		}
		    		else {
		    			JOptionPane.showMessageDialog(null,"INVALID USERNAME OR PASSWORD");
		    		}
		        }
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(158, 178, 114, 49);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText("PAYROLL MANAGEMENT SYSTEM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(78, 11, 345, 28);
		contentPane.add(lblNewLabel_1);
	}
}
