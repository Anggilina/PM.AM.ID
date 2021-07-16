/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Entity.Tentang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import koneksi.Koneksi;

/**
 *
 * @author user
 */
public class TentangModel {
    Koneksi db = new Koneksi("pm_am_id", "root", "");
    
    public Tentang[] semuaTentang() {
        Connection con = null;
        Tentang[] tentangList = null;
        Tentang temp = null;
        ArrayList list = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from tentang";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {

                temp = new Tentang();

                temp.setIdPemilik(rs.getInt("id_pemilik"));
                temp.setPemilik(rs.getString("pemilik"));
                temp.setLokasi(rs.getString("lokasi"));
                temp.setHariBuka(rs.getString("hari_buka"));
                temp.setJamOprasional(rs.getString("jam_oprasional"));
                temp.setJamTutup(rs.getString("jam_tutup"));
                temp.setDeskripsi(rs.getString("deskripsi"));

                list.add(temp);
            }

            tentangList = new Tentang[list.size()];
            list.toArray(tentangList);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return tentangList;
            } catch (SQLException e) {
                e.printStackTrace();
                return tentangList;
            }
        }
    }
    
    public Tentang ambilTentang(int id_pemilik) {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Tentang mTentang = new Tentang();
        String sql = "SELECT * FROM tentang where id_pemilik='" + id_pemilik + "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                mTentang.setIdPemilik(rs.getInt("id_pemilik"));
                mTentang.setPemilik(rs.getString("pemilik"));
                mTentang.setLokasi(rs.getString("lokasi"));
                mTentang.setHariBuka(rs.getString("hari_buka"));
                mTentang.setJamOprasional(rs.getString("jam_oprasional"));
                mTentang.setJamTutup(rs.getString("jam_tutup"));
                mTentang.setDeskripsi(rs.getString("deskripsi"));

            }

            return mTentang;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return mTentang;
            } catch (SQLException e) {
                e.printStackTrace();
                return mTentang;

            }
        }
    }

    
    public boolean ubahTentang(Tentang mTentang) {
        Connection con = null;
        String insert;

        insert = "UPDATE tentang SET "
                + "pemilik= '" + mTentang.getPemilik()+ "', "
                + "lokasi= '" + mTentang.getLokasi()+ "' ,"
                + "hari_buka= '" + mTentang.getHariBuka()+ "' ,"
                + "jam_oprasional= '" + mTentang.getJamOperasional()+ "' ,"
                + "jam_tutup= '" + mTentang.getJamTutup()+ "' ,"
                + "deskripsi= '" + mTentang.getDeskripsi()+ "'"
                + "WHERE id_pemilik='" + mTentang.getIdPemilik() + "'";

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
