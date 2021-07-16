/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Entity.Konfirmasi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import koneksi.Koneksi;

/**
 *
 * @author user
 */
public class KonfirmasiModel {
    Koneksi db = new Koneksi("jdbc:mysql://localhost:3306/pm_am_id", "root", "");

    public Konfirmasi AmbilData(int id_konfirmasi) {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Konfirmasi kon = new Konfirmasi();
        String sql = "SELECT * FROM konfirmasi where id_konfirmasi='" + id_konfirmasi + "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                kon.setIdKonfrimasi(rs.getInt("id_konfirmasi"));
                kon.setNamaAkunA(rs.getString("nama_akunA"));
                kon.setNamaAkunM(rs.getString("nama_akunM"));
                kon.setPertanyaan(rs.getString("pertanyaan"));
                kon.setJawaban(rs.getString("jawaban"));
            }

            return kon;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return kon;
            } catch (SQLException e) {
                e.printStackTrace();
                return kon;

            }
        }
    }

    public boolean tambahKonfrimasi(Konfirmasi kon) {
        Connection con = null;
        try {
            String insert = "insert into konfirmasi values(NULL,'" 
                             + kon.getNamaAkunM()+"'," 
                             + "NULL,'" 
                             + kon.getPertanyaan()+ "','" 
                             + kon.getJawaban() + "')";

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

    public boolean UbahData(Konfirmasi kon) {
        Connection con = null;

        String insert;

        insert = "UPDATE konfirmasi SET "
                +"nama_akunM = '" + kon.getNamaAkunM() + "', "
                +"pertanyaan = '" + kon.getPertanyaan()+ "', "
                + "nama_akunA = '" + kon.getNamaAkunA() + "', "
                + "jawaban = '" + kon.getJawaban() + "'"
                + "WHERE id_konfirmasi='" + kon.getIdKonfrimasi() + "'";

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
    
     public Konfirmasi[] semuaKonfirmasi() {
        Connection con = null;
        Konfirmasi[] KonfirmasiList = null;
        Konfirmasi temp = null;
        ArrayList list = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from konfirmasi";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {

                temp = new Konfirmasi();

                temp.setNamaAkunA(rs.getString("nama_akunA"));
                temp.setNamaAkunM(rs.getString("nama_akunM"));
                temp.setPertanyaan(rs.getString("pertanyaan"));
                temp.setJawaban(rs.getString("jawaban"));
                temp.setIdKonfrimasi(rs.getInt("id_konfirmasi"));
                

                list.add(temp);
            }

            KonfirmasiList = new Konfirmasi[list.size()];
            list.toArray(KonfirmasiList);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return KonfirmasiList;
            } catch (SQLException e) {
                e.printStackTrace();
                return KonfirmasiList;
            }
        }
    }
}
