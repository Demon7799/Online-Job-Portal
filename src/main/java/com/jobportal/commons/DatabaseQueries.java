package com.jobportal.commons;

public class DatabaseQueries
{
	// to add new job post
	public static String query_addJobPost = "INSERT into dbo.'Jobs' ('JobTitle','Company','JobLocation','JobCategory','JobStatus','JobLastDate','JobDescription','PostedBy') values (?,?,?,?,?,?,?,?)";

	//to get all jobs
	public static String query_getAllJobs = "select * from dbo.\"Jobs\" ";
}
