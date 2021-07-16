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
public class Konfirmasi {
    private int id_konfirmasi;
    private String nama_akunM;
    private String nama_akunA;
    private String pertanyaan;
    private String jawaban;
    
    public int getIdKonfrimasi(){
        return id_konfirmasi;
    }
    
    public void setIdKonfrimasi(int id_konfirmasi){
        this.id_konfirmasi=id_konfirmasi;
    }
    
    public String getNamaAkunM(){
        return nama_akunM;
    }
    
    public void setNamaAkunM(String nama_akunM){
        this.nama_akunM=nama_akunM;
    }
    
    public String getNamaAkunA(){
        return nama_akunA;
    }
    
    public void setNamaAkunA(String nama_akunA){
        this.nama_akunA=nama_akunA;
    }
    
    public String getPertanyaan(){
        return pertanyaan;
    }
    
    public void setPertanyaan(String pertanyaan){
        this.pertanyaan=pertanyaan;
    }
    
    public String getJawaban(){
        return jawaban;
    }
    
    public void setJawaban(String jawaban){
        this.jawaban=jawaban;
    }
}
