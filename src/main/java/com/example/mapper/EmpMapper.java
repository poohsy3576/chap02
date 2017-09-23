package com.example.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Emp;

@Mapper
public interface EmpMapper {

	@Select("select * from emp")		// JPA는 이거마저 없어.
	public List<Emp> selectAll();
	
}
