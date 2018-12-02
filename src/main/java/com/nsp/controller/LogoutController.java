package com.nsp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LogoutController {

	/**
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/ministry_logout",method=RequestMethod.GET)
  public String logout(HttpSession session) {
    
    String str=(String)session.getAttribute("str");
    System.out.println("Cheking Session : "+str);
    session.removeAttribute("str");
    session.invalidate();
    System.out.println("Cheking Session : "+str);
    return "index";
  }
}