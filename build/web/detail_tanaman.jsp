<%-- 
    Document   : detail_tanaman
    Created on : Feb 5, 2022, 7:49:04 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*, java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Dashboard</title>
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
              height: 1200px;
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

            .topnav .search-container {
              float: right;
              margin-top: 5px;
              
            }

            .topnav input[type=text] {
              padding: 6px;
              margin-top: 8px;
              font-size: 17px;
              border: none;
              border-radius: 5px;
              height: 40px;
              width: 260px;
              background-color: #EFEFEF;
            }

            .topnav .search-container button {
              float: right;
              padding: 6px 10px;
              margin-top: 8px;
              margin-right: 16px;
              background: #EFEFEF;
              font-size: 17px;
              cursor: pointer;
              border-radius: 5px;
              height: 40px;
              width: 41px;
            }

            .topnav .search-container button:hover {
              background: #ccc;
            }

            @media screen and (max-width: 600px) {
              .topnav .search-container {
                float: none;
              }
              .topnav input[type=text], .topnav .search-container button {
                float: none;
                display:inline-block;
                text-align: left;
                width: 100%;
                margin: 0;
                padding: 14px;
              }
              .topnav input[type=text] {
                border: 1px solid #ccc;  
              }
            }
            
            #container-1{
                width: 1080px;
                height: 530px;
                background-color: rgb(255, 255, 255);
                border-radius: 20px;
                margin: 20px;
                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;

            }
            
            #container-2{
                width: 400px;
                height: 400px;
                background: none;
                margin: 20px;
                margin-right: 40px;
                display: inline-block;
            }
            .container-box-1{
                width: 400px;
                height: 400px;
                background-color: white;
                border-radius: 20px;
                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;
            }
            #container-3{
                width: 630px;
                height: 400px;
                display: inline-block;
            }
            .container-box-2{
                width: 630px;
                height: 400px;
                background-color: white;
                border-radius: 20px;
                box-shadow: 5px 5px 5px rgb(197, 197, 197), -1px -1px 3px #e4e2e2;
               
            }
            .photo_customer{
                border-radius: 50%;
                box-shadow: 1px 1px 3px black, -1px -1px 3px black;
                margin: 5px;
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
    <a class="active" href="#dashboard"><i class="fas fa-columns"></i> Dashboard</a>
    <a href="Datacustomer.jsp"> Data Customer</a>
    <a href="DataTanaman.jsp">Data Tanaman</a>
    <a href="Datatransaksi.jsp">Data Transaksi</a>
    <a href="Ruangfeedback.jsp">Ruang Feedback</a>
  </div>
  
  <div class="content">
      <div class="topnav">
          <h2 style=" display: inline-block; color: black; text-align: left; font-size: 25px; font-family: 'PT Sans', sans-serif; margin-top: 20px">Dashboard</h2>
      </div>
      <br>
      
      <%
            try{
                String Host="jdbc:mysql://localhost:3306/projekwpw";
                Connection connection = null;
                Statement statement = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(Host,"root", "");
                statement = connection.createStatement();
                String Data = "select * from tanaman";
                rs = statement.executeQuery(Data);
                %>
                
      <div id="container-1">
          <h3 style="margin: 15px; padding-top: 25px; font-size: 20px; font-family:'PT Sans', sans-serif">Data Tanaman</h3>
          
          <div class="card" style="width: 200px; margin: 15px; display: inline-block; margin-top: 5px">
              <img src="photo/<%=rs.getString("gambar_tanaman")%>" class="card-img-top" alt="..." width="100px">
              <div class="card-body">
                  <p class="card-title" style="font-family:'PT Sans', sans-serif; font-weight: bold"><%=rs.getString("nama_tanaman")%></p>
                  <p class="card-text" style="font-size: 15px; font-family:'PT Sans', sans-serif"> <strong>Harga </strong><%=rs.getString("harga_tanaman")%></p>
                  <p class="card-text" style="font-size: 15px; font-family:'PT Sans', sans-serif"> <strong>Stock: </strong><%=rs.getString("stok_tanaman")%></p>
                  <p class="card-text" style="font-size: 15px; font-family:'PT Sans', sans-serif"> <strong>Keterangan </strong><%=rs.getString("keterangan")%></p>
              </div>
          </div>
                
          <hr>
          <a href="DataTanaman.jsp" style="text-align: center; text-decoration: none; color: black; margin-left: 880px;color: #436C56; font-weight: bold;">Lihat Selengkapnya ...</a>
      </div>
          <%
              rs.close();
              statement.close();
              connection.close();
              } catch(SQLException e){
                   out.println("cant connect to database");
}
          %>
      
          </div>
</body>
</html>
