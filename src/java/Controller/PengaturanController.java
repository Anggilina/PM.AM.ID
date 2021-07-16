/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Entity.Member;
import Entity.Admin;
import Model.MemberModel;
import Model.AdminModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class PengaturanController extends HttpServlet {
    MemberModel mMember = new MemberModel();
    AdminModel mAdmin = new AdminModel();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String proses = request.getParameter("proses");
            String pesan=null;
            
            if (proses.equals("UbahDataDiri")) {
              HttpSession session = request.getSession(true);

            if (session.getAttribute("Status").equals("member")) {
                Member mbr = new Member();
                request.getAttribute("pesan");
                mbr = mMember.AmbilData(session.getAttribute("Nama_Akun").toString());
                session.setAttribute("mMember", mbr);
                response.sendRedirect("Formubahdatadiri.jsp");
            }

            if (session.getAttribute("Status").equals("admin")) {
                Admin adm = new Admin();
                adm = mAdmin.AmbilData(session.getAttribute("Nama_Akun").toString());
                session.setAttribute("mAdmin", adm);
                response.sendRedirect("FormPengaturan.jsp");
            }

        } else if (proses.equals("ubahAksi")) {
            HttpSession session = request.getSession(true);
            if (session.getAttribute("Status").equals("member")) {
                String Nama_Akun = request.getParameter("Nama_Akun");
                String Email = request.getParameter("Email");
                String jk = request.getParameter("pilih");
                String No_Hp = request.getParameter("No_Hp");
                String lama = request.getParameter("pwd");
                String baru = request.getParameter("pwd1");
                String baru1 = request.getParameter("pwd2");
                MemberModel mm = new MemberModel();
                Member mem = mm.AmbilData(Nama_Akun);
                
                if (mem.getKata_Sandi().equals(lama)) {
                    if (baru.equals(baru1)) {
                        mem.setNamaAkunM(Nama_Akun);
                        mem.setEmail(Email);
                        mem.setNo_Hp(No_Hp);
                        mem.setjenis_kelamin(jk);
                        mem.setKata_Sandi(baru);
                
                        boolean x = mMember.UbahData(mem);
                        if (x) {
                            session.setAttribute("Nama_Akun", Nama_Akun);
                            response.sendRedirect("index.jsp");
                        }
                    }
                    else {
                        out.println("<script>"
                                + "alert(\"Konfirmasi Kata Sandi baru tidak sesuai dengan kata sandi baru, silakan isi ulang\");"
                                + "location.href=history.back();"
                                + "</script>");
//                    session.setAttribute("pesan", "Kata Sandi Sebelumnya tidak sesuai silakan isi ulang");
//                    request.getRequestDispatcher("PengaturanController?proses=UbahDataDiri").forward(request, response);
                    }
                } else {
                    out.println("<script>"
                                + "alert(\"Kata Sandi Sebelumnya tidak sesuai silakan isi ulang\");"
                                + "location.href=history.back();"
                                + "</script>");
//                    request.setAttribute("pesan", "Kata Sandi Sebelumnya tidak sesuai silakan isi ulang");
//                    request.getRequestDispatcher("PengaturanController?proses=UbahDataDiri").forward(request, response);
                }
            }
            
            if (session.getAttribute("Status").equals("admin")) {
                String Nama_Akun = request.getParameter("Nama_Akun");
                String Email = request.getParameter("Email");               
                String lama = request.getParameter("pwd");
                String baru = request.getParameter("pwd1");
                String baru1 = request.getParameter("pwd2");

                AdminModel ad = new AdminModel();
                Admin admin = ad.AmbilData(Nama_Akun);
                
                if (admin.getKataSandi().equals(lama)) {
                    if (baru.equals(baru1)) {
                admin.setNamaAkunA(Nama_Akun);
                admin.setEmail(Email);
                admin.setKataSandi(baru);
                
                boolean x = mAdmin.UbahData(admin);
                if (x) {
                    session.setAttribute("Nama_Akun", Nama_Akun);
                    response.sendRedirect("index.jsp");
                }
                    }else {
                        out.println("<script>"
                                + "alert(\"Konfirmasi Kata Sandi baru tidak sesuai dengan kata sandi baru, silakan isi ulang\");"
                                + "location.href=history.back();"
                                + "</script>");
                        //request.setAttribute("pesan", "Kata Sandi Sebelumnya tidak sesuai silakan isi ulang");
                        //request.getRequestDispatcher("PengaturanController?proses=UbahDataDiri").forward(request, response);
                    }
            } else {
                    out.println("<script>"
                                + "alert(\"Kata Sandi Sebelumnya tidak sesuai silakan isi ulang\");"
                                + "location.href=history.back();"
                                + "</script>");
                    //request.setAttribute("pesan", "Kata Sandi Sebelumnya tidak sesuai silakan isi ulang");
                    //request.getRequestDispatcher("PengaturanController?proses=UbahDataDiri").forward(request, response);

                }
            }
        }
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PengaturanController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PengaturanController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
