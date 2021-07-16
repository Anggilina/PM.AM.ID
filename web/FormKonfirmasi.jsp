<%-- 
    Document   : FormKonfirmasi
    Created on : Jan 17, 2020, 10:22:15 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.KonfirmasiModel"%>
<%@page import="Entity.Konfirmasi"%>
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
        Konfirmasi km = new Konfirmasi();
        km = (Konfirmasi) request.getAttribute("konfirmasiList");
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
        <h1>Jawab</h1>
        <form action="KonfirmasiController" method="POST">
            <!--   <h2>Registrasi</h2>-->
            <div class=" w3l-login-form">
                <div class=" w3l-form-group">
                    <label>Pertanyaan</label>
                    <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <%=km.getPertanyaan()%>
                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Jawaban </label>
                    <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <input type="text" name="jawaban" value="<%=km.getJawaban()%>" class="form-control" placeholder="Jawaban" required="required" />

                    </div>
                </div>
                 <input type="hidden" name="idkonfirmasi" value="<%=km.getIdKonfrimasi()%>" >
                 <input type="hidden" name="Nama_AkunM" value="<%=km.getNamaAkunM()%>" >
                 <input type="hidden" name="pertanyaan" value="<%=km.getPertanyaan()%>" >
                 <input type="hidden" name="Nama_AkunA" value="<%=session.getAttribute("Nama_Akun")%>" >
                <input type="hidden" name="proses" value="editkonfirmasiaksi" >
                <button type="submit">Edit</button>
            </div>
</form>
        <footer>
            <p class="copyright-agileinfo"> &copy; 2018 Material Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
        </footer>

    </body>

</html>

