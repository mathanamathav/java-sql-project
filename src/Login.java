public class Login {

	private String Username;
    private String Password;
    public Login() {
    	
    }
	public Login(String username, String password) {
		this.Username = username;
		this.Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int is(String username, String password)
	{
		if(username.trim().equals("admin") && Password.trim().equals("admin")) {
			return 1;
		}
		if(check_user(username.trim(),password.trim())==true) {
			return 2; 
		}
		else
			return 3;
			
	}
	
	public boolean check_user(String username,String Password) {
		int i=0;
		int id = Integer.parseInt(username);
		View_Employee obj = new View_Employee();
		try {
		if(Password.equals(obj.get_Name(id)) && username.equals(obj.get_id(id))) {
			i=1;
		}
		else {
			i=0;
		}
		System.out.println(i);
		}catch(Exception e) {e.printStackTrace();}
		if(i==1) {
			return true;
		}
		return false;
	}
	
}
