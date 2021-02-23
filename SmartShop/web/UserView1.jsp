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
            <br>
            <br>
            <input type="button" value="Clear All" class="btn btn-warning" style="margin-left: 900px;" onclick="clearAll();">
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
                <input type="button" value="Search" onclick="search();"class="btn btn-info">
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
            function search() {

                var name = document.getElementById("uname").value;
                var email = document.getElementById("uemail").value;
                var mobile = document.getElementById("umobile").value;
                var country = document.getElementById("ucountry").value;

                var user = {"name": name, "email": email, "mobile": mobile, "country": country};
                var str = JSON.stringify(user);


                var request = new XMLHttpRequest();

                request.onreadystatechange = function () {
                    if (request.readyState === 4 && request.status === 200) {
                        if (request.responseText === "1") {
                            document.getElementById("mess").innerHTML = "No such User!!!";
                        } else {

                            document.getElementById("mess").innerHTML = "";

                            var str = request.responseText;
                            var arr = JSON.parse(str);
                            document.getElementById("tbody3").innerHTML = "";

                            for (var i = 0; i < arr.length; i++) {

                                var tr = document.createElement("tr");

                                var ob = arr[i];

                                var tr = document.createElement("tr");
                                
                                var td1 = document.createElement("td");
                                var td2 = document.createElement("td");
                                var td3 = document.createElement("td");
                                var td4 = document.createElement("td");
                                var td5 = document.createElement("td");
                                var td6 = document.createElement("td");
                                var td7 = document.createElement("td");
                                
                                td1.innerHTML = ob.id;
                                td2.innerHTML = ob.name;
                                td3.innerHTML = ob.email;
                                td4.innerHTML = ob.password;
                                td5.innerHTML = ob.mobile;
                                td6.innerHTML = ob.country;
                                td7.innerHTML = ob.type;
                                
                                tr.appendChild(td1);
                                tr.appendChild(td2);
                                tr.appendChild(td3);
                                tr.appendChild(td4);
                                tr.appendChild(td5);
                                tr.appendChild(td6);
                                tr.appendChild(td7);
                                
                                document.getElementById("tbody3").appendChild(tr);
                            }
                        }
                    }
                };

                request.open("GET", "UserView1?str=" + str, true);
                request.send();

            }
            
            function clearAll(){
                document.getElementById("uname").value = "";
                document.getElementById("uemail").value = "";
                document.getElementById("umobile").value = "";
                document.getElementById("ucountry").value = "";
            }
        </script>

    </body>
</html>
