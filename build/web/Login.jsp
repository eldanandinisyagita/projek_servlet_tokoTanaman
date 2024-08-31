<%-- 
    Document   : Login
    Created on : Jan 28, 2022, 10:05:20 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
         <style>
             *{
                 font-family: monospace;
                 
             }
            .login {
                width: 47%;
                float: right;
                padding: 10px;
                margin-top: 100px;
                margin-left: 20px;
            }
            input[type=text], input[type=password] {
                width: 100%;
                padding: 16px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

              /* Set a style for all buttons */
            button {
                background-color: #146356;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                opacity: 0.8;
            }
            .container {
                padding-right: 15px;
                
            }
            h1{
                font-size: 50px;
                letter-spacing: 5px;
            }
            h3{
                letter-spacing: 5px;
            }
        </style>
    </head>
    <body background="photo/bg.jpg" 
          style="background-position: left;
          background-repeat: no-repeat;
          background-size: 95%;
          height: 705px;width: auto;">
        <div class="login">
            <h1>Login</h1>
            <h3>Welcome back! Please Login to your account.</h3><br>
                <form action="http://localhost:8080/ProjekUas_TokoTanaman/Olahlogin" method="POST">
                    <div class="container">
                        <label for="username"><b>Username</b></label> 
                        <input type="text" placeholder="Enter username" name="username" required>
                        
                        <label for="pass"><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" name="pass" required>
                        
                        <label>
                          <input type="checkbox" checked="checked" name="remember"> Remember me
                        </label>
                        
                        <button type="submit">Login</button>
                    </div>
                </form>
        </div>
    </body>
</html>