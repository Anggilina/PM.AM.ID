/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import Entity.Member;
import java.sql.*;
import koneksi.Koneksi;

/**
 *
 * @author user
 */
public class MemberModel {
    Koneksi db = new Koneksi("jdbc:mysql://localhost:3306/pm_am_id", "root", "");

    public Member AmbilData(String namaAkun) {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;
        Member mbr1 = new Member();
        String sql = "SELECT * FROM member where nama_akunM='" + namaAkun + "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                mbr1.setNamaAkunM(rs.getString("nama_akunM"));
                mbr1.setEmail(rs.getString("email"));
                mbr1.setjenis_kelamin(rs.getString("jenis_kelamin"));
                mbr1.setNo_Hp(rs.getString("no_hp"));
                mbr1.setKata_Sandi(rs.getString("kata_sandi"));
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

    public boolean tambahMember(Member member) {
        Connection con = null;
        try {
            String insert = "insert into member values(" 
                             +"'"+ member.getNamaAkunM() + "',"
                             + "'" + member.getEmail()+ "',"
                             + "'" + member.getJenis_Kelamin()+ "',"
                             + "'" + member.getNo_Hp() + "',"
                             + "'" + member.getKata_Sandi()+ "')";
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

    public boolean UbahData(Member member) {
        Connection con = null;

        String insert;

        insert = "UPDATE member SET "
                + "email = '" + member.getEmail() + "', "
                + "jenis_kelamin = '" + member.getJenis_Kelamin() + "', "
                + "No_Hp= '" + member.getNo_Hp() + "', "
                + "Kata_Sandi= '" + member.getKata_Sandi() + "' "
                + "WHERE nama_akunM='" + member.getNamaAkunM() + "'";

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
    
    public boolean Login(Member member) {
        Connection con = null;
        ResultSet rs = null;
        boolean validasi = false;

        String sql = "SELECT * FROM konsumen where Nama_Akun='" + member.getNamaAkunM()+ "'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            if (rs.next()) {
                if (member.getKata_Sandi().equals(rs.getString("Kata_Sandi"))) {
                    validasi = true;
                }
            }

            return validasi;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return validasi;
            } catch (SQLException e) {
                e.printStackTrace();
                return validasi;

            }
        }
    }
}
