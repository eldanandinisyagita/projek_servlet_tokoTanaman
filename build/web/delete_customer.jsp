<%-- 
    Document   : delete_customer
    Created on : Feb 3, 2022, 12:26:33 AM
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
            String id_customer = request.getParameter("id_customer");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekwpw", "root", "");
                if (conn != null) {
                    if (id_customer != null) {
                        Statement st = conn.createStatement();
                        st.executeUpdate("delete from customer where id_customer = '"+id_customer+"' ");
                        
                        response.sendRedirect("Datacustomer.jsp");
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
