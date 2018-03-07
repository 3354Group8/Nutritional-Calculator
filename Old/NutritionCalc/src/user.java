
public class user
{
	//vars
	private String userID;
	private String password;
	
	//constructor
	public user()
	{
		userID=null;
		password=null;
	}
	public user(String userID, String password)
	{
		this.userID=userID;
		this.password=password;
	}
	public String getUser()
	{
		return userID;
	}
	public String getPassword()
	{
		return password;
	}
	public user deepCopy()
	{
		user data = new user(userID, password);
		return data;
	}
}
