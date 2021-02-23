<%-- 
    Document   : ProductView
    Created on : Feb 2, 2018, 2:41:23 PM
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
    <body onload="productView(0);">
        <div class="container">
            <h1 class="breadcrumb">Product View</h1>
            <div>
                <table>
                    <tr id="tr2">
                    
                    </tr>
                </table>
            </div>
            <div style="margin-left: 900px;">
                <span>No. of items per row</span>
                <select id="cols" onchange="productView();">
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
                <br>
                <br>
            </div>
            <table>
                <tbody id="tbody1">

                </tbody>
            </table>

        </div>
        <script type="text/javascript">
            function productView(i) {

                var request = new XMLHttpRequest();

                request.onreadystatechange = function () {
                    if (request.readyState === 4 && request.status === 200) {
                        document.getElementById("tbody1").innerHTML = request.responseText.split(",")[0];
                        document.getElementById("tr2").innerHTML = request.responseText.split(",")[1];
                    }
                };

                var cols = document.getElementById("cols").value;

                request.open("GET", "ViewProduct?cols=" + cols+"&i="+i, true);
                request.send();

            }

        </script>
    </body>
</html>
