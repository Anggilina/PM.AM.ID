/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Entity.Konfirmasi;
import Model.KonfirmasiModel;
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
public class KonfirmasiControl extends HttpServlet {
   KonfirmasiModel mKonfirmasi = new KonfirmasiModel();

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
            /* TODO output your page here. You may use following sample code. */
                  String proses = request.getParameter("proses");

        if (proses.equals("listkonfrimasi")) {
            Konfirmasi[] mKonfirmsiList = mKonfirmasi.semuaKonfirmasi();
            request.setAttribute("KonfirmasiList", mKonfirmsiList);
            RequestDispatcher rd=request.getRequestDispatcher("layananpengunjung.jsp");  
             //servlet2 is the url-pattern of the second servlet  
            rd.forward(request, response);//method may be include or forward  

        }   else if (proses.equals("listkonfrimasiadmin")) {

            Konfirmasi[] mKonfirmsiList = mKonfirmasi.semuaKonfirmasi();
            request.setAttribute("konfrimasiList", mKonfirmsiList);
            RequestDispatcher rd=request.getRequestDispatcher("adKonfirmasi.jsp");  
             //servlet2 is the url-pattern of the second servlet  
            rd.forward(request, response);//method may be include or forward 

        } else if(proses.equals("tambahPertanyaan")){
            String Nama_AkunM = request.getParameter("Nama_Akun");
            String pertanyaan = request.getParameter("pertanyaan");
            String jawaban = request.getParameter("jawaban");
            String Nama_AkunA = request.getParameter("Nama_AkunA");

            Konfirmasi kn = new Konfirmasi();

            kn.setNamaAkunM(Nama_AkunM);
            kn.setPertanyaan(pertanyaan);
            kn.setJawaban(jawaban);
            kn.setNamaAkunA(Nama_AkunA);
            
            boolean x = mKonfirmasi.tambahKonfrimasi(kn);

            if (x) {
                response.sendRedirect("KonfirmasiController?proses=listkonfrimasi");
            }
        }
        
        
        else if (proses.equals("editKonfimasi")) {
            int idkonfirmasi = Integer.parseInt(request.getParameter("idkonfirmasi"));
            Konfirmasi kn = new Konfirmasi();
            kn = mKonfirmasi.AmbilData(idkonfirmasi);
            request.setAttribute("konfirmasiList", kn);
            RequestDispatcher rd=request.getRequestDispatcher("FormKonfirmasi.jsp");  
             //servlet2 is the url-pattern of the second servlet  
            rd.forward(request, response);

        } else if (proses.equals("editkonfirmasiaksi")) {
            int idkonfirmasi = Integer.parseInt(request.getParameter("idkonfirmasi"));
            String Nama_AkunM = request.getParameter("Nama_AkunM");
            String pertanyaan = request.getParameter("pertanyaan");
            String jawaban = request.getParameter("jawaban");
            String Nama_AkunA = request.getParameter("Nama_AkunA");

            Konfirmasi kn = new Konfirmasi();
            kn.setIdKonfrimasi(idkonfirmasi);
            kn.setNamaAkunM(Nama_AkunM);
            kn.setPertanyaan(pertanyaan);
            kn.setJawaban(jawaban);
            kn.setNamaAkunA(Nama_AkunA);
            

            boolean x = mKonfirmasi.UbahData(kn);

            if (x) {
                response.sendRedirect("KonfirmasiController?proses=listkonfrimasiadmin");
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
