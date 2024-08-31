<%-- 
    Document   : olahedit_customer
    Created on : Feb 2, 2022, 10:21:50 PM
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
                String nama_customer = request.getParameter("nama_customer");
                String alamat_customer = request.getParameter("alamat_customer");
                String email_customer= request.getParameter("email_customer");
                String host = "jdbc:mysql://localhost:3306/projekwpw";
            try {
                Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection(host, "root", "");
                if (conn != null) {
                    if (id_customer != null) {
                        PreparedStatement pst = conn.prepareStatement("update customer set id_customer = ?,nama_customer = ?,alamat_customer = ?,email_customer = ? where id_customer='"+id_customer+"' ");
                        pst.setString(1, id_customer);
                        pst.setString(2, nama_customer);
                        pst.setString(3, alamat_customer);
                        pst.setString(4, email_customer);
                        pst.executeUpdate();

                        response.sendRedirect("Datacustomer.jsp");

                    }
                } else {
                    response.sendRedirect("errorsave.jsp");
                }
            } catch (Exception e) {
                out.println("can't connect to database. with error = " + e.getMessage());
            }
        %>
    </body>
</html>
