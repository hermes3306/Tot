package j.p.Tot;

public class Member {
	int id;
	public Member(int id, String password, String name, String email) {
		super();
		this.id = id;
		this.password = password;
		Name = name;
		Email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	String password;
	String Name;
	String Email;
	
}
