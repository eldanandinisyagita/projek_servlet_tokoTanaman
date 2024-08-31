package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class DataTanaman_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String host = "jdbc:mysql://localhost:3306/projekwpw";
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select*from tanaman";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
    

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
      out.write("              height: 1200px;\n");
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
      out.write("\n");
      out.write("              td{\n");
      out.write("                padding: 12px 15px;\n");
      out.write("            }\n");
      out.write("            tr{\n");
      out.write("                border-bottom: 1px solid #dddddd;\n");
      out.write("            }\n");
      out.write("            tr:last-of-type{\n");
      out.write("                border-bottom: 2px solid #dddddd;\n");
      out.write("            }\n");
      out.write("            .table-content{\n");
      out.write("                border-radius: 5px 5px 0 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                box-shadow: 1px 1px 5px #949494;\n");
      out.write("                background-color: white;\n");
      out.write("                font-family: 'PT Sans', sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("            .form-popup {\n");
      out.write("                display:none;\n");
      out.write("                position:absolute;\n");
      out.write("                margin-top: -80px;\n");
      out.write("                margin-left: -350px;\n");
      out.write("                border: 3px solid #c5c5c5;\n");
      out.write("                z-index: 9;\n");
      out.write("                font-family:'PT Mono', sans-serif;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              /* Add styles to the form container */\n");
      out.write("              .form-container {\n");
      out.write("                width: 800px;\n");
      out.write("                height: 520px;\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: white;\n");
      out.write("\n");
      out.write("\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              /* Full-width input fields */\n");
      out.write("              .form-container input[type=text]{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 30px;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 5px 0 22px 0;\n");
      out.write("                border: none;\n");
      out.write("                background: #f1f1f1;\n");
      out.write("                \n");
      out.write("              }\n");
      out.write("\n");
      out.write("              /* When the inputs get focus, do something */\n");
      out.write("              .form-container input[type=text]:focus {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                outline: none;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              /* Set a style for the submit/login button */\n");
      out.write("              .form-container .btn {\n");
      out.write("                background-color: #04AA6D;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 20%;\n");
      out.write("                height: 40px;\n");
      out.write("                margin-bottom:10px;\n");
      out.write("                opacity: 0.8;\n");
      out.write("                display: inline-block;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              /* Add a red background color to the cancel button */\n");
      out.write("              .form-container .cancel {\n");
      out.write("                background-color: red;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              /* Add some hover effects to buttons */\n");
      out.write("              .form-container .btn:hover, .open-button:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("              }\n");
      out.write("           \n");
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
      out.write("    <a href=\"Datacustomer.jsp\"> Data Customer</a>\n");
      out.write("    <a class=\"active\" href=\"DataTanaman.jsp\">Data Tanaman</a>\n");
      out.write("    <a href=\"Datatransaksi.jsp\">Data Transaksi</a>\n");
      out.write("    <a href=\"Ruangfeedback.jsp\">Ruang Feedback</a>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"content\">\n");
      out.write("      <div class=\"topnav\">\n");
      out.write("          <h2 style=\" display: inline-block; color: black; text-align: left; font-size: 25px; font-family: 'PT Sans', sans-serif; margin-top: 20px\">Data Tanaman</h2>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      <table width=\"1100px\" style=\"\" class=\"table-content\">\n");
      out.write("          <tr>\n");
      out.write("              <th colspan=\"3\" style=\"height: 70px; background-color: #ebebeb\">\n");
      out.write("                  <div class=\"container-fluid\">\n");
      out.write("                      <form class=\"d-flex\" action=\"Search_tanaman.jsp\" method=\"POST\">\n");
      out.write("                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" style=\"width: 300px;\">\n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                  </div>  \n");
      out.write("              </th>\n");
      out.write("              <th colspan=\"4\" style=\"height: 70px; background-color: #ebebeb\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-dark\" style=\"float: right; margin-right: 20px\" onclick=\"openForm()\">add</button>\n");
      out.write("        \n");
      out.write("            <div class=\"form-popup\" id=\"myForm\">\n");
      out.write("              <form action=\"add_tanaman.jsp\" method=\"post\" class=\"form-container\">\n");
      out.write("                <h2>Tambah Customer</h2>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"kode_tanaman\"><b>Kode Tanaman</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Kode Tanaman\" name=\"kode_tanaman\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"gambar_tanaman\"><b>Gambar Tanaman</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Gambar Tanaman\" name=\"gambar_tanaman\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"nama_tanaman\"><b>Nama Tanaman</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Nama Tanaman\" name=\"nama_tanaman\" required>\n");
      out.write("\n");
      out.write("                <label for=\"harga_tanaman\"><b>Harga Tanaman</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Harga Tanaman\" name=\"harga_tanaman\" required>\n");
      out.write("                \n");
      out.write("                <label for=\"stok_tanaman\"><b>Stok Tanaman</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Stok Tanaman\" name=\"stok_tanaman\" required>\n");
      out.write("                \n");
      out.write("                <label for=\"harga_tanaman\"><b>Harga Tanaman</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Keterangan\" name=\"keterangan\" required>\n");
      out.write("\n");
      out.write("                <button type=\"button\" class=\"btn cancel\" onclick=\"closeForm()\" style=\"float: left;\">Close</button>\n");
      out.write("                <button type=\"submit\" name=\"submit\" class=\"btn\" style=\"float: right;\">Add</button>\n");
      out.write("\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("              </th>\n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <tr style=\"text-align: left; font-weight: bold\">\n");
      out.write("                <td width=\"50px\">Kode</td>\n");
      out.write("                <td width=\"100px\">Gambar </td>\n");
      out.write("                <td width=\"120px\">Nama </td>\n");
      out.write("                <td width=\"100px\">Harga </td>\n");
      out.write("                <td width=\"80px\">Stok </td>\n");
      out.write("                <td width=\"260px\">Keterangan</td>\n");
      out.write("                <td width=\"160px\" style=\"text-align: center;\"> Aksi </td>\n");
      out.write("           </tr>\n");
      out.write("           ");
 while (rs.next()){
      out.write("\n");
      out.write("           <tr>\n");
      out.write("               <td> ");
      out.print(rs.getString("kode_tanaman"));
      out.write(" </td>\n");
      out.write("               <td> <img src=\"photo/");
      out.print(rs.getString("gambar_tanaman"));
      out.write("\" width=\"100px\"> </td>\n");
      out.write("               <td> ");
      out.print(rs.getString("nama_tanaman"));
      out.write(" </td>\n");
      out.write("               <td> ");
      out.print(rs.getString("harga_tanaman"));
      out.write(" </td>\n");
      out.write("               <td> ");
      out.print(rs.getString("stok_tanaman"));
      out.write(" </td>\n");
      out.write("               <td> ");
      out.print(rs.getString("keterangan"));
      out.write(" </td>\n");
      out.write("               <td><a href=\"edit_tanaman.jsp?kode_tanaman=");
      out.print(rs.getString("kode_tanaman"));
      out.write("\" class=\"btn btn-primary\"> edit</a>\n");
      out.write("                   \n");
      out.write("                   <a href=\"delete_tanaman.jsp?kode_tanaman=");
      out.print(rs.getString("kode_tanaman"));
      out.write("\" class=\"btn btn-danger\"> delete</a>\n");
      out.write("               </td>\n");
      out.write("               \n");
      out.write("           </tr>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("    ");

        rs.close();
        stmt.close();
        conn.close();
        }
catch(SQLException ex){
out.print("Gagal koneksi");
}
catch(Exception ex){
out.print(ex.getMessage());
}
    
      out.write("\n");
      out.write("     \n");
      out.write("  </div> \n");
      out.write("     <script>\n");
      out.write("      function openForm() {\n");
      out.write("        document.getElementById(\"myForm\").style.display = \"block\";\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      function closeForm() {\n");
      out.write("        document.getElementById(\"myForm\").style.display = \"none\";\n");
      out.write("      }\n");
      out.write("      </script>\n");
      out.write("     \n");
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
