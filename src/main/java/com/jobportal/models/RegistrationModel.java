package com.jobportal.models;

public class RegistrationModel
{
	private int id;
	private String name;
	private String email;
	private String password;
	private String role;
	private String createdOn;
	private String updatedOn;
	
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
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public String getRole()
	{
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role)
	{
		this.role = role;
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
	
}
