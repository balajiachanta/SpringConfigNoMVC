package com.bala;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class DBTest {

	@Autowired
	private DataSource dataSource;
	
	@Transactional
	public void getData() throws SQLException{
		
		Connection con = dataSource.getConnection();
		ResultSet rs =con.createStatement().executeQuery("select * from *****");
		if(rs.next()){
			System.out.println("yup");
		}
		
	}

}
