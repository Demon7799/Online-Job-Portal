package com.jobportal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobportal.dao.PostJobDAO;
import com.jobportal.models.JobPostModel;

@WebServlet("/ addjob")
public class PostNewJobServlet extends HttpServlet
{
	/**
	 *  No Use Of It Ignore It
	 */
	private static final long serialVersionUID = 1L;
	HttpSession sessionObj = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			String jobTitle = request.getParameter("jobTitle");
			String company = request.getParameter("jobCompany");
			String location = request.getParameter("location");
			String category = request.getParameter("category");
			String status = request.getParameter("status");
			String lastDate = request.getParameter("lastDate");
			String description = request.getParameter("jobDescription");
			
			JobPostModel jobModel = new JobPostModel();
			jobModel.setJobTitle(jobTitle);
			jobModel.setCompanyName(company);
			jobModel.setJobLocation(location);
			jobModel.setJobCategory(category);
			jobModel.setJobStatus(status);
			jobModel.setJobDescription(description);
			jobModel.setJobLastDate(lastDate);
			
			boolean result = new PostJobDAO().addJobPost(jobModel);
			sessionObj = request.getSession();
			if(result)
			{
				sessionObj.setAttribute("successMsg", "New Job SuccessFully Posted");
				response.sendRedirect("PostNewJob.jsp");
			}
			else
			{
				sessionObj.setAttribute("successMsg", "New Job Posting Failed Due To Service Error");
				response.sendRedirect("PostNewJob.jsp");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
