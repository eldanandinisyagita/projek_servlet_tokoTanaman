<%-- 
    Document   : Add_customer
    Created on : Feb 2, 2022, 5:19:55 PM
    Author     : HP
--%>
<%@page import = "java.sql.*, java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            String email_customer = request.getParameter("email_customer");
            String gambar = request.getParameter("gambar");
            String noHP_customer = request.getParameter("noHP_customer");
            String zip_code = request.getParameter("zip_code");
            String password = request.getParameter("password");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekwpw","root", "");
                if(conn != null){
                    if (id_customer != null){
                        PreparedStatement pst = conn.prepareStatement("insert into customer values (?,?,?,?,?,?,?,?)");
                        pst.setString(1, id_customer);
                        pst.setString(2, nama_customer);
                        pst.setString(3, alamat_customer);
                        pst.setString(4, email_customer);
                        pst.setString(5, gambar);
                        pst.setString(6, noHP_customer);
                        pst.setString(7, zip_code);
                        pst.setString(8, password);
                        pst.executeUpdate();
                        
                        response.sendRedirect("Datacustomer.jsp");
                        
                    }
                }else{
                    response.sendRedirect("errosave.jsp");
                }
            }catch(Exception e){
                out.println("can't connect to database. with error = " + e.getMessage());
            }
            %>
    </body>
</html>
