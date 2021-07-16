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
public class Tentang {
    private int id_pemilik;
    private String pemilik;
    private String lokasi;
    private String hari_buka;
    private String jam_oprasional;
    private String jam_tutup;
    private String deskripsi;
    
    public int getIdPemilik(){
        return id_pemilik;
    }
    
    public void setIdPemilik(int id_pemilik){
        this.id_pemilik=id_pemilik;
    }
    
    public String getPemilik(){
        return pemilik;
    }
    
    public void setPemilik(String pemilik){
        this.pemilik=pemilik;
    }
    
    public String getLokasi(){
        return lokasi;
    }
    
    public void setLokasi(String lokasi){
        this.lokasi=lokasi;
    }
    
    public String getHariBuka(){
        return hari_buka;
    }
    
    public void setHariBuka(String hari_buka){
        this.hari_buka=hari_buka;
    }
    
    public String getJamOperasional(){
        return jam_oprasional;
    }
    
    public void setJamOprasional(String jam_oprasional){
        this.jam_oprasional=jam_oprasional;
    }
    
    public String getJamTutup(){
        return jam_tutup;
    }
    
    public void setJamTutup(String jam_tutup){
        this.jam_tutup=jam_tutup;
    }
    
    public String getDeskripsi(){
        return deskripsi;
    }
    
    public void setDeskripsi(String deskripsi){
        this.deskripsi=deskripsi;
    }
}
