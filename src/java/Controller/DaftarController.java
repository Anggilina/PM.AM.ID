/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Entity.Member;
import Entity.Pesan;
import Model.MemberModel;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class DaftarController extends HttpServlet {
    MemberModel mMember = new MemberModel();
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
            String proses = request.getParameter("proses");
             String pesan= null;
            
           if (proses.equals("daftar")) {
            String Nama_Akun = request.getParameter("nama_akun");
            String Email = request.getParameter("email");
            String jk=request.getParameter("pilih");
            String No_Hp = request.getParameter("no_hp");
            String Kata_Sandi = request.getParameter("kata_sandi");
            String KataSandi2 = request.getParameter("konfirmasikata_sandi");
            
            if((Kata_Sandi.length() >= 8) && (Kata_Sandi.equals(KataSandi2)) ){
                Member member = new Member();
                member.setNamaAkunM(Nama_Akun);
                member.setEmail(Email);
                member.setjenis_kelamin(jk);
                member.setNo_Hp(No_Hp);
                member.setKata_Sandi(Kata_Sandi);


                if (mMember.tambahMember(member)) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("Nama_Akun", member.getNamaAkunM());
                    session.setAttribute("Status", "member");
                    ArrayList<Pesan> mCart = new ArrayList();
                    session.setAttribute("mCart", mCart);
                    response.sendRedirect("index.jsp");
                } else {
                     pesan="Nama akun sudah ada yang ada ";
                     request.setAttribute("pesan", pesan );
                    request.getRequestDispatcher("daftar.jsp").forward(request, response);
                }
            }else {
                        pesan="password yang dimasukkan Kurang dari 8 atau tidak sama ";
                        request.setAttribute("pesan", pesan );
                        request.getRequestDispatcher("daftar.jsp").forward(request, response);
                    }
           }else{
               pesan="password yang dimasukkan Kurang dari 8 atau tidak sama ";
               request.setAttribute("pesan", pesan );
               request.getRequestDispatcher("daftar.jsp").forward(request, response);
           }
            /* TODO output your page here. You may use following sample code. */
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DaftarController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DaftarController at " + request.getContextPath() + "</h1>");
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
