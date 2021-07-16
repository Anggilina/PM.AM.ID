<%-- 
    Document   : adMinuman
    Created on : Jan 17, 2020, 11:07:50 PM
    Author     : user
--%>

<%@page import="Model.MinumanModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Minuman"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String alamat = "minuman";
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
                                            
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="text-center clearfix">
                                            <h6>Aksi</h6>

                                            <a href="MinumanController?proses=hapusminum&idMinuman=<%=mn.getIdMinuman()%>"><button class="btn btn-default-orange"><i class="fa fa-times"></i></button></a>
                                            <br>
                                            <a href="MinumanController?proses=editmenu&idMinuman=<%=mn.getIdMinuman()%>"> <button class="btn btn-default-orange"><i class="fa fa-pencil"></i></button></a>

                                        </div> <!-- end .qty-cart -->
                                    </div> <!-- end .visible-option -->	


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
                                            
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="text-center clearfix">
                                            <h6>Aksi</h6>

                                            <a href="MinumanController?proses=hapusminum&idMinuman=<%=mn.getIdMinuman()%>"><button class="btn btn-default-orange"><i class="fa fa-times"></i></button></a>
                                            <br>
                                            <a href="MinumanController?proses=editmenu&idMinuman=<%=mn.getIdMinuman()%>"> <button class="btn btn-default-orange"><i class="fa fa-pencil"></i></button></a>

                                        </div> <!-- end .qty-cart -->
                                    </div> <!-- end .visible-option -->	


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
                                          
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="text-center clearfix">
                                            <h6>Aksi</h6>

                                            <a href="MinumanController?proses=hapusminum&idMinuman=<%=mn.getIdMinuman()%>"><button class="btn btn-default-orange"><i class="fa fa-times"></i></button></a>
                                            <br>
                                            <a href="MinumanController?proses=editmenu&idMinuman=<%=mn.getIdMinuman()%>"> <button class="btn btn-default-orange"><i class="fa fa-pencil"></i></button></a>

                                        </div> <!-- end .qty-cart -->
                                    </div> <!-- end .visible-option -->	


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
                                          
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="text-center clearfix">
                                             <h6>Aksi</h6>

                                            <a href="MinumanController?proses=hapusminum&idMinuman=<%=mn.getIdMinuman()%>"><button class="btn btn-default-orange"><i class="fa fa-times"></i></button></a>
                                            <br>
                                            <a href="MinumanController?proses=editmenu&idMinuman=<%=mn.getIdMinuman()%>"> <button class="btn btn-default-orange"><i class="fa fa-pencil"></i></button></a>

                                        </div> <!-- end .qty-cart -->
                                    </div> <!-- end .visible-option -->	


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
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="text-center clearfix">
                                            <h6>Aksi</h6>

                                            <a href="MinumanController?proses=hapusminum&idMinuman=<%=mn.getIdMinuman()%>"><button class="btn btn-default-orange"><i class="fa fa-times"></i></button></a>
                                            <br>
                                            <a href="MinumanController?proses=editmenu&idMenu=<%=mn.getIdMinuman()%>"> <button class="btn btn-default-orange"><i class="fa fa-pencil"></i></button></a>

                                        </div> <!-- end .qty-cart -->
                                    </div> <!-- end .visible-option -->	


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
                                            <button class="toggle">Option</button>
                                        </div>
                                        <!-- end .price-option-->
                                        <div class="text-center clearfix">
                                             <h6>Aksi</h6>

                                            <a href="MinumanController?proses=hapusminum&idMinuman=<%=mn.getIdMinuman()%>"><button class="btn btn-default-orange"><i class="fa fa-times"></i></button></a>
                                            <br>
                                            <a href="MinumanController?proses=editmenu&idMinuman=<%=mn.getIdMinuman()%>"> <button class="btn btn-default-orange"><i class="fa fa-pencil"></i></button></a>

                                        </div> <!-- end .qty-cart -->
                                    </div> <!-- end .visible-option -->	


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

            <div class="col-md-4">
                <div class="events-side-panel">

                    <div class="find-on-map">
                        <h6>Tambah Data</h6>
                        <a href="tambahMinuman.jsp">  <button class="btn btn-default-orange">Tambah Menu <i class="fa fa-plus"></i></button></a>

                    </div>
                    <!-- end .find-on-map -->

                </div>
                <!-- end .events-side-panel -->
            </div>
        </div>
        <!-- end .row -->
    </div>
    <!--end .container -->
    <!-- footer begin -->
    <footer id="footer">


        <div class="footer-copyright">
            <div class="container">
                <p>Copyright 2014 © TakeAway. All rights reserved. Powered by <a>PM.AM.ID</a>.</p>
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

