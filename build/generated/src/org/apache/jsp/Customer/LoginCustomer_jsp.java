package org.apache.jsp.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=Open+Sans\" />\n");
      out.write("        <style>\n");
      out.write("            .login {\n");
      out.write("                width: 47%;\n");
      out.write("                float: right;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin-top: 0px;\n");
      out.write("            }\n");
      out.write("            .judul {\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 52px;\n");
      out.write("                opacity: 1;\n");
      out.write("                text-align: left;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .form-style-5{\n");
      out.write("                max-width: 500px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background: #f4f7f8;\n");
      out.write("                margin: 10px auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background: #f4f7f8;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                font-family: Georgia, \"Times New Roman\", Times, serif;\n");
      out.write("            }\n");
      out.write("            input[type=email], \n");
      out.write("            input[type=password]{\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 3px solid rgba(67,108,86,1);\n");
      out.write("                border-top-left-radius: 15px;\n");
      out.write("                border-top-right-radius: 15px;\n");
      out.write("                border-bottom-left-radius: 15px;\n");
      out.write("                border-bottom-right-radius: 15px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-size: 16px;\n");
      out.write("                opacity: 1;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            input[type=\"email\"]:focus,\n");
      out.write("            input[type=\"password\"]:focus {\n");
      out.write("                background: #E3F2E1;\n");
      out.write("            }\n");
      out.write("            .fp {\n");
      out.write("                color: rgba(0,0,0,0.5);\n");
      out.write("                font-family: Open Sans;\n");
      out.write("                font-size: 13px;\n");
      out.write("                opacity: 1;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"]\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 3px solid rgba(67,108,86,1);\n");
      out.write("                border-top-left-radius: 15px;\n");
      out.write("                border-top-right-radius: 15px;\n");
      out.write("                border-bottom-left-radius: 15px;\n");
      out.write("                border-bottom-right-radius: 15px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-size: 16px;\n");
      out.write("                opacity: 1;\n");
      out.write("                color: white;\n");
      out.write("                background: #436C56;\n");
      out.write("                font-weight: Bold;\n");
      out.write("                text-align: center;\n");
      out.write("                font-style: normal;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"]:hover\n");
      out.write("            {\n");
      out.write("                opacity: 0.5;\n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"]:active\n");
      out.write("            {\n");
      out.write("                opacity: 0.5;\n");
      out.write("            }\n");
      out.write("            .olw {\n");
      out.write("                color: #000000;\n");
      out.write("                font-family: Open Sans;\n");
      out.write("                font-size: 13px;\n");
      out.write("                opacity: 1;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                display:inline-block;\n");
      out.write("                padding: 0px 40px;\n");
      out.write("                margin-left: auto; \n");
      out.write("                margin-right: auto; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"photo/a.png\" \n");
      out.write("          style=\"background-position: left;\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-size: 50% 100%;\n");
      out.write("          height: 705px;width: auto;\">\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <form action=\"/login.java\">\n");
      out.write("                <div class=\"judul\">Login</div><br><br>\n");
      out.write("                <input type=\"email\" id=\"email_customer\" name=\"email_customer\" placeholder=\"Email\"><br><br>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                <a href=\"...\" style=\"text-decoration: none\">\n");
      out.write("                    <div class=\"fp\">Forgot Password?</div>\n");
      out.write("                </a><br><br>\n");
      out.write("                <a href=\"/login.java\"><input type=\"submit\" value=\"Login\"></a><br><br><br>\n");
      out.write("            </form>\n");
      out.write("            <center><div class=\"olw\">---------------------------------------------------------------------- or login with ---------------------------------------------------------------------</div></center>\n");
      out.write("                <br>\n");
      out.write("                <ul style=\"list-style-type: none;\">&emsp;&emsp;&emsp;&emsp;&nbsp;\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession\"\n");
      out.write("                           style=\"text-decoration: none;\">\n");
      out.write("                            <img src=\"photo/G-Icon.png\" style=\"width: 54px; height: 54px;\">\n");
      out.write("                            <div class=\"olw\">Google</div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"https://web.facebook.com/?_rdc=1&_rdr\"\n");
      out.write("                            style=\"text-decoration: none;\">\n");
      out.write("                            <img src=\"photo/FB-Icon.png\" style=\"width: 54px; height: 54px;\">\n");
      out.write("                            <div class=\"olw\">Facebook</div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"https://appleid.apple.com/#!&page=signin\"\n");
      out.write("                            style=\"text-decoration: none;\">\n");
      out.write("                            <img src=\"photo/Apl.id-Icon.png\" style=\"width: 54px; height: 54px;\">\n");
      out.write("                            <div class=\"olw\">Apple ID</div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <br>\n");
      out.write("                <div style=\"color: rgba(0,0,0,0.5); font-family: Open Sans; font-size: 13px; opacity: 1;\n");
      out.write("                     text-align: left;\">Don't have an account? \n");
      out.write("                    <a href=\"SignupCustomer.jsp\" style=\"text-decoration: none; color: rgba(0,0,0,0.5);\"><b>Sign Up</b></a></div>\n");
      out.write("        </div>\n");
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
