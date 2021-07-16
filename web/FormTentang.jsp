<%-- 
    Document   : FormTentang
    Created on : Jan 17, 2020, 1:34:36 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.TentangModel"%>
<%@page import="Entity.Tentang"%>
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
        Tentang mn = new Tentang();
        mn = (Tentang) request.getAttribute("tentangLi");
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
        <h1>Edit Tentang</h1>
        <form action="TentangController" method="POST">
            <!--   <h2>Registrasi</h2>-->
            <div class=" w3l-login-form">
                <div class=" w3l-form-group">
                    <label>Pemilik</label>
                    <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <input type="text" value="<%=mn.getPemilik()%>" name="pemilik" class="form-control" placeholder="Nama Menu" required="required" />

                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Lokasi </label>
                    <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <input type="text" name="lokasi" value="<%=mn.getLokasi()%>" class="form-control" placeholder="Harga Menu" required="required" />

                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Hari Buka</label>
                    <div class="group">
                       <i class="fas fa-pen-square"></i>
                        <input type="text"  value="<%=mn.getHariBuka()%>" class="form-control" placeholder="Deskripsi Menu" name="hari_buka" required="required" />
                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Jam Oprasional</label>
                        <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <input type="text"  value="<%=mn.getJamOperasional()%>" class="form-control" placeholder="Deskripsi Menu" name="jam_oprasional" required="required" />
                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Jam Tutup</label>
                       <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <input type="text"  value="<%=mn.getJamTutup()%>" class="form-control" placeholder="Deskripsi Menu" name="jam_tutup" required="required" />
                    </div>
                </div>
                    <div class=" w3l-form-group">
                    <label>Deskripsi</label>
                    <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <textarea name="deskripsi" placeholder="Deskripsi"><%=mn.getDeskripsi()%></textarea>
                    </div>
                </div>
                 <input type="hidden" name="idpemilik" value="<%=mn.getIdPemilik()%>" >
                <input type="hidden" name="proses" value="memperbaruiTentang" >
                <button type="submit">Edit Tentang</button>
            </div>
</form>
        <footer>
            <p class="copyright-agileinfo"> &copy; 2018 Material Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
        </footer>

    </body>

</html>
