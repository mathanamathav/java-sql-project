import java.awt.BorderLayout;
import java.util.Date;
import java.text.SimpleDateFormat;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Calculate_Salary_frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate_Salary_frame frame = new Calculate_Salary_frame();
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
	public Calculate_Salary_frame() {
		this.setResizable(false);
		setTitle("Calculate Salary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1118, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(120, 29, 206, 36);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrAsd = new JTextArea();
		txtrAsd.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd.setBounds(524, 29, 361, 36);
		contentPane.add(txtrAsd);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admin_Menu().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(132, 366, 134, 36);
		contentPane.add(btnBack);
		
		
		JLabel lblNumberOfDays = new JLabel("Number of Days Worked");
		lblNumberOfDays.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNumberOfDays.setBounds(120, 73, 286, 36);
		contentPane.add(lblNumberOfDays);
		
		JTextArea txtrAsd_1 = new JTextArea();
		txtrAsd_1.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_1.setBounds(524, 76, 361, 36);
		contentPane.add(txtrAsd_1);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmployeeName.setBounds(120, 179, 206, 36);
		contentPane.add(lblEmployeeName);
		
		JTextArea txtrAsd_1_1 = new JTextArea();
		txtrAsd_1_1.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_1_1.setBounds(524, 179, 361, 36);
		contentPane.add(txtrAsd_1_1);
		

		
		
		JLabel lblTotalSalary = new JLabel("Total Salary");
		lblTotalSalary.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTotalSalary.setBounds(120, 279, 206, 36);
		contentPane.add(lblTotalSalary);
		
		JTextArea txtrAsd_1_1_1 = new JTextArea();
		txtrAsd_1_1_1.setFont(new Font("Monospaced", Font.ITALIC, 16));
		txtrAsd_1_1_1.setBounds(524, 229, 472, 36);
		contentPane.add(txtrAsd_1_1_1);
		
		JLabel lblEmployeePost = new JLabel("Employee Post\r\n");
		lblEmployeePost.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmployeePost.setBounds(120, 226, 206, 36);
		contentPane.add(lblEmployeePost);
		
		JTextArea txtrAsd_1_1_1_1 = new JTextArea();
		txtrAsd_1_1_1_1.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_1_1_1_1.setBounds(524, 282, 361, 36);
		contentPane.add(txtrAsd_1_1_1_1);
		
		JButton btnCompute = new JButton("COMPUTE");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtrAsd.getText().isEmpty() || txtrAsd_1.getText().isEmpty() ){
		            JOptionPane.showMessageDialog(null,"Enter All Fields");
		        }
				else
				{
					double Total_sal =0.0;
					String ID = txtrAsd.getText().trim();
					int id = Integer.parseInt(ID);
					String temp = txtrAsd_1.getText().trim();
					int noofdays = Integer.parseInt(temp);
					View_Employee obj = new View_Employee();
					if(noofdays >= 20) {
						Total_sal= 1000*20 + 1020*(noofdays - 20);
					}
					if(noofdays < 20) {
						Total_sal= 1000*20 + 1020*(noofdays - 20);
					}
					
					try {
						
						String name = obj.get_Name(id);
						String post = obj.get_Post(id);
						double basic_sal = obj.get_Salary(id); 
						Total_sal += basic_sal;
						String value = String.valueOf(Total_sal);
						
						txtrAsd_1_1.setText(name);
						txtrAsd_1_1_1.setText(post);
						txtrAsd_1_1_1_1.setText(value);
					}catch(Exception f){System.out.println(f);}
					
				}
			}
		});
		
		btnCompute.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnCompute.setBounds(691, 366, 134, 36);
		contentPane.add(btnCompute);
		
		JButton btnNewButton_1 = new JButton("SUMBIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtrAsd.getText().isEmpty() || txtrAsd_1.getText().isEmpty() ){
		            JOptionPane.showMessageDialog(null,"Enter All Fields");
		        }
				else
				{
					Compute_Salary obj = new Compute_Salary();
					String ID = txtrAsd.getText().trim();
					int id = Integer.parseInt(ID);
					obj.setid(id);
					
					String name = txtrAsd_1_1.getText().trim();
					obj.setname(name);
					
					SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
					Date date=new Date();

					String date_ =  sdf.format(date);
					obj.setDate(date_);
					
					View_Employee ob = new View_Employee();

					
					String temp = txtrAsd_1_1_1_1.getText().trim();
					double Total_sal = Double.parseDouble(temp);
					obj.setTotal_salary(Total_sal);
		
					
					try {
						double basic_sal = ob.get_Salary(id); 
						obj.setBasic_salary(basic_sal);
						
						//obj.createtable_sal();
						obj.post_sal(obj);
						
					}catch(Exception f){System.out.println(f);}
					
		            JOptionPane.showMessageDialog(null,"Entered successfully");

					dispose();
					new Admin_Menu().setVisible(true);
				}
		
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(847, 366, 134, 36);
		contentPane.add(btnNewButton_1);
		
		
	}
}
