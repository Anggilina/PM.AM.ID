/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author yenny d
 */

import Entity.Minuman;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import koneksi.Koneksi;


public class MinumanModel {

    Koneksi db = new Koneksi("jdbc:mysql://localhost:3306/pm_am_id", "root", "");

    public Minuman ambilMinuman(String id_minuman) {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Minuman mMinuman = new Minuman();
        String sql = "SELECT * FROM minuman where id_minuman ='" + id_minuman + "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                mMinuman.setIdMinuman(rs.getString("id_minuman"));
                mMinuman.setNamaMinuman(rs.getString("nama_minuman"));
                mMinuman.setGambarMinuman(rs.getString("gambar_minuman"));
                mMinuman.setHargaMinuman(rs.getInt("harga"));
                mMinuman.setDesMinuman(rs.getString("descripsi"));
                mMinuman.setStatus(rs.getString("status"));
                mMinuman.setJenisMinuman(rs.getString("jenis_minuman"));
                
            }

            return mMinuman;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return mMinuman;
            } catch (SQLException e) {
                e.printStackTrace();
                return mMinuman;

            }
        }
    }

    public Minuman[] semuaMinuman() {
        Connection con = null;
        Minuman[] menuList = null;
        Minuman temp = null;
        ArrayList list = new ArrayList();
        ResultSet rs = null;
        String sql = "select * from minuman";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {

                temp = new Minuman();

                temp.setIdMinuman(rs.getString("id_minuman"));
                temp.setNamaMinuman(rs.getString("nama_minuman"));
                temp.setGambarMinuman(rs.getString("gambar_minuman"));
                temp.setHargaMinuman(rs.getInt("harga"));
                temp.setStatus(rs.getString("status"));
                temp.setDesMinuman(rs.getString("descripsi"));
                temp.setJenisMinuman(rs.getString("jenis_minuman"));
                

                list.add(temp);
            }

            menuList = new Minuman[list.size()];
            list.toArray(menuList);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return menuList;
            } catch (SQLException e) {
                e.printStackTrace();
                return menuList;
            }
        }
    }

    public boolean tambahMinuman(Minuman mMinuman) {
        Connection con = null;
        try {
            String insert = "insert into minuman values(" 
                             +"'"+ mMinuman.getIdMinuman() + "',"
                             + "'" + mMinuman.getNamaMinuman()+ "',"
                             + "'" + mMinuman.getGambarMinuman()+ "',"
                             + "'" + mMinuman.getHargaMinuman() + "',"
                             + "'" + mMinuman.getDesMinuman() + "',"
                             + "'" + mMinuman.getStatus() + "',"
                             + "'" + mMinuman.getJenisMinuman()+ "')";

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

    public boolean ubahMinuman(Minuman mMinuman) {
        Connection con = null;
        String insert;

        insert = "UPDATE minuman SET "
                + "nama_minuman= '" + mMinuman.getNamaMinuman()+ "', "
                + "gambar_minuman= '" + mMinuman.getGambarMinuman()+ "' ,"
                + "harga= '" + mMinuman.getHargaMinuman()+ "' ,"
                + "descripsi= '" + mMinuman.getDesMinuman()+ "' ,"
                + "status= '" + mMinuman.getStatus()+ "' ,"
                + "jenis_minuman= '" +  mMinuman.getJenisMinuman()+ "'"
                + "WHERE id_minuman='" + mMinuman.getIdMinuman() + "'";
        
        System.out.println(insert);
                

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

    public boolean hapusMinuman(String idMinuman) {
        Connection con = null;

        String insert = "Delete from minuman  "
                + "WHERE id_minuman='" + idMinuman + "'";
        System.out.println(idMinuman);
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

