/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Pesan;
import Entity.Member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import koneksi.Koneksi;

/**
 *
 * @author user
 */
public class PesanModel {

    Koneksi db = new Koneksi("pm_am_id", "root", "");

    public Pesan ambilPesan(int id_pesan) {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Pesan mPesan = new Pesan();
        String sql = "SELECT * FROM pesan where id_pesan='" + id_pesan + "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                mPesan.setIdPesan(rs.getInt("id_pesan"));
                mPesan.setNamaAkunM(rs.getString("nama_akunM"));
                mPesan.setIdMinuman(rs.getString("id_minuman"));
                mPesan.setJamPengambilan(rs.getString("jam_pengambilan"));
                mPesan.setTanggal(rs.getString("tanggal"));
                mPesan.setJumlah(rs.getInt("jumlah"));
                mPesan.setTotal(rs.getInt("total"));
                mPesan.setKeterangan(rs.getString("keterangan"));
                mPesan.setStatus(rs.getString("status"));

            }

            return mPesan;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return mPesan;
            } catch (SQLException e) {
                e.printStackTrace();
                return mPesan;

            }
        }
    }

    public Pesan[] semuaPesan() {
        Connection con = null;
        Pesan[] pesanList = null;
        Pesan temp = null;
        ArrayList list = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from pesan";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {

                temp = new Pesan();

                temp.setIdPesan(rs.getInt("id_pesan"));
                temp.setNamaAkunM(rs.getString("nama_akunM"));
                temp.setIdMinuman(rs.getString("id_minuman"));
                temp.setJamPengambilan(rs.getString("jam_pengambilan"));
                temp.setTanggal(rs.getString("tanggal"));
                temp.setJumlah(rs.getInt("jumlah"));
                temp.setTotal(rs.getInt("total"));
                temp.setKeterangan(rs.getString("keterangan"));
                temp.setStatus(rs.getString("status"));

                list.add(temp);
            }

            pesanList = new Pesan[list.size()];
            list.toArray(pesanList);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return pesanList;
            } catch (SQLException e) {
                e.printStackTrace();
                return pesanList;
            }
        }
    }

    public boolean tambahPesan(Pesan mPesan) {
        Connection con = null;
        try {
            String insert = "insert into pesan values(NULL,'" 
                             + mPesan.getNamaAkunM()+"','" 
                             + mPesan.getIdMinuman()+"','" 
                             + mPesan.getJamPengambilan()+"','"
                             + mPesan.getTanggal() + "','"
                             + mPesan.getJumlah() + "','"
                             + mPesan.getTotal()+ "','"
                             + mPesan.getKeterangan()+ "','"
                             + mPesan.getStatus() + "')";
            db.connect();
            db.executeUpdate(insert);
            db.disconnect();
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean ubahPesan(Pesan mPesan) {
        Connection con = null;
        String insert;

        insert = "UPDATE pesan SET "
                + "nama_akunM= '" + mPesan.getNamaAkunM()+ "', "
                + "id_minuman= '" + mPesan.getIdMinuman()+ "' ,"
                + "jam_pengambilan= '" + mPesan.getJamPengambilan()+ "' ,"
                + "tanggal= '" + mPesan.getTanggal()+ "' ,"
                + "jumlah= '" + mPesan.getJumlah()+ "' ,"
                + "total= '" + mPesan.getTotal()+ "' ,"
                + "keterangan= '" + mPesan.getKeterangan()+ "' ,"
                + "status= '" + mPesan.getStatus() + "' "
                + "WHERE Id_Pesan='" + mPesan.getIdPesan() + "'";

        try {
            db.connect();
            db.executeUpdate(insert);
            db.disconnect();
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //beda
    public Pesan[] semuaPesanMember(String nama_akunM) {
        Connection con = null;
        Pesan[] pesanList = null;
        Pesan temp = null;
        ArrayList list = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from pesan where nama_akunM ='" + nama_akunM + "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {

        temp = new Pesan();

                temp.setIdPesan(rs.getInt("id_pesan"));
                temp.setNamaAkunM(rs.getString("nama_akunM"));
                temp.setIdMinuman(rs.getString("id_minuman"));
                temp.setJamPengambilan(rs.getString("jam_pengambilan"));
                temp.setTanggal(rs.getString("tanggal"));
                temp.setJumlah(rs.getInt("jumlah"));
                temp.setTotal(rs.getInt("total"));
                temp.setKeterangan(rs.getString("keterangan"));
                temp.setStatus(rs.getString("status"));
                list.add(temp);
            }

            pesanList = new Pesan[list.size()];
            list.toArray(pesanList);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return pesanList;
            } catch (SQLException e) {
                e.printStackTrace();
                return pesanList;
            }
        }
    }
    
    public Pesan[] cari(String search) {
        Connection con = null;
        Pesan[] pesanList = null;
        Pesan temp = null;
        ArrayList list = new ArrayList();
        ResultSet rs = null;
        String data = "SELECT * FROM pesan,minuman where nama_akunM like '%"+search+"%' or nama_minuman like '%"+search+"%' and pesan.id_minuman=minuman.id_minuman;";

        try {
            con = db.connect();
            rs = db.executeQuery(data);

            while (rs.next()) {

                temp = new Pesan();

                temp.setIdPesan(rs.getInt("id_pesan"));
                temp.setNamaAkunM(rs.getString("nama_akunM"));
                temp.setIdMinuman(rs.getString("id_minuman"));
                temp.setJamPengambilan(rs.getString("jam_pengambilan"));
                temp.setTanggal(rs.getString("tanggal"));
                temp.setJumlah(rs.getInt("jumlah"));
                temp.setTotal(rs.getInt("total"));
                temp.setKeterangan(rs.getString("keterangan"));
                temp.setStatus(rs.getString("status"));

                list.add(temp);
            }

            pesanList = new Pesan[list.size()];
            list.toArray(pesanList);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return pesanList;
            } catch (SQLException e) {
                e.printStackTrace();
                return pesanList;
            }
        }
    }
    
    public Member View() {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Member mbr1 = new Member();
        String sql = "select * from max_pesan";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                mbr1.setNamaAkunM(rs.getString("nama_akunM"));
                mbr1.setEmail(rs.getString("email"));
                mbr1.setjenis_kelamin(rs.getString("jenis_kelamin"));
                mbr1.setNo_Hp(rs.getString("no_hp"));
            }

            return mbr1;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return mbr1;
            } catch (SQLException e) {
                e.printStackTrace();
                return mbr1;

            }
        }
    }
    
    public Member View2() {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Member mbr1 = new Member();
        String sql = "select * from min_pesan";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                mbr1.setNamaAkunM(rs.getString("nama_akunM"));
                mbr1.setEmail(rs.getString("email"));
                mbr1.setjenis_kelamin(rs.getString("jenis_kelamin"));
                mbr1.setNo_Hp(rs.getString("no_hp"));
            }

            return mbr1;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return mbr1;
            } catch (SQLException e) {
                e.printStackTrace();
                return mbr1;
            }
        }
    }
  
    public boolean hapusPesan(int id_pesan) {
        Connection con = null;

        String insert = "Delete from pesan  "
                + "WHERE id_pesan='" + id_pesan + "'";

        try {
            db.connect();
            db.executeUpdate(insert);
            db.disconnect();
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
