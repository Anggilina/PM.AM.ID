<%-- 
    Document   : pesanan
    Created on : Nov 12, 2018, 5:55:08 PM
    Author     : Maverick
--%>

<%@page import="Entity.Minuman"%>
<%@page import="Model.MinumanModel"%>
<%@page import="Entity.Pesan"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String alamat = "";
%>

<%@include file="header.jsp" %>

<div class="page-content">

    <!--
    <div class="heading" style="background-image:url(./assets/image/Capture.PNG); height: 100px">
                            <h1 style="color: #fff">Pesanan Anda</h1>
                    </div>
    <!-- end .heading -->


    <div class="news-events-blog">
        <div class="container" style="margin-left: 370px">
            <div class="row" >


                <div class="col-md-6 col-sm-12 col-xs-12" >
                    <div class="blog-side-panel" style="background-color: #343434">
                        <div class="search-keyword" >
                            <h4 style="color: #fff">Pesanan Anda</h4>
                        </div>
                        <div class="tag">
                        </div>    

                        <div class="categories" style="background-color: #fff">
                            <center><img src="./assets/image/thankyu.PNG" alt="" style="width: 300px; height: 150px;">
                                <p>Terimakasih <%=session.getAttribute("Nama_Akun")%> Telah memesan Minuman di AM.PM.ID</p>
                            </center> 
                            <h5> List Pesanan</h5>
                            <%
                                ArrayList<Pesan> mCart = new ArrayList();
                                mCart = (ArrayList) session.getAttribute("mCart");
                                int total = 0;
                                if (session.getAttribute("mCart") != null) {
                            %>


                            <ul class="list-unstyled">
                                <%for (int i = 0; i < mCart.size(); i++) {
                                    Pesan mPesan = new Pesan();
                                    mPesan = mCart.get(i);
                                        MinumanModel md = new MinumanModel();
                                        Minuman mn = new Minuman();
                                        mn = md.ambilMinuman(mCart.get(i).getIdMinuman());
                                        total = total + mCart.get(i).getTotal();
                                %>
                                <li><%=mPesan.getJumlah()%> x <%=mn.getNamaMinuman()%>   <div style="margin-top: -23px; margin-left: 450px"><%=mPesan.getTotal()%></div></li>
                                    <%}
                                        }%>
                            </ul>

                        </div>
                        <div style="color: #fff; margin-left: 20px ">
                            <h3>Total</h3>
                            <div style="margin-top: -35px; margin-left: 370px"><h3>Rp.<%=total%></h3></div>
                        </div>
                            
                        <div style="color: #fff; margin-left: 20px ">
                            <div style="margin-left: 200px">
                                <a href="PesanController?proses=checkout">
                                <button class="btn btn-success">Konfirmasi</button>
                                </a>
                            </div>
                        </div>
                    </div>
                    <!-- end .events-side-panel -->
                </div>
                <!-- end .col-md-4 -->

            </div>
        </div>
    </div>
</div>
                            