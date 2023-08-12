package com.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jobportal.commons.DatabaseConnection;
import com.jobportal.commons.DatabaseQueries;
import com.jobportal.models.JobPostModel;

public class PostJobDAO
{
	private Connection connectionObj=null;
	private ResultSet resultSet = null;
	
	public PostJobDAO() {}
	public PostJobDAO(Connection connectionObj)
	{
		this.connectionObj = connectionObj;
	}

	public boolean addJobPost(JobPostModel jobModel) throws SQLException
	{
		boolean flag= false;
		try
		{
			connectionObj = DatabaseConnection.getConnection();
			
			PreparedStatement ps = connectionObj.prepareStatement(DatabaseQueries.query_addJobPost);
			ps.setString(1, jobModel.getJobTitle());
			ps.setString(2, jobModel.getCompanyName());
			ps.setString(3, jobModel.getJobLocation());
			ps.setString(4, jobModel.getJobCategory());
			ps.setString(5, jobModel.getJobStatus());
			ps.setString(6, jobModel.getJobLastDate());
			ps.setString(7, jobModel.getJobDescription());
			ps.setInt(8, jobModel.getPostedBy());
			ps.setInt(9, jobModel.getApplicantId());
			
			int result = ps.executeUpdate();
			if(result>0)
			{
				flag= true;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
				connectionObj.close();
		}
		return flag;
	}
	
	public List<JobPostModel> getAllJobs() throws SQLException
	{
		List<JobPostModel> jobsList = new ArrayList<JobPostModel>();
		JobPostModel jobModel; 
		try
		{
			connectionObj = DatabaseConnection.getConnection();
			PreparedStatement ps = connectionObj.prepareStatement(DatabaseQueries.query_getAllJobs);
			resultSet = ps.executeQuery();
			
			while(resultSet.next())
			{
				jobModel = new JobPostModel();
				jobModel.setJobTitle(resultSet.getString("JobTitle"));
				jobModel.setCompanyName(resultSet.getString("Company"));
				jobModel.setJobLocation(resultSet.getString("JobLocation"));
				jobModel.setJobCategory(resultSet.getString("JobCategory"));
				jobModel.setJobLastDate(resultSet.getString("JobLastDate"));
				jobModel.setJobStatus(resultSet.getString("JobStatus"));
				jobModel.setJobDescription(resultSet.getString("JobDescription"));
				jobModel.setCreatedOn(resultSet.getString("CreatedOn"));
				jobsList.add(jobModel);
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally 
		{
			if(connectionObj != null)
			{
				connectionObj.close();
			}
			if(resultSet != null)
			{
				resultSet.close();
			}
		}
		
		return jobsList;
	}
	
}
