package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class edit_005fcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

            try {
                String id_customer = request.getParameter("id_customer");
                String nama_customer = request.getParameter("nama_customer");
                String alamat_customer = request.getParameter("alamat_customer");
                String email_customer = request.getParameter("email_customer");
                String Host = "jdbc:mysql://localhost:3306/projekwpw";
                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Host, "root", "");
                statement = connection.createStatement();
                String Data = "select * from customer where id_customer=" + id_customer;
                rs = statement.executeQuery(Data);
                while (rs.next()) {

        
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Data Customer</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=PT+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            html{\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("              margin: 0;\n");
      out.write("              font-family: \"Lato\", sans-serif;\n");
      out.write("              background: rgb(255, 255, 255);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar {\n");
      out.write("              margin-top: -20px;\n");
      out.write("              padding: 10px;\n");
      out.write("              width: 270px;\n");
      out.write("              background-image: url(photo/daun.png);\n");
      out.write("              position:fixed;\n");
      out.write("              height: 100%;\n");
      out.write("              overflow: auto;\n");
      out.write("              border-bottom: rgb(255, 255, 255);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a {\n");
      out.write("              display: block;\n");
      out.write("              color: rgb(255, 255, 255);\n");
      out.write("              padding: 16px;\n");
      out.write("              text-decoration: none;\n");
      out.write("              font-family: 'PT Sans', sans-serif;\n");
      out.write("              letter-spacing: 2px;\n");
      out.write("              font-size: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a.active {\n");
      out.write("              background-color: #04AA6D;\n");
      out.write("              color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a:hover:not(.active) {\n");
      out.write("              background-color: #555;\n");
      out.write("              color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content {\n");
      out.write("              margin-left: 300px;\n");
      out.write("              margin-bottom: 20px;\n");
      out.write("              margin-top: 20px;\n");
      out.write("              margin-right: 30px;\n");
      out.write("              padding: 10px 16px;\n");
      out.write("              height: 680px;\n");
      out.write("              background-color: #F7F7F7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 700px) {\n");
      out.write("              .sidebar {\n");
      out.write("                width: 100%;\n");
      out.write("                height: auto;\n");
      out.write("                position:absolute;\n");
      out.write("              }\n");
      out.write("              .sidebar a {float: left;}\n");
      out.write("              .content {margin-left: 0;}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 400px) {\n");
      out.write("              .sidebar a {\n");
      out.write("                text-align: center;\n");
      out.write("                float: none;\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image_profile{\n");
      out.write("              width: 80px;\n");
      out.write("              border-radius: 50px;\n");
      out.write("              margin-top: -22px;\n");
      out.write("            }\n");
      out.write("            .topnav {\n");
      out.write("                margin-top: 0px;\n");
      out.write("                background-color: rgba(255, 255, 255, 0);\n");
      out.write("              }\n");
      out.write("              #container-1{\n");
      out.write("                width: 700px;\n");
      out.write("                height: 390px;\n");
      out.write("                background-color: rgb(255, 255, 255);\n");
      out.write("                border-radius: 20px;\n");
      out.write("                margin: 20px;\n");
      out.write("                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;\n");
      out.write("                margin-left: 200px;\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            .table-content{\n");
      out.write("                margin: 20px;\n");
      out.write("               font-family: 'PT Sans', sans-serif;\n");
      out.write("               width: 650px;\n");
      out.write("               font-size: 20px;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                padding: 12px 15px;\n");
      out.write("            }\n");
      out.write("            tr{\n");
      out.write("                border-bottom: 1px solid #dddddd;\n");
      out.write("            }\n");
      out.write("            tr:last-of-type{\n");
      out.write("                border-bottom: none;\n");
      out.write("            }\n");
      out.write("            .table-content input[type=text]{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 40px;\n");
      out.write("                \n");
      out.write("              }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"sidebar\">\n");
      out.write("    <center>\n");
      out.write("      <h2 style=\"color: white; font-family: 'PT Sans', sans-serif; font-weight: normal; font-size:24px; padding-top: 22px; padding-bottom: 7px;\">The Grow Room</h2>\n");
      out.write("      <hr style=\"color: #ffffff\">\n");
      out.write("      <br>\n");
      out.write("      <img src=\"photo/profile.jpg\" class=\"image_profile\" alt=\"\">\n");
      out.write("      <h4 style=\"margin-top: 29px ;color: white; font-family: 'PT Sans', sans-serif; letter-spacing: 2px; font-size: large; font-weight: lighter; \">Admin</h4>\n");
      out.write("    </center>\n");
      out.write("    <hr style=\"color: #ffffff\">\n");
      out.write("    <br>\n");
      out.write("    <a href=\"Homepage.jsp\">Dashboard</a>\n");
      out.write("    <a class=\"active\" href=\"Datacustomer.jsp\"> Data Customer</a>\n");
      out.write("    <a href=\"DataTanaman.jsp\">Data Tanaman</a>\n");
      out.write("    <a href=\"Datatransaksi.jsp\">Data Transaksi</a>\n");
      out.write("    <a href=\"Ruangfeedback.jsp\">Ruang Feedback</a>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    <div class=\"content\">\n");
      out.write("      <div class=\"topnav\">\n");
      out.write("          <h2 style=\" display: inline-block; color: black; text-align: left; font-size: 25px; font-family: 'PT Sans', sans-serif; margin-top: 20px\">Data Customer</h2>\n");
      out.write("      </div>\n");
      out.write("      <br>       \n");
      out.write("      \n");
      out.write("      <div id=\"container-1\">\n");
      out.write("          <h3 style=\"margin: 15px; padding-top: 25px; font-size: 20px; font-family:'PT Sans', sans-serif; font-weight: bold\">Edit Data Customer</h3>\n");
      out.write("             <form action=\"olahedit_kurikulum.jsp\" method=\"post\">\n");
      out.write("            <table class=\"table-content\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Id customer</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"id_customer\" value=\"");
      out.print(rs.getString("id_customer"));
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama Customer</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nama_customer\" value=\"");
      out.print(rs.getString("nama_customer"));
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Alamat Customer</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"alamat_customer\" value=\"");
      out.print(rs.getString("alamat_customer"));
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email </td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email_customer\" value=\"");
      out.print(rs.getString("email_customer"));
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\"><input type=\"submit\" class=\"btn btn-success\" name=\"update\" style=\"float: right\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                 ");
 }
                        rs.close();
                        statement.close();
                        connection.close();

                    } catch (SQLException e) {
                        out.println("can't connect to database. with error = " + e.getMessage());
                    }
                
      out.write("\n");
      out.write("        </form>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("  </div> \n");
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
