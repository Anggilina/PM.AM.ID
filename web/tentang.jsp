<%-- 
    Document   : tentang
    Created on : Nov 10, 2019, 3:17:10 PM
    Author     : user
--%>

<%@page import="Model.TentangModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Tentang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   String alamat = "tentang";
   Tentang[] mTentangList = (Tentang[]) request.getAttribute("tentangList");
%>
<%@include file="header.jsp" %>

    <div class="page-content">
      <div class="heading" style="background-image:url(./assets/image/back1.jpg); height: 100px">
          <!-- style="background-color:#202226 " -->
        <h1 style="color: #000">TENTANG PM.AM.ID</h1>
      </div>
      <!-- end .heading -->
      <div class="chef-details">
        <div class="container">
          <div class="row">
            <div class="col-md-8">
              <div class="pmam">
                <img src="./assets/image/pmam.jpg" alt="">
              </div>
                <%
                                for (int i = 0; i < mTentangList.length; i++) {
                                    Tentang tg = mTentangList[i];

                            %>
              <h4> Tentang PM.AM.ID </h4>   
              <br>
              <div class="chef-description">
                <p align="justify"><%=tg.getDeskripsi()%></p>
              </div>
              
              <h4> Social Media </h4>
              <BR>
              <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

              <!-- Add font awesome icons -->
              <a href="#" class="fa fa-facebook"></a>   PM.AM.ID_PKU <br>
              <a href="#" class="fa fa-twitter"></a>    @PM.AM.ID_SerayuPku <br>
              <a href="#" class="fa fa-youtube"></a>    PM.AM.ID Channel<br>              
              <!-- end .chef-description -->
<br>
<br>
   <div class="leave-reply">
                <h5>Tinggalkan Pesan</h5>
                <form>
                  
                  <!-- end nasted .row -->
                  <textarea placeholder="Tulis disini ..."></textarea>
                  <button><i class="fa fa-pencil-square-o"></i> Kirim Pesan</button>
                </form>
              </div>

            </div>
            <!-- end .col-md-8 grid -->

            <div class="col-md-4">
              <div class="general-info">
                <h4> Informasi Utama  <i class="fa fa-pencil" style="color: #CC9933; margin-left: 100px; "></i> </h4>
                
                <ul class="list-unstyled">
                    <li>
                    <span class="value">Pemilik</span>
                    <span class="result"><%=tg.getPemilik()%></span>
                  </li>
                  <li>
                    <span class="value">Lokasi</span>
                    <span class="result"><%=tg.getLokasi()%></span>
                  </li>
                  <li>
                    <span class="value">Hari Buka:</span>
                    <span class="result"><%=tg.getHariBuka()%></span>
                  </li>
                  <li>
                    <span class="value">Jam Operasional:</span>
                    <span class="result"><%=tg.getJamOperasional()%> WIB</span>
                  </li>
                  <li>
                    <span class="value">Jam Tutup:</span>
                    <span class="result"><%=tg.getJamTutup()%> WIB</span>
                  </li>
                  <li>
                    <span class="value">Dikelola Oleh:</span>
                    <span class="result">3 Orang</span>
                  </li>
                </ul>
              </div>
              <!-- end .general-info -->
            </div>
          </div>
          <!-- end .row -->
        </div>
        <!-- end .container -->
      </div>
      <!-- end .chef-details -->
    </div>
    <!-- end page-content -->
 <%}%>
    <%@include file="footer.jsp" %>
  </div>
  <!-- end #main-wrapper -->
  <!-- Scripts -->
  <!-- CDN jQuery -->
