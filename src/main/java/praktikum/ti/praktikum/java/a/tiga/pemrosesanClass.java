/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.praktikum.java.a.tiga;

/**
 *
 * @author TUF GAMING
 */
public class pemrosesanClass {
    // Variable
    //method
    //objek class lain
    public String ucapanSalam(){
        String result = "" ;
        result = "Selamat Datang";
        
        return result;
        
    }
    
    public String tampilkanhasil(String nim, String nama){
        String hasil = "";
        hasil = "NIM : " + nim + "<br> Nama : " + nama;
        return hasil;
    }
    
    public double getHarga(double jumlahbeli, double hargasatuan){
        double hitung = 0.0;
        hitung = jumlahbeli * hargasatuan;
        return hitung;
    }
    
    public double getSuhu(double celcuis){
        double hitung = 0.0;
        hitung = 9/5*celcuis +32;
        return hitung;
    }
}
