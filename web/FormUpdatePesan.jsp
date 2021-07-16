<%-- 
    Document   : FormPerbaruiWaktu
    Created on : Jan 18, 2020, 10:11:58 PM
    Author     : user
--%>

<%@page import="Model.PesanModel"%>
<%@page import="Entity.Pesan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
    <%
         Pesan ps = new Pesan();
        ps = (Pesan) request.getAttribute("Form");

    %>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <!-- /meta tags -->
        <!-- custom style sheet -->
        <link href="./assets/csslogin/style.css" rel="stylesheet" type="text/css" />
        <!-- /custom style sheet -->
        <!-- fontawesome css -->
        <link href="./assets/csslogin/fontawesome-all.css" rel="stylesheet" />
        <!-- /fontawesome css -->
        <!-- google fonts-->
        <link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
              rel="stylesheet">
        <!-- /google fonts-->

    </head>


    <body>
        <h1>Edit Menu</h1>
        <form action="PesanController" method="POST">
            <!--   <h2>Registrasi</h2>-->
<div class=" w3l-login-form">
                <div class=" w3l-form-group">
                    <label>Jam Pemngambilan</label>
                    <div class="group">
                        <i class="fas fa-file-archive"></i>
                        <input type="text" value="<%=ps.getJamPengambilan()%>" name="jam_pengambilan" class="form-control" placeholder="Nama Menu" required="required" />

                    </div>
                </div>
                <input type="hidden" name="idPesan" value=<%=ps.getIdPesan()%>>
                <input type="hidden" name="proses" value="ubahaksiwaktu" >
                <button type="submit">Edit Menu</button>
</div>
            
</form>
        <footer>
            <p class="copyright-agileinfo"> &copy; 2018 Material Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
        </footer>

    </body>

</html>
