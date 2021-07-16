<%-- 
    Document   : tambahMinuman
    Created on : Nov 12, 2018, 4:09:24 PM
    Author     : Maverick
--%>

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
        <h1>Tambah Minuman</h1>
        <form action="MinumanController" method="POST">
            <div class=" w3l-login-form" style="margin-left:  100px">
                
                <div class=" w3l-form-group">
                    <label>Gambar Minuman</label>
                    <div class="group">
                        <img src="./assets/image/<%=request.getAttribute("gambarminuman")%>" id="blah" alt="" width="380px" height="200px">
                    </div>
                    <div class="group">
                        <input type="file" id="imgInp" name="gambarminuman" value="<%=session.getAttribute("gambarminuman")%>" onchange="readURL(this);"  class="form-control" placeholder="Nama Akun" required="required" />
                        <input type="hidden" name="gambarminuman" value="<%=request.getAttribute("gambarminuman")%>" > 
                    </div>
                </div>
            </div>
        <div class=" w3l-login-form" style="margin-right: 100px; margin-top: -480px">
            <!--   <h2>Registrasi</h2>-->

                
                
                <div class=" w3l-form-group">
                    <label>id Minuman</label>
                    <div class="group">
                        <i class="fas fa-file-archive"></i>
                        <input type="text" name="idMinuman" class="form-control" placeholder="Id Minuman" required="required" />

                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Nama Minuman</label>
                    <div class="group">
                        <i class="fas fa-file-archive"></i>
                        <input type="text" name="namaMinuman" class="form-control" placeholder="Nama Minuman" required="required" />

                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Harga Minuman </label>
                    <div class="group">
                        <i class="fas fa-money-bill-alt"></i>
                        <input type="text" name="harga" class="form-control" placeholder="Harga Minuman" required="required" />

                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Deskripsi Minuman</label>
                    <div class="group">
                        <i class="fas fa-pen-square"></i>
                        <textarea name="desMinuman" placeholder="Deskripsi Minuman"></textarea>
                    </div>
                </div>
                <div class=" w3l-form-group">
                    <label>Status</label>
                        <select name="status">
                            <option value="Tersedia">Tersedia</option>
                            <option value="Tidak Tersedia">Tidak Tersedia</option>
                        </select>
                </div>
                <div class=" w3l-form-group">
                    <label>Jenis Minuman</label>
                       <select name="jenisMinuman">
                            <option value="Yang Terbaru">Yang Terbaru</option>
                            <option value="Yang Terlaku">Yang Terlaku</option>
                            <option value="Yang Terpopuler">Yang Terpopuler</option>
                        </select>
                </div>

                <input type="hidden" name="proses" value="tambahminuman" >
                <button type="submit">Tambah Minuman</button>
        </div>
</form>
        <footer>
            <p class="copyright-agileinfo"> &copy; 2019 Material Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
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