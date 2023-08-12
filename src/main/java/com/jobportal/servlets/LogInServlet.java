package com.jobportal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobportal.models.UserModel;

@WebServlet("/login")
public class LogInServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			String email= request.getParameter("userMail");
			String password = request.getParameter("userPassword");
			String role = request.getParameter("Role");
			
			HttpSession session = request.getSession();
			
			UserModel userModel = new UserModel();
			
			if(role.equalsIgnoreCase("Recruiter") || role.contains("Recruiter"))
			{
				// check from recruiter table db
				userModel.setRole("recruiter");
				session.setAttribute("userObject", userModel);
				response.sendRedirect("Recruiter.jsp");
				
				
			}
			/*else if()
			{
				for applicant
			}*/
		}
		catch(Exception e) {e.printStackTrace();}	
	}
}
