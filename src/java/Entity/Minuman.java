/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author yenny d
 */
public class Minuman {
    private String id_minuman;
    private String nama_minuman;
    private String gambar_minuman;
    private int harga;
    private String descripsi;
    private String status;
    private String jenis_minuman;

    public String getIdMinuman() {
        return id_minuman;
    }

    public void setIdMinuman(String id_minuman) {
        this.id_minuman = id_minuman;
    }

    public String getNamaMinuman() {
        return nama_minuman;
    }

    public void setNamaMinuman(String nama_minuman) {
        this.nama_minuman = nama_minuman;
    }
    
    public String getGambarMinuman() {
        return gambar_minuman;
    }

    public void setGambarMinuman(String gambar_minuman) {
        this.gambar_minuman = gambar_minuman;
    }
    
          public int getHargaMinuman() {
        return harga;
    }

    public void setHargaMinuman(int harga) {
        this.harga = harga;
    }
    
    public String getDesMinuman() {
        return descripsi;
    }

    public void setDesMinuman(String descripsi) {
        this.descripsi = descripsi;
    }
    
    public String getJenisMinuman() {
        return jenis_minuman;
    }

    public void setJenisMinuman(String jenis_minuman) {
        this.jenis_minuman = jenis_minuman;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
}

