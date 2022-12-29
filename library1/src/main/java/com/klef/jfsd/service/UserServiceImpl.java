package com.klef.jfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.User;
import com.klef.jfsd.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
  @Autowired
  private UserRepository userRepository;

  @Override
  public User adduser(User user)
  {
    return userRepository.save(user);
    
  }

  @Override
  public User checkuserlogin(String uname, String pwd) 
  {
    return userRepository.checkuserlogin(uname, pwd);
  }

  @Override
  public User viewuser(String uname) 
  {
    
    return userRepository.viewuser(uname);
  }

  @Override
  public int changeuserpassword(String useroldpwd, String usernewpwd, String euname)
  {
    return userRepository.updateuserpassword(usernewpwd, useroldpwd, euname);
  }
}