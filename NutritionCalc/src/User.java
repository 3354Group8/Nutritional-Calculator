
public class User
{
	//vars
	private String userID;
	private String password;
	
	//constructor
	public User()
	{
		userID=null;
		password=null;
	}
	public User(String userID, String password)
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
	public User deepCopy()
	{
		User data = new User(userID, password);
		return data;
	}
}
