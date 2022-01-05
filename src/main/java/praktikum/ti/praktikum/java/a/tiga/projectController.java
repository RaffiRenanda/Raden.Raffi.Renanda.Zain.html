/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.praktikum.java.a.tiga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import praktikum.ti.praktikum.java.a.tiga.pemrosesanClass; // input packages
import service.project.serviceAccess;


/**
 *
 * @author TUF GAMING
 */
@Controller
public class projectController {
    
    pemrosesanClass proses = new pemrosesanClass();
    
    
    @RequestMapping("/salam")
    @ResponseBody
    public String greeting(){
        String kalimat = proses.ucapanSalam();
        
        return kalimat;
    }
    
    @RequestMapping("/viewdata")
    @ResponseBody
    public String tampilkan(){
        String result = "";
        
        //nama dan kelas
        result = proses.tampilkanhasil("20200140020", "raffi");
        return result;
    }
    
    @RequestMapping("/prosesharga")
    @ResponseBody
    public String getHarga(){
        String harga = "";
        
        //jumlah beli dan harga satuan = totaal harga?
        harga = String.valueOf(proses.getHarga(4, 20000)); //convert double to string

        return "Total harga beli : " + harga;
    }
    
    @RequestMapping("/suhu1")
    @ResponseBody
    public String getSuhu(){
        String suhu = "";
        int celcius = 50;

        suhu = String.valueOf(proses.getSuhu(celcius)); //convert double to string

        return "Suhu Dalam celcuis : " + celcius + "<br> Suhu Fahreinheit : " + suhu;
    }
    
    serviceAccess pemrosesan =new serviceAccess();
    
    @RequestMapping("/ceknama")
    @ResponseBody
    public String viewNama(){
        String hasil ="";
        
        hasil = pemrosesan.cekNama();
        
        return hasil;
    } 
    
    @RequestMapping("/cekUmur")
    @ResponseBody
    public String viewUmur(){
        return String.valueOf(pemrosesan.umur());// convert int to string
    }
    
    @RequestMapping("/NamaUmur")
    @ResponseBody
    public String NamaUmur(){
        String nama = "";
        String umur = "";
        nama = pemrosesan.cekNama();
        umur = String.valueOf(pemrosesan.umur());
        
        return "Data Diri<br> Nama : " + nama + "<br> Umur : " + umur + " Tahun";
    }
    
    @RequestMapping("/Datadiri")
    @ResponseBody
    public String viewData(){
        String view = "";
        String nama = pemrosesan.cekNama();
        String umur = String.valueOf(pemrosesan.umur());
        String status = pemrosesan.status();
        
        view = "Nama : " + nama + " <br>Umur : " + umur + " <br>Status : " + status ;
        
        
        return view;
    }
    
    @RequestMapping("/Datadiri2")
    @ResponseBody
    public String viewData2(){
        String view = "";
        String nama = pemrosesan.cekNama();
        String umur = String.valueOf(pemrosesan.umur2(2001, 2021));
        String status = pemrosesan.status2();
        
        view = "Contoh 2 <br> Nama : " + nama + " <br>Umur : " + umur + " <br>Status : " + status ;
        
        
        return view;
    }
}
