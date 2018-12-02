/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bhuvnesh Sharma
 */
public class jConnect {
   private jConnect(){
}
   static Connection con;
   public static Connection connectIt(){
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyberdb?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true");
       
   }
   catch(Exception e){
       System.out.println(e);
   }
       return con;
}
}