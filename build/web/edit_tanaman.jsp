<%-- 
    Document   : edit_tanaman
    Created on : Feb 3, 2022, 9:10:10 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*, java.io.*" %>
<!DOCTYPE html>
<%
            try {
                String kode_tanaman = request.getParameter("kode_tanaman");
                String gambar_tanaman = request.getParameter("gambar_tanaman");
                String nama_tanaman = request.getParameter("nama_tanaman");
                String harga_tanaman = request.getParameter("harga_tanaman");
                String stok_tanaman = request.getParameter("stok_tanaman");
                String keterangan = request.getParameter("keterangan");
                String Host = "jdbc:mysql://localhost:3306/projekwpw";
                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Host, "root", "");
                statement = connection.createStatement();
                String Data = "select*from tanaman where kode_tanaman ='" + kode_tanaman + "'";
                rs = statement.executeQuery(Data);
                while (rs.next()) {

        %>
<html>
    <head>
        <title>Data Customer</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=PT+Sans&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
        <style>
            html{
                background-color: white;
            }
            body {
              margin: 0;
              font-family: "Lato", sans-serif;
              background: rgb(255, 255, 255);
            }

            .sidebar {
              margin-top: -20px;
              padding: 10px;
              width: 270px;
              background-image: url(photo/daun.png);
              position:fixed;
              height: 100%;
              overflow: auto;
              border-bottom: rgb(255, 255, 255);

            }

            .sidebar a {
              display: block;
              color: rgb(255, 255, 255);
              padding: 16px;
              text-decoration: none;
              font-family: 'PT Sans', sans-serif;
              letter-spacing: 2px;
              font-size: 15px;
            }

            .sidebar a.active {
              background-color: #04AA6D;
              color: white;
            }

            .sidebar a:hover:not(.active) {
              background-color: #555;
              color: white;
            }

            .content {
              margin-left: 300px;
              margin-bottom: 20px;
              margin-top: 20px;
              margin-right: 30px;
              padding: 10px 16px;
              height: 680px;
              background-color: #F7F7F7;
            }

            @media screen and (max-width: 700px) {
              .sidebar {
                width: 100%;
                height: auto;
                position:absolute;
              }
              .sidebar a {float: left;}
              .content {margin-left: 0;}
            }

            @media screen and (max-width: 400px) {
              .sidebar a {
                text-align: center;
                float: none;
              }
            }

            .image_profile{
              width: 80px;
              border-radius: 50px;
              margin-top: -22px;
            }
            .topnav {
                margin-top: 0px;
                background-color: rgba(255, 255, 255, 0);
              }
              #container-1{
                width: 700px;
                height: 530px;
                background-color: rgb(255, 255, 255);
                border-radius: 20px;
                margin: 20px;
                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;
                margin-left: 200px;
            }
          
            .table-content{
                margin: 20px;
               font-family: 'PT Sans', sans-serif;
               width: 650px;
               font-size: 20px;
            }
            td{
                padding: 12px 15px;
            }
            tr{
                border-bottom: 1px solid #dddddd;
            }
            tr:last-of-type{
                border-bottom: none;
            }
            .table-content input[type=text]{
                width: 100%;
                height: 40px;
                
              }
            
        </style>
    </head>
<body>
  <div class="sidebar">
    <center>
      <h2 style="color: white; font-family: 'PT Sans', sans-serif; font-weight: normal; font-size:24px; padding-top: 22px; padding-bottom: 7px;">The Grow Room</h2>
      <hr style="color: #ffffff">
      <br>
      <img src="photo/profile.jpg" class="image_profile" alt="">
      <h4 style="margin-top: 29px ;color: white; font-family: 'PT Sans', sans-serif; letter-spacing: 2px; font-size: large; font-weight: lighter; ">Admin</h4>
    </center>
    <hr style="color: #ffffff">
    <br>
    <a href="Homepage.jsp">Dashboard</a>
    <a href="Datacustomer.jsp"> Data Customer</a>
    <a class="active" href="DataTanaman.jsp">Data Tanaman</a>
    <a href="Datatransaksi.jsp">Data Transaksi</a>
    <a href="Ruangfeedback.jsp">Ruang Feedback</a>
  </div>
  
    <div class="content">
      <div class="topnav">
          <h2 style=" display: inline-block; color: black; text-align: left; font-size: 25px; font-family: 'PT Sans', sans-serif; margin-top: 20px">Data Tanaman</h2>
      </div>
      <br>       
      
      <div id="container-1">
          <h3 style="margin: 15px; padding-top: 25px; font-size: 20px; font-family:'PT Sans', sans-serif; font-weight: bold">Edit Data Tanaman</h3>
             <form action="olahedit_tanaman.jsp" method="post">
            <table class="table-content">
                <tr>
                    <td>Kode Tanaman</td>
                    <td>:</td>
                    <td><input type="text" name="kode_tanaman" value="<%=rs.getString("kode_tanaman")%>"></td>
                </tr>
                <tr>
                    <td>Gambar Tanaman</td>
                    <td>:</td>
                    <td><input type="text" name="gambar_tanaman" value="<%=rs.getString("gambar_tanaman")%>"></td>
                </tr>
                
                <tr>
                    <td>Nama Tanaman</td>
                    <td>:</td>
                    <td><input type="text" name="nama_tanaman" value="<%=rs.getString("nama_tanaman")%>"></td>
                </tr>
                <tr>
                    <td>Harga Tanaman </td>
                    <td>:</td>
                    <td><input type="text" name="harga_tanaman" value="<%=rs.getString("harga_tanaman")%>"></td>
                </tr>
                <tr>
                    <td>Stok Tanaman </td>
                    <td>:</td>
                    <td><input type="text" name="stok_tanaman" value="<%=rs.getString("stok_tanaman")%>"></td>
                </tr>
                <tr>
                    <td>Keterangan </td>
                    <td>:</td>
                    <td><input type="text" name="keterangan" value="<%=rs.getString("keterangan")%>"></td>
                </tr>
                
                <tr>
                    <td colspan="3"><input type="submit" class="btn btn-success" name="update" style="float: right"></td>
                </tr>
            </table>
                 <% }
                        rs.close();
                        statement.close();
                        connection.close();

                    } catch (SQLException e) {
                        out.println("can't connect to database. with error = " + e.getMessage());
                    }
                %>
        </form>
          
      </div>
  </div> 
</body>
</html>
