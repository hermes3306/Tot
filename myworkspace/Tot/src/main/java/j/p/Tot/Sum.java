package j.p.Tot;

public class Sum {
	public Sum(int money, String yymmdd) {
		super();
		this.money = money;
		this.yymmdd = yymmdd;
	}
	public Sum() {
		super();
		// TODO Auto-generated constructor stub
	}
	int money;
	String yymmdd;
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
