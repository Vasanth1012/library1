package com.klef.jfsd.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.klef.jfsd.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{
  @Query("select e from 	User  e where username=?1 and password=?2")
  public User checkuserlogin(String uname,String pwd);
  
  @Query("select e from  User e where username=?1")
  public User viewuser(String uname);
  
  @Transactional
  @Modifying
  @Query("update User e set e.password=?1 where e.password=?2 and e.username=?3")
  public int updateuserpassword(String empnewpwd,String empoldpwd,String empuname);
}