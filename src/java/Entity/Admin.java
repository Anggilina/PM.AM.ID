/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author user
 */
public class Admin {
    private String nama_akunA;
    private String email;
    private String kata_sandi;

    public String getNamaAkunA() {
        return nama_akunA;
    }

    public void setNamaAkunA(String nama_akunA) {
        this.nama_akunA = nama_akunA;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKataSandi() {
        return kata_sandi;
    }

    public void setKataSandi(String kata_sandi) {
        this.kata_sandi = kata_sandi;
    }
    
}
