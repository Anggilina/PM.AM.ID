<%-- 
    Document   : pesan
    Created on : Jan 26, 2020, 2:45:58 PM
    Author     : user
--%>

<%@page import="Model.MinumanModel"%>
<%@page import="Entity.Pesan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Minuman"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String alamat = "pesan";

%>
<%@include file="header.jsp" %>
<!-- thumbnail slide section -->
<div class="col-md-4" style="height: 520px">
    <div class="my-check-right" style="margin-left: 500px;margin-top: 40px; height: 300px">
        <h5 class="toggle-title">Keranjang Saya</h5>
        <ul class="list-unstyled">
             <%
                                    ArrayList<Pesan> mCart = new ArrayList();
                                    mCart = (ArrayList) session.getAttribute("mCart");
                                    int total = 0;
                                    if (session.getAttribute("mCart") != null) {

                                %>
                                <%for (int i = 0; i < mCart.size(); i++) {
                                        MinumanModel md = new MinumanModel();
                                        Minuman mn = new Minuman();
                                        mn = md.ambilMinuman(mCart.get(i).getIdMinuman());
                                        total = total + mCart.get(i).getTotal();
                                %>
                                <li>
                                    <p> <%=mCart.get(i).getJumlah()%> x <%=mn.getNamaMinuman()%>
                                        <span class="icon-link">
                                            <a href="PesanController?proses=hapuscart&index=<%=i%>">
                                                <i class="fa fa-times"></i>
                                            </a>
                                        </span>
                                    </p>

                                    <p class="price">Rp. <%=mCart.get(i).getTotal()%></p>
                                </li>

                                <%}

                                %>
                                <li>
                                    <!-- list for total price-->
                                    <p>Total</p>
                                    <p class="price-total">Rp.<%=total%></p>
                                </li>

        </ul>
                            <div class="checkout">
                                <a class="btn btn-default-orange" href="pesanan.jsp"><i class="fa fa-shopping-cart"></i>Checkout</a>
                            </div>
                            <%} else {%>
                            <li>
                                <p class="price">Anda Belum berbelanja atau masuk</p>
                            </li>
                            <%}
                            %>

    </div>
    <!-- end .chekout class -->
</div>
</div>
<!-- end .row -->
</div>
<!--end .container -->
<!-- footer begin -->
<footer id="footer">


    <div class="footer-copyright">
        <div class="container">
            <p>Copyright 2019 © TakeAway. All rights reserved. Powered by <a>ANDEYE</a>.</p>
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
