package com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Register;
import com.service.RegisterService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("welcome to servlet");
		Register register = new Register();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		String date1=request.getParameter("dob");
		// convert string into date 
		try {
			date=sdf.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dob1=sdf.format(date);
		System.out.println("My date of birth is"+dob1);
		//String name = request.getParameter("name");
		register.setName(request.getParameter("name"));
		register.setPassword(request.getParameter("password"));
		
		register.setDate(dob1);
		register.setGender(request.getParameter("gender"));
		register.setAddress(request.getParameter("address"));
		RegisterService registerService = new RegisterService();
		Boolean success = registerService.registerEmployee(register);
		// list.add(register);
		// register.setList(list);
		// request.setAttribute("listitems",list);
		if (success) {
			System.out.println("welcome to success page");
			System.out.println(register.getName());
			System.out.println(register.getPassword());
			System.out.println(register.getDate());
			System.out.println(register.getGender());
			System.out.println(register.getAddress());
			List<Register> register1=registerService.getList();
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			request.setAttribute("register", register1);
			rd.forward(request, response);
		} else
			response.sendRedirect("register.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
