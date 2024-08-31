<%-- 
    Document   : delete_transaksi
    Created on : Feb 4, 2022, 7:27:16 PM
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
            String kode_penjualan= request.getParameter("kode_penjualan");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekwpw", "root", "");
                if (conn != null) {
                    if (kode_penjualan != null) {
                        Statement st = conn.createStatement();
                        st.executeUpdate("delete from penjualan where kode_penjualan = '"+kode_penjualan+"' ");
                        
                        response.sendRedirect("Datatransaksi.jsp");
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