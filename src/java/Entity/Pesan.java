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
public class Pesan {

    private int id_pesan;
    private String nama_akunM;
    private String id_minuman;
    private String jam_pengambilan;
    private String tanggal;
    private int jumlah;
    private int total;
    private String keterangan;
    private String status;

    public int getIdPesan() {
        return id_pesan;
    }

    public void setIdPesan(int id_pesan) {
        this.id_pesan = id_pesan;
    }

    public String getNamaAkunM() {
        return nama_akunM;
    }

    public void setNamaAkunM(String nama_akunM) {
        this.nama_akunM = nama_akunM;
    }

    public String getIdMinuman() {
        return id_minuman;
    }

    public void setIdMinuman(String id_minuman) {
        this.id_minuman = id_minuman;
    }

    public String getJamPengambilan() {
        return jam_pengambilan;
    }

    public void setJamPengambilan(String jam_pengambilan) {
        this.jam_pengambilan = jam_pengambilan;
    }
    
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
}
