package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layananpengunjung_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String alamat = "layananpengunjung";


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
      out.write("        <title>PM.AM.ID</title>\n");
      out.write("\n");
      out.write("        <link href=\"./assets/css/css.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/masterslider.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/style(1).css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/style(2).css\">\n");
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
      out.write("                                    <img src=\"./assets/image/logo.png\" width=280px height=50px alt=\"TakeAway\" style=\"margin-top:-15px\">\n");
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
      out.write("\n");
      out.write("<div class=\"page-content\">\n");
      out.write("    <div class=\"heading\" style=\"background-image:url(./assets/image/back2.jpg); height: 100px\">\n");
      out.write("        <!-- style=\"background-color:#202226 \" -->\n");
      out.write("        <h1 style=\"color: #000\">Layanan Pengunjung</h1>\n");
      out.write("    </div>\n");
      out.write("    <!-- end .heading -->\n");
      out.write("    <div class=\"chef-details\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                 <img src=\"./assets/image/FAQ2.png\" alt=\"\" alt=\"faq\" width=\"1000\" height=\"600\" style=\"margin-left: 100px\">\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <h4> FAQ </h4>   \n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <p>Frequently Asked Question (FAQ) adalah layanan yang akan menginformasikan pertanyaan yang sering ditanyakan oleh pengunjung. Layanan ini juga akan bertindak sebagai sarana bagi masyarakat untuk menyampaikan aspirasi, keluhan ataupun pertanyaan seputar keuangan inklusif.</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <h5> A. Umum </H5>\n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <h6>Pertanyaan : Siapa ANDEYE?</h6>\n");
      out.write("                    <p>ANDEYE adalah perusahaan yang melayani pemesanan tempat wisata di bandung melalui situs web. Berbasis operasional di Politeknik Caltex Riau, ANDEYE secara fokus membantu mengelola kebutuhan liburan ataupun perjalanan bisnis dengan menjadi Fun Traveling Partner bagi masyarakat Indonesia yang ingin berlibur ke Bandung.</p>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <h6>Pertanyaan : Di mana alamat ANDEYE?</h6>\n");
      out.write("                    <p>Jl. Umban Sari (Patin) No. 1 Rumbai\n");
      out.write("                        Pekanbaru-Riau 28265\n");
      out.write("                        Telp : (0761) - 53939\n");
      out.write("                        Fax : (0761) - 554224                   </p></div>   \n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <h6>Pertanyaan : Mengapa memesan di ANDEYE?</h6>\n");
      out.write("                    <p>ANDEYE terhubung langsung ke lebih dari 20 temopat wisata di bandung, termasuk juga restoran, museum, dan tempat wisata religi. Nikmati berbagai kemudahan dan penawaran menarik yang akan membuat liburan atau perjalanan bisnis Anda semakin praktis dan menyenangkan.</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <h5> B. Kontak</H5>\n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <h6>Pertanyaan : Bagaimana saya dapat menghubungi ANDEYE?</h6>\n");
      out.write("                    <p>Untuk respon cepat, Anda dapat menghubungi kami di 0804 1400 777. Selain itu, Anda juga dapat menghubungi kami di (021) 4040 7777 atau mengirimkan email ke andeye@pcr.ac.id</p>\n");
      out.write("                </div>   \n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <h5> C. Promosi </H5>\n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <h6>Pertanyaan : Apa yang dimaksud dengan promosi ANDEYE?</h6>\n");
      out.write("                    <p>Promosi ANDEYE adalah suatu kegiatan baik dari internal ANDEYE maupun kerja sama dengan pihak ketiga (bank, produk, brand, dll) untuk memberikan manfaat sebesar-besarnya kepada pelanggan ANDEYE. Promosi umumnya berlaku dalam waktu tertentu dan jumlah manfaat untuk pelanggan berbeda pada setiap promosinya.</p>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <h6>Pertanyaan : Apakah yang dimaksud dengan voucher ANDEYE?</h6>\n");
      out.write("                    <p>Voucher ANDEYE adalah kupon atau kode tertentu yang dapat berfungsi sebagai potongan harga untuk pemesanan tempat wisata di ANDEYE</p></div>   \n");
      out.write("                <div class=\"chef-description\">\n");
      out.write("                    <h6>Pertanyaan : Bagaimana cara mendapatkan voucher ANDEYE?</h6>\n");
      out.write("                    <p>Ada berbagai cara mendapatkan voucher ANDEYE, baik dari promosi yang kami sampaikan di website, event yang kami gelar di setiap daerah, dan voucher yang kami distribusikan melalui newsletter atau kuis di akun media sosial kami.</p></div>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!-- end .chef-description -->\n");
      out.write("                \n");
      out.write("                <h4> Kontak Admin </h4><br>\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("              <!-- Add font awesome icons -->\n");
      out.write("              <a href=\"#\" class=\"fa fa-facebook\"></a>  Yenny Dermawan <br>\n");
      out.write("              <a href=\"#\" class=\"fa fa-twitter\"></a> @anggilina  <br>\n");
      out.write("              <a href=\"#\" class=\"fa fa-youtube\"></a> Devi Yanti<br>\n");
      out.write("              <br>\n");
      out.write("              <br>\n");
      out.write("                            \n");
      out.write("                <div class=\"leave-reply\">\n");
      out.write("                    <h5>Tinggalkan Pertanyaan Untuk Kami</h5>\n");
      out.write("                    <form>\n");
      out.write("\n");
      out.write("                        <!-- end nasted .row -->\n");
      out.write("                        <textarea placeholder=\"Tulis Pertanyaan kamu disini ...\"></textarea>\n");
      out.write("                        <button><i class=\"fa fa-pencil-square-o\"></i> Kirim Pertanyaan</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- end .col-md-8 grid -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- end .row -->\n");
      out.write("    </div>\n");
      out.write("    <!-- end .container -->\n");
      out.write("</div>\n");
      out.write("<!-- end .chef-details -->\n");
      out.write("</div>\n");
      out.write("<!-- end page-content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--footer start-->\n");
      out.write("\t\t<footer id=\"footer\">\n");
      out.write("\t\t\t<div class=\"footer-copyright\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<p>Copyright 2019 © TakeAway. All rights reserved. Powered by <a>PM.AM.ID</a>.</p>\n");
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
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- end #main-wrapper -->\n");
      out.write("<!-- Scripts -->\n");
      out.write("<!-- CDN jQuery -->\n");
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
