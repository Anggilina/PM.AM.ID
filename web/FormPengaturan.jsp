<%-- 
    Document   : FormPengaturan
    Created on : Jan 13, 2020, 12:03:04 PM
    Author     : user
--%>

<%@page import="Entity.Admin"%>
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
        Admin mAdmin = new Admin();

        if (session.getAttribute("mAdmin") != null) {
            mAdmin = (Admin) session.getAttribute("mAdmin");
        }
    %>


    <div class=" w3l-login-form">
        <h4 style="color:red">${pesan}</h4>

        <%
            if (session.getAttribute("Status").equals("admin")) {%>

        <form action="PengaturanController" method="POST">
            <% String pesan1=(String) session.getAttribute("pesan");
           if(pesan1 != null){ %>
           <h4 style="color:red"><%=pesan1%></h4>
           <%}%>

            <div class=" w3l-form-group">
                <label>Nama Akun</label>
                <div class="group">
                    <i class="fas fa-user"></i>
                    <%=mAdmin.getNamaAkunA()%>
                     <input type="hidden" name="Nama_Akun" value="<%=mAdmin.getNamaAkunA()%>" >
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>Email</label>
                <div class="group">
                    <i class="fas fa-envelope"></i>
                    <input type="text" name="Email" value="<%=mAdmin.getEmail()%>" class="form-control" placeholder="Email " required="required" />
                </div>
            </div>
                
                <div class=" w3l-form-group">
                <label>Kata Sandi Sebelumnya</label>
                <div class="group">
                    <i class="fas fa-unlock"></i>
                    <input name="pwd" type="password" class="form-control" placeholder="Kata Sandi Sebelumnya" required="required" />
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>Kata Sandi Baru</label>
                <div class="group">
                    <i class="fas fa-unlock"></i>
                    <input name="pwd1" type="password" class="form-control" placeholder="Kata Sandi Baru" required="required" />
                </div>
            </div>
            <div class=" w3l-form-group">
                <label>Ulangi Kata Sandi</label>
                <div class="group">
                    <i class="fas fa-unlock"></i>
                    <input name="pwd2" type="password" class="form-control" placeholder="Ulangi Kata Sandi" required="required" />
                </div>
            </div>

            <input type="hidden" name="Nama_Akun" value="<%=mAdmin.getNamaAkunA()%>" >
            <input type="hidden" name="Kata_Sandi" value="<%=mAdmin.getKataSandi()%>" >

            <input type="hidden" name="proses" value="ubahAksi" >

            <button type="submit">Simpan Perubahan</button>
        </form>

        <% }
        %>
    </div>
    <footer>
        <p class="copyright-agileinfo"> </p>
    </footer>

</body>

</html>
