package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Dashboard</title>\n");
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
      out.write("            .topnav .search-container {\n");
      out.write("              float: right;\n");
      out.write("              margin-top: 5px;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav input[type=text] {\n");
      out.write("              padding: 6px;\n");
      out.write("              margin-top: 8px;\n");
      out.write("              font-size: 17px;\n");
      out.write("              border: none;\n");
      out.write("              border-radius: 5px;\n");
      out.write("              height: 40px;\n");
      out.write("              width: 260px;\n");
      out.write("              background-color: #EFEFEF;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav .search-container button {\n");
      out.write("              float: right;\n");
      out.write("              padding: 6px 10px;\n");
      out.write("              margin-top: 8px;\n");
      out.write("              margin-right: 16px;\n");
      out.write("              background: #EFEFEF;\n");
      out.write("              font-size: 17px;\n");
      out.write("              cursor: pointer;\n");
      out.write("              border-radius: 5px;\n");
      out.write("              height: 40px;\n");
      out.write("              width: 41px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav .search-container button:hover {\n");
      out.write("              background: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("              .topnav .search-container {\n");
      out.write("                float: none;\n");
      out.write("              }\n");
      out.write("              .topnav input[type=text], .topnav .search-container button {\n");
      out.write("                float: none;\n");
      out.write("                display:inline-block;\n");
      out.write("                text-align: left;\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 14px;\n");
      out.write("              }\n");
      out.write("              .topnav input[type=text] {\n");
      out.write("                border: 1px solid #ccc;  \n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #container-1{\n");
      out.write("                width: 1080px;\n");
      out.write("                height: 530px;\n");
      out.write("                background-color: rgb(255, 255, 255);\n");
      out.write("                border-radius: 20px;\n");
      out.write("                margin: 20px;\n");
      out.write("                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #container-2{\n");
      out.write("                width: 400px;\n");
      out.write("                height: 400px;\n");
      out.write("                background: none;\n");
      out.write("                margin: 20px;\n");
      out.write("                margin-right: 40px;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .container-box-1{\n");
      out.write("                width: 400px;\n");
      out.write("                height: 400px;\n");
      out.write("                background-color: white;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;\n");
      out.write("            }\n");
      out.write("            #container-3{\n");
      out.write("                width: 630px;\n");
      out.write("                height: 400px;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .container-box-2{\n");
      out.write("                width: 630px;\n");
      out.write("                height: 400px;\n");
      out.write("                background-color: white;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .photo_customer{\n");
      out.write("                border-radius: 50%;\n");
      out.write("                box-shadow: 1px 1px 3px black, -1px -1px 3px black;\n");
      out.write("                margin: 5px;\n");
      out.write("            }\n");
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
      out.write("    <a class=\"active\" href=\"#dashboard\"><i class=\"fas fa-columns\"></i> Dashboard</a>\n");
      out.write("    <a href=\"Datacustomer.jsp\"> Data Customer</a>\n");
      out.write("    <a href=\"DataTanaman.jsp\">Data Tanaman</a>\n");
      out.write("    <a href=\"Datatransaksi.jsp\">Data Transaksi</a>\n");
      out.write("    <a href=\"Ruangfeedback.jsp\">Ruang Feedback</a>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"content\">\n");
      out.write("      <div class=\"topnav\">\n");
      out.write("          <h2 style=\" display: inline-block; color: black; text-align: left; font-size: 25px; font-family: 'PT Sans', sans-serif; margin-top: 20px\">Dashboard</h2>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("      ");

            try{
                String Host="jdbc:mysql://localhost:3306/projekwpw";
                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Host,"root", "");
                statement = connection.createStatement();
                String Data = "select * from tanaman";
                rs = statement.executeQuery(Data);
                
      out.write("\n");
      out.write("                \n");
      out.write("      <div id=\"container-1\">\n");
      out.write("          <h3 style=\"margin: 15px; padding-top: 25px; font-size: 20px; font-family:'PT Sans', sans-serif\">Data Tanaman</h3>\n");
      out.write("          ");
while (rs.next()){
      out.write("\n");
      out.write("          <div class=\"card\" style=\"width: 200px; margin: 15px; display: inline-block; margin-top: 5px\">\n");
      out.write("              <img src=\"photo/");
      out.print(rs.getString("gambar_tanaman"));
      out.write("\" class=\"card-img-top\" alt=\"...\" width=\"100px\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                  <p class=\"card-title\" style=\"font-family:'PT Sans', sans-serif; font-weight: bold\">");
      out.print(rs.getString("nama_tanaman"));
      out.write("</p>\n");
      out.write("                  <p class=\"card-text\" style=\"font-size: 15px; font-family:'PT Sans', sans-serif\"> <strong>Stock: </strong>");
      out.print(rs.getString("stok_tanaman"));
      out.write("</p>\n");
      out.write("                  <a href=\"detail_tanaman.jsp\" class=\"btn btn-success\">View Details</a>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("          <hr>\n");
      out.write("          <a href=\"DataTanaman.jsp\" style=\"text-align: center; text-decoration: none; color: black; margin-left: 880px;color: #436C56; font-weight: bold;\">Lihat Selengkapnya ...</a>\n");
      out.write("      </div>\n");
      out.write("          ");

              rs.close();
              statement.close();
              connection.close();
              } catch(SQLException e){
                   out.println("cant connect to database");
}
          
      out.write("\n");
      out.write("      <br>\n");
      out.write("      <div id=\"container-2\">\n");
      out.write("          ");

            try{
                String Host="jdbc:mysql://localhost:3306/projekwpw";
                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Host,"root", "");
                statement = connection.createStatement();
                String Data = "select c.gambar, c.nama_customer, f.tanggal_posting, f.isi_feedback from customer c, feedback f WHERE c.id_customer=f.id_customer";
                rs = statement.executeQuery(Data);
                
      out.write("\n");
      out.write("          <div class=\"container-box-1\">\n");
      out.write("              <h3 style=\"padding-top: 20px; padding-left: 20px; font-size: 20px; font-family:'PT Sans', sans-serif\">Feedback</h3>\n");
      out.write("              <center>\n");
      out.write("               ");
while (rs.next()){
      out.write("\n");
      out.write("              <img class=\"photo_customer\" src=\"photo/");
      out.print(rs.getString("c.gambar"));
      out.write("\" width=\"100px\">\n");
      out.write("              <p style=\"font-family:'PT Sans', sans-serif; font-weight: bold; font-size: 20px\">");
      out.print(rs.getString("c.nama_customer"));
      out.write("</p>\n");
      out.write("              <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"#436C56\" class=\"bi bi-star-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\n");
      out.write("</svg><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"#436C56\" class=\"bi bi-star-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\n");
      out.write("</svg><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"#436C56\" class=\"bi bi-star-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\n");
      out.write("</svg><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"#436C56\" class=\"bi bi-star-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\n");
      out.write("</svg><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"#436C56\" class=\"bi bi-star-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\n");
      out.write("</svg>\n");
      out.write("              <p style=\"font-family:'PT Sans', sans-serif; font-weight: normal\">");
      out.print(rs.getString("f.tanggal_posting"));
      out.write("</p>\n");
      out.write("              <p style=\"font-family:'PT Mono', sans-serif; font-weight:normal; font-size: 18px; margin-left: 10px; margin-right: 10px; \">\"");
      out.print(rs.getString("f.isi_feedback"));
      out.write("\"</p>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("              </center>\n");
      out.write("              <hr>\n");
      out.write("              <a href=\"Ruangfeedback.jsp\" style=\"text-align: center; text-decoration: none; color: black; margin-left: 200px; color: #436C56; font-weight: bold; \">Lihat Selengkapnya ...</a>\n");
      out.write("          </div>\n");
      out.write("          ");

              rs.close();
              statement.close();
              connection.close();
              } catch(SQLException e){
                   out.println("cant connect to database");
}
          
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <div id=\"container-3\" style=\"float: right; display: inline-block; margin-top: 120px; margin-right: 40px\">\n");
      out.write("          <div class=\"container-box-2\"style=\"margin-top: -100px;\" >\n");
      out.write("              <h3 style=\"padding-top: 20px; padding-left: 20px; font-size: 20px; font-family:'PT Sans', sans-serif\">Data Penjualan</h3>\n");
      out.write("              <canvas id=\"myChart\" style=\"width:100%;max-width:600px; margin-left: 20px\"></canvas>\n");
      out.write("              \n");
      out.write("              <script>\n");
      out.write("                var xValues = [\"T1\", \"T2\"];\n");
      out.write("                var yValues = [\"140000\", \"150000\", \"130000\", \"120000\", \"110000\", \"100000\", \"0\"];\n");
      out.write("                var barColors = [\"red\", \"green\"];\n");
      out.write("\n");
      out.write("                new Chart(\"myChart\", {\n");
      out.write("                  type: \"bar\",\n");
      out.write("                  data: {\n");
      out.write("                    labels: xValues,\n");
      out.write("                    datasets: [{\n");
      out.write("                      backgroundColor: barColors,\n");
      out.write("                      data: yValues\n");
      out.write("                    }]\n");
      out.write("                  },\n");
      out.write("                  options: {\n");
      out.write("                    legend: {display: false},\n");
      out.write("                    title: {\n");
      out.write("                      display: true,\n");
      out.write("                      text: \"Penjualan Bunga\"\n");
      out.write("                    }\n");
      out.write("                  }\n");
      out.write("                });\n");
      out.write("               </script>\n");
      out.write("             \n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
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
