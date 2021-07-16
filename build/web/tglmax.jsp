<%-- 
    Document   : tglmax
    Created on : Jan 26, 2020, 5:19:12 PM
    Author     : user
--%>
<%@page import="Entity.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //  String alamat = "akun";
    String alamat = "";
%>
<%@include file="header.jsp" %>
<link href="./assets/csslogin/style.css" rel="stylesheet" type="text/css" />
<!-- /custom style sheet -->
<!-- fontawesome css -->
<link href="./assets/csslogin/fontawesome-all.css" rel="stylesheet" />
<!-- /fontawesome css -->
<!-- google fonts-->
<link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
      rel="stylesheet">


<body>
    <%
        Member mMember = new Member();
            mMember = (Member) request.getAttribute("List");
    %>

    <div class=" w3l-login-form">
        <h2>Data Member Pembelian Terakhir</h2>
            <form action="PengaturanController" method="POST">
            <div class=" w3l-form-group">
                <label>Nama Akun</label>
                <div class="group">
                    <i class="fas fa-user"></i>
                    <%=mMember.getNamaAkunM()%>
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>Email</label>
                <div class="group">
                    <i class="fas fa-envelope"></i>
                    <%=mMember.getEmail()%>
                </div>
            </div>

            <div class=" w3l-form-group">
                <label>No Hp</label>
                <div class="group">
                    <i class="fas fa-phone"></i>
                   <%=mMember.getNo_Hp()%>
                </div>
            </div>
                
            <div class=" w3l-form-group">
                <label>Jenis Kelamin</label>
                <div class="group">
                    <i class="fas fa-venus-mars"></i>
                 <%=mMember.getJenis_Kelamin()%>
            </div>
            </div>
    </div>
    <footer>
        <p class="copyright-agileinfo"> </p>
    </footer>
</body>
</html>
