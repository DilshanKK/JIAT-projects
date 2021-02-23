<%-- 
    Document   : Stock
    Created on : Feb 2, 2018, 2:51:41 PM
    Author     : DILSHAN
--%>

<%@page import="java.util.List"%>
<%@page import="Hibernate.Brand"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="Hibernate.NewHibernateUtil"%>
<%@page import="org.hibernate.Session"%>
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
            

            <h1 class="breadcrumb">Stock</h1>
            <br>
            <h4 id="stockmsg" style="color: tomato;"></h4>
            <br>

            <div class="row">
                <div class="col-sm-3">
                    <span>Brand Name:</span>
                </div>
                <div class="col-sm-3">
                    <select id="brandselect" onchange="loadModel();">
                        <%
                            Session hs = NewHibernateUtil.getSessionFactory().openSession();
                            Criteria cr = hs.createCriteria(Brand.class);

                            List<Brand> li = cr.list();

                            for (Brand b : li) {
                        %>
                        <option><%= b.getName()%></option>
                        <%
                            }

                        %>
                    </select>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Model :</span>
                </div>
                <div class="col-sm-3">
                    <select id="modelselect">
                        <!--Load By Ajax-->
                    </select>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Quantity :</span>
                </div>
                <div class="col-sm-3">
                    <input id="quantity" type="number">
                </div>
            </div>
             <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Unit Price :</span>
                </div>
                <div class="col-sm-3">
                    <input id="uprice" type="text">
                </div>
            </div>
              <br>
            <div class="row">
                <div class="col-sm-3">
                    <input type="submit" value="Add Stock" class="btn btn-info" onclick="saveStock();">
                </div>
            </div>

        </div>
    </body>
    <script type="text/javascript">
        function loadModel(){
            var brand = document.getElementById("brandselect").value;
            
//            window.alert(brand);

            var request = new XMLHttpRequest();
            
            request.onreadystatechange = function(){
              if(request.readyState === 4 && request.status === 200){
                  document.getElementById("modelselect").innerHTML = request.responseText;
              }  
            };
            
            request.open("GET","ModelLoad?brand="+brand,true);
            request.send();
        }
        
        function saveStock(){
            var brand = document.getElementById("brandselect").value;
            var model = document.getElementById("modelselect").value;
            var quantity = document.getElementById("quantity").value;
            var uprice = document.getElementById("uprice").value;
            
//            window.alert(brand);
//            window.alert(model);
//            window.alert(quantity);
//            window.alert(uprice);

            var request = new XMLHttpRequest();
            
            request.onreadystatechange = function(){
              if(request.readyState === 4 && request.status === 200){
                  document.getElementById("stockmsg").innerHTML = request.responseText;
                  document.getElementById("brandselect").value = "";
                  document.getElementById("modelselect").value = "";
                  document.getElementById("uprice").value = "";
                  document.getElementById("quantity").value = "";
              }  
            };
            
            var parameters = "brand="+brand+"&model="+model+"&quantity="+quantity+"&uprice="+uprice;
            
            request.open("GET","SaveStock?"+parameters,true);
            request.send();
            
        }
        
    </script>
</html>
