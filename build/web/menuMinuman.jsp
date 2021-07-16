<%-- 
    Document   : menuMinuman
    Created on : Jan 13, 2020, 9:06:03 PM
    Author     : user
--%>

<%@page import="Model.MinumanModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Minuman"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String alamat = "menu";
    Minuman[] mMenuList = (Minuman[]) request.getAttribute("menuList");
%>


<%@include file="header.jsp" %>
<!-- thumbnail slide section -->
<div id="page-content">

    <!-- start #main-wrapper -->
    <div class="container">
        <div class="row mt30">

            <div class="col-md-8 col-md-push-0">
                <ul class="nav nav-tabs" role="tablist">
                    <li class="active"><a href="#tab-1" role="tab" data-toggle="tab">Semua</a>
                    </li>
                    <li class=""><a href="#tab-2" role="tab" data-toggle="tab">Yang Terbaru</a>
                    </li>
                    <li class=""><a href="#tab-3" role="tab" data-toggle="tab">Yang Terlaku</a>
                    </li>
                    <li class=""><a href="#tab-4" role="tab" data-toggle="tab">Yang Terpopuler</a>
                    </li>
                </ul>



                <!-- end view-style -->

                <div class="tab-content">
                    <div class="tab-pane fade active in" id="tab-1">
                        <div class="all-menu-details">
                            <h5>Yang Terbaru</h5>
                            <%
                                for (int i = 0; i < mMenuList.length; i++) {
                                    Minuman mn = mMenuList[i];
                                    if (mn.getJenisMinuman().equals("Yang Terbaru")&& mn.getStatus().equals("Tersedia")) {

                            %>
                            <div class="item-list right-checkout">
                                <div class="list-image">
                                    <img src="./assets/image/<%=mn.getGambarMinuman()%>" alt="">
                                </div>
                                <div class="all-details">
                                    <div class="visible-option">
                                        <div class="details">
                                            <h6><a href="#"><%=mn.getNamaMinuman()%></a>
                                            </h6>
                                            <p class="for-list"><%=mn.getDesMinuman()%></p>
                                        </div>

                                        <div class="price-option fl">
                                            <h4><%=mn.getHargaMinuman()%></h4>
                                            <button class="toggle"> Tambah</button>
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="qty-cart text-center clearfix">
                                            <h6>Jumlah</h6>
                                            <form action="PesanController" method="POST">
                                                <input type="hidden" name="idMinuman" value="<%=mn.getIdMinuman()%>">
                                                <input type="hidden" name="harga" value="<%=mn.getHargaMinuman()%>">
                                                <input type="text" name="jumlah" value="1">
                                                <input type="hidden" name="catatan" value=" ">
                                                <input type="hidden" name="jam_pengambilan" value="00:00 ">
                                                <input type="hidden" name="proses" value="masukkeranjang">
                                                <br>
                                                
                                                <input type="submit" value="Pesan" class="btn-default-orange" >

                                                </div> <!-- end .qty-cart -->
                                                </div> <!-- end .visible-option -->	

                                                <div class="dropdown-option clearfix" style="display: none;">
                                                    <div class="dropdown-details">
                                                        <h6>Catatan</h6>
                                                        <input type="text" name="catatan1"  style="width: 200px;height: 100px">

                                                        <button type="submit" class="btn btn-default-orange"><i class="fa fa-plus"></i><i class="fa fa-shopping-cart"></i></button>
                                                        <!-- <a class="btn btn-default-black">Cancle</a>-->
                                                        </form>
                                                    </div>
                                                    <!--end .dropdown-details-->
                                                </div>
                                                <!--end .dropdown-option-->
                                        </div>
                                        <!-- end .all-details -->
                                    </div>
                                    <!-- end .item-list -->


                                    <%}
                                }%>


                                    <h5>Yang Terlaku</h5>
                                    <%
                                        for (int i = 0; i < mMenuList.length; i++) {
                                            Minuman mn = mMenuList[i];
                                            if (mn.getJenisMinuman().equals("Yang Terlaku")&& mn.getStatus().equals("Tersedia")) {

                                    %>
                                    <div class="item-list right-checkout">
                                <div class="list-image">
                                    <img src="./assets/image/<%=mn.getGambarMinuman()%>" alt="">
                                </div>
                                <div class="all-details">
                                    <div class="visible-option">
                                        <div class="details">
                                            <h6><a href="#"><%=mn.getNamaMinuman()%></a>
                                            </h6>
                                            <p class="for-list"><%=mn.getDesMinuman()%></p>
                                        </div>

                                        <div class="price-option fl">
                                            <h4><%=mn.getHargaMinuman()%></h4>
                                            <button class="toggle"> Tambah</button>
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="qty-cart text-center clearfix">
                                            <h6>Jumlah</h6>
                                            <form action="PesanController" method="POST">
                                                <input type="hidden" name="idMinuman" value="<%=mn.getIdMinuman()%>">
                                                <input type="hidden" name="harga" value="<%=mn.getHargaMinuman()%>">
                                                <input type="text" name="jumlah" value="1">
                                                <input type="hidden" name="catatan" value=" ">
                                                <input type="hidden" name="jam_pengambilan" value="00:00 ">
                                                <input type="hidden" name="proses" value="masukkeranjang">
                                                <br>
                                                
                                                <input type="submit" value="Pesan" class="btn-default-orange" >

                                                </div> <!-- end .qty-cart -->
                                                </div> <!-- end .visible-option -->	

                                                <div class="dropdown-option clearfix" style="display: none;">
                                                    <div class="dropdown-details">
                                                        <h6>Catatan</h6>
                                                        <input type="text" name="catatan1"  style="width: 200px;height: 100px">

                                                        <button type="submit" class="btn btn-default-orange"><i class="fa fa-plus"></i><i class="fa fa-shopping-cart"></i></button>
                                                        <!-- <a class="btn btn-default-black">Cancle</a>-->
                                                        </form>
                                                    </div>
                                                    <!--end .dropdown-details-->
                                                </div>
                                                <!--end .dropdown-option-->
                                        </div>
                                        <!-- end .all-details -->
                                    </div>
                                    <!-- end .item-list -->


                                    <%}
                                }%>

                                    <h5>Yang Terpopuler</h5>

                                    <%
                                        for (int i = 0; i < mMenuList.length; i++) {
                                            Minuman mn = mMenuList[i];
                                            if (mn.getJenisMinuman().equals("Yang Terpopuler")&& mn.getStatus().equals("Tersedia")) {

                                    %>
                                   <div class="item-list right-checkout">
                                <div class="list-image">
                                    <img src="./assets/image/<%=mn.getGambarMinuman()%>" alt="">
                                </div>
                                <div class="all-details">
                                    <div class="visible-option">
                                        <div class="details">
                                            <h6><a href="#"><%=mn.getNamaMinuman()%></a>
                                            </h6>
                                            <p class="for-list"><%=mn.getDesMinuman()%></p>
                                        </div>

                                        <div class="price-option fl">
                                            <h4><%=mn.getHargaMinuman()%></h4>
                                            <button class="toggle"> Tambah</button>
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="qty-cart text-center clearfix">
                                            <h6>Jumlah</h6>
                                            <form action="PesanController" method="POST">
                                                <input type="hidden" name="idMinuman" value="<%=mn.getIdMinuman()%>">
                                                <input type="hidden" name="harga" value="<%=mn.getHargaMinuman()%>">
                                                <input type="text" name="jumlah" value="1">
                                                <input type="hidden" name="catatan" value=" ">
                                                <input type="hidden" name="jam_pengambilan" value="00:00 ">
                                                <input type="hidden" name="proses" value="masukkeranjang">
                                                <br>
                                                
                                                <input type="submit" value="Pesan" class="btn-default-orange" >

                                                </div> <!-- end .qty-cart -->
                                                </div> <!-- end .visible-option -->	

                                                <div class="dropdown-option clearfix" style="display: none;">
                                                    <div class="dropdown-details">
                                                        <h6>catatan</h6>
                                                        <input type="text" name="catatan1"  style="width: 200px;height: 100px">

                                                        <button type="submit" class="btn btn-default-orange"><i class="fa fa-plus"></i><i class="fa fa-shopping-cart"></i></button>
                                                        <!-- <a class="btn btn-default-black">Cancle</a>-->
                                                        </form>
                                                    </div>
                                                    <!--end .dropdown-details-->
                                                </div>
                                                <!--end .dropdown-option-->
                                        </div>
                                        <!-- end .all-details -->
                                    </div>
                                    <!-- end .item-list -->


                                    <%}
                                }%>


                                </div>
                                <!--end all-menu-details-->


                            </div> <!-- end .tab-pane -->


                            <div class="tab-pane fade" id="tab-2">
                                <div class="all-menu-details">
                                    <h5>Yang Terbaru</h5>
                                    <%
                                        for (int i = 0; i < mMenuList.length; i++) {
                                            Minuman mn = mMenuList[i];
                                            if (mn.getJenisMinuman().equals("Yang Terbaru")&& mn.getStatus().equals("Tersedia")) {

                                    %>
                                <div class="item-list right-checkout">
                                <div class="list-image">
                                    <img src="./assets/image/<%=mn.getGambarMinuman()%>" alt="">
                                </div>
                                <div class="all-details">
                                    <div class="visible-option">
                                        <div class="details">
                                            <h6><a href="#"><%=mn.getNamaMinuman()%></a>
                                            </h6>
                                            <p class="for-list"><%=mn.getDesMinuman()%></p>
                                        </div>

                                        <div class="price-option fl">
                                            <h4><%=mn.getHargaMinuman()%></h4>
                                            <button class="toggle"> Tambah</button>
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="qty-cart text-center clearfix">
                                            <h6>Jumlah</h6>
                                            <form action="PesanController" method="POST">
                                               <input type="hidden" name="idMinuman" value="<%=mn.getIdMinuman()%>">
                                                <input type="hidden" name="harga" value="<%=mn.getHargaMinuman()%>">
                                                <input type="text" name="jumlah" value="1">
                                                <input type="hidden" name="catatan" value=" ">
                                                <input type="hidden" name="jam_pengambilan" value="00:00 ">
                                                <input type="hidden" name="proses" value="masukkeranjang">
                                                <br>
                                                
                                                <input type="submit" value="Pesan" class="btn-default-orange" >

                                                </div> <!-- end .qty-cart -->
                                                </div> <!-- end .visible-option -->	

                                                <div class="dropdown-option clearfix" style="display: none;">
                                                    <div class="dropdown-details">
                                                        <h6>Catatan</h6>
                                                        <input type="text" name="catatan1"  style="width: 200px;height: 100px">

                                                        <button type="submit" class="btn btn-default-orange"><i class="fa fa-plus"></i><i class="fa fa-shopping-cart"></i></button>
                                                        <!-- <a class="btn btn-default-black">Cancle</a>-->
                                                        </form>
                                                    </div>
                                                    <!--end .dropdown-details-->
                                                </div>
                                                <!--end .dropdown-option-->
                                        </div>
                                        <!-- end .all-details -->
                                    </div>
                                    <!-- end .item-list -->


                                    <%}
                                }%>



                                </div>
                                <!--end all-menu-details-->
                            </div> <!-- end .tab-pane  -->


                            <div class="tab-pane fade" id="tab-3">
                                <div class="all-menu-details">
                                    <h5>Yang Terlaku</h5>
                                    <%
                                        for (int i = 0; i < mMenuList.length; i++) {
                                            Minuman mn = mMenuList[i];
                                            if (mn.getJenisMinuman().equals("Yang Terlaku")&& mn.getStatus().equals("Tersedia")) {

                                    %>
                                   <div class="item-list right-checkout">
                                <div class="list-image">
                                    <img src="./assets/image/<%=mn.getGambarMinuman()%>" alt="">
                                </div>
                                <div class="all-details">
                                    <div class="visible-option">
                                        <div class="details">
                                            <h6><a href="#"><%=mn.getNamaMinuman()%></a>
                                            </h6>
                                            <p class="for-list"><%=mn.getDesMinuman()%></p>
                                        </div>

                                        <div class="price-option fl">
                                            <h4><%=mn.getHargaMinuman()%></h4>
                                            <button class="toggle"> Tambah</button>
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="qty-cart text-center clearfix">
                                            <h6>Jumlah</h6>
                                            <form action="PesanController" method="POST">
                                                <input type="hidden" name="idMinuman" value="<%=mn.getIdMinuman()%>">
                                                <input type="hidden" name="harga" value="<%=mn.getHargaMinuman()%>">
                                                <input type="text" name="jumlah" value="1">
                                                <input type="hidden" name="catatan" value=" ">
                                                <input type="hidden" name="jam_pengambilan" value="00:00 ">
                                                <input type="hidden" name="proses" value="masukkeranjang">
                                                <br>
                                                
                                                <input type="submit" value="Pesan" class="btn-default-orange" >

                                                </div> <!-- end .qty-cart -->
                                                </div> <!-- end .visible-option -->	

                                                <div class="dropdown-option clearfix" style="display: none;">
                                                    <div class="dropdown-details">
                                                        <h6>Catatan</h6>
                                                        <input type="text" name="catatan1"  style="width: 200px;height: 100px">

                                                        <button type="submit" class="btn btn-default-orange"><i class="fa fa-plus"></i><i class="fa fa-shopping-cart"></i></button>
                                                        <!-- <a class="btn btn-default-black">Cancle</a>-->
                                                        </form>
                                                    </div>
                                                    <!--end .dropdown-details-->
                                                </div>
                                                <!--end .dropdown-option-->
                                        </div>
                                        <!-- end .all-details -->
                                    </div>
                                    <!-- end .item-list -->


                                    <%}
                                }%>
                                </div>
                                <!--end all-menu-details-->
                            </div> <!-- end .tab-pane  -->


                            <div class="tab-pane fade" id="tab-4">
                                <div class="all-menu-details">
                                    <h5>Yang terpopuler</h5>
                                    <%
                                        for (int i = 0; i < mMenuList.length; i++) {
                                            Minuman mn = mMenuList[i];
                                            if (mn.getJenisMinuman().equals("Yang Terpopuler")&& mn.getStatus().equals("Tersedia")) {

                                    %>
                                <div class="item-list right-checkout">
                                <div class="list-image">
                                    <img src="./assets/image/<%=mn.getGambarMinuman()%>" alt="">
                                </div>
                                <div class="all-details">
                                    <div class="visible-option">
                                        <div class="details">
                                            <h6><a href="#"><%=mn.getNamaMinuman()%></a>
                                            </h6>
                                            <p class="for-list"><%=mn.getDesMinuman()%></p>
                                        </div>

                                        <div class="price-option fl">
                                            <h4><%=mn.getHargaMinuman()%></h4>
                                            <button class="toggle"> Tambah</button>
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="qty-cart text-center clearfix">
                                            <h6>Jumlah</h6>
                                            <form action="PesanController" method="POST">
                                                <input type="hidden" name="idMinuman" value="<%=mn.getIdMinuman()%>">
                                                <input type="hidden" name="harga" value="<%=mn.getHargaMinuman()%>">
                                                <input type="text" name="jumlah" value="1">
                                                <input type="hidden" name="catatan" value=" ">
                                                <input type="hidden" name="jam_pengambilan" value="00:00 ">
                                                <input type="hidden" name="proses" value="masukkeranjang">
                                                <br>
                                                
                                                <input type="submit" value="Pesan" class="btn-default-orange" >

                                                </div> <!-- end .qty-cart -->
                                                </div> <!-- end .visible-option -->	

                                                <div class="dropdown-option clearfix" style="display: none;">
                                                    <div class="dropdown-details">
                                                        <h6>Catatan</h6>
                                                        <input type="text" name="catatan1"  style="width: 200px;height: 100px">

                                                        <button type="submit" class="btn btn-default-orange"><i class="fa fa-plus"></i><i class="fa fa-shopping-cart"></i></button>
                                                        <!-- <a class="btn btn-default-black">Cancle</a>-->
                                                        </form>
                                                    </div>
                                                    <!--end .dropdown-details-->
                                                </div>
                                                <!--end .dropdown-option-->
                                        </div>
                                        <!-- end .all-details -->
                                    </div>
                                    <!-- end .item-list -->


                                    <%}
                                }%>
                                </div>
                                <!--end all-menu-details-->
                            </div> <!-- end .tab-pane  -->
                        </div> <!-- end .tab-content -->
                        <!-- end .pagination -->
                    </div>
                    <!--end main-grid layout-->

                    <!--end .col-md-3 -->

                        </div>
                        <!-- end .chekout class -->
                    </div>
                </div>
                <!-- end .row -->
            <!--end .container -->
            <!-- footer begin -->
            <footer id="footer">


                <div class="footer-copyright">
                    <div class="container">
                        <p>Copyright 2019 © TakeAway. All rights reserved. Powered by <a>PM.AM.ID</a>.</p>
                        <ul class="footer-social">
                            <li><a href="http://new.uouapps.com/takeaway/menu-with-right-checkout.html#"><i class="fa fa-facebook-square"></i></a>
                            </li>
                            <li><a href="http://new.uouapps.com/takeaway/menu-with-right-checkout.html#"><i class="fa fa-twitter-square"></i></a>
                            </li>
                            <li><a href="http://new.uouapps.com/takeaway/menu-with-right-checkout.html#"><i class="fa fa-google-plus-square"></i></a>
                            </li>
                            <li><a href="http://new.uouapps.com/takeaway/menu-with-right-checkout.html#"><i class="fa fa-linkedin-square"></i></a>
                            </li>
                            <li><a href="http://new.uouapps.com/takeaway/menu-with-right-checkout.html#"><i class="fa fa-pinterest-square"></i></a>
                            </li>
                        </ul>
                        <!-- end .footer-social -->
                    </div>
                </div>
            </footer>
            <!-- end #footer -->

        </div> <!-- end .page-content -->
    </div>
    <!-- end #main-wrapper -->

    <script src="./assets/js/jquery.min.js.download"></script>
    <!-- Local jQuery -->
    <script>
        window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')
    </script>
    <script src="./assets/js/jquery-ui-1.10.4.custom.min.js.download" type="text/javascript"></script>
    <script src="./assets/js/jquery.magnific-popup.min.js.download"></script>
    <script src="./assets/js/owl.carousel.js.download"></script>
    <script src="./assets/js/bootstrap.js.download"></script>
    <script type="text/javascript" src="./assets/js/js.js"></script>
    <script type="text/javascript" src="./assets/js/jquery.ui.map.js.download"></script>
    <script src="./assets/js/scripts.js.download"></script>

    <script>

    </script>




    <var id="media-query-breakpoint"><span></span></var></body></html>
