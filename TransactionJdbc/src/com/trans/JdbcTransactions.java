package com.trans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTransactions {
	private static int acctno;
	private static int accotno;
	private static int bal;
public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	boolean flag=false;
	 	try {
		System.out.println("enter Source account no:");
		acctno = Integer.parseInt(br.readLine());
		System.out.println("enter the amount");
		bal=Integer.parseInt(br.readLine());
		System.out.println("enter the dissignation account no:");
		accotno=Integer.parseInt(br.readLine());
		
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Connection con=null;
	PreparedStatement ps=null;
	PreparedStatement ps1=null;
	String qry="";
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ashok","ashok123");
		con.setAutoCommit(false);
		qry="update paccount set balance=balance-"+bal+ "where accno= ?";
		ps=con.prepareStatement(qry);
		ps.setInt(1,acctno);
		int t=ps.executeUpdate();
		qry="update paccount set balance=balance+"+bal+ "where accno= ?";
		ps1=con.prepareStatement(qry);
		ps1.setInt(1,accotno);
		int t1=ps1.executeUpdate();
		flag=true;
		
	}catch(SQLException|ClassNotFoundException e){
		e.printStackTrace();
		
	}finally{
		if(con!=null){
			if(flag==true){
				try {
					con.commit();
						System.out.println("ur transaction is successfull");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				try {
					con.rollback();
					System.out.println("ur transaction is not successfull");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
}
