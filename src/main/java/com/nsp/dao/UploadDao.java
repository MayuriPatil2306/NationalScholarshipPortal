package com.nsp.dao;

import java.sql.SQLSyntaxErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UploadDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
    public void savelocation(long gs_aadhar,String loc,String column_name)throws SQLSyntaxErrorException
    {
    	System.out.println("Inside savelocation Dao");
    	int i= jdbcTemplate.update("insert into gr12_documents values("+gs_aadhar+",'','','','','','','')");
    	if(i>0)System.out.println("Data Successfully inserted ");
    	else System.out.println("Data insertion failed in uPLOAD dAO");
    		
		jdbcTemplate.update("update gr12_documents set "+column_name+"='"+loc+"' where gs_aadhar_no="+gs_aadhar+" ");			
		  	
    }
    
    public int updatelocation(long gs_aadhar,String loc,String column_name)throws SQLSyntaxErrorException
    {
			return jdbcTemplate.update("update gr12_documents set "+column_name+"='"+loc+"' where gs_aadhar_no="+gs_aadhar+" ");
		
		
    	
    }
	
    public void DeleteRecords(long gs_aadhar)
    {
    	jdbcTemplate.update("delete from gr12_documents where gs_aadhar_no="+gs_aadhar+" ");
    }
	
}
