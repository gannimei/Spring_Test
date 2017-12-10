package com.netease.Spring_Mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface MybatisDao {

	@Select("select * from user where id=#{userId}")
	public User getUser(int userId);
	
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "firstName", column = "first_name"),
		@Result(property = "lastName", column = "last_name")
	})
	@Select("select * from user")
	public List<User> getUsers();
	
}
