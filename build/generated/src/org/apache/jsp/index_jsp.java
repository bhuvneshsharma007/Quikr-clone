package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.PrintWriter;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>QUICKR CLONE </title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"helper.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"accordion.css\">\n");
      out.write("         \n");
      out.write("\t<style>\n");
      out.write(" \n");
      out.write("\t\t\tul {\n");
      out.write("\t\t\t\tlist-style-type: none;\n");
      out.write("\t\t\t\tmargin: 0;\n");
      out.write("\t\t\t\tpadding: 0;\n");
      out.write("\t\t\t\toverflow: hidden;\n");
      out.write("\t\t\t\tbackground-color: indigo;\n");
      out.write("\t\t\t\theight:100px;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tli {\n");
      out.write("\t\t\t\tfloat: left;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tli a {\n");
      out.write("\t\t\t\tdisplay: block;\n");
      out.write("\t\t\t\tcolor: white;\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\tpadding: 14px 16px;\n");
      out.write("\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tli a:hover:not(.active) {\n");
      out.write("\t\t\t\tbackground-color: #111;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.active {\n");
      out.write("\t\t\t\tbackground-color: #09235C;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t/*#postanad{background-color: ;}*/\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\ttable {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                width: 25%;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                height: 100%;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("\t\t\ttd a {\n");
      out.write("    display: block;\n");
      out.write("    color: #000;\n");
      out.write("    padding: 8px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("td a.active {\n");
      out.write("    background-color: #09235C;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td a:hover:not(.active) {\n");
      out.write("    background-color: greenyellow;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("\t   background: url(logi.jpg);\n");
      out.write("           \n");
      out.write("}        \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("\t\t\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t  <li><a class=\"active\" href=\"#home\">Home</a></li>\n");
      out.write("\t\t  <li><a href=\"login1.html\">Login</a></li>\n");
      out.write("\t\t  <li style=\"float:right\"><a href=\"#about\">About</a></li>\n");
      out.write("\t\t  <li style=\"float:right\"><a href=web1.html>Contact</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t<div id=\"titleborder\">\n");
      out.write("\t\t<h1 style=\"display:inline\">QUCOKR - </h1><h4 style=\"display:inline\">An Online Buying and Selling Platform.!</h4>\n");
      out.write("\t\t<form style = \"display: inline;float:right;margin:20px;\" method=\"get\">\n");
      out.write("\t\t\t\t <a href=\"post.html \" style=\"text-decoration:none;font-weight: bold;font-size:20px;\">Post An Ad</a>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"indexcontentborder\">\n");
      out.write("\t<script src=\"accordion.js\">\n");
      out.write("\t</script>\t\n");
      out.write("\t<br>\n");
      out.write("\t<hr>\t\n");
      out.write("        <div>\t\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t\t<tr><td><a class=\"active\" href=\"#home\"><h3>Categories</h3></a></td></tr>\n");
      out.write("\t\t\t\t<tr><td><a href=\"catogery.html\"><h4>Moblies</h4></a></td></tr>\n");
      out.write("\t\t\t\n");
      out.write("                                  \n");
      out.write("\t\t\t\t<tr><td><a href=\"catogery.html\"><h4> Eletronic and application</h4></a></td></tr>\n");
      out.write("\t\t\t\t<tr><td><a href=\"catogery.html\"><h4>Cars</h4></a></td></tr>\n");
      out.write("\t\t\t\t<tr><td><a href=\"catogery.html\"><h4>Bikes</h4></a></td></tr>\n");
      out.write("\t\t\t\t<tr><td><a href=\"catogery.html\"><h4>Furniture</h4></a></td></tr>\n");
      out.write("                                <tr><td><a href=\"catogery.html\"><h4>Pets</h4></a></td></tr>\n");
      out.write("                                <tr><td><a href=\"catogery.html\"><h4>book & sports </h4></a></td></tr>\n");
      out.write("                                <tr><td><a href=\"catogery.html\"><h4>Faishon </h4></a></td></tr>\n");
      out.write("                                <tr><td><a href=\"catogery.html\"><h4>Servieces </h4></a></td></tr>\n");
      out.write("                                <tr><td><a href=\"catogery.html\"><h4>Jobs </h4></a></td></tr>\n");
      out.write("                                <tr><td><a href=\"catogery.html\"><h4>RealEstates </h4></a></td></tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("    <table>\n");
      out.write("        <tr> ");

    Connection conn;
    Statement ps;
    ResultSet rs=null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyberdb?user=root&password=Bhuvnesh@01&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true");
     try {
         String str="select * from postad ";
         ps=conn.createStatement();
         rs=ps.executeQuery(str);
         while(rs.next())
         {
          
 
      out.write("\n");
      out.write(" <td>");
 rs.getString("title"); 
      out.write("</td><br>\n");
      out.write("   <td>");
rs.getString("disk"); 
      out.write("</td></tr>\n");
      out.write("      ");

         }
     }
     catch(Exception e)
     {
         out.println(e);
     }
    
      out.write("\n");
      out.write("    </table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
