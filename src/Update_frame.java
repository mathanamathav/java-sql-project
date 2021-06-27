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
import javax.swing.JComboBox;

public class Update_frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_frame frame = new Update_frame();
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
	public Update_frame() {
		this.setResizable(false);
		setTitle("Update Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(115, 34, 206, 36);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrAsd = new JTextArea();
		txtrAsd.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd.setBounds(501, 34, 361, 36);
		contentPane.add(txtrAsd);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmployeeName.setBounds(115, 156, 206, 36);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmployee = new JLabel("Employee Email-ID");
		lblEmployee.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmployee.setBounds(115, 203, 206, 36);
		contentPane.add(lblEmployee);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee Moblie-Number");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(115, 250, 291, 36);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Employee Post");
		lblNewLabel_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1_2_1.setBounds(115, 348, 291, 36);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Employee Basic Salary\r\n");
		lblNewLabel_2_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1_2_2.setBounds(115, 395, 291, 36);
		contentPane.add(lblNewLabel_2_1_2_2);
		
		JTextArea txtrAsd_1 = new JTextArea();
		txtrAsd_1.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_1.setBounds(501, 159, 361, 36);
		contentPane.add(txtrAsd_1);
		
		JTextArea txtrAsd_2 = new JTextArea();
		txtrAsd_2.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_2.setBounds(501, 206, 361, 36);
		contentPane.add(txtrAsd_2);
		
		JTextArea txtrAsd_3 = new JTextArea();
		txtrAsd_3.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_3.setBounds(501, 253, 361, 36);
		contentPane.add(txtrAsd_3);
		
		JTextArea txtrAsd_5 = new JTextArea();
		txtrAsd_5.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_5.setBounds(501, 398, 361, 36);
		contentPane.add(txtrAsd_5);

		JLabel lblNewLabel_2_1_1 = new JLabel("Employee Address");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1_1.setBounds(115, 297, 291, 36);
		contentPane.add(lblNewLabel_2_1_1);
		
		JTextArea txtrAsd_3_1 = new JTextArea();
		txtrAsd_3_1.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd_3_1.setBounds(501, 300, 361, 36);
		contentPane.add(txtrAsd_3_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Assembler");
		 comboBox_1.addItem("Boiler Operator");
		 comboBox_1.addItem("Boilermaker");
		 comboBox_1.addItem("Bookbinder and Bindery Worker");
	     comboBox_1.addItem("Electronic Assembler");
	     comboBox_1.addItem("Expediter");
	     comboBox_1.addItem("Fabricator");
	     comboBox_1.addItem("Fiberglass Laminator/Fabricator");
	     comboBox_1.addItem("Floor Assembler");
	     comboBox_1.addItem("General Laborer");
	     comboBox_1.addItem("Material Handler");
	     comboBox_1.addItem("Packaging Engineer");
	     comboBox_1.addItem("Painting and Coating Worker");
	     comboBox_1.addItem("Photographic Processor");
	     comboBox_1.addItem("Precision Assembler");
	     comboBox_1.addItem("Processing Worker");
	     comboBox_1.addItem("Production Painter");
	     comboBox_1.addItem("Production Worker");
	     comboBox_1.addItem("Semiconductor Processor");
	     comboBox_1.addItem("Tool and Die Maker");
	     comboBox_1.addItem("Tool Crib Attendant");
	     comboBox_1.addItem("Tool, Die, and Gauge Maker");
	     comboBox_1.addItem("Warehouse Associate");
	     comboBox_1.addItem("Warehouse Worker");
	     comboBox_1.addItem("Woodworker");
		 comboBox_1.addItem("Chief Manufacturing Executive");
	     comboBox_1.addItem("Chief Quality Control Executive");
	     comboBox_1.addItem("Civil Engineering Supervisor");
	     comboBox_1.addItem("Controls Engineer");
	     comboBox_1.addItem("Director of Quality Management");
	     comboBox_1.addItem("Distribution Manager");
	     comboBox_1.addItem("Division Manager");
	     comboBox_1.addItem("Engineer");
	     comboBox_1.addItem("Estimating Manager");
	     comboBox_1.addItem("Facilities Manager");
	     comboBox_1.addItem("Floor Assembly Supervisor");
	     comboBox_1.addItem("General Manager");
	     comboBox_1.addItem("Industrial Engineer");
	     comboBox_1.addItem("Machine Shop Maintenance Supervisor");
	     comboBox_1.addItem("Machine Shop Production Supervisor");
	     comboBox_1.addItem("Manager or Supervisor");
	     comboBox_1.addItem("Manufacturing Engineer");
	     comboBox_1.addItem("Manufacturing Process Engineer");
	     comboBox_1.addItem("Manufacturing Production Manager");
	     comboBox_1.addItem("Master Scheduler");
	     comboBox_1.addItem("Materials Management Supervisor");
	     comboBox_1.addItem("Materials Manager");
	     comboBox_1.addItem("Materials Planner");
	     comboBox_1.addItem("Mechanical Designer");
	     comboBox_1.addItem("Mechanical Engineer");
	     comboBox_1.addItem("Operations Clerk");
	     comboBox_1.addItem("Operations Manager");
	     comboBox_1.addItem("Plant Accountant");
	     comboBox_1.addItem("Plant Human Resources Manager");
	     comboBox_1.addItem("Plant Manager");
	     comboBox_1.addItem("Power Plant Dispatcher");
	     comboBox_1.addItem("Power Plant Distributor");
	     comboBox_1.addItem("Powerhouse Supervisor");
	     comboBox_1.addItem("Process/Product Design Engineer");
	     comboBox_1.addItem("Process Engineer");
	     comboBox_1.addItem("Processing Equipment Operations Supervisor");
	     comboBox_1.addItem("Product Development Engineering Manager");
	     comboBox_1.addItem("Product Manager");
	     comboBox_1.addItem("Product Marketing Analyst");
	     comboBox_1.addItem("Production Control Clerk");
	     comboBox_1.addItem("Production Control Manager");
	     comboBox_1.addItem("Production Engineering Manager");
	     comboBox_1.addItem("Production Foreman");
	     comboBox_1.addItem("Production Manager");
	     comboBox_1.addItem("Production Planner/Scheduler");
	     comboBox_1.addItem("Production Supervisor");
	     comboBox_1.addItem("Project Manager");
	     comboBox_1.addItem("Purchasing Agent/Buyer");
	     comboBox_1.addItem("Safety Manager");
	     comboBox_1.addItem("Safety Manager/Coordinator");
	     comboBox_1.addItem("Stationary Engineer");
	     comboBox_1.addItem("Supplier Quality Engineer");
	     comboBox_1.addItem("Test Engineer");
	     comboBox_1.addItem("Tool Room Supervisor");
	     comboBox_1.addItem("Warehouse Manager");
		comboBox_1.setSelectedItem(null);
		comboBox_1.setBounds(501, 348, 361, 36);
		contentPane.add(comboBox_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admin_Menu().setVisible(true);
			}
			
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(147, 498, 134, 36);
		contentPane.add(btnBack);
		
		JButton btnNewButton_1 = new JButton("SUMBIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtrAsd.getText().isEmpty() || txtrAsd_2.getText().isEmpty() || txtrAsd_3.getText().isEmpty() || txtrAsd_3_1.getText().isEmpty() || txtrAsd_5.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Enter Employee ID");
				}else
				{
					Add_Employee obj = new Add_Employee();
					String ID = txtrAsd.getText().trim();
					int id = Integer.parseInt(ID);
					try {
						obj.update_address(id, txtrAsd_3_1.getText());
						obj.update_name(id,txtrAsd_1.getText());
						obj.update_email(id,txtrAsd_2.getText());
						obj.update_number(id,txtrAsd_3.getText());
						obj.update_post(id, (String)comboBox_1.getSelectedItem());
						String value = txtrAsd_5.getText();
						double sal = Double.parseDouble(value);
						obj.update_salary(id,sal);
					}catch(Exception f){System.out.println(f);}
					JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY!");
					dispose();
					new Admin_Menu().setVisible(true);
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(706, 498, 134, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("GO");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtrAsd.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Enter Employee ID");
				}
				else {
					View_Employee obj = new View_Employee();
					String ID = txtrAsd.getText().trim();
					int id = Integer.parseInt(ID);
				
					try {
						if(obj.get_id(id)==null) {
							JOptionPane.showMessageDialog(null,"Entered Employee ID is not present in Data Base");
						}
						else {
						String name = obj.get_Name(id);
						String post = obj.get_Post(id);
						String address = obj.get_address(id);
						String email = obj.get_Email(id);
						String number = obj.get_number(id);
						double basic_sal = obj.get_Salary(id); 
						String value = String.valueOf(basic_sal);
						txtrAsd_1.setText(name);
						txtrAsd_2.setText(email);
						txtrAsd_3.setText(number);
						txtrAsd_3_1.setText(address);
						comboBox_1.setSelectedItem(post);
						txtrAsd_5.setText(value);}
					}catch(Exception f){System.out.println(f);}
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1.setBounds(878, 34, 92, 36);
		contentPane.add(btnNewButton_1_1);
		
	
		
	}
}
