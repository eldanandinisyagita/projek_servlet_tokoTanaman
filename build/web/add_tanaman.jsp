<%-- 
    Document   : add_tanaman
    Created on : Feb 3, 2022, 8:05:09 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*, java.io.*" %>
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
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projekwpw","root", "");
                if(conn != null){
                    if (kode_tanaman != null){
                        PreparedStatement pst = conn.prepareStatement("insert into tanaman values (?,?,?,?,?,?)");
                        pst.setString(1, kode_tanaman);
                        pst.setString(2, gambar_tanaman);
                        pst.setString(3, nama_tanaman);
                        pst.setInt(4, harga_tanaman);
                        pst.setInt(5, stok_tanaman);
                        pst.setString(6, keterangan);
                        pst.executeUpdate();
                        
                        response.sendRedirect("DataTanaman.jsp");
                        
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
