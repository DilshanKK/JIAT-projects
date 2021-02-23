<%-- 
    Document   : Profile
    Created on : Feb 1, 2018, 12:47:55 PM
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
            <h1 class="breadcrumb">User Profile</h1>
            <input type="button" value="Sign Out" class="btn btn-info" onclick="signout();">
            <h4 style="margin-left: 900px;">Welcome <%= request.getServletContext().getAttribute("user") %></h4>
        </div>
        <script type="text/javascript">
            function signout(){
                var request = new XMLHttpRequest();
                
                request.onreadystatechange = function (){
                  if(request.readyState === 4 && request.status === 200){
                      if(request.responseText === "1"){
                          window.location = "Login.jsp";
                      }
                  }  
                };
                
                request.open("GET","SignOut",true);
                request.send();
            }
        </script>
    </body>
</html>
