<%-- 
    Document   : adKonfrimasi
    Created on : Jan 17, 2020, 10:17:08 PM
    Author     : user
--%>

<%@page import="Model.KonfirmasiModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Konfirmasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String alamat = "layananpengunjung";
      Konfirmasi[] mKonfirmasiList = (Konfirmasi[]) request.getAttribute("konfrimasiList");
%>
<%@include file="header.jsp" %>

<div class="page-content">
    <div class="heading" style="background-image:url(./assets/image/back2.jpg); height: 100px">
        <!-- style="background-color:#202226 " -->
        <h1 style="color: #000">Layanan Pengunjung</h1>
    </div>
    <!-- end .heading -->
    <div class="chef-details">
        <div class="container">
            <div class="row">
                <br>

                 <img src="./assets/image/FAQ.png" alt="" alt="faq" width="1000" height="600" style="margin-left: 100px">
                <br>
                
                <h4> FAQ </h4>   
                <div class="chef-description">
                    <p>Frequently Asked Question (FAQ) adalah layanan yang akan menginformasikan pertanyaan yang sering ditanyakan oleh pengunjung. Layanan ini juga akan bertindak sebagai sarana bagi masyarakat untuk menyampaikan aspirasi, keluhan ataupun pertanyaan seputar keuangan inklusif.</p>
                </div>
                <%
                                for (int i = 0; i < mKonfirmasiList.length; i++) {
                                    Konfirmasi kn = mKonfirmasiList[i];

                            %>
                <div class="chef-description">
                    <h6>Pertanyaan : <%=kn.getPertanyaan()%></h6>
                    <p><%=kn.getJawaban()%></p>
                    <a href="KonfirmasiController?proses=editKonfimasi&idkonfirmasi=<%=kn.getIdKonfrimasi()%>"><button class="btn btn-default-orange"><i class="fa fa-pencil"></i></button></a>
                  <br>
                  <br>
                </div>   

                        <% } %>

            </div>
            <!-- end .col-md-8 grid -->

        </div>
        <!-- end .row -->
    </div>
    <!-- end .container -->
</div>
<!-- end .chef-details -->
</div>
<!-- end page-content -->

<%@include file="footer.jsp" %>
</div>
<!-- end #main-wrapper -->
<!-- Scripts -->
<!-- CDN jQuery -->
