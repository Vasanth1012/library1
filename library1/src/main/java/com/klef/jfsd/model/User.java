package com.klef.jfsd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	@Id
	  @GeneratedValue
	   private int id;
	  @Column(nullable = false,length = 200)
	   private String name;
	  @Column(nullable = false,length = 10)
	  private String department;
	  @Column(nullable = false,length = 200)
	  private String emailid;
	  @Column(nullable = false,unique = true,length = 200)
	   private String username;
	  @Column(nullable = false,length = 200)
	   private String password;
	  @Column(nullable = false,length = 200)
	  private String contactno;
	   
	public String getUsername() {
	  return username;
	}
	public void setUsername(String username) {
	  this.username = username;
	}
	public String getPassword() {
	  return password;
	}
	public void setPassword(String password) {
	  this.password = password;
	}
	public int getId() {
	  return id;
	}
	public void setId(int id) {
	  this.id = id;
	}
	public String getName() {
	  return name;
	}
	public void setName(String name) {
	  this.name = name;
	}

	public String getContactno() {
	  return contactno;
	}
	public void setContactno(String contactno) {
	  this.contactno = contactno;
	}
	public String getDepartment() {
	  return department;
	}
	public void setDepartment(String department) {
	  this.department = department;
	}
	public String getEmailid() {
	  return emailid;
	}
	public void setEmailid(String emailid) {
	  this.emailid = emailid;
	}
	@Override
	public String toString() {
	  return "User [id=" + id + ", name=" + name + ", department=" + department + ",  emailid=" + emailid + ", username=" + username + ", password=" + password + ", contactno="
	      + contactno + "]";
	}
}
