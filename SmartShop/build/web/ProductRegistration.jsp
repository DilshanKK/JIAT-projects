<%-- 
    Document   : ProductRegistration
    Created on : Feb 1, 2018, 6:04:55 PM
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
            <h1 class="breadcrumb">Product Registration</h1>
            <br>
            <h4 id="product_msg" style="color: tomato;"></h4>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Brand Name :</span>
                </div>
                <div class="col-sm-3">
                    <select id="brand_select">
                        <%
                            Session hs = NewHibernateUtil.getSessionFactory().openSession();
                            Criteria cr = hs.createCriteria(Brand.class);
                            
                            List<Brand> li=cr.list();
                            
                            for(Brand b : li){
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
                    
                </div>
                <div class="col-sm-2">
                    <input id="brand_name" type="text" placeholder="Enter New Brand Name...">
                </div>
                <div class="col-sm-3">
                    <input type="submit" value="Add New Brand" class="btn btn-sm" onclick="addBrand();">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Model :</span>
                </div>
                <div class="col-sm-3">
                    <input id="model" type="text">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Released Date :</span>
                </div>
                <div class="col-sm-3">
                    <input id="date" type="date">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Description :</span>
                </div>
                <div class="col-sm-3">
                    <textarea id="description">
                        
                    </textarea>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <span>Product Image :</span>
                </div>
                <div class="col-sm-4">
                    <label for="file">
                        <img src="icons/upload.png" style="margin-top: -20px;">
                    </label>
                    <input id="file" type="file" onchange="loadImage();" style="display: none;">
                </div>
                <div class="col-sm-3">
                    <img id="preview_image" style="border-width: 2px;
                         width: 350px;
                         height: 350px;
                         min-width: 350px;
                         min-height: 350px;
                         max-width: 350px;
                         max-height: 350px;
                         margin-top: -260px;
                         ">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-3">
                    <input type="submit" value="Add Product" class="btn btn-info" onclick="saveProduct();">
                </div>
            </div>
        </div>
        <script type="text/javascript">
            function addBrand(){
                var brand = document.getElementById("brand_name").value;
                
                var request = new XMLHttpRequest();
                
                request.onreadystatechange = function(){
                  if(request.readyState === 4 && request.status === 200){
                      document.getElementById("brand_select").innerHTML += request.responseText;
                      document.getElementById("brand_name").value = "";
                  }  
                };
                
                request.open("GET","AddBrand?brand="+brand,true);
                request.send();
                
            }
            function loadImage(){
                var file = document.getElementById("file").files[0];
                var reader = new FileReader();
                reader.readAsDataURL(file);
                
                reader.onload = function(content){
                    document.getElementById("preview_image").src = content.target.result;
                };
            }
            function saveProduct(){
                var brand = document.getElementById("brand_select").value;
                var model = document.getElementById("model").value;
                var date = document.getElementById("date").value;
                var description = document.getElementById("description").value;
                var file = document.getElementById("file");
                
//                alert(brand);
//                alert(model);
//                alert(date);
//                alert(description);
//                alert(file.value);

                var all_files = file.files[0];
                var form = new FormData();
                form.append("brand",brand);
                form.append("model",model);
                form.append("date",date);
                form.append("description",description);
                form.append("file",all_files);
                
                var request= new XMLHttpRequest();
                
                request.onreadystatechange = function(){
                  if(request.readyState === 4 && request.status === 200){
                      document.getElementById("product_msg").innerHTML = request.responseText;
                      document.getElementById("brand_select").value="Apple";
                      document.getElementById("model").value="";
                      document.getElementById("date").value="";
                      document.getElementById("description").value="";
                      document.getElementById("preview_image").src="";
                  }  
                };
                
                request.open("POST","ProductSave",true);
                request.send(form);
                
            }
        </script>
    </body>
</html>
