package com.nsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nsp.dao.StateDao;

import com.nsp.model.StateLogin;

@Controller
public class StateController {

	
	@Autowired
	StateDao statedao;
	
	@RequestMapping("/StateLogin")
	public ModelAndView statelogin() {
		return new ModelAndView("StateLogin");
		
	}
	
	/**
	 * 
	 * @param st
	 * @return
	 */
	@RequestMapping("/state_login")
	public ModelAndView StateLogin(@ModelAttribute StateLogin st)
	{
		System.out.println(" Check State Atrribute : "+st.getGstate_name());
			
		if(st.getGstate_password().equals(statedao.getpassword(st.getGstate_name())))
		{ 
			System.out.println("State login successful"); 	
			return new ModelAndView("state dashboard"); 
			}
		  else  return new ModelAndView("StateLogin");	
	}
}
