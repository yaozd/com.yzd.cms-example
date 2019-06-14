package com.zhiliao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
public class CmsApplication {
	/**
	 * http://localhost:2380/admin/login
	 * @param args
	 */
	public static void main(String[] args){
		SpringApplication.run(CmsApplication.class, args);
	}
}