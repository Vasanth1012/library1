package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Admin;
import com.klef.jfsd.model.User;
import com.klef.jfsd.repository.AdminRepository;
import com.klef.jfsd.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService
{
  @Autowired
  private AdminRepository adminRepository;
  
  @Autowired
  private UserRepository userRepository;
  
  @Override
  public Admin checkadminlogin(String uname, String pwd) 
  {
    return adminRepository.checkadnminlogin(uname, pwd);
  }

  @Override
  public List<User> viewallusers() 
  {
    return (List<User>) userRepository.findAll();
  }

  @Override
  public void deleteuser(int id)
  {
    userRepository.deleteById(id);
    
  }

  @Override
  public User viewuserbyid(int id)
  {
    return userRepository.findById(id).get();
  }
}