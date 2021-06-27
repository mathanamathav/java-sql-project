import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Add_Employee {
	private int emp_id;
	private String emp_name;
	private String emp_address;
	private String emp_gender;
	private String emp_emailid;
	private String emp_number;
	private String emp_post;
	private double emp_basic_salary;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public String getEmp_gender() {
		return emp_gender;
	}
	public void setEmp_gender(String emp_gender) {
		this.emp_gender = emp_gender;
	}
	public String getEmp_emailid() {
		return emp_emailid;
	}
	public void setEmp_emailid(String emp_emailid) {
		this.emp_emailid = emp_emailid;
	}
	public String getEmp_number() {
		return emp_number;
	}
	public void setEmp_number(String emp_number) {
		this.emp_number = emp_number;
	}
	public String getEmp_post() {
		return emp_post;
	}
	public void setEmp_post(String emp_post) {
		this.emp_post = emp_post;
	}
	public double getEmp_basic_salary() {
		return emp_basic_salary;
	}
	public void setEmp_basic_salary(double emp_basic_salary) {
		this.emp_basic_salary = emp_basic_salary;
	}
	
	
	
	public void update_name(int id,String temp) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("UPDATE Employee SET emp_name = '"+temp+"' where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeUpdate();            
        }catch(Exception e){System.out.println(e);}
    }
	
	public void update_address(int id,String temp) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("UPDATE Employee SET address = '"+temp+"' where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeUpdate();            
        }catch(Exception e){System.out.println(e);}
    }
	
	public void update_email(int id,String temp) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("UPDATE Employee SET email_id = '"+temp+"' where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeUpdate();            
        }catch(Exception e){System.out.println(e);}
    }
	
	public void update_post(int id,String temp) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("UPDATE Employee SET post = '"+temp+"' where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeUpdate();            
        }catch(Exception e){System.out.println(e);}
    }
	
	public void update_number(int id,String temp) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("UPDATE Employee SET number = '"+temp+"' where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeUpdate();            
        }catch(Exception e){System.out.println(e);}
    }
	
	public void update_salary(int id,double temp) throws Exception{
        try{
        	Connection con = getConnection();
        	String query=("UPDATE Employee SET salary = '"+temp+"' where emp_id = "+id);
			PreparedStatement statement = con.prepareStatement(query);
		    statement.executeUpdate();            
        }catch(Exception e){System.out.println(e);}
    }
	
	
	
	
	public void post(Add_Employee ob) throws Exception{
        
        try{
            Connection con = getConnection();
            PreparedStatement posted = con.prepareStatement("INSERT INTO Employee VALUES ('"+ob.getEmp_id()+"', '"+ob.getEmp_name()+"','"+ob.getEmp_emailid()+"','"+ob.getEmp_address()+"','"+ob.getEmp_number()+"','"+ob.getEmp_post()+"','"+ob.getEmp_gender()+"','"+ob.getEmp_basic_salary()+"')");
            posted.executeUpdate();
        } catch(Exception e){System.out.println(e);} 
        finally {
            System.out.println("Insert Completed.");
        }
    }
	
	
	public void createtable() throws Exception{
		try
		{
			Connection con= getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS Employee(emp_id int primary key,emp_name varchar(255),email_id varchar(255),address varchar(255),number varchar(255),post varchar(255),gender varchar(255),salary double)");
			create.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		finally {
			System.out.println("function created");
		}
	}
	
	
	public  Connection getConnection() throws Exception{
		  try{
		   String driver = "com.mysql.jdbc.Driver";
		   String url = "jdbc:mysql://localhost:3306/payroll";
		   String username = "root";
		   String password = "mathanaas";
		   Class.forName(driver);
		   
		   Connection conn = DriverManager.getConnection(url,username,password);
		   System.out.println("Connected");
		   return conn;
		  } catch(Exception e){System.out.println(e);}
		  
		  
		  return null;
		 }
	

}
