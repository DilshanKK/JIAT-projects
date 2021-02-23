<%-- 
    Document   : UserView
    Created on : Feb 5, 2018, 4:31:08 PM
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
            <h1 class="breadcrumb">User View</h1>
            <br>
            <h4 id="mess" style="color: tomato;"></h4>
            <br>
            <br>
            <div class="col-sm-1">
                <span>Username: </span>
            </div>
            <div class="col-sm-2">
                <input id="uname" type="text" placeholder="Enter your Username...">
            </div>
            <div class="col-sm-1">
                <span>Email :</span>
            </div>
            <div class="col-sm-2">
                <input id="uemail" type="email" placeholder="Enter your Password...">
            </div>
            <div class="col-sm-1">
                <span>Mobile :</span>
            </div>
            <div class="col-sm-2">
                <input id="umobile" type="text" placeholder="Enter your Mobile...">
            </div>
            <div class="col-sm-1">
                <span>Country :</span>
            </div>
            <div class="col-sm-1">
                <select id="ucountry">
                    <option>All</option>
                    <option>Sri Lanka</option>
                    <option>India</option>
                    <option>Australia</option>
                </select>
            </div>
            <div class="col-sm-1">
                <input type="button" value="Search" onclick="searchUser();" class="btn btn-info">
            </div>
            <br>
            <br>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Username</th>
                        <th>Email</th>
                        <th>Password</th>
                        <th>Mobile</th>
                        <th>Country</th>
                        <th>Type</th>
                    </tr>
                </thead>
                <tbody id="tbody3">
                    <tr>
                        <td>67</td>
                        <td>Kamal</td>
                        <td>kamal@gmail.com</td>
                        <td>k12345</td>
                        <td>0715788957</td>
                        <td>Sri Lanka</td>
                        <td>User</td>
                    </tr>
                    <tr>
                        <td>68</td>
                        <td>Peter</td>
                        <td>peter@gmail.com</td>
                        <td>p12345</td>
                        <td>0715788957</td>
                        <td>Australia</td>
                        <td>Admin</td>
                    </tr>
                </tbody>
            </table>


        </div>
        <script type="text/javascript">
            function searchUser(){
                var request = new XMLHttpRequest();
                
                var user={"name": document.getElementById("uname").value,
                "email": document.getElementById("uemail").value,
                "mobile": document.getElementById("umobile").value,
                "country": document.getElementById("ucountry").value};
            
                window.alert(JSON.stringify(user));
                
                request.onreadystatechange = function(){
                  if(request.readyState === 4 && request.status === 200){
                      var str = request.responseText;
                      var obj = JSON.parse(str);
                      
                      window.alert(obj[0]);
                  }  
                };
                
                
                request.open("GET","UserSearch?user="+JSON.stringify(user),true);
                request.send();
            }
        </script>

    </body>
</html>
