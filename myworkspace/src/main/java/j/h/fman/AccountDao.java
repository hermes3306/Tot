package j.h.fman;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao {
	JdbcTemplate template = null;
	public AccountDao() {
		template = Constant.template;
	}
	
	public ArrayList<Account> all() {
		String query = "select id, accnt, money, yymmdd from Tot";
		ArrayList<Account> accounts = 
				(ArrayList<Account>) template.query(query, new BeanPropertyRowMapper<Account>(Account.class));
		return accounts;
	}
	
	public ArrayList<Stat> stat() {
		String query = "select yymmdd, sum(money) as amount from Tot group by yymmdd";
		ArrayList<Stat> stats =
				(ArrayList<Stat>) template.query(query, new BeanPropertyRowMapper<Stat>(Stat.class));
		return stats; 
	}

}
