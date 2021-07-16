<%-- 
    Document   : search
    Created on : Jan 26, 2020, 3:56:36 PM
    Author     : user
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Model.MinumanModel"%>
<%@page import="Entity.Minuman"%>
<%@page import="Entity.Pesan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String alamat = "";
    Pesan[] mPesanList = (Pesan[]) request.getAttribute("pesanList");

%>

<%@include file="header.jsp" %>
<div id="page-content" style="height: 800px; margin-left: 100px">
    <div class="container">


        <div class="row">

            <div class="col-md-8">

                <ul class="nav nav-tabs mt30" role="tablist">
                    <li class="active"><a href="#tab-1" role="tab" data-toggle="tab">Pesanan</a>
                    </li>
                    <li><a href="#tab-2" role="tab" data-toggle="tab">Riwayat</a>
                    </li>

                </ul>

                <div class="tab-content">
                    <div class="tab-pane fade in active" id="tab-1">
                        <!--xx-->

                        <!--Start blog feed section-->
                        <div class="latest-from-blog text-center">
                            <div class="container">
                                <div class="row">
                                    <%
                                        for (int i = 0; i < mPesanList.length; i++) {
                                            Pesan mP = mPesanList[i];

                                            Minuman mn = new Minuman();
                                            MinumanModel mm = new MinumanModel();
                                            mn = mm.ambilMinuman(mP.getIdMinuman());

                                            //Date ys = new Date(); // membuat oject ys dari class Date

                                            //SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy"); //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
                                            //String tanggal = s.format(ys);
                                            String button = "";
                                            if (mP.getStatus().equals("proses")) {
                                                button = "warning";
                                            } else if (mP.getStatus().equals("selesai")) {
                                                button = "success";
                                            } else if (mP.getStatus().equals("batal")) {
                                                button = "danger";
                                            }
                                    %>

                                    <% if (mP.getStatus().equals("selesai")) {%>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <div class="latest-from-blog">
                                            <div class="blog-latest">
                                                <div class="row" style="height: 250px ;margin-top: -20px">
                                                    <div class="col-md-6 col-sm-12" >
                                                        <img class="" src="./assets/image/<%=mn.getGambarMinuman()%>"  alt="blog-image">

                                                    </div>
                                                    <div class="col-md-6 col-sm-12">
                                                        <span class="icon-link" style="margin-left:220px">
                                                            <a href="PesanController?proses=hapuspesan&idPesan=<%=mP.getIdPesan()%>">
                                                                <i class="fa fa-times" style="color:red"></i>
                                                            </a>
                                                        </span>
                                                        <h5 style="margin-top:-30px"><a href="#"><%= mn.getNamaMinuman()%></a>
                                                        </h5>
                                                                <i class="fa fa-clock-o"></i>
                                                            <span class="date"><%=mP.getJamPengambilan()%></span><br>
                                                            <i class="fas fa-user-tag"></i>
                                                            <span class="date"><%=mP.getNamaAkunM()%></span><br>
                                                            <i class="fa fa-book"></i>
                                                            <span class="date">Catatan</span><br>
                                                            <textarea disabled><%=mP.getKeterangan()%>
                                                            </textarea>
                                                        <!--<p class="bl-sort">Rp. 15.000</p>-->
                                                        <h6>
                                                            <i class="fa fa-money"></i>
                                                            Rp. <%=mP.getTotal()%> <%=mP.getJumlah()%>
                                                        </h6>
                                                        <button class="btn btn-<%=button%>"><%=mP.getStatus()%></button>
                                                    </div>
                                                    <!--end .blog-details-->
                                                </div>
                                                <!--end .row-->
                                            </div>
                                        </div>
                                        <!--end .blog-latest -->
                                    </div>
                                    <%}
                                        }%>

                                </div>
                                <!--end .row main-->

                            </div>
                            <!--end container-->
                        </div>
                        <!--end .latest-from-blog-->


                        <!--xx-->
                    </div>
                    <div class="tab-pane fade" id="tab-2">
                        <!--xx-->

                        <!--Start blog feed section-->
                        <div class="latest-from-blog text-center">
                            <div class="container">
                                <div class="row">

                                    <%
                                        for (int i = 0; i < mPesanList.length; i++) {
                                            Pesan mP = mPesanList[i];

                                            Minuman mn = new Minuman();
                                            MinumanModel mm = new MinumanModel();
                                            mn = mm.ambilMinuman(mP.getIdMinuman());

                                            Date ys = new Date(); // membuat oject ys dari class Date

                                            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy"); //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
                                            String tanggal = s.format(ys);
                                            String color = "";
                                            if (mP.getStatus().equals("proses")) {
                                                color = "brown";
                                            } else if (mP.getStatus().equals("selesai")) {
                                                color = "green";
                                            }
                                    %>

                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <div class="latest-from-blog">
                                            <div class="blog-latest">
                                                <div class="row" style="height: 250px ;margin-top: -20px">
                                                    <div class="col-md-6 col-sm-12" >
                                                        <img class="" src="./assets/image/<%=mn.getGambarMinuman()%>"  alt="blog-image">
                                                    </div>
                                                    <div class="col-md-6 col-sm-12">
                                                        <span class="icon-link" style="margin-left:220px">
                                                            <a href="PesanController?proses=hapuspesan&idPesan=<%=mP.getIdPesan()%>">
                                                                <i class="fa fa-times" style="color:red"></i>
                                                            </a>
                                                        </span>
                                                        <h5 style="margin-top:-30px"><a href="#"><%= mn.getNamaMinuman()%></a>
                                                        </h5>
                                                            <i class="fa fa-clock-o"></i>
                                                            <span class="date"><%=mP.getJamPengambilan()%></span><br>
                                                            <i class="fas fa-user-tag"></i>
                                                            <span class="date"><%=mP.getNamaAkunM()%></span><br>
                                                            <i class="fa fa-book"></i>
                                                            <span class="date">Catatan</span><br>
                                                            <textarea disabled><%=mP.getKeterangan()%>
                                                            </textarea>
                                                        <!--<p class="bl-sort">Rp. 15.000</p>-->
                                                        <h6>
                                                            <i class="fa fa-money"></i>
                                                            Rp. <%=mP.getTotal()%>  (<%=mP.getJumlah()%>)<br>
                                                        </h6>
                                                        <h5 style="color: <%=color%>; margin-top: 10px"><%=mP.getStatus()%></h5>
                                                    </div>
                                                    <div class="col-md-12" style="margin-left:250px">
                                                        <a href="PesanController?proses=ubahstatuspesan&idPesan=<%=mP.getIdPesan()%>&status=proses">  <button class="btn btn-warning">Proses</button></a>
                                                        <a href="PesanController?proses=ubahstatuspesan&idPesan=<%=mP.getIdPesan()%>&status=selesai">   <button class="btn btn-success">Selesai</button></a>
                                                        <a href="PesanController?proses=ubahwaktu&idPesan=<%=mP.getIdPesan()%>"><button class="btn btn-warning">Ubah Jam</button></a>
                                                    </div>
                                                </div>
                                                <!--end .row-->
                                            </div>
                                        </div>
                                        <!--end .blog-latest -->
                                    </div>
                                    <%                                        }%>



                                </div>
                                <!--end .row main-->

                            </div>
                            <!--end container-->
                        </div>
                        <!--end .latest-from-blog-->


                        <!--xx-->


                    </div>

                </div>
            </div>
                <div class="col-md-4">
                <div class="events-side-panel">
                    <div class="search-keyword">
                        <form action="PesanController" method="post">
                        <input type="text" name="search" placeholder="Search">
                        <input type="hidden" name="proses" value="cari">
                        <button type="submit" value=""><i class="fa fa-search"></i>
                        </button>
                        </form>
                    </div>
                </div>
            </div>
                                    
        </div>
           
    </div>
</div>
</div>







<%@include file="footer.jsp" %>
