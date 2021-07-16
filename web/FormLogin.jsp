<%-- 
    Document   : login
    Created on : Nov 12, 2018, 3:58:56 PM
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
    <title>Masuk</title>
    <!-- meta tags -->
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="keywords" content="Art Sign Up Form Responsive Widget, Audio and Video players, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, 
		Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design"
    />
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
<center><h1><b>Selamat Datang di PM.AM.ID</b></h1></center>
   <div class=" w3l-login-form">
       <h2><b>MASUK </b></h2>
            <% String pesan=(String) request.getAttribute("pesan");
           if(pesan!= null){ %>
           <h4 style="color:red"><%=pesan%></h4>
           <%}%>
        <form action="LoginController" method="POST">

            <div class=" w3l-form-group">
                <label>Nama Akun</label>
                <div class="group">
                    <i class="fas fa-user"></i>
                    <input type="text" name="nama_akun" class="form-control" placeholder="Nama Akun"  required="required"  />
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>Kata Sandi</label>
                <div class="group">
                    <i class="fas fa-unlock"></i>
                    <input type="password" name="kata_sandi" class="form-control" placeholder="Kata sandi"  required="required" />
                </div>
            </div>
            
            <input type="hidden" name="proses" value="login" >
            <button type="submit">Masuk</button></a>
        </form>
        <p class=" w3l-register-p">Belum Memiliki Akun?<a href="daftar.jsp" class="register"> Daftar Sekarang</a></p>
    </div>
    <footer>
    </footer>

</body>

</html>