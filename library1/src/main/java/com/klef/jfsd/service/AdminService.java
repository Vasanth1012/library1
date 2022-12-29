package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Admin;
import com.klef.jfsd.model.User;

public interface AdminService
{
  public Admin checkadminlogin(String uname,String pwd);
  public List<User> viewallusers();
  public void deleteuser(int id);
  public User viewuserbyid(int id);
}