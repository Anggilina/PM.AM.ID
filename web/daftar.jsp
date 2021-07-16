<%-- 
    Document   : registrasi
    Created on : Nov 7, 2019, 4:09:24 PM
    Author     : user
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
    <title>Daftar</title>
</head>


<body>
<center> <h1>Selamat Datang di PM.AM.ID </h1> </center>
    <div class=" w3l-login-form">
        <h2>DAFTAR</h2>
        <% String pesan=(String) request.getAttribute("pesan");
           if(pesan!= null){ %>
           <h4 style="color:red"><%=pesan%></h4>
           <%}%>
        <form action="DaftarController" method="POST">

            <div class=" w3l-form-group">
                <label>Nama</label>
                <div class="group">
                    <i class="fas fa-user"></i>
                    <input type="text" name="nama_akun" class="form-control" placeholder="Nama Akun"  required="required"  />
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>Email</label>
                <div class="group">
                    <i class="fas fa-envelope"></i>
                    <input type="text" name="email" class="form-control" placeholder="Email"  required="required"  />
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>No Hp</label>
                <div class="group">
                     <i class="fas fa-phone"></i>
                    <input type="text" name="no_hp" class="form-control" placeholder="No Hp"  required="required"  />
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>Jenis Kelamin</label>
                 <input type="radio" id="under_13" value="L" name="pilih"><label-2>Laki-Laki</label-2><br>
                 <input type="radio" id="over_13" value="P" name="pilih"><label-2>Perempuan</label-2>
            </div>
            <div class=" w3l-form-group">
                <label>Kata Sandi</label>
                <div class="group">
                    <i class="fas fa-lock"></i>
                    <input type="password" name="kata_sandi" class="form-control" placeholder="Kata Sandi" required="required" />
                </div>
            </div>
               <div class=" w3l-form-group">
                <label>Konfirmasi Kata Sandi</label>
                <div class="group">
                    <i class="fas fa-unlock"></i>
                    <input type="password" name="konfirmasikata_sandi" class="form-control" placeholder="Konfirmasi Kata Sandi" required="required" />
                </div>
            </div>
            
            <input type="hidden" name="proses" value="daftar" >
            <button type="submit">Daftar</button></a>
        </form>
        <p class=" w3l-register-p">Sudah Memiliki Akun?<a href="FormLogin.jsp" class="register">Masuk</a></p>
    </div>
    <footer>
        <p class="copyright-agileinfo"> &copy; 2019 Material Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
    </footer>

</body>

</html>
