package j.h.p;

public class FooService {
	
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper)
	{
		System.out.println("setUserMapper");
		this.userMapper = userMapper;
	}
	
	public String doSomeBusinessStuff(int id)
	{
		System.out.println("doSomeBusinessStuff");
		return this.userMapper.getUser(id);
	}
	
  
	
	
}
