import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Add_Employee_frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Employee_frame frame = new Add_Employee_frame();
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
	public Add_Employee_frame() throws Exception{
		this.setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width/2 - getSize().width/2, screenSize.height/2 - getSize().height/2);
		
		this.setTitle("Add Details of Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 655);
        setTitle("Add Employee Details");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrAsd = new JTextArea();
		txtrAsd.setFont(new Font("Monospaced", Font.ITALIC, 20));
		txtrAsd.setBounds(421, 45, 361, 36);
		contentPane.add(txtrAsd);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(89, 45, 206, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmployeeName.setBounds(89, 110, 206, 36);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmployee = new JLabel("Employee Email-ID");
		lblEmployee.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmployee.setBounds(89, 171, 206, 36);
		contentPane.add(lblEmployee);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee Moblie-Number");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(89, 233, 291, 36);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Employee Gender");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1_1.setBounds(89, 292, 291, 36);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Employee Address");
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1_2.setBounds(89, 353, 291, 36);
		contentPane.add(lblNewLabel_2_1_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea_1.setBounds(421, 110, 361, 36);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_2.setBounds(421, 171, 361, 36);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Monospaced", Font.ITALIC, 20));
		textArea_3.setBounds(421, 233, 361, 36);
		contentPane.add(textArea_3);
		
		JTextArea textArea_3_1 = new JTextArea();
		textArea_3_1.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea_3_1.setBounds(421, 353, 361, 36);
		contentPane.add(textArea_3_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Employee Post");
		lblNewLabel_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1_2_1.setBounds(89, 410, 291, 36);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Employee Basic Salary\r\n");
		lblNewLabel_2_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_1_2_2.setBounds(89, 471, 291, 36);
		contentPane.add(lblNewLabel_2_1_2_2);
		
		JTextArea textArea_3_1_2 = new JTextArea();
		textArea_3_1_2.setFont(new Font("Monospaced", Font.ITALIC, 20));
		textArea_3_1_2.setBounds(421, 481, 361, 36);
		contentPane.add(textArea_3_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		comboBox.addItem("Others");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(421, 303, 121, 22);
		contentPane.add(comboBox);
		
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
		
		comboBox_1.setBounds(421, 421, 361, 36);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("SUMBIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtrAsd.getText().isEmpty() || textArea_1.getText().isEmpty() || textArea_2.getText().isEmpty()
						|| textArea_3_1.getText().isEmpty() || textArea_3_1_2.getText().isEmpty()){
		            JOptionPane.showMessageDialog(null,"Enter All Fields");
		        }
				else
				{
					String temp = txtrAsd.getText().trim();
					int id = Integer.parseInt(temp);
					String name = textArea_1.getText().trim();
					String email = textArea_2.getText().trim();
					String mob = textArea_3.getText().trim();
					
					String address = textArea_3_1.getText().trim();
					double sal = Float.parseFloat(temp);
					//String gender = comboBox.getSelectedItem();
					
					Add_Employee obj = new Add_Employee();
					obj.setEmp_id(id); 
					obj.setEmp_name(name);
					obj.setEmp_emailid(email);
					obj.setEmp_address(address);
					obj.setEmp_number(mob);
					obj.setEmp_post((String)comboBox_1.getSelectedItem());
					obj.setEmp_basic_salary(sal);
					obj.setEmp_gender((String)comboBox.getSelectedItem());
					try {
						obj.createtable();
						obj.post(obj);
					}catch(Exception f){System.out.println(f);}
					
					dispose();
					new Admin_Menu().setVisible(true);
				}}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(648, 569, 134, 36);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admin_Menu().setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(89, 569, 134, 36);
		contentPane.add(btnBack);
		
		
		
	}
}
