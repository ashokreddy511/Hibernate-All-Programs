package com.find.num;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindNumber {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs=null;
	
	String username="Gopal";
	
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ashok","ashok123");
	st=con.prepareStatement("select empname from employee where empname= ?");
	st.setString(1,username);
	rs=st.executeQuery();
	
	while(rs.next()){
		if(username.equals(rs.getString("empname"))){
			System.out.println(username+"  is available");
		}else{
			System.out.println(username+"  is nt there");
		}
	}
	
	}
}
