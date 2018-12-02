package Modelpack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhuvnesh Sharma
 */
public class LoginDao {
    public static boolean validate(String name,String pwd){  
boolean status=false;
 String u = new String();
         String q=new String();
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyberdb?useSSL=false","root","Bhuvnesh@01");  
  String sql="select * from user where name=? and password=?";    
PreparedStatement ps=con.prepareStatement(sql);  
ps.setString(1, name);
ps.setString(2, pwd);
System.out.print(u+" "+q);
ResultSet rs=ps.executeQuery();
status=rs.next();
}
        catch(Exception e){ System.out.println(e);} 
      return status;  
  
}
}
