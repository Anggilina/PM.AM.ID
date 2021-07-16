/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Entity.Tentang;
import Model.TentangModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class TentangControl extends HttpServlet {
TentangModel mTentang = new TentangModel();
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
        PrintWriter out = response.getWriter();
        String proses = request.getParameter("proses");

        if (proses.equals("listtentang")) {
            Tentang[] mTentangList = mTentang.semuaTentang();
            request.setAttribute("tentangList", mTentangList);
            RequestDispatcher rd=request.getRequestDispatcher("tentang.jsp");  
             //servlet2 is the url-pattern of the second servlet  
            rd.forward(request, response);//method may be include or forward  

        }   else if (proses.equals("listtentangadmin")) {

            Tentang[] mTentangList = mTentang.semuaTentang();
            request.setAttribute("tentangList", mTentangList);
            RequestDispatcher rd=request.getRequestDispatcher("adTentang.jsp");  
             //servlet2 is the url-pattern of the second servlet  
            rd.forward(request, response);//method may be include or forward 

        } else if (proses.equals("editTentang")) {
            int id_pemilik = Integer.parseInt(request.getParameter("idpemilik"));
            Tentang tg = new Tentang();
            tg = mTentang.ambilTentang(id_pemilik);
            request.setAttribute("tentangLi", tg);
            RequestDispatcher rd=request.getRequestDispatcher("FormTentang.jsp");  
             //servlet2 is the url-pattern of the second servlet  
            rd.forward(request, response);

        } else if (proses.equals("memperbaruiTentang")) {
            int id_pemilik = Integer.parseInt(request.getParameter("idpemilik"));
            String pemilik = request.getParameter("pemilik");
            String lokasi = request.getParameter("lokasi");
            String hari_buka = request.getParameter("hari_buka");
            String jam_oprasional = request.getParameter("jam_oprasional");
            String jam_tutup = request.getParameter("jam_tutup");
            String deskripsi = request.getParameter("deskripsi");

            Tentang tg = new Tentang();

            tg.setIdPemilik(id_pemilik);
            tg.setPemilik(pemilik);
            tg.setLokasi(lokasi);
            tg.setHariBuka(hari_buka);
            tg.setJamOprasional(jam_oprasional);
            tg.setJamTutup(jam_tutup);
            tg.setDeskripsi(deskripsi);

            boolean x = mTentang.ubahTentang(tg);

            if (x) {
                response.sendRedirect("TentangController?proses=listtentangadmin");
            }

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
