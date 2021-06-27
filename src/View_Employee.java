import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class View_Employee extends Add_Employee{
	
	public ResultSet get() throws Exception{
        try{ 
        	Connection con = getConnection();
        	String query="SELECT * from employee";
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			return result;
        }catch(Exception e){System.out.println(e);}
        return null;
        
    }
	public ResultSet get_sal() throws Exception{
        try{ 
        	Connection con = getConnection();
        	String query="SELECT * from Employee_Salary";
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			return result;
        }catch(Exception e){System.out.println(e);}
        return null;
        
    }
	public String get_Email(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from employee where emp_id = "+id);
     
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
            return (result.getString("email_id"));
            
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	public String get_number(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from employee where emp_id = "+id);
     
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
            return (result.getString("number"));
            
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	public String get_address(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from employee where emp_id = "+id);
     
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
            return (result.getString("address"));
            
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	
	public String get_Post(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from employee where emp_id = "+id);
     
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
            return (result.getString("post"));
            
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	public String get_id(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from employee where emp_id = "+id);
     
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
            return (result.getString("emp_id"));
            
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	
	public String get_Name(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from employee where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
			return result.getString("emp_name"); 
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	public double get_Salary(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from employee where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			result.next();
			return result.getDouble("salary"); 
        }catch(Exception e){System.out.println(e);}
        return 0.0;
    }
	public void resultSetToTableModel(ResultSet rs, JTable table) throws SQLException{
        DefaultTableModel tableModel = new DefaultTableModel();

        ResultSetMetaData metaData = rs.getMetaData();

        int columnCount = metaData.getColumnCount();

        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++){
            tableModel.addColumn(metaData.getColumnLabel(columnIndex));
        }
        Object[] row = new Object[columnCount];

        while (rs.next()){
            for (int i = 0; i < columnCount; i++){
                row[i] = rs.getObject(i+1);
            }
            tableModel.addRow(row);
        }
        table.setModel(tableModel);
    }
}
