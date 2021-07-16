/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Minuman;
import Model.MinumanModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maverick
 */
public class MinumanControl extends HttpServlet {

    MinumanModel mMinum = new MinumanModel();

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

        if (proses.equals("listminuman")) {
            Minuman[] mMenuList = mMinum.semuaMinuman();
            request.setAttribute("menuList", mMenuList);
            RequestDispatcher rd=request.getRequestDispatcher("menuMinuman.jsp"); 
            rd.forward(request, response); 

        } else if (proses.equals("tambahminuman")) {
            String idMinuman = request.getParameter("idMinuman");
            String namaMinuman = request.getParameter("namaMinuman");
            int harga = Integer.parseInt(request.getParameter("harga"));
            String desMinuman = request.getParameter("desMinuman");
            String gambarMinuman = request.getParameter("gambarminuman");
            String jenisMinuman = request.getParameter("jenisMinuman");
            String status = request.getParameter("status");

            Minuman mn = new Minuman();

            mn.setIdMinuman(idMinuman);
            mn.setNamaMinuman(namaMinuman);
            mn.setGambarMinuman(gambarMinuman);
            mn.setHargaMinuman(harga);
            mn.setDesMinuman(desMinuman);
            mn.setStatus(status);
            mn.setJenisMinuman(jenisMinuman);
            
            boolean x = mMinum.tambahMinuman(mn);

            if (x) {
                response.sendRedirect("MinumanController?proses=listadmin");
            }

        } else if (proses.equals("listadmin")) {

            Minuman[] mMenuList = mMinum.semuaMinuman();
            request.setAttribute("menuList", mMenuList);
            request.getRequestDispatcher("adMinuman.jsp").forward(request, response);

        } else if (proses.equals("editmenu")) {
            String idMinuman = request.getParameter("idMinuman");
            Minuman mn = new Minuman();
            mn = mMinum.ambilMinuman(idMinuman);
            request.setAttribute("menu", mn);
            request.getRequestDispatcher("FormPerbaruiMinuman.jsp").forward(request, response);

        } else if (proses.equals("editminumanaksi")) {
            String idMinuman = request.getParameter("idMinuman");
            String namaMinuman = request.getParameter("namaMinuman");
            int harga = Integer.parseInt(request.getParameter("harga"));
            String desMinuman = request.getParameter("desMinuman");
            String gambarMinuman = request.getParameter("gambarminuman");
            String jenisMinuman = request.getParameter("jenisMinuman");
            String status = request.getParameter("status");

            Minuman mn = new Minuman();

            mn.setIdMinuman(idMinuman);
            mn.setNamaMinuman(namaMinuman);
            mn.setGambarMinuman(gambarMinuman);
            mn.setHargaMinuman(harga);
            mn.setDesMinuman(desMinuman);
            mn.setStatus(status);
            mn.setJenisMinuman(jenisMinuman);

            boolean x = mMinum.ubahMinuman(mn);

            if (x) {
                response.sendRedirect("MinumanController?proses=listadmin");
            }

        } else if (proses.equals("hapusminum")) {
            String idMinuman = request.getParameter("idMinuman");
            boolean x = mMinum.hapusMinuman(idMinuman);
            out.print(x);
            if (x) {
                response.sendRedirect("MinumanController?proses=listadmin");
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
