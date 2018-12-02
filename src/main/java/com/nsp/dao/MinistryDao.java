package com.nsp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class MinistryDao {

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
	 * @param name
	 * @return
	 */
	public String getpassword(String name)
	{

		   String password=null;
		   
		   try {
			Object obj=(String)jdbcTemplate.queryForObject("select password from gr12_Ministry where name=?",new Object[] {name},String.class);
			password=(String)obj;
		} catch (DataAccessException e) {
			                       
			e.printStackTrace();
		    }
		   return password;
	}
	
	
}
