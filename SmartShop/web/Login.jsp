<%-- 
    Document   : Login
    Created on : Feb 1, 2018, 12:21:11 PM
    Author     : DILSHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1 class="breadcrumb">Login</h1>
            </div>
            <br>
            <h5 style="margin-left: 900px;">New member <input class="btn btn-success" type="submit" value="Sign Up" onclick="signup();"></h5>
            <br>
            <h4 id="login_msg" style="color: tomato;"></h4>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Email :</span>
                </div>
                <div class="col-sm-3">
                    <input id="email" type="email" placeholder="Enter your Email...">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Password :</span>
                </div>
                <div class="col-sm-3">
                    <input id="password" type="password" placeholder="Enter your Password...">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <input type="submit" value="Login" class="btn btn-primary" onclick="login();">
                </div>
            </div>
            <br>

        </div>
        <script type="text/javascript">
            function login() {
                var email = document.getElementById("email").value;
                var password = document.getElementById("password").value;

                var request = new XMLHttpRequest();

                request.onreadystatechange = function () {
                    if (request.readyState === 4 && request.status === 200) {

                        if (request.responseText === "1") {
                            window.location = "Profile.jsp";
                        } else {
                           
                           document.getElementById("login_msg").innerHTML = request.responseText;

                        }

                    }
                };

                var param = "email=" + email + "&password=" + password;

                request.open("POST", "Login", true);
                request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                request.send(param);

            }
            
            function signup(){
                window.location = "UserRegistration.jsp";
            }
            
        </script>
    </body>
</html>
