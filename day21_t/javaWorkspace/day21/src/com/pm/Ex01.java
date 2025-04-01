package com.pm;

import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {

	public static void main(String[] args) {
//		String sql="insert into dept (deptno,dname,loc) values (70,'�μ�7','����')";
//		String sql="update dept set loc='�λ�' where deptno=60";
//		String sql="delete from dept where deptno=60";
		String sql="create table lec99(num number,name varchar2(3))";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		java.util.Properties props=new Properties();
		props.setProperty("user", "scott");
		props.setProperty("password", "tiger");
		
		OracleDriver driver=new OracleDriver();
		java.sql.Connection conn=null;
		java.sql.Statement stmt=null;
		try {
			conn=java.sql.DriverManager.getConnection(url,props);
			stmt=conn.createStatement();
			stmt.execute(sql);
			System.out.println("�Է¼���");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}








