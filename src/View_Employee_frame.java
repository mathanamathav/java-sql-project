import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;



public class View_Employee_frame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnLoadSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Employee_frame frame = new View_Employee_frame();
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
	public View_Employee_frame() {
		this.setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width/2 - getSize().width/2, screenSize.height/2 - getSize().height/2);
		
		setTitle("View Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 1055, 513);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		
		JButton btnNewButton = new JButton("LOAD EMPLOYEE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				View_Employee obj = new View_Employee();
				
				try {
					ResultSet re = obj.get();
					obj.resultSetToTableModel(re,table);
					
					scrollPane.setViewportView(table);
				}catch(Exception f){System.out.println(f);}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(866, 11, 196, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admin_Menu().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(10, 12, 169, 23);
		contentPane.add(btnNewButton_1);
		
		btnLoadSalary = new JButton("LOAD SALARY\r\n");
		btnLoadSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Employee obj = new View_Employee();
			
			try {
				ResultSet re = obj.get_sal();
				obj.resultSetToTableModel(re,table);
				
				scrollPane.setViewportView(table);
			}catch(Exception f){System.out.println(f);}
			}
		});
		btnLoadSalary.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLoadSalary.setBounds(660, 11, 196, 23);
		contentPane.add(btnLoadSalary);
	}
}
