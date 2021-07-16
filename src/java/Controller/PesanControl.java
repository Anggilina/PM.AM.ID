/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Pesan;
import Entity.Member;
import Model.PesanModel;
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
public class PesanControl extends HttpServlet {

    PesanModel mModel = new PesanModel();

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
        Pesan[] mPesanList;
        Member[] mMember;
        HttpSession mSession = request.getSession(true);

        String nama_akunM = mSession.getAttribute("Nama_Akun").toString();
        String status = mSession.getAttribute("Status").toString();
        ArrayList<Pesan> mCart = new ArrayList();
        if (status.equals("member")) {
            mCart = (ArrayList) mSession.getAttribute("mCart");
        }

        switch (proses) {
            case "listpesan":
                mPesanList = mModel.semuaPesan();
                request.setAttribute("pesanList", mPesanList);
                request.getRequestDispatcher("adRiwayat.jsp").forward(request, response);
                break;
            case "listpesanMember":
                mPesanList = mModel.semuaPesanMember(nama_akunM);
                request.setAttribute("pesanList", mPesanList);
                RequestDispatcher rd=request.getRequestDispatcher("riwayat.jsp"); 
                rd.forward(request, response); 
                break;
            case "masukkeranjang":
                String idMinuman = request.getParameter("idMinuman");
                String jam_pengambilan=request.getParameter("jam_pengambilan");
                int jumlah = Integer.parseInt(request.getParameter("jumlah"));
                int harga = Integer.parseInt(request.getParameter("harga"));
                String catatan = request.getParameter("catatan");
                if(request.getParameter("catatan1")!=null || request.getParameter("catatan1")!=""){
                    catatan = request.getParameter("catatan1");
                }

                Date ys = new Date(); // membuat oject ys dari class Date
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");//membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
                String tanggal = s.format(ys);

                Pesan mPesan = new Pesan();
                mPesan.setIdMinuman(idMinuman);
                mPesan.setNamaAkunM(nama_akunM);
                mPesan.setJamPengambilan(jam_pengambilan);
                mPesan.setJumlah(jumlah);
                mPesan.setTotal(harga * jumlah);
                mPesan.setStatus("belum olah");
                mPesan.setTanggal(tanggal);
                mPesan.setKeterangan(catatan);
                mCart.add(mPesan);
                mSession.setAttribute("mCart", mCart);
                response.sendRedirect("MinumanController?proses=listminuman");

                out.print(catatan);
                //   request.getRequestDispatcher("MenuController?proses=listmenu").forward(request, response);
                //response.sendRedirect("MenuController?proses=listmenu");
                break;
            case "checkout":
                for (int i = 0; i < mCart.size(); i++) {
                    Boolean x = mModel.tambahPesan(mCart.get(i));
                    out.print(x);
                }
                ArrayList<Pesan> mCartBaru = new ArrayList();
                mSession.setAttribute("mCart", mCartBaru);
                response.sendRedirect("PesanController?proses=listpesanMember");

                break;

            case "hapuscart":
                int index = Integer.parseInt(request.getParameter("index"));
                mCart.remove(index);
                mSession.setAttribute("mCart", mCart);
                response.sendRedirect("pesan.jsp");
                break;

            case "ubahstatuspesan":
                int idPesan = Integer.parseInt(request.getParameter("idPesan"));
                status = request.getParameter("status");
                mPesan = mModel.ambilPesan(idPesan);
                mPesan.setStatus(status);
                mModel.ubahPesan(mPesan);
                response.sendRedirect("PesanController?proses=listpesan");
                break;
                
            case "ubahwaktu":
                int idPesan1 = Integer.parseInt(request.getParameter("idPesan"));
                mPesan = mModel.ambilPesan(idPesan1);
                request.setAttribute("Form", mPesan);
                request.getRequestDispatcher("FormUpdatePesan.jsp").forward(request, response);
                break;  
                
            case "ubahaksiwaktu":
                int idPesan2 = Integer.parseInt(request.getParameter("idPesan"));
                String jam_pengambilan1 = request.getParameter("jam_pengambilan");
                mPesan = mModel.ambilPesan(idPesan2);
                mPesan.setJamPengambilan(jam_pengambilan1);
                mModel.ubahPesan(mPesan);
                response.sendRedirect("PesanController?proses=listpesan");
                break;
            
            case "cari":
                String search = request.getParameter("search");
                mPesanList = mModel.cari(search);
                request.setAttribute("pesanList", mPesanList);
                RequestDispatcher rd1=request.getRequestDispatcher("search.jsp"); 
                rd1.forward(request, response); 
                break;
                
            case "max_pesan":
                request.setAttribute("List", mModel.View());
                request.getRequestDispatcher("tglmax.jsp").forward(request, response);
                break;
                
            case "min_pesan":
                request.setAttribute("List", mModel.View2());
                request.getRequestDispatcher("tglmin.jsp").forward(request, response);
                break;

            case "hapuspesan":
                int idPesan3 = Integer.parseInt(request.getParameter("idPesan"));
                boolean x = mModel.hapusPesan(idPesan3);
                out.print(x);
                if (x) {
                    response.sendRedirect("PesanController?proses=listpesan");
                }
                break;
            default:
                System.out.println("no match");
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
