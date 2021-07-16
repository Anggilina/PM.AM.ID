<%-- 
    Document   : index
    Created on : Nov 11, 2018, 2:37:48 PM
    Author     : Maverick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String alamat="beranda";
    %>
<%@include file="header.jsp" %>

<!-- all page-content star -->
<div id="page-content" style="position: relative;">
    <!-- masterslider -->
    <div class="master-slider ms-skin-black-2 round-skin" id="masterslider" style="visibility: visible; opacity: 1;">
        <!-- new slide -->

        <!-- end of slide -->
        <!-- new slide -->


        <!-- new slide -->

        <!-- end of slide -->
        <div class="ms-container">
            <div class="ms-view ms-flow-view ms-grab-cursor" style="width: 1400px; height: 500px;">
                <div class="ms-slide-container" style="transform-style: preserve-3d; transform: translateX(0px) translateZ(0px);">
                    <div class="ms-slide ms-sl-selected" style="left: 0px; transform: translateZ(0px) rotateY(0deg); width: 1400px; height: 500px;">
                        <div class="ms-slide-bgcont" style="height: 100%; opacity: 1;"><img src="./assets/image/c2.jpg" alt="" style="width: 1400px; height: 500px; margin-top: -16px; margin-left: 0px;"></div>
                    </div>
                    </div></div>
            
            
        </div>
                                
        
        
    </div>
    <!-- end of masterslider -->


    <!-- end purchase TakeAway section  -->

    <!-- start .category box section -->
    <div class="category-boxes-icons">
        <div class=" container">
            <div class="row">
                <div class="col-md-4 col-sm-6 col-xs-12 text-center">
                    <div class="category-boxes-item">
                        <figure>
                            <img src="./assets/image/gb1.jpg">
                            <h4>Yang Terbaru</h4>
                            <figcaption> <a href="MinumanController?proses=listminuman" class="btn btn-default-white"><i class="fa fa-file-text-o"></i> Lihat</a> 
                            </figcaption>
                        </figure>
                    </div>
                </div>

                <div class="col-md-4 col-sm-6 col-xs-12  text-center">
                    <div class="category-boxes-item">
                        <figure>
                            <img src="./assets/image/gb2.jpg">
                            <h4>Yang Terlaku</h4>
                            <figcaption><a href="MinumanController?proses=listminuman" class="btn btn-default-white"><i class="fa fa-file-text-o"></i> Lihat</a>
                            </figcaption>
                        </figure>
                    </div>
                </div>

                <div class="col-md-4 col-sm-6 col-xs-12 text-center">
                    <div class="category-boxes-item">
                        <figure>
                            <img src="./assets/image/bg3.jpg">
                            <h4>Yang Terpopuler</h4>
                            <figcaption> <a href="MinumanController?proses=listmenu" class="btn btn-default-white"><i class="fa fa-file-text-o"></i> Lihat</a> 
                            </figcaption>
                        </figure>
                    </div>
                </div>

               
            </div>
            <!-- end .row -->
        </div>
        <!-- end .category-boxes-icons -->
    </div>
    <!-- container -->

    <!-- star.chef-welcome -->
    <div class="chef-welcome" style="background-color:#d6d8db;">
        <div class="container">
            <h1>Selamat Datang Di Coffee Shop PM.AM.ID</h1>
            <p align="justify">Coffee Shop PM.AM.ID adalah coffe shop yang berlokasi di Jln. Serayu No. 55, Payung Sekaki, Pekanbaru yang memiliki jam operasional dari 10.00 AM - 21.00 PM</p>
            <a href="TentangController?proses=listtentang" class="btn btn-default-orange"><i class="fa fa-file-text-o"></i> Detail</a>
        </div>
        <!-- end .container -->
    </div>
    <!--end .chef-welcome-->



  
</div>
<!-- end #page-content -->



    

</div>

<%@include file="footer.jsp" %>
