<%-- 
    Document   : UserRegistration
    Created on : Feb 1, 2018, 1:28:03 AM
    Author     : DILSHAN
--%>

<%@page import="Model.Country"%>
<%@page import="java.util.ArrayList"%>
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
            <h1 class="breadcrumb">User Registration</h1>
            <h3 id="msg"></h3>
            <form>
                <div class="row">
                    <div class="col-sm-3">
                        <span>User Name :</span>
                    </div>
                    <div class="col-sm-3">
                        <input id="name" type="text">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-3">
                        <span>Email :</span>
                    </div>
                    <div class="col-sm-3">
                        <input id="email" type="email">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-3">
                        <span>Password :</span>
                    </div>
                    <div class="col-sm-3">
                        <input id="password" type="password">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-3">
                        <span>Mobile :</span>
                    </div>
                    <div class="col-sm-3">
                        <input id="mobile" type="text">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-3">
                        <span>Country :</span>
                    </div>
                    <div class="col-sm-3">
                        <select id="country">
                            <%
                                ArrayList<Country> c_list = Country.countries;
                                
                                for(Country c: c_list){
                                    %>
                                    <option><%= c.getCountry() %></option>
                                    <%
                                }
                                
                            %>
                        </select>
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-3">
                        <span>Profile Picture :</span>
                    </div>
                    <div class="col-sm-3">
                        <label for="file">
                            <img src="icons/upload.png">
                        </label>
                        <input id="file" type="file" onchange="loadImage();"  style="display: none;">
                    </div>
                    <div class="col-sm-3">
                        <img id="preview"  style="width: 350px;
                             height: 350px;
                             min-height: 350px;
                             min-width: 350px;
                             max-height: 350px;
                             max-width: 350px;
                             border-style: solid;
                             border-width: 1px;
                             margin-top: -220px;">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-3">
                        <input type="submit" value="Register" class="btn btn-primary" onclick="saveUser();">
                    </div>
                    
                </div>
                <br>
            </form>
        </div>
    </body>
    <script type="text/javascript">
        function loadImage(){
            
            var file = document.getElementById("file").files[0];
            var reader = new FileReader();
            reader.readAsDataURL(file);
            
            reader.onload = function(content){
              document.getElementById("preview").src = content.target.result;
            };
            
        }
        
        function saveUser(){
            var name=document.getElementById("name").value;
            var email=document.getElementById("email").value;
            var password=document.getElementById("password").value;
            var mobile=document.getElementById("mobile").value;
            var country=document.getElementById("country").value;
            var file=document.getElementById("file");
            
//            alert(name);
//            alert(email);
//            alert(password);
//            alert(mobile);
//            alert(country);
//            alert(file.value);

            var all_files = file.files[0];
            var form = new FormData();
            form.append("name",name);
            form.append("email",email);
            form.append("password",password);
            form.append("mobile",mobile);
            form.append("country",country);
            form.append("file",all_files);
            
            var request = new XMLHttpRequest();
            
            request.onreadystatechange = function(){
              if(request.readyState === 4 && request.status === 200){
                  alert(request.responseText);
              }  else{
                  alert(request.status);
              }
            };
            
            request.open("POST","SaveUser",true);
            request.send(form);
        }
        
    </script>
</html>
