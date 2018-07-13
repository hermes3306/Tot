package j.p.Tot;

import org.springframework.jdbc.core.JdbcTemplate;

public class MemberDao {
	private JdbcTemplate jdbcTemplate; 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{ 
		this.jdbcTemplate = jdbcTemplate; 
	}
	
	public Member getMember(int id, String password) {
		
		return null;
	}

}
