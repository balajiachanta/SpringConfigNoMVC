package com.bala;

import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.bala")
public class AppConfig {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Arrays.asList(ctx.getBeanDefinitionNames()).forEach( n -> System.out.println(n));
		DBTest db = (DBTest)ctx.getBean("DBTest");
		db.getData();
		  
	}

}
