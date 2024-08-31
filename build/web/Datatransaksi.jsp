<%-- 
    Document   : Datatransaksi
    Created on : Jan 30, 2022, 7:25:01 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*, java.io.*" %>
<!DOCTYPE html>
<%
    String host = "jdbc:mysql://localhost:3306/projekwpw";
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select*from penjualan";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
    
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

              td{
                padding: 12px 15px;
            }
            tr{
                border-bottom: 1px solid #dddddd;
            }
            tr:last-of-type{
                border-bottom: 2px solid #dddddd;
            }
            .table-content{
                border-radius: 5px 5px 0 0;
                overflow: hidden;
                box-shadow: 1px 1px 5px #949494;
                background-color: white;
                font-family: 'PT Sans', sans-serif;
                border-collapse: collapse;
                margin-left: 10px;
            }
            .form-popup {
                display:none;
                position:absolute;
                margin-top: -80px;
                margin-left: -350px;
                border: 3px solid #c5c5c5;
                z-index: 9;
                font-family:'PT Mono', sans-serif;
              }

              /* Add styles to the form container */
              .form-container {
                width: 800px;
                height: 520px;
                padding: 10px;
                background-color: white;


              }

              /* Full-width input fields */
              .form-container input[type=text]{
                width: 100%;
                height: 30px;
                padding: 15px;
                margin: 5px 0 22px 0;
                border: none;
                background: #f1f1f1;
                
              }

              /* When the inputs get focus, do something */
              .form-container input[type=text]:focus {
                background-color: #ddd;
                outline: none;
              }

              /* Set a style for the submit/login button */
              .form-container .btn {
                background-color: #04AA6D;
                color: white;
                border: none;
                cursor: pointer;
                width: 20%;
                height: 40px;
                margin-bottom:10px;
                opacity: 0.8;
                display: inline-block;
              }

              /* Add a red background color to the cancel button */
              .form-container .cancel {
                background-color: red;
              }

              /* Add some hover effects to buttons */
              .form-container .btn:hover, .open-button:hover {
                opacity: 1;
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
    <a href="DataTanaman.jsp">Data Tanaman</a>
    <a class="active" href="Datatransaksi.jsp">Data Transaksi</a>
    <a href="Ruangfeedback.jsp">Ruang Feedback</a>
  </div>
  
  <div class="content">
      <div class="topnav">
          <h2 style=" display: inline-block; color: black; text-align: left; font-size: 25px; font-family: 'PT Sans', sans-serif; margin-top: 20px">Data Transaksi</h2>
      </div>
      <br>
      <table width="1100px" style="" class="table-content">
          <tr>
              <th colspan="3" style="height: 70px; background-color: #ebebeb">
                  <div class="container-fluid">
                      <form class="d-flex" action="Search_tanaman.jsp" method="POST">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" style="width: 300px;">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                  </div>  
              </th>
              <th colspan="4" style="height: 70px; background-color: #ebebeb">
                <button type="button" class="btn btn-outline-dark" style="float: right; margin-right: 20px" onclick="openForm()">add</button>
        
            <div class="form-popup" id="myForm">
              <form action="add_transaksi.jsp" method="post" class="form-container">
                <h2>Tambah Data Transaksi</h2>
                <br>
                <label for="kode_penjualan"><b>Kode Penjualan</b></label>
                <input type="text" placeholder="Enter Kode Penjualan" name="kode_penjualan" required>
            
                <label for="id_customer"><b>Id Customer</b></label>
                <input type="text" placeholder="Enter Id Customer" name="id_customer" required>
            
                <label for="kode_tanaman"><b>Kode Tanaman</b></label>
                <input type="text" placeholder="Enter Kode Tanaman" name="kode_tanaman" required>

                <label for="jumlah_jual"><b>Jumlah Jual</b></label>
                <input type="text" placeholder="Enter Jumlah Jual" name="jumlah_jual" required>
                
                <label for="tanggal_jual"><b>Tanggal Jual</b></label>
                <input type="text" placeholder="Enter Tanggal Jual" name="tanggal_jual" required>
                
                <label for="total_jual"><b>Total Jual</b></label>
                <input type="text" placeholder="Enter Total Jual" name="total_jual" required>

                <button type="button" class="btn cancel" onclick="closeForm()" style="float: left;">Close</button>
                <button type="submit" name="submit" class="btn" style="float: right;">Add</button>

              </form>
            </div>
              </th>
          </tr>
          
          
          <tr style="text-align: left; font-weight: bold">
                <td width="100px">Kode Penjualan</td>
                <td width="100px">Id Customer </td>
                <td width="100px">Kode Tanaman </td>
                <td width="100px">Jumlah</td>
                <td width="150px">Tanggal</td>
                <td width="100px">Total</td>
                <td width="150px" style="text-align: center;"> Aksi </td>
           </tr>
           <% while (rs.next()){%>
           <tr>
               <td> <%=rs.getString("kode_penjualan")%> </td>
               <td> <%=rs.getString("id_customer")%> </td>
               <td> <%=rs.getString("kode_tanaman")%> </td>
               <td> <%=rs.getString("jumlah_jual")%> </td>
               <td> <%=rs.getString("tanggal_jual")%> </td>
               <td> <%=rs.getString("total_jual")%> </td>
               <td><a href="edit_transaksi.jsp?kode_penjualan=<%=rs.getString("kode_penjualan")%>" class="btn btn-primary"> edit</a>
                   
                   <a href="delete_transaksi.jsp?kode_penjualan=<%=rs.getString("kode_penjualan")%>" class="btn btn-danger"> delete</a>
               </td>
               
           </tr>
           <%}%>
        </table>
    <%
        rs.close();
        stmt.close();
        conn.close();
        }
catch(SQLException ex){
out.print("Gagal koneksi");
}
catch(Exception ex){
out.print(ex.getMessage());
}
    %>
     
  </div> 
     <script>
      function openForm() {
        document.getElementById("myForm").style.display = "block";
      }
      
      function closeForm() {
        document.getElementById("myForm").style.display = "none";
      }
      </script>
     
  </div> 
</body>
</html>
