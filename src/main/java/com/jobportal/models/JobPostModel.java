package com.jobportal.models;

public class JobPostModel
{
	private int id;
	private String jobTitle;
	private String companyName;
	private String jobLocation;
	private String jobCategory;
	private String jobStatus;
	private String jobLastDate;
	private String jobDescription;
	private String createdOn;
	private String updatedOn;
	private int postedBy;
	private int applicantId;
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @return the jobTitle
	 */
	public String getJobTitle()
	{
		return jobTitle;
	}
	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName()
	{
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	/**
	 * @return the jobLocation
	 */
	public String getJobLocation()
	{
		return jobLocation;
	}
	/**
	 * @param jobLocation the jobLocation to set
	 */
	public void setJobLocation(String jobLocation)
	{
		this.jobLocation = jobLocation;
	}
	/**
	 * @return the jobCategory
	 */
	public String getJobCategory()
	{
		return jobCategory;
	}
	/**
	 * @param jobCategory the jobCategory to set
	 */
	public void setJobCategory(String jobCategory)
	{
		this.jobCategory = jobCategory;
	}
	/**
	 * @return the jobStatus
	 */
	public String getJobStatus()
	{
		return jobStatus;
	}
	/**
	 * @param jobStatus the jobStatus to set
	 */
	public void setJobStatus(String jobStatus)
	{
		this.jobStatus = jobStatus;
	}
	/**
	 * @return the jobLastDate
	 */
	public String getJobLastDate()
	{
		return jobLastDate;
	}
	/**
	 * @param jobLastDate the jobLastDate to set
	 */
	public void setJobLastDate(String jobLastDate)
	{
		this.jobLastDate = jobLastDate;
	}
	/**
	 * @return the jobDescription
	 */
	public String getJobDescription()
	{
		return jobDescription;
	}
	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription)
	{
		this.jobDescription = jobDescription;
	}
	/**
	 * @return the createdOn
	 */
	public String getCreatedOn()
	{
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(String createdOn)
	{
		this.createdOn = createdOn;
	}
	/**
	 * @return the updatedOn
	 */
	public String getUpdatedOn()
	{
		return updatedOn;
	}
	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(String updatedOn)
	{
		this.updatedOn = updatedOn;
	}
	/**
	 * @return the postedBy
	 */
	public int getPostedBy()
	{
		return postedBy;
	}
	/**
	 * @param postedBy the postedBy to set
	 */
	public void setPostedBy(int postedBy)
	{
		this.postedBy = postedBy;
	}
	/**
	 * @return the applicantId
	 */
	public int getApplicantId()
	{
		return applicantId;
	}
	/**
	 * @param applicantId the applicantId to set
	 */
	public void setApplicantId(int applicantId)
	{
		this.applicantId = applicantId;
	}
}
