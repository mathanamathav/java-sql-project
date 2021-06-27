import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Compute_Salary extends Add_Employee{
	private int id;
	private String name;
	
	private String date;
	
	private double basic_salary;
	private double Total_salary;
	public int getid() {
		return id;
	}
	public void setid(int emp_id) {
		this.id = emp_id;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String emp_name) {
		this.name = emp_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(double basic_salary) {
		this.basic_salary = basic_salary;
	}
	public double getTotal_salary() {
		return Total_salary;
	}
	public void setTotal_salary(double total_salary) {
		Total_salary = total_salary;
	}
	
	public void createtable_sal() throws Exception{
		try
		{
			Connection con= getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS Employee_Salary(empid int ,emp_name varchar(255),date_of_cal date,basic_salary double,Total_salary double,foreign key(empid) REFERENCES Employee(emp_id)");
			create.executeUpdate(); 
			
		}catch(Exception e){System.out.println(e);}
		finally {
			System.out.println("function created");
		}
	}
	public void post_sal(Compute_Salary ob) throws Exception{
        
        try{
            Connection con = getConnection();
            PreparedStatement posted = con.prepareStatement("INSERT INTO Employee_Salary VALUES ("+ob.getid()+", \""+ob.getname()+"\",\""+ob.getDate()+"\","+ob.getBasic_salary()+","+ob.getTotal_salary()+")");
            posted.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally {
            System.out.println("Insert Completed.");
        }
    }
	
	public double get_calculate_Total(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from Employee_Salary where empid = "+id+" order by date_of_cal desc");
     
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
            return (result.getDouble("Total_salary"));
            
        }catch(Exception e){System.out.println(e);}
        return 0.0;
    }
	public String get_calculate_Name(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT * from Employee_Salary where empid = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
			return result.getString("emp_name"); 
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	
	public String get_calculate_date(int id) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("SELECT date_of_cal from Employee_Salary where empid = "+id+" order by date_of_cal desc");
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();            
			result.next();
			Date date = result.getDate("date_of_cal");
            DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");  
            String strDate = dateFormat.format(date);  
			return strDate; 
        }catch(Exception e){System.out.println(e);}
        return null;
    }
	
}
