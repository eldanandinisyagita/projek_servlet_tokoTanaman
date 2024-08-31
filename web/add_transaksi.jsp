<%-- 
    Document   : add_transaksi
    Created on : Feb 4, 2022, 1:28:54 PM
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
            String kode_penjualan = request.getParameter("kode_penjualan");
            String id_customer = request.getParameter("id_customer");
            String kode_tanaman = request.getParameter("kode_tanaman");
            int jumlah_jual = Integer.parseInt(request.getParameter("jumlah_jual"));
            String tanggal_jual = request.getParameter("tanggal_jual");
            int total_jual = Integer.parseInt(request.getParameter("total_jual"));
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekwpw","root", "");
                if(conn != null){
                    if (kode_penjualan != null){
                        PreparedStatement pst = conn.prepareStatement("insert into penjualan values (?,?,?,?,?,?)");
                        pst.setString(1, kode_penjualan);
                        pst.setString(2, id_customer);
                        pst.setString(3, kode_tanaman);
                        pst.setInt(4, jumlah_jual);
                        pst.setString(5, tanggal_jual);
                        pst.setInt(6, total_jual);
                        pst.executeUpdate();
                        
                        response.sendRedirect("Datatransaksi.jsp");
                        
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
