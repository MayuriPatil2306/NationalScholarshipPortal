package com.nsp.controller;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nsp.dao.InstituteDao;
import com.nsp.dao.StudentDao;
import com.nsp.model.InstituteLogin;
import com.nsp.model.InstituteRegister;
import com.nsp.model.StudentRegister;

@Controller
public class InstituteRegisterController {

	@Autowired
	StudentDao sdao;
	@Autowired
	InstituteDao idao;
	private long value;

	@RequestMapping("/iregister")
	public ModelAndView register() {
		return new ModelAndView("iregister");
	}

	@RequestMapping("/ilogin")
	public ModelAndView ilogin() {
		return new ModelAndView("ilogin");
	}

	/*@RequestMapping("/view")
	public ModelAndView view() {
		return new ModelAndView("view");
	}*/
	/**
	 * Controller to register institute
	 * @param ir
	 * @return 
	 * @throws ServerException
	 * @throws IOException
	 */
	@RequestMapping("/register")
	public ModelAndView InstituteRegister(@ModelAttribute InstituteRegister ir) throws ServerException,IOException
	{

		int i = idao.saveData(ir);
		if(i>0) {
			System.out.println("Success");
			return new ModelAndView("ilogin");

		}
		else
		{
			System.out.println("Fail");
			return new ModelAndView("index");

		}

	}

	/**
	 * controller to login for institute
	 * @param it
	 * @return 
	 */
	@RequestMapping("/institute_login")
	public ModelAndView Institutelogin(@ModelAttribute InstituteLogin it) {

		System.out.println("First pass : " +it.getGi_pass());
		if(it.getGi_pass().equals(idao.getpass(it.getGi_code()))){
			return new ModelAndView("institute dashboard");	
		}
		else {
			return new ModelAndView("ilogin");
		}

	}

	/*@RequestMapping(value="/view/{gs_aadhar}")
	public String view(@PathVariable long gs_aadhar, Model m){ 
		System.out.println("inside view");
        StudentRegister sr=new StudentRegister();
        sr=idao.getStudentByGs_aadhar(gs_aadhar);
        System.out.println(sr);
        m.addAttribute("command",sr);  
        return "view";    
    }    */

	@RequestMapping("/view/{gs_aadhar}")
	public ModelAndView viewer(@PathVariable long gs_aadhar) {
		StudentRegister sr = new StudentRegister();
		sr.setGs_aadhar(gs_aadhar);
		value = sr.getGs_aadhar();
		sr=idao.getStudentByGs_aadhar(gs_aadhar);
		System.out.println(sr);
		ArrayList<StudentRegister> st=new ArrayList<StudentRegister>();
		st.add(sr);
		return new ModelAndView("view","list",st);

	}


	@RequestMapping("/status/{gs_aadhar}")
	public ModelAndView changestatuses(@PathVariable long gs_aadhar,HttpServletRequest request)
	{

		String status=request.getParameter("checkstatus");
		System.out.println("inside status controller");
		idao.changestatus(gs_aadhar,status);

		return new ModelAndView("institute dashboard");	
            
	}
	
	
	
	@RequestMapping("/download_student_documents/{gs_aadhar}/{file_name}")
	public ModelAndView student_record_download(@PathVariable long gs_aadhar)
	{
		
		
		return new ModelAndView("view");
		
	}




}
