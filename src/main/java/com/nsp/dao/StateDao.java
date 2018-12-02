package com.nsp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StateDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * retrieving password from database
	 * @param gstate_name
	 * @return
	 */
	public String getpassword(String gstate_name)
	{

		String password=null;

		try {
			System.out.println("check");
			Object obj=(String)jdbcTemplate.queryForObject("select gstate_password from gr12_State where gstate_name=?",new Object[] {gstate_name},String.class);
			password=(String)obj;
		} catch (DataAccessException e) {

			e.printStackTrace();
		}
		return password;
	}



}
