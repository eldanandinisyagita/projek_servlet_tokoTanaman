<%-- 
    Document   : delete_feedback
    Created on : Feb 4, 2022, 8:14:37 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*, java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String kode_feedback = request.getParameter("kode_feedback");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekwpw", "root", "");
                if (conn != null) {
                    if (kode_feedback != null) {
                        Statement st = conn.createStatement();
                        st.executeUpdate("delete from feedback where kode_feedback = '"+kode_feedback+"' ");
                        
                        response.sendRedirect("Ruangfeedback.jsp");
                    }
                }else{
                   response.sendRedirect("errorsave.jsp");
                }
            } catch (Exception e) {
                out.println("can't connect to database. with error = " + e.getMessage());
            }
        %>
    </body>
</html>

