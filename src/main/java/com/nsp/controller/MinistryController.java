package com.nsp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nsp.dao.MinistryDao;
import com.nsp.model.MinistryLogin;

@Controller
public class MinistryController {
    
	@Autowired
	MinistryDao mindao;
	
	
	@RequestMapping("/MinistryLogin")
	public ModelAndView ministrylogin() {
		return new ModelAndView("MinistryLogin");
	}
	
	/**
	 * 
	 * @param mn
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/ministry_login")
	public ModelAndView MinistryLogin(@ModelAttribute MinistryLogin mn,HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println(" Check Minstry Atrribute : "+mn.getName());
		
		
			
		if(mn.getPassword().equals(mindao.getpassword(mn.getName())))
		{ 
			
			HttpSession session=request.getSession(true);
			session.setAttribute("str", mn.getName());
			
			String str=(String)session.getAttribute("str");
			                                              
			System.out.println("Login Session : "+str);
			System.out.println("Ministry login successful"); 	
			return new ModelAndView("MinistryDashBoard"); 
			}
		  else  return new ModelAndView("index");	
	}
	
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping("/ministry_logout")
	public ModelAndView logout(HttpServletRequest request,HttpServletResponse response,HttpSession session)
	{  
		System.out.println("Inside Logout");
		ModelAndView model=new ModelAndView("MinistryLogin");
	   
	   String name=(String)session.getAttribute("str");
	   System.out.println("Checking Session :"+name);
	   session.invalidate();
	   System.out.println("Checking Session :"+name);
	   return model;
	}
	
	
}




