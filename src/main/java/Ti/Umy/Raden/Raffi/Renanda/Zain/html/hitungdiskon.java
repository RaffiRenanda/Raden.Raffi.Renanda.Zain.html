/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ti.Umy.Raden.Raffi.Renanda.Zain.html;

/**
 *
 * @author TUF GAMING
 */
public class hitungdiskon {
    public String Datanamabuah (String namabuah)
    {
        String ok ="";
        ok = namabuah;
        return ok;
    }
    
    public int TotalhargaAWL(String a, String b){

        int iHargaKg = Integer.parseInt(a);
        int iJumlahBl = Integer.parseInt(b);
        int total = iHargaKg*iJumlahBl;
       return total;
    } 
    
    public int GetDiskon(String Dsc, String a, String b){
        int Diskon = Integer.parseInt(Dsc);
        int iHargaKg = Integer.parseInt(a);
        int iJumlahBl = Integer.parseInt(b);
        int total = iHargaKg*iJumlahBl;
        if (total<16000){
            Diskon = total*0/100;
        }
        else if (total < 25000){
            Diskon = total*10/100;
        }
        else{
            Diskon = total*15/100;
        }
        return Diskon;
    }
    
    public int TotalHargaAHR(String TBA, String Dsc, String a, String b){
        int TotalBayarAkhir = Integer.parseInt(TBA);
        int Diskon = Integer.parseInt(Dsc);
        int iHargaKg = Integer.parseInt(a);
        int iJumlahBl = Integer.parseInt(b);
        int total = iHargaKg*iJumlahBl;
        
        if (total<16000){
            Diskon = total*0/100;
            TotalBayarAkhir = total - Diskon;
        }
        else if (total < 25000){
            Diskon = total*10/100;
            TotalBayarAkhir = total - Diskon;
        }
        else{
            Diskon = total*15/100;
            TotalBayarAkhir = total - Diskon;
        }
        
        return TotalBayarAkhir;
}
    public int GetPersenan(int prs, String a, String b){
       
        int iHargaKg = Integer.parseInt(a);
        int iJumlahBl = Integer.parseInt(b);
        int total = iHargaKg*iJumlahBl;
        int persenan = 0;
        if (total<16000){
            persenan = 0;
        }
        else if (total < 25000){
            persenan = 10;
            
        }
        else{
            persenan = 15;
            
        }
        return persenan;
}

        
    public int GetKembalian(String Kmb, String TBA, String Dsc, String a, String b, String c){
        int TotalBayarAkhir = Integer.parseInt(TBA);
        int Diskon = Integer.parseInt(Dsc);
        int iHargaKg = Integer.parseInt(a);
        int iJumlahBl = Integer.parseInt(b);
        int UangCus = Integer.parseInt(c);
        int total = iHargaKg*iJumlahBl;
        int Kembalian = Integer.parseInt(Kmb);
        
        if (total<16000){
            Diskon = total*0/100;
            TotalBayarAkhir = total - Diskon;
        }
        else if (total < 25000){
            Diskon = total*10/100;
            TotalBayarAkhir = total - Diskon;
        }
        else{
            Diskon = total*15/100;
            TotalBayarAkhir = total - Diskon;
        }
        Kembalian = UangCus - TotalBayarAkhir;
        
        
        return Kembalian;
    }
    
   
}