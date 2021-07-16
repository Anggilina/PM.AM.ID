<%-- 
    Document   : riwayat
    Created on : Nov 11, 2018, 3:58:17 PM
    Author     : Maverick
--%>
<%@page import="Model.MinumanModel"%>
<%@page import="Entity.Minuman"%>
<%@page import="Entity.Pesan"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="Entity.Pesan"%>

<%
    String alamat ="riwayat";
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

                                            Date ys = new Date(); // membuat oject ys dari class Date

                                            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");//membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
                                            String tanggal = s.format(ys);
                                            String button = "";
                                            if (mP.getStatus().equals("proses")) {
                                                button = "warning";
                                            } else if (mP.getStatus().equals("selesai")) {
                                                button = "success";
                                            } else if (mP.getStatus().equals("batal")) {
                                                button = "danger";
                                            }
                                    %>

                                    <% if (mP.getTanggal().equals(tanggal)) {%>
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <div class="latest-from-blog">
                                            <div class="blog-latest">
                                                <div class="row" style="height: 250px ;margin-top: -20px">
                                                    <div class="col-md-6 col-sm-12" >
                                                        <img class="" src="./assets/image/<%=mn.getGambarMinuman()%>"  alt="blog-image">
                                                    </div>
                                                    <div class="col-md-6 col-sm-12">
                                                        <h5><a href="#"><%= mn.getNamaMinuman()%></a>
                                                        </h5>
                                                        <p>
                                                            <i class="fa fa-clock-o"></i>
                                                            <span class="date"><%=mP.getJamPengambilan()%></span>
                                                            <br>
                                                            <i class="fa fa-book"></i>
                                                            <span class="date">Catatan</span>
                                                            <textarea disabled><%=mP.getKeterangan()%>
                                                            </textarea>
                                                        </p>
                                                        <!--<p class="bl-sort">Rp. 15.000</p>-->
                                                        <h6>
                                                            <i class="fa fa-money"></i>
                                                            Rp. <%=mP.getTotal()%> (<%=mP.getJumlah()%>)
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
                                                    <% }
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

                                            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd"); //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
                                            String tanggal = s.format(ys);
                                            String button = "";
                                            if (mP.getStatus().equals("proses")) {
                                                button = "warning";
                                            } else if (mP.getStatus().equals("selesai")) {
                                                button = "success";
                                            } else if (mP.getStatus().equals("batal")) {
                                                button = "danger";
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
                                                        <h5><a href="#"><%= mn.getNamaMinuman()%></a>
                                                        </h5>
                                                        <p>
                                                            <i class="fa fa-clock-o"></i>
                                                            <span class="date"><%=mP.getJamPengambilan()%></span>
                                                            <br>
                                                            <i class="fa fa-book"></i>
                                                            <span class="date">Catatan</span>
                                                            <textarea disabled><%=mP.getKeterangan()%>
                                                            </textarea>
                                                        </p>
                                                        <!--<p class="bl-sort">Rp. 15.000</p>-->
                                                        <h6>
                                                            <i class="fa fa-money"></i>
                                                            Rp. <%=mP.getTotal()%> (<%=mP.getJumlah()%>)
                                                        </h6>
                                                        <%

                                                        %>
                                                        <button class="btn btn-<%=button%>"><%=mP.getStatus()%></button>
                                                    </div>
                                                    <!--end .blog-details-->
                                                </div>
                                                <!--end .row-->
                                            </div>
                                        </div>
                                        <!--end .blog-latest -->
                                    </div>
                                    <%
                                        }%>
                                        
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
        </div>
    </div>

</div>

</div>







<%@include file="footer.jsp" %>