package com.nsp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nsp.model.StudentRegister;

public class StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	/**
	 * save data into database
	 * @param st
	 * @return
	 */
	
	public String encrypt(String str)
	{
		
		int i=0; String hash="";
		while(i<str.length())
		{
			char c=(char)(str.charAt(i)+3);
			hash=hash+c;
			i++;
		}
		return hash;
	}
	
	
	
	public int saveData(StudentRegister st)
	{
		String hash=encrypt(st.getGs_password());
		System.out.println("in save data..");
		String query="insert into gr12_Students values('"+st.getGs_name()+"','"+st.getGs_dob()+"',"+st.getGs_mobile()+",'"+st.getGs_email()+"','"+st.getGs_insname()+"',"+st.getGs_aadhar()+",'"+st.getGs_bank_name()+"','"+st.getGs_ifsc()+"',"+st.getGs_account_no()+",'"+hash+"','"+st.getGs_state()+"',0,0,0,0,'no caste',default,'not approved')";
		return jdbcTemplate.update(query);
	}

	public String getpass(long gs_aadhar)
	{   
		String password=null;

		try {
			System.out.println("check");
			Object obj=jdbcTemplate.queryForObject("select gs_password from gr12_Students where gs_aadhar=?", new Object[] {gs_aadhar}, String.class);

			password=(String)obj;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		System.out.println("Password is : "+password);
		return password;

	}

	/**
	 * Update student data in database
	 * @param st
	 */
	public void saveUploadData(StudentRegister st,long gs_aadhar)
	{

		System.out.println("in save Upload data..");
		String query="update gr12_Students set gs_metric="+st.getGs_metric()+",gs_hsc="+st.getGs_hsc()+",gs_degree="+st.getGs_degree()+",gs_income="+st.getGs_income()+",gs_caste='"+st.getGs_caste()+"' where gs_aadhar="+gs_aadhar+" ";
		jdbcTemplate.update(query);
	}


	/**
	 * Displaying Student Records To Institute
	 */

	public List<StudentRegister> DisplayStudentRecord()
	{


		System.out.println("inside Dao");
		List<Map<String,Object>> list=jdbcTemplate.queryForList("select * from gr12_Students where gs_doc_uploaded='NO'");

		ArrayList<StudentRegister> last = new ArrayList<StudentRegister>();

		for(Map<String,Object> lst:list)
		{
			System.out.println("Inside loop");
			Object obj;
			String str;

			StudentRegister st=new StudentRegister();
			//Setting Values
			obj=lst.get("gs_name"); str=obj.toString(); st.setGs_name(str);
			System.out.println(str);
			obj=lst.get("gs_dob");  str=obj.toString(); st.setGs_dob(str);
			System.out.println(str);
			obj=lst.get("gs_mobile");  str=obj.toString();    st.setGs_mobile(Long.parseLong(str));
			System.out.println(str);
			obj=lst.get("gs_email");  str=obj.toString(); st.setGs_email(str);
			System.out.println(str);
			obj=lst.get("gs_insname");  str=obj.toString(); st.setGs_insname(str);
			System.out.println(str);
			obj=lst.get("gs_aadhar");  str=obj.toString();    st.setGs_aadhar(Long.parseLong(str));
			System.out.println(str);
			obj=lst.get("gs_bank_name");  str=obj.toString(); st.setGs_bank_name(str);
			System.out.println(str);
			obj=lst.get("gs_ifsc");  str=obj.toString(); st.setGs_ifsc(str);
			System.out.println(str);
			obj=lst.get("gs_account_no");  str=obj.toString();    st.setGs_account_no(Long.parseLong(str));
			System.out.println(str);
			obj=lst.get("gs_state");  str=obj.toString(); st.setGs_state(str);
			System.out.println(str);
			obj=lst.get("gs_metric");  str=obj.toString();    st.setGs_metric(Long.parseLong(str));
			System.out.println(str);
			obj=lst.get("gs_hsc");  str=obj.toString();    st.setGs_hsc(Long.parseLong(str));
			System.out.println(str);
			obj=lst.get("gs_degree");  str=obj.toString();    st.setGs_degree(Long.parseLong(str));
			System.out.println(str);
			obj=lst.get("gs_income");  str=obj.toString();    st.setGs_income(Long.parseLong(str));
			System.out.println(str);
			obj=lst.get("gs_caste");  str=obj.toString(); st.setGs_caste(str);



			System.out.println("checking");
			System.out.println(str);

			last.add(st);
		}

		return last;

	}	
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	public long getaadhar(String email)
	{
		System.out.println("Inside Upload Dao");
		
		long gs_aadhar=0;
		Object obj=null;
		
		try {
			obj=jdbcTemplate.queryForObject("select gs_aadhar from gr12_students where gs_email='"+email+"' ", Long.class);
		} catch (DataAccessException e) {
			
			e.printStackTrace();
		}
		
		gs_aadhar=(Long)obj;
		
		System.out.println("fetched aadhar value is : "+gs_aadhar);
		
		return gs_aadhar;
	}


}
