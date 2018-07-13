package j.p.Tot;

public class Account {
	
	public Account() {
		super();
	}
	public Account(int id, String accnt, int money, String yymmdd) {
		super();
		this.id = id;
		this.accnt = accnt;
		this.money = money;
		this.yymmdd = yymmdd;
	}
	int id;
	String accnt;
	int money;
	String yymmdd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccnt() {
		return accnt;
	}
	public void setAccnt(String accnt) {
		this.accnt = accnt;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getYymmdd() {
		return yymmdd;
	}
	public void setYymmdd(String yymmdd) {
		this.yymmdd = yymmdd;
	}
	

}
