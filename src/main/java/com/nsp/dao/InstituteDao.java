package com.nsp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nsp.model.InstituteRegister;
import com.nsp.model.StudentRegister;

public class InstituteDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Saving data into database
	 * @param ir
	 * @return
	 */
	public int saveData(InstituteRegister ir)
	{
		System.out.println("in save data..");
		String query="insert into gr12_Institutes values('"+ir.getGi_code()+"','"+ir.getGi_name()+"','"+ir.getGi_pass()+"','"+ir.getGi_state()+"','"+ir.getGi_uni()+"')";
		return jdbcTemplate.update(query);
	}

	/**
	 * retrieving password from database
	 * @param gi_code
	 * @return
	 */

	/////////////////////////////////////////////////////////

	public StudentRegister getStudentById(long aadhar)
	{
		StudentRegister st=new StudentRegister();
		st=(StudentRegister)jdbcTemplate.queryForObject("select * from gr12_students where gs_aadhar="+aadhar+" ", StudentRegister.class);
		System.out.println(st);
		return st;
	}

	//////////////////////////////////////////////////////	


	public String getpass(int gi_code)
	{   
		String password=null;

		try {
			System.out.println("check");
			Object obj=jdbcTemplate.queryForObject("select gi_pass from gr12_Institutes where gi_code=?", new Object[] {gi_code}, String.class);

			password=(String)obj;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		System.out.println("Password is : "+password);
		return password;

	}



	public StudentRegister getStudentByGs_aadhar(long gs_aadhar){  
		String q;
		q = "select * from gr12_Students where gs_aadhar = ?";
		return jdbcTemplate.queryForObject(q, new Object[] {gs_aadhar}, new BeanPropertyRowMapper<StudentRegister>(StudentRegister.class)) ;
	}

	/////////////////////////////////////////////////////////////////////////////////

	public void changestatus(long gs_aadhar,String status)
	{
		System.out.println("inside status dao");
		jdbcTemplate.update("update gr12_students set GS_STATUS='"+status+"' where gs_aadhar="+gs_aadhar+" ");

	}

}	


