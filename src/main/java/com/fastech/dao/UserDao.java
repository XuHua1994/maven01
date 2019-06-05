package com.fastech.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.fastech.model.User;
@MapperScan
public interface UserDao {
	
	User selectByPrimaryKey(@Param("userId") int userId);

	
}
