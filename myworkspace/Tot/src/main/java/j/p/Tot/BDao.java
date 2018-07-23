package j.p.Tot;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class BDao {
	JdbcTemplate template = null;
	public BDao() {
		template = Constant.template;
	}
	
	public ArrayList<Account> list() {

		String query = "select id, accnt, money, yymmdd from Tot order by yymmdd asc, id asc";
		return (ArrayList<Account>) template.query(query, new BeanPropertyRowMapper<Account>(Account.class));
	}

	public ArrayList<Account> Sum() {

		String query = "select yymmdd, sum(money) money from Tot order by yymmdd asc";
		return (ArrayList<Account>) template.query(query, new BeanPropertyRowMapper<Account>(Account.class));
	}

}
