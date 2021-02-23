<%-- 
    Document   : Brand View
    Created on : Feb 4, 2018, 7:54:08 AM
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
    <body onload="m(0);">
        <div class="container">
            <h1 class="breadcrumb">Brand View</h1>

            <table>
                <tbody>
                <tr id="tr1">
                    
                </tr>
                <tbody>
            </table>
            
            <br>
            <br>
            <br>
            
            <table>
                <tbody id="tbody2">
                    
                </tbody>
            </table>
            
            
            
        </div>
    </body>
    <script type="text/javascript">
        function m(i){
            var request = new XMLHttpRequest();
            
            request.onreadystatechange = function (){
              if(request.readyState === 4 && request.status === 200){
                  document.getElementById("tbody2").innerHTML = request.responseText.split(",")[0];
                  document.getElementById("tr1").innerHTML = request.responseText.split(",")[1];
              }  
            };
            
            request.open("GET","BrandView?i="+i,true);
            request.send();
        }
    </script>
</html>
