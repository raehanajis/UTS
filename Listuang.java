/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsualng;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class Listuang {
    String nama;
    int jumlahtukar,beli;
    List<JenisUang> mu;
    
    public Listuang(String nama, int jumlahtukar,int beli, List<JenisUang> mu)
    {
     this.nama          = nama;
     this.jumlahtukar   = jumlahtukar;
     this.beli          = beli;
     this.mu            = mu;
     
       
    }
    public List<JenisUang> getMu() {
        return mu;
    }
    public void setMu(List<JenisUang> mu) {
        this.mu = mu;
    }
    
    public String getNama(){
       return nama;
    }
    public void setNama(String nama){
       this.nama = nama ;
    }
    int getJumlahtukar(){
       
       return jumlahtukar;
    }
    public void setJumlahtukar(int jumlahtukar){
       this.jumlahtukar = jumlahtukar ;
    }


   int getBeli(){
       return beli;
    }
    public void setBeli(int Beli){
       this.beli = beli ;
    }
    
}
