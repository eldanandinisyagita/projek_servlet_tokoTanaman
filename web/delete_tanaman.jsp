<%-- 
    Document   : delete_tanaman
    Created on : Feb 3, 2022, 7:50:22 PM
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
            String kode_tanaman= request.getParameter("kode_tanaman");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekwpw", "root", "");
                if (conn != null) {
                    if (kode_tanaman != null) {
                        Statement st = conn.createStatement();
                        st.executeUpdate("delete from tanaman where kode_tanaman = '"+kode_tanaman+"' ");
                        
                        response.sendRedirect("DataTanaman.jsp");
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
