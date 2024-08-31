package org.apache.jsp.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        String query = "select*from customer";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("   \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                      <h4><i class=\"fa fa-user\"></i> My Profile</h4>\n");
      out.write("                      <table class=\"table\">\n");
      out.write("                          <tbody>\n");
      out.write("                              ");
 while (rs.next()){
      out.write("\n");
      out.write("                              <tr>\n");
      out.write("                                  <td>Nama</td>\n");
      out.write("                                  <td width=\"10\">:</td>\n");
      out.write("                                  <td>");
      out.print(rs.getString("nama_customer"));
      out.write(" </td>\n");
      out.write("                              </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td>Email</td>\n");
      out.write("                                  <td>:</td>\n");
      out.write("                                  <td> ");
      out.print(rs.getString("email_customer"));
      out.write("</td>\n");
      out.write("                              </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td>No HP</td>\n");
      out.write("                                  <td>:</td>\n");
      out.write("                                  <td>");
      out.print(rs.getString("noHP_customer"));
      out.write(" </td>\n");
      out.write("                              </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                  <td>Alamat</td>\n");
      out.write("                                  <td>:</td>\n");
      out.write("                                  <td> ");
      out.print(rs.getString("alamat_customer"));
      out.write("</td>\n");
      out.write("                              </tr>\n");
      out.write("                          </tbody>\n");
      out.write("                          ");
}
      out.write("\n");
      out.write("                          \n");
      out.write("                      </table>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-12 mt-2\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                      <h4><i class=\"fa fa-pencil-alt\"></i> Edit Profile</h4>\n");
      out.write("                      \n");
      out.write("                      <form method=\"POST\" action=\"olahedit_customer.jsp\">\n");
      out.write("                      \n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label for=\"nama_customer\" class=\"col-md-2 col-form-label text-md-right\">Nama</label>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input id=\"nama_customer\" type=\"text\" class=\"form-control\" name=\"nama_customer\" value=\"");
      out.print(rs.getString("nama_customer"));
      out.write("\" required autocomplete=\"nama_customer\" autofocus>\n");
      out.write("\n");
      out.write("                                @error('name')\n");
      out.write("                                    <span class=\"invalid-feedback\" role=\"alert\">\n");
      out.write("                                        <strong>{{ $message }}</strong>\n");
      out.write("                                    </span>\n");
      out.write("                                @enderror\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"noHP_customer\" class=\"col-md-2 col-form-label text-md-right\">NO HP</label>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input id=\"noHP_customer\" type=\"text\" class=\"form-control\" name=\"noHP_customer\" value=\"");
      out.print(rs.getString("noHP_customer"));
      out.write("\" required autocomplete=\"noHP_customer\">\n");
      out.write("\n");
      out.write("                                @error('email')\n");
      out.write("                                    <span class=\"invalid-feedback\" role=\"alert\">\n");
      out.write("                                        <strong>{{ $message }}</strong>\n");
      out.write("                                    </span>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("  \n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                              <label for=\"alamat_customer\" class=\"col-md-2 col-form-label text-md-right\">Alamat</label>\n");
      out.write("  \n");
      out.write("                              <div class=\"col-md-6\">\n");
      out.write("                                  <textarea name=\"alamat_customer\" class=\"form-control\" required=\"\">");
      out.print(rs.getString("alamat_customer"));
      out.write(" </textarea>\n");
      out.write("  \n");
      out.write("                                  @error('alamat')\n");
      out.write("                                      <span class=\"invalid-feedback\" role=\"alert\">\n");
      out.write("                                          <strong>{{ $message }}</strong>\n");
      out.write("                                      </span>\n");
      out.write("                                  @enderror\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("  \n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                              <label for=\"zip_code\" class=\"col-md-2 col-form-label text-md-right\">");
      out.print(rs.getString("zip_code"));
      out.write("</label>\n");
      out.write("  \n");
      out.write("                              <div class=\"col-md-6\">\n");
      out.write("                                  <input id=\"zip_code\" type=\"zip_code\" class=\"form-control\" name=\"zip_code\">\n");
      out.write("  \n");
      out.write("                                  @error('password')\n");
      out.write("                                      <span class=\"invalid-feedback\" role=\"alert\">\n");
      out.write("                                          <strong>{{ $message }}</strong>\n");
      out.write("                                      </span>\n");
      out.write("                                  @enderror\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("  \n");
      out.write("                          <div class=\"form-group row mb-0\">\n");
      out.write("                              <div class=\"col-md-6 offset-md-2\">\n");
      out.write("                                  <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                      Save\n");
      out.write("                                  </button>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </form>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>     \n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("                    ");

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
    
      out.write("              \n");
      out.write("    </body>\n");
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
