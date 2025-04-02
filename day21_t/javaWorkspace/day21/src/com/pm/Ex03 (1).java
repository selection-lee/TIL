package com.pm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Ex03 {

	public static void main(String[] args) {
		// �л��������� ���α׷�(ver 0.20.0)
		// 1.���� 2.�Է� [3.���� 4.����] 0.����>
		ArrayList<Integer> list=new ArrayList<>();
		String sql="select num from stu01";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Properties props=new Properties();
		props.setProperty("user", "scott");
		props.setProperty("password", "tiger");

		Connection conn=null;
		Statement stmt=null;
		java.sql.ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, props);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(Integer.parseInt(rs.getObject(1).toString()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�л��������� ���α׷�(ver 0.20.0)");
		Scanner sc=new Scanner(System.in);
		String input=null;
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer before, Integer after) {
				return after-before;
			}
		});
		int cnt=0;
		if(list.isEmpty())cnt=20250000;
		else cnt=list.get(0);
		while(true) {
			System.out.print("1.���� 2.�Է� [3.���� 4.����] 0.����> ");
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("-------------------------------------------");
				System.out.println("�й�\t\t����\t����\t����");
				System.out.println("-------------------------------------------");
				
				sql="select num,kor,eng,math from stu01 order by num desc";

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection(url, props);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						System.out.print(rs.getObject(1)+"\t");
						System.out.print(rs.getObject(2)+"\t");
						System.out.print(rs.getObject(3)+"\t");
						System.out.println(rs.getObject(4));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					try {
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println("-------------------------------------------");
				
			}
			if(input.equals("2")) {
				int num=++cnt;
				System.out.print("����> ");
				int kor=Integer.parseInt(sc.nextLine());
				System.out.print("����> ");
				int eng=Integer.parseInt(sc.nextLine());
				System.out.print("����> ");
				int math=Integer.parseInt(sc.nextLine());
				
				sql="insert into stu01 (num,kor,eng,math) values ("
							+num+","+kor+","+eng+","+math+")";

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
	}

}

















