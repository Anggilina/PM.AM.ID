<%-- 
    Document   : header
    Created on : Nov 11, 2018, 2:51:24 PM
    Author     : Maverick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
//    String alamat = "";

%>


<!DOCTYPE html>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>PM.AM.ID</title>

        <link href="./assets/css/css.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="./assets/css/bootstrap.css">
        <link rel="stylesheet" href="./assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="./assets/css/masterslider.css">
        <link rel="stylesheet" href="./assets/css/css/style.css">
        <link rel="stylesheet" href="./assets/css/style(1).css">
        <link rel="stylesheet" href="./assets/css/style(2).css">
        <link rel="stylesheet" href="./assets/css/responsive.css">
        <link rel="stylesheet" href="./assets/css/owl.theme.css">
        <link rel="stylesheet" href="./assets/css/owl.carousel.css">


        <script type="text/javascript" charset="UTF-8" src="./assets/js/common.js.download"></script><script type="text/javascript" charset="UTF-8" src="./assets/js/util.js.download"></script></head>

    <body style="">
        <div id="main-wrapper" style="">
            <header id="header">

                <!-- end .header-top-bar -->

                <div class="header-nav-bar">
                    <nav class="navbar navbar-default" role="navigation">
                        <div class="container">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <a class="navbar-brand" href="#">
                                    <img src="./assets/image/logo.png" width=280px height=50px alt="TakeAway" style="margin-top:-15px">
                                </a>
                            </div>

                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">



                                <%if ((session.getAttribute("Status") != null) && (session.getAttribute("Status").equals("admin"))) {%>
                                <ul class="nav navbar-nav navbar-right">


                                    <li
                                        <%if (alamat.equals("beranda")) {
                                                out.print("class='active'");
                                            }%> >
                                        <a href="index.jsp">Beranda</a>
                                    </li>
                                    <li
                                        <%if (alamat.equals("riwayat")) {
                                                out.print("class='active'");
                                            }%>
                                        ><a href="PesanController?proses=listpesan">Pesanan</a>
                                    </li>
                                    <li
                                        <%if (alamat.equals("minuman")) {
                                                out.print("class='active'");
                                            }%>
                                        ><a href="MinumanController?proses=listadmin">Minuman</a>
                                    </li>
                                    <li
                                        <%if (alamat.equals("tentang")) {
                                                out.print("class='active'");
                                            }%>
                                            
                                        class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Tentang <span class="caret"></span></a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="TentangController?proses=listtentangadmin">Tentang PM.AM.ID</a></li>
                                            <li><a href="KonfirmasiController?proses=listkonfrimasiadmin"> Layanan Pengunjung</a></li>
                                        </ul>
                                    </li>

                                    <li 
                                        <%if (alamat.equals("akun")) {
                                                out.print("class='active'");
                                            }%>

                                        class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><%=session.getAttribute("Nama_Akun")%> <span class="caret"></span></a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="PengaturanController?proses=UbahDataDiri">Ubah Data Diri</a></li>
                                            <li><a href="LoginController?proses=logout">Logout</a></li>


                                        </ul>
                                    </li>




                                </ul>


                                <%} else {%>


                                <ul class="nav navbar-nav navbar-right">

                                    <li
                                        <%if (alamat.equals("beranda")) {
                                                out.print("class='active'");
                                            }%> >
                                        <a href="index.jsp">Beranda</a>
                                    </li>
                                    <li
                                        <%if (alamat.equals("minuman")) {
                                                out.print("class='active'");
                                            }%>
                                        ><a href="MinumanController?proses=listminuman">Minuman</a>
                                    </li>
                                    <li
                                        <%if (alamat.equals("pesan")) {
                                                out.print("class='active'");
                                            }%>
                                        ><a href="pesan.jsp">Pemesanan</a>
                                    </li>
                                    <li
                                        <%if (alamat.equals("tentang")) {
                                                out.print("class='active'");
                                            }%>
                                            
                                        class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Tentang <span class="caret"></span></a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="TentangController?proses=listtentang">Tentang PM.AM.ID</a></li>
                                            <li><a href="KonfirmasiController?proses=listkonfrimasi"> Layanan Pengunjung</a></li>
                                        </ul>
                                    </li>

                                    <%
                                       if((session.getAttribute("Status") != null) && (session.getAttribute("Status").equals("member"))) {
                                    %>
                                    <li 
                                        <%if (alamat.equals("akun")) {
                                                out.print("class='active'");
                                            }%>

                                        class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><%=session.getAttribute("Nama_Akun")%> <span class="caret"></span></a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="PengaturanController?proses=UbahDataDiri">Ubah Data Diri</a></li>
                                            <li><a href="PesanController?proses=listpesanMember">Riwayat</a></li>
                                            <li><a href="LoginController?proses=logout">Logout</a></li>

                                        </ul>
                                    </li>
                                    <%
                                        }else {
                                    %>

                                    <li><a href="FormLogin.jsp">Login</a>
                                    </li>
                                    <%}%>
                                </ul>

                                <%}%>


                            </div>
                            <!-- /.navbar-collapse -->
                        </div>
                        <!-- /.container-fluid -->
                    </nav>
                </div>
                <!-- end .header-nav-bar -->

            </header>
            <!-- end #header -->
