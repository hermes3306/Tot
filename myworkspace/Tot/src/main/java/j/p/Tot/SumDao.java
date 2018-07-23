package j.p.Tot;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SumDao {
	JdbcTemplate template = null;
	public SumDao() {
		template = Constant.template;
	}
	
	public ArrayList<Sum> list() {

		String query = "select yymmdd, sum(money) money from Tot group by yymmdd order by yymmdd asc";
		return (ArrayList<Sum>) template.query(query, new BeanPropertyRowMapper<Sum>(Sum.class));
	}

}
