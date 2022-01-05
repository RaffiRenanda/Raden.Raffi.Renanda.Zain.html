/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.project;

/**
 *
 * @author TUF GAMING
 */
public class serviceAccess {
    int tahunTemp;
    public String cekNama(){
        return "Raffi Renanda Zain Azis";
    }
    
    public int umur(){
        int umurSekarang;
        int tahunLahir = 2001;
        int tahunSekarang = 2021;
        
        umurSekarang = tahunSekarang - tahunLahir;
        return umurSekarang;
    }
    
    public String status(){
        String status = "";
        
        if(umur()>= 17){
            status = "Memiliki KTP";
        }
        else{
            status = "Belum memiliki KTP";
        }
        return status;
        
    }
    
    public int umur2(int tahunKelahiran, int tahunSaatini){
        int umurSekarang;
        int tahunLahir = tahunKelahiran;
        int tahunSekarang = tahunSaatini;
        
        umurSekarang = tahunSekarang - tahunLahir;
        
        tahunTemp = umurSekarang;
        return umurSekarang;
    }
    
    public String status2(){
        String status = "";
        int usia = tahunTemp;
        if(usia >= 17){
            status = "Memiliki KTP";
        }
        else{
            status = "Belum memiliki KTP";
        }
        return status;
    }
}
