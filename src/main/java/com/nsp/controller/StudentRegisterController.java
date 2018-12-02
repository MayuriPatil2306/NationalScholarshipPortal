package com.nsp.controller;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nsp.dao.StudentDao;
import com.nsp.model.StudentLogin;
import com.nsp.model.StudentRegister;

@Controller
public class StudentRegisterController {

	@Autowired
	StudentDao sdao;


	@RequestMapping("/sregister")
	public ModelAndView register() {
		return new ModelAndView("sregister");
	}

	@RequestMapping("/post")
	public ModelAndView dashboard() {
		return new ModelAndView("post");
	}


	/**
	 * 
	 * @param ir
	 * @return
	 * @throws ServerException
	 * @throws IOException
	 */
	@RequestMapping("/student_register")
	public ModelAndView StudentRegister(@ModelAttribute StudentRegister ir) throws ServerException,IOException
	{
		System.out.println("inside student register");


		int i = sdao.saveData(ir);
		if(i>0) {
			System.out.println("Success");
			return new ModelAndView("index");
		}
		else
		{
			System.out.println("Fail");
			return new ModelAndView("index");
		}

	}


	/**
	 * 
	 * @param st
	 * @return
	 */
	@RequestMapping("/student_login")
	public ModelAndView Studentlogin(@ModelAttribute StudentLogin st) {

		System.out.println("Entered");
		System.out.println("First pass : " +st.getGs_aadhar());
		System.out.println(st.getGs_password());


		System.out.println("Entering");
		String hash=sdao.encrypt(st.getGs_password());
		System.out.println(hash);




		if(hash.equals(sdao.getpass(st.getGs_aadhar()))){


			System.out.println("login successful");
			return new ModelAndView("sdashboard");	
		}
		else {
			return new ModelAndView("index");
		}
	}


	/**
	 * 
	 * @return
	 */
	@RequestMapping("/logout")
	public ModelAndView Studentlogout() {
		return new ModelAndView("logout");
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/ViewUpload")
	public ModelAndView displayStudent()
	{
		System.out.println("Inside Display");
		List<StudentRegister> list=sdao.DisplayStudentRecord();

		return new ModelAndView("institute dashboard","lst",list);

	}

	

}
