/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Entity.Admin;
import Entity.Member;
import Entity.Pesan;
import Model.AdminModel;
import Model.MemberModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class LoginController extends HttpServlet {
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
             String proses = request.getParameter("proses");
             String pesan=null;
             
 
          if (proses.equals("login")) {
            String Nama_Akun = request.getParameter("nama_akun");
            String Kata_Sandi = request.getParameter("kata_sandi");
            
            Admin admin = new Admin();
            admin = mAdmin.AmbilData(Nama_Akun);
            
            Member member = new Member();
                member = mMember.AmbilData(Nama_Akun);

            if (admin.getKataSandi() != null) {
                if (admin.getKataSandi().equals(Kata_Sandi)) {
                    admin= mAdmin.AmbilData(Nama_Akun);
                    HttpSession session = request.getSession(true);
                    session.setAttribute("Nama_Akun", Nama_Akun);
                    session.setAttribute("Status", "admin");
                    response.sendRedirect("index.jsp");
                    out.print("berhasil admin");
                } else {
                    pesan="Password yang dimasukkan salah";
                    request.setAttribute("pesan", pesan);
                    request.getRequestDispatcher("FormLogin.jsp").forward(request, response);
                }
            } else if(member.getKata_Sandi() != null) {
                    if (member.getKata_Sandi().equals(Kata_Sandi)) {
                        HttpSession session = request.getSession(true);
                        session.setAttribute("Nama_Akun", Nama_Akun);
                        session.setAttribute("Status", "member");
                        ArrayList<Pesan> mCart = new ArrayList();
                        session.setAttribute("mCart", mCart);
                        out.print("berhasil member");
                        response.sendRedirect("index.jsp");
                    } else {
                        pesan="Password yang dimasukkan salah";
                        request.setAttribute("pesan", pesan);
                        request.getRequestDispatcher("FormLogin.jsp").forward(request, response);
                    }
                }
            else{
                pesan="Nama Akun yang dimasukkan salah";
                request.setAttribute("pesan", pesan);
                request.getRequestDispatcher("FormLogin.jsp").forward(request, response);
            }
        } else if (proses.equals("logout")) {
            HttpSession session = request.getSession(true);
            session.invalidate();
            response.sendRedirect("index.jsp");
        }
          else {
               response.sendRedirect("FormLogin.jsp");
        }
            /* TODO output your page here. You may use following sample code. */
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
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


