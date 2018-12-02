package com.nsp.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nsp.dao.DownloadDao;

@Controller
public class FileDownloadController {
	
	@Autowired
	DownloadDao ddao;
	
	
	@RequestMapping("/download/{gs_aadhar}/{document_name}")
	public ModelAndView downloadfiles(@PathVariable long gs_aadhar,@PathVariable String document_name,HttpServletRequest request,HttpServletResponse response ) throws IOException
	{
		/**
		 * path of file for download
		 */
		
		System.out.println("check : "+document_name);
	     
		
		String loc=ddao.getlocation(gs_aadhar,document_name);
		
		File file=new File(loc);
		
	    System.out.println("Inside File Download Controller");
	
		/**
		 * Checking mime type of the content
		 */
	   
		InputStream inputstream=new BufferedInputStream(new FileInputStream(file));
		String mimetype=URLConnection.guessContentTypeFromStream(inputstream);
		
		if(mimetype==null)
		mimetype="application/octet-stream";
		
		response.setContentType(mimetype);
		response.setContentLength((int)file.length());

		response.setHeader("Content-Disposition", String.format(" attachment; filename=\"%s\"",file.getName()));
		
		FileCopyUtils.copy(inputstream,response.getOutputStream());
		response.flushBuffer();
		response.getOutputStream().close();
	
	
		return new ModelAndView("view");
	}
	
	
	
}
