package j.h.fman;

public class Stat {
	public Stat(String yymmdd, int amount) {
		super();
		this.yymmdd = yymmdd;
		this.amount = amount;
	}
	public Stat() {
		super();
		// TODO Auto-generated constructor stub
	}
	String yymmdd;
	int amount;
	public String getYymmdd() {
		return yymmdd;
	}
	public void setYymmdd(String yymmdd) {
		this.yymmdd = yymmdd;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
