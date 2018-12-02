<%-- 
    Document   : index
    Created on : Nov 29, 2018, 10:12:57 PM
    Author     : Bhuvnesh Sharma
--%>

<%@page import="java.sql.Blob"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>QUICKR CLONE </title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="helper.css">
	<link rel="stylesheet" type="text/css" href="accordion.css">
         
	<style>
            .abc{
                float : right;
            }
			ul {
				list-style-type: none;
				margin: 0;
				padding: 0;
				overflow: hidden;
				background-color: indigo;
				height:100px;
			}

			
			li {
				float: left;
			}
			
			li a {
				display: block;
				color: white;
				text-align: center;
				padding: 14px 16px;
				text-decoration: none;
			}
			
			li a:hover:not(.active) {
				background-color: #111;
			}
			
			.active {
				background-color: #09235C;
			}
			/*#postanad{background-color: ;}*/


			table {
                list-style-type: none;
                margin: 0;
                padding: 0;
                width: 25%;
                background-color: #f1f1f1;
                height: 100%;
                overflow: auto;
            }
			td a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
}
td a.active {
    background-color: #09235C;
    color: white;
}

td a:hover:not(.active) {
    background-color: greenyellow;
    color: white;
}
body{
	   background: url(logi.jpg);
           
}        

</style>
</head>


   
		
		<ul>
		  <li><a class="active" href="#home">Home</a></li>
		  <li><a href="login1.html">Login</a></li>
		  <li style="float:right"><a href="#about">About</a></li>
		  <li style="float:right"><a href=web1.html>Contact</a></li>
		</ul>
		
	<div id="titleborder">
		<h1 style="display:inline">QUCOKR - </h1><h4 style="display:inline">An Online Buying and Selling Platform.!</h4>
		<form style = "display: inline;float:right;margin:20px;" method="get">
				 <a href="post.html " style="text-decoration:none;font-weight: bold;font-size:20px;">Post An Ad</a>
			</form>
	</div>

	<div id="indexcontentborder">
	<script src="accordion.js">
	</script>	
	<br>
	<hr>	
        <div>	
		<table>
				<tr><td><a class="active" href="#home"><h3>Categories</h3></a></td></tr>
				<tr><td><a href="catogery.html"><h4>Mobiles</h4></a></td></tr>
			
                                  
				<tr><td><a href="catogery.html"><h4> Electronic and application</h4></a></td></tr>
				<tr><td><a href="catogery.html"><h4>Cars</h4></a></td></tr>
				<tr><td><a href="catogery.html"><h4>Bikes</h4></a></td></tr>
				<tr><td><a href="catogery.html"><h4>Furniture</h4></a></td></tr>
                                <tr><td><a href="catogery.html"><h4>Pets</h4></a></td></tr>
                                <tr><td><a href="catogery.html"><h4>book & sports </h4></a></td></tr>
                                <tr><td><a href="catogery.html"><h4>Fashion </h4></a></td></tr>
                                <tr><td><a href="catogery.html"><h4>Services </h4></a></td></tr>
                                <tr><td><a href="catogery.html"><h4>Jobs </h4></a></td></tr>
                                <tr><td><a href="catogery.html"><h4>Real Estates </h4></a></td></tr>
		</table>
	
	</div>
    
        <% 
             String url="jdbc:mysql://localhost:3306/hyberdb?useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
            try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,"root","Bhuvnesh@01");
        String q = "Select * from postad where category = ?";
        PreparedStatement ps = conn.prepareStatement(q);
        ps.setString(1,"Cars");
        ResultSet rs = ps.executeQuery();
        //OutputStream os =response.getOutputStream();
        FileOutputStream fout = null;
        int i=1;
        while(rs.next()){
               Blob blob = rs.getBlob(6);
               byte byteArray[] = blob.getBytes(1,(int)blob.length());
             fout=new FileOutputStream("C:/Users/Bhuvnesh Sharma/Documents/NetBeansProjects/quickrclone/web/imgs/img"+i+".jpg"); 
             fout.write(byteArray); 
              String title = rs.getString(1);
              String disk = rs.getString(2);
              int price = rs.getInt(8);
              %>
              <table>
              <tr><td><% out.println(title);%></td><br>
   <td><%=disk %></td><br>
   <td><img src=<%="C:/Users/Bhuvnesh Sharma/Documents/NetBeansProjects/quickrclone/web/imgs/img"+i+".jpg"%>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
        </table>
     <%
            //session.setAttribute("userId"+i+"", ref);
            System.out.print(title);
              i++;
            }
        fout.close();
          }
         catch(Exception e){
            System.out.print(e);
         }
        %>

