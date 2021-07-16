package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class daftar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("   \n");
      out.write("    <!-- /meta tags -->\n");
      out.write("    <!-- custom style sheet -->\n");
      out.write("    <link href=\"./assets/csslogin/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <!-- /custom style sheet -->\n");
      out.write("    <!-- fontawesome css -->\n");
      out.write("    <link href=\"./assets/csslogin/fontawesome-all.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- /fontawesome css -->\n");
      out.write("    <!-- google fonts-->\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("    <!-- /google fonts-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<center> <h1>Selamat Datang di Booking Tempat Wisata ANDEYE</h1> </center>\n");
      out.write("    <div class=\" w3l-login-form\">\n");
      out.write("        <h2>DAFTAR</h2>\n");
      out.write("        <form action=\"#\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <div class=\" w3l-form-group\">\n");
      out.write("                <label>Nama:</label>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <i class=\"fas fa-user\"></i>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Nama Akun\" required=\"required\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" w3l-form-group\">\n");
      out.write("                <label>Email</label>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <i class=\"fas fa-envelope\"></i>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" placeholder=\"Email\" required=\"required\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" w3l-form-group\">\n");
      out.write("                <label>No Hp</label>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                     <i class=\"fas fa-phone\"></i>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"nohp\" required=\"required\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" w3l-form-group\">\n");
      out.write("                <label>Kata Sandi</label>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <i class=\"fas fa-unlock\"></i>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"Kata Sandi\" required=\"required\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("               <div class=\" w3l-form-group\">\n");
      out.write("                <label>Ulangi Kata Sandi</label>\n");
      out.write("                <div class=\"group\">\n");
      out.write("                    <i class=\"fas fa-unlock\"></i>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"Ulangi Kata Sandi\" required=\"required\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <a href=\"index.jsp\"><button type=\"button\">Daftar</button></a>\n");
      out.write("        </form>\n");
      out.write("        <p class=\" w3l-register-p\">Sudah Memiliki Akun?<a href=\"login.jsp\" >Login</a></p>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <p class=\"copyright-agileinfo\"> &copy; 2019 Material Login Form. All Rights Reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
