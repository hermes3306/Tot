package j.p.Tot;

import java.util.List;

public class Tot {
	public Tot(List<Account> accounts) {
		super();
		this.accounts = accounts;
	}

	public Tot() {
		// TODO Auto-generated constructor stub
	}

	List <Account> accounts;

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
