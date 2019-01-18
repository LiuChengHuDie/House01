package com.cq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cq.maven0117.Demo1;

public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  Demo1 hello  = new Demo1();
       
   
    public HelloController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		
		response.getWriter().append(hello.hello());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
