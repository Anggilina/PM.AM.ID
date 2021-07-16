<%-- 
    Document   : FormPerbaruiMinuman
    Created on : Jan 14, 2020, 1:45:38 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.MinumanModel"%>
<%@page import="Entity.Minuman"%>
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
        Minuman mn = new Minuman();
        mn = (Minuman) request.getAttribute("menu");
        String gambarminuman = "";
        if (session.getAttribute("gambarminuman") != null) {
            gambarminuman = session.getAttribute("gambarminuman").toString();
        } else {
            gambarminuman = mn.getGambarMinuman();

        }

        if (request.getAttribute("menu") == null) {
            String id = session.getAttribute("idMinuman").toString();
            MinumanModel md = new MinumanModel();
            mn = md.ambilMinuman(id);
            gambarminuman = session.getAttribute("gambarminuman").toString();

        }

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
        <h1>Edit Minuman</h1>
        <form action="MinumanController" method="POST">
            <div class=" w3l-login-form" style="margin-left:  100px">
                 <div class="w3l-form-group">
                    <label>Gambar Minuman </label>
                    <div class="group">
                        <img src="./assets/image/<%=gambarminuman%>" id="blah" alt="" width="200px" height="190px">
                    </div>
                    <div class="group">
                    <input type="file" id="imgInp" name="gambarminuman" value="<%=gambarminuman%>" onchange="readURL(this);"  class="form-control" placeholder="Nama Akun" required="required" />

                    </div>
                </div>
            </div>
        <div class=" w3l-login-form" style="margin-right: 100px; margin-top: -480px">
            <!--   <h2>Registrasi</h2>-->

                <input type="hidden" name="gambarminuman" value="<%=gambarminuman%>" >
                <input type="hidden" name="idMinuman" value="<%=mn.getIdMinuman()%>" >

                <div class=" w3l-form-group">
                    <label>Nama Menu</label>
                    <div class="group">
                        <i class="fas fa-file-archive"></i>
                        <input type="text" value="<%=mn.getNamaMinuman()%>" name="namaMinuman" class="form-control" placeholder="Nama Menu" required="required" />

                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Harga Menu </label>
                    <div class="group">
                        <i class="fas fa-money-bill-alt"></i>
                        <input type="text" name="harga" value="<%=mn.getHargaMinuman()%>" class="form-control" placeholder="Harga Menu" required="required" />

                    </div>
                </div>
                 <div class=" w3l-form-group">
                    <label>Deskripsi Minuman</label>
                    <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <textarea name="desMinuman" placeholder="Deskripsi Minuman"><%=mn.getDesMinuman()%></textarea>
                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Status</label>
                        <select name="status">
                            <option><%=mn.getStatus()%></option>
                            <option value="Tersedia">Tersedia</option>
                            <option value="Tidak Tersedia">Tidak Tersedia</option>
                        </select>
                </div>
                <div class=" w3l-form-group">
                    <label>Jenis Minuman</label>
                       <select name="jenisMinuman">
                            <option><%=mn.getJenisMinuman()%></option>
                            <option value="Yang Terbaru">Yang Terbaru</option>
                            <option value="Yang Terlaku">Yang Terlaku</option>
                            <option value="Yang Terpopuler">Yang Terpopuler</option>
                        </select>
                </div>

                <input type="hidden" name="proses" value="editminumanaksi" >
                <button type="submit">Edit Minuman</button>
            
        </div>
</form>
        <footer>
            <p class="copyright-agileinfo"> &copy; 2018 Material Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
        </footer>

    </body>
</html>
<script>
    function readURL(input) {

        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#blah').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }

    $("#imgInp").change(function () {
        readURL(this);
    });
</script>
