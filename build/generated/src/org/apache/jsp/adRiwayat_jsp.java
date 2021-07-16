package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import Model.MenuModel;
import Entity.Menu;
import Entity.Pesan;

public final class adRiwayat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    String alamat = "";
    Pesan[] mPesanList = (Pesan[]) request.getAttribute("pesanList");


      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

//    String alamat = "";


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Pondok Gibran</title>\n");
      out.write("\n");
      out.write("        <link href=\"./assets/css/css.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/masterslider.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/style(1).css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/owl.theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/owl.carousel.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" charset=\"UTF-8\" src=\"./assets/js/common.js.download\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./assets/js/util.js.download\"></script></head>\n");
      out.write("\n");
      out.write("    <body style=\"\">\n");
      out.write("        <div id=\"main-wrapper\" style=\"\">\n");
      out.write("            <header id=\"header\">\n");
      out.write("\n");
      out.write("                <!-- end .header-top-bar -->\n");
      out.write("\n");
      out.write("                <div class=\"header-nav-bar\">\n");
      out.write("                    <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                                    <img src=\"./assets/image/logo.png\" width=235px height=50px alt=\"TakeAway\" style=\"margin-top:-33px\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
if ((session.getAttribute("Status") != null) && (session.getAttribute("Status").equals("pemilik"))) {
      out.write("\n");
      out.write("                                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <li\n");
      out.write("                                        ");
if (alamat.equals("riwayat")) {
                                                out.print("class='active'");
                                            }
      out.write("\n");
      out.write("                                        ><a href=\"PesanController?proses=listpesan\">Pesanan</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li\n");
      out.write("                                        ");
if (alamat.equals("menu")) {
                                                out.print("class='active'");
                                            }
      out.write("\n");
      out.write("                                        ><a href=\"MenuController?proses=listmenuadmin\">Menu</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li\n");
      out.write("                                        ");
if (alamat.equals("tentang")) {
                                                out.print("class='active'");
                                            }
      out.write("\n");
      out.write("                                        ><a href=\"adTentang.jsp\">Tentang Gibran</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <li \n");
      out.write("                                        ");
if (alamat.equals("akun")) {
                                                out.print("class='active'");
                                            }
      out.write("\n");
      out.write("\n");
      out.write("                                        class=\"dropdown\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Admin <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                            <li><a href=\"LoginController?proses=UbahDataDiri\">Ubah Data Diri</a></li>\n");
      out.write("                                            <li><a href=\"ubahkatasandi.jsp\">Ubah Password</a></li>\n");
      out.write("                                            <li><a href=\"LoginController?proses=logout\">Logout</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                                    <li\n");
      out.write("                                        ");
if (alamat.equals("beranda")) {
                                                out.print("class='active'");
                                            }
      out.write(" >\n");
      out.write("                                        <a href=\"index.jsp\">Beranda</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li\n");
      out.write("                                        ");
if (alamat.equals("menu")) {
                                                out.print("class='active'");
                                            }
      out.write("\n");
      out.write("                                        ><a href=\"MenuController?proses=listmenu\">Menu</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li\n");
      out.write("                                        ");
if (alamat.equals("tentang")) {
                                                out.print("class='active'");
                                            }
      out.write("\n");
      out.write("                                        ><a href=\"tentang.jsp\">Tentang Kami</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    ");

                                       if((session.getAttribute("Status") != null) && (session.getAttribute("Status").equals("konsumen"))) {
                                    
      out.write("\n");
      out.write("                                    <li \n");
      out.write("                                        ");
if (alamat.equals("akun")) {
                                                out.print("class='active'");
                                            }
      out.write("\n");
      out.write("\n");
      out.write("                                        class=\"dropdown\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
      out.print(session.getAttribute("Nama_Akun"));
      out.write(" <span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                            <li><a href=\"LoginController?proses=UbahDataDiri\">Ubah Data Diri</a></li>\n");
      out.write("                                            <li><a href=\"ubahkatasandi.jsp\">Ubah Password</a></li>\n");
      out.write("                                            <li><a href=\"PesanController?proses=listpesanKonsumen\">Riwayat</a></li>\n");
      out.write("                                            <li><a href=\"LoginController?proses=logout\">Logout</a></li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");

                                        }else {
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <li><a href=\"login.jsp\">Login</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.navbar-collapse -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <!-- end .header-nav-bar -->\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("            <!-- end #header -->\n");
      out.write("\n");
      out.write("<div id=\"page-content\" style=\"height: 800px; margin-left: 100px\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("\n");
      out.write("                <ul class=\"nav nav-tabs mt30\" role=\"tablist\">\n");
      out.write("                    <li class=\"active\"><a href=\"#tab-1\" role=\"tab\" data-toggle=\"tab\">Pesanan</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#tab-2\" role=\"tab\" data-toggle=\"tab\">Riwayat</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane fade in active\" id=\"tab-1\">\n");
      out.write("                        <!--xx-->\n");
      out.write("\n");
      out.write("                        <!--Start blog feed section-->\n");
      out.write("                        <div class=\"latest-from-blog text-center\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");

                                        for (int i = 0; i < mPesanList.length; i++) {
                                            Pesan mP = mPesanList[i];

                                            Menu mn = new Menu();
                                            MenuModel mm = new MenuModel();
                                            mn = mm.ambilMenu(mP.getIdMenu());

                                            Date ys = new Date(); // membuat oject ys dari class Date

                                            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy"); //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
                                            String tanggal = s.format(ys);
                                            String button = "";
                                            if (mP.getStatus().equals("proses")) {
                                                button = "warning";
                                            } else if (mP.getStatus().equals("selesai")) {
                                                button = "success";
                                            } else if (mP.getStatus().equals("batal")) {
                                                button = "danger";
                                            }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    ");
 if (mP.getTanggal().equals(tanggal)) {
      out.write("\n");
      out.write("                                    <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <div class=\"latest-from-blog\">\n");
      out.write("                                            <div class=\"blog-latest\">\n");
      out.write("                                                <div class=\"row\" style=\"height: 200px ;margin-top: -20px\">\n");
      out.write("                                                    <div class=\"col-md-6 col-sm-12\" >\n");
      out.write("                                                        <img class=\"\" src=\"./assets/image/");
      out.print(mn.getGambarMenu());
      out.write("\"  alt=\"blog-image\">\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                                        <span class=\"icon-link\" style=\"margin-left:220px\">\n");
      out.write("                                                            <a href=\"PesanController?proses=hapuspesan&idPesan=");
      out.print(mP.getIdPesan());
      out.write("\">\n");
      out.write("                                                                <i class=\"fa fa-times\" style=\"color:red\"></i>\n");
      out.write("                                                            </a>\n");
      out.write("                                                        </span>\n");
      out.write("                                                        <h5 style=\"margin-top:-30px\"><a href=\"#\">");
      out.print( mn.getNamaMenu());
      out.write("</a>\n");
      out.write("                                                        </h5>\n");
      out.write("\n");
      out.write("                                                        <p>\n");
      out.write("                                                            <i class=\"fa fa-clock-o\"></i>\n");
      out.write("                                                            <span class=\"date\">");
      out.print(mP.getTanggal());
      out.write("</span>\n");
      out.write("                                                            <br>\n");
      out.write("                                                            <i class=\"fa fa-book\"></i>\n");
      out.write("                                                            <span class=\"date\">Catatan</span>\n");
      out.write("                                                            <textarea disabled>");
      out.print(mP.getCatatan());
      out.write("\n");
      out.write("                                                            </textarea>\n");
      out.write("                                                        </p>\n");
      out.write("                                                        <!--<p class=\"bl-sort\">Rp. 15.000</p>-->\n");
      out.write("                                                        <h6>\n");
      out.write("                                                            <i class=\"fa fa-money\"></i>\n");
      out.write("                                                            Rp. ");
      out.print(mP.getTotal());
      out.write(' ');
      out.write('(');
      out.print(mP.getJumlah());
      out.write(")\n");
      out.write("                                                        </h6>\n");
      out.write("                                                        ");


                                                        
      out.write("\n");
      out.write("                                                        <button class=\"btn btn-");
      out.print(button);
      out.write('"');
      out.write('>');
      out.print(mP.getStatus());
      out.write("</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <!--end .blog-details-->\n");
      out.write("                                                </div>\n");
      out.write("                                                <!--end .row-->\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--end .blog-latest -->\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
}
                                        }
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!--end .row main-->\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!--end container-->\n");
      out.write("                        </div>\n");
      out.write("                        <!--end .latest-from-blog-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!--xx-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"tab-2\">\n");
      out.write("                        <!--xx-->\n");
      out.write("\n");
      out.write("                        <!--Start blog feed section-->\n");
      out.write("                        <div class=\"latest-from-blog text-center\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                    ");

                                        for (int i = 0; i < mPesanList.length; i++) {
                                            Pesan mP = mPesanList[i];

                                            Menu mn = new Menu();
                                            MenuModel mm = new MenuModel();
                                            mn = mm.ambilMenu(mP.getIdMenu());

                                            Date ys = new Date(); // membuat oject ys dari class Date

                                            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy"); //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
                                            String tanggal = s.format(ys);
                                            String color = "";
                                            if (mP.getStatus().equals("proses")) {
                                                color = "brown";
                                            } else if (mP.getStatus().equals("selesai")) {
                                                color = "green";
                                            } else if (mP.getStatus().equals("batal")) {
                                                color = "red";
                                            } else if (mP.getStatus().equals("lunas")) {
                                                color = "blue";
                                            }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <div class=\"latest-from-blog\">\n");
      out.write("                                            <div class=\"blog-latest\">\n");
      out.write("                                                <div class=\"row\" style=\"height: 200px ;margin-top: -20px\">\n");
      out.write("                                                    <div class=\"col-md-6 col-sm-12\" >\n");
      out.write("                                                        <img class=\"\" src=\"./assets/image/");
      out.print(mn.getGambarMenu());
      out.write("\"  alt=\"blog-image\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                                        <span class=\"icon-link\" style=\"margin-left:220px\">\n");
      out.write("                                                            <a href=\"PesanController?proses=hapuspesan&idPesan=");
      out.print(mP.getIdPesan());
      out.write("\">\n");
      out.write("                                                                <i class=\"fa fa-times\" style=\"color:red\"></i>\n");
      out.write("                                                            </a>\n");
      out.write("                                                        </span>\n");
      out.write("                                                        <h5 style=\"margin-top:-30px\"><a href=\"#\">");
      out.print( mn.getNamaMenu());
      out.write("</a>\n");
      out.write("                                                        </h5>\n");
      out.write("\n");
      out.write("                                                        <p>\n");
      out.write("                                                            <i class=\"fa fa-clock-o\"></i>\n");
      out.write("                                                            <span class=\"date\">");
      out.print(mP.getTanggal());
      out.write("</span>\n");
      out.write("                                                            <br>\n");
      out.write("                                                            <i class=\"fa fa-book\"></i>\n");
      out.write("                                                            <span class=\"date\">Catatan</span>\n");
      out.write("                                                            <textarea disabled>");
      out.print(mP.getCatatan());
      out.write("\n");
      out.write("                                                            </textarea>\n");
      out.write("                                                        </p>\n");
      out.write("                                                        <!--<p class=\"bl-sort\">Rp. 15.000</p>-->\n");
      out.write("                                                        <h6>\n");
      out.write("                                                            <i class=\"fa fa-money\"></i>\n");
      out.write("                                                            Rp. ");
      out.print(mP.getTotal());
      out.write(' ');
      out.write('(');
      out.print(mP.getJumlah());
      out.write(")\n");
      out.write("                                                        </h6>\n");
      out.write("                                                        <h5 style=\"color: ");
      out.print(color);
      out.write("; margin-top: 10px\">");
      out.print(mP.getStatus());
      out.write("</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-12\" style=\"margin-left:200px\">\n");
      out.write("                                                        <a href=\"PesanController?proses=ubahstatuspesan&idPesan=");
      out.print(mP.getIdPesan());
      out.write("&status=batal\"><button class=\"btn btn-danger\">Batal</button></a> \n");
      out.write("                                                        <a href=\"PesanController?proses=ubahstatuspesan&idPesan=");
      out.print(mP.getIdPesan());
      out.write("&status=konfirmasi\">  <button class=\"btn btn-warning\">Konfirmasi</button></a>\n");
      out.write("                                                        <a href=\"PesanController?proses=ubahstatuspesan&idPesan=");
      out.print(mP.getIdPesan());
      out.write("&status=selesai\">   <button class=\"btn btn-success\">Selesai</button></a>\n");
      out.write("                                                        <a href=\"PesanController?proses=ubahstatuspesan&idPesan=");
      out.print(mP.getIdPesan());
      out.write("&status=lunas\">  <button class=\"btn btn-primary\">Bayar</button></a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!--end .row-->\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--end .blog-latest -->\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
                                        }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!--end .row main-->\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!--end container-->\n");
      out.write("                        </div>\n");
      out.write("                        <!--end .latest-from-blog-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!--xx-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"events-side-panel\">\n");
      out.write("                    <div class=\"search-keyword\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Search\">\n");
      out.write("                        <button type=\"submit\" value=\"\"><i class=\"fa fa-search\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--footer start-->\n");
      out.write("\t\t<footer id=\"footer\">\n");
      out.write("\t\t\t<div class=\"footer-copyright\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<p>Copyright 2014 © TakeAway. All rights reserved. Powered by <a>Pondok Gibran</a>.</p>\n");
      out.write("\t\t\t\t\t<ul class=\"footer-social\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-facebook-square\"></i></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-twitter-square\"></i></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-google-plus-square\"></i></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-linkedin-square\"></i></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><i class=\"fa fa-pinterest-square\"></i></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<!-- end .footer-social -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<!-- end #footer -->\n");
      out.write("                \n");
      out.write("                <!-- Scripts -->\n");
      out.write("\t<!-- CDN jQuery -->\n");
      out.write("\t<script src=\"./assets/js/jquery.min.js.download\"></script>\n");
      out.write("\t<!-- Local jQuery -->\n");
      out.write("\t<script>\n");
      out.write("\twindow.jQuery || document.write('<script src=\"js/jquery-1.11.0.min.js\"><\\/script>')\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script src=\"./assets/js/masterslider.min.js.download\"></script>\n");
      out.write("\t<script src=\"./assets/js/jquery-ui-1.10.4.custom.min.js.download\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"./assets/js/jquery.magnific-popup.min.js.download\"></script>\n");
      out.write("\t<script src=\"./assets/js/owl.carousel.js.download\"></script>\n");
      out.write("\t<script src=\"./assets/js/bootstrap.js.download\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"./assets/js/js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"./assets/js/jquery.ui.map.js.download\"></script>\n");
      out.write("\t<script src=\"./assets/js/scripts.js.download\"></script>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\n");
      out.write("\t\tvar slider = new MasterSlider();\n");
      out.write("\t\tslider.setup('masterslider', {\n");
      out.write("\t\t\twidth: 1140,\n");
      out.write("\t\t\theight: 500,\n");
      out.write("\t\t\tspace: 5,\n");
      out.write("\t\t\tfullwidth: true,\n");
      out.write("\t\t\tspeed: 25,\n");
      out.write("\t\t\tview: 'flow',\n");
      out.write("\t\t\tcenterControls: false\n");
      out.write("\t\t});\n");
      out.write("\t\tslider.control('bullets', {\n");
      out.write("\t\t\tautohide: false\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<var id=\"media-query-breakpoint\"><span></span></var></body></html>\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
