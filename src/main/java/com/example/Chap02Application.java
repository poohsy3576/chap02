package com.example;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mapper.DeptMapper;


@SpringBootApplication
public class Chap02Application implements CommandLineRunner{

	@Inject
	DataSource ds;
	
	public static void main(String[] args) {
//		SpringApplication.run(Chap02Application.class, args);
		SpringApplication application = new SpringApplication(Chap02Application.class);
//		application.setAdditionalProfiles("mysql");
//		application.setAdditionalProfiles("mysql-ec2");
		application.setAdditionalProfiles("oracle");
		application.run(args);
	}

//	@Inject
//	DeptMapper deptmapper;
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("###");
		System.out.println("### " + ds);
//		System.out.println("###" + ds.getDriverClassName());
//		System.out.println("###" + ds.getUrl());
		System.out.println("###");
	}
}
