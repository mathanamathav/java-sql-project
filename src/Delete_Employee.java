import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_Employee extends Add_Employee{
	public void delete(int id) throws Exception{
        
        try{
            Connection con = getConnection();
            PreparedStatement posted = con.prepareStatement("DELETE from employee where emp_id = ('"+id+"')");
            posted.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally {
            System.out.println("deletion Completed.");
        }
    }

}
