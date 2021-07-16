/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Entity.Admin;
import java.sql.*;
import koneksi.Koneksi;


/**
 *
 * @author user
 */
public class AdminModel {
    
     Koneksi db = new Koneksi("jdbc:mysql://localhost:3306/pm_am_id", "root", "");

    public Admin AmbilData(String namaAkun) {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Admin adm = new Admin();

        String sql = "SELECT * FROM admin where nama_akunA='" + namaAkun + "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                adm.setNamaAkunA(rs.getString("nama_akunA"));
                adm.setEmail(rs.getString("email"));
                adm.setKataSandi(rs.getString("kata_sandi"));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return adm;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;

            }
        }
    }

      public boolean UbahData(Admin mAdmin) {
        Connection con = null;

        String insert;

        insert = "UPDATE admin SET "
                + "email = '" + mAdmin.getEmail() + "', "
                + "kata_sandi= '" + mAdmin.getKataSandi() + "' "
                + "WHERE nama_akunA='" + mAdmin.getNamaAkunA() + "'";

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
