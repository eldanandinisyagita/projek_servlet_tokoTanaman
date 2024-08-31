<%-- 
    Document   : olahedit_tanaman
    Created on : Feb 4, 2022, 12:05:47 PM
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
                String kode_tanaman = request.getParameter("kode_tanaman");
                String gambar_tanaman = request.getParameter("gambar_tanaman");
                String nama_tanaman = request.getParameter("nama_tanaman");
                int harga_tanaman = Integer.parseInt(request.getParameter("harga_tanaman"));
                int stok_tanaman = Integer.parseInt(request.getParameter("stok_tanaman"));
                String keterangan = request.getParameter("keterangan");
                String host = "jdbc:mysql://localhost:3306/projekwpw";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(host, "root", "");
                if (conn != null) {
                    if (kode_tanaman != null) {
                        PreparedStatement pst = conn.prepareStatement("update tanaman set kode_tanaman = ?,gambar_tanaman = ?,nama_tanaman = ?,harga_tanaman = ?,stok_tanaman = ?,keterangan = ? where kode_tanaman='"+kode_tanaman+"' ");
                       pst.setString(1, kode_tanaman);
                        pst.setString(2, gambar_tanaman);
                        pst.setString(3, nama_tanaman);
                        pst.setInt(4, harga_tanaman);
                        pst.setInt(5, stok_tanaman);
                        pst.setString(6, keterangan);
                        pst.executeUpdate();

                        response.sendRedirect("DataTanaman.jsp");

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
