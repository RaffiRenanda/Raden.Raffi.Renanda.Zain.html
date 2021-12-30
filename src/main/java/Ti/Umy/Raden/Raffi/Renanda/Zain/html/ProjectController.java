/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ti.Umy.Raden.Raffi.Renanda.Zain.html;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import static org.apache.el.lang.ELArithmetic.add;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.myService;

/**
 *
 * @author TUF GAMING
 */
@Controller
public class ProjectController {
    
    
    @RequestMapping("showdatabuah")
    public String getData(Model kurir){
        myService getservice = new myService();
        ArrayList<List<String>> isipaket = new ArrayList<>();
        isipaket = getservice.myData();
        
        kurir.addAttribute("namapaket",isipaket); //proses pengiriman
        return "raffi"; // halaman tujuan
    }
    
    
       
    
    @RequestMapping("lihatdata")
    //@ResponseBody
    public String lihatdata(HttpServletRequest data, Model model){
        String data_dikirim_NamaCustomer = data.getParameter("NamaCus");
        String data_dikirim_TanggalTransaksi = data.getParameter("TanggalTrans");
        String data_dikirim_UangCustomer = data.getParameter("UangCus");
        String data_dikirim_NamaBuah = data.getParameter("NamaBuah");
        String data_dikirim_HargaKg = data.getParameter("HargaKg");
        String data_dikirim_JumlahBl = data.getParameter("JumlahBl");
        /*String data_dikirim_TotalHargaAwal = data.getParameter("TotalHargaAwal");
        int JumlahBayar = addJumlahBeli( data_dikirim_HargaKg,data_dikirim_JumlahBl);
       
        Double TotalBayar = null;
        int persenan = 0;
        double diskon = 0;
        
        if (JumlahBayar < 16000){
            diskon = JumlahBayar*0/100;
            TotalBayar = JumlahBayar-diskon;
            
        }
        else if(JumlahBayar<25000 ){
            persenan = 10;
            diskon = JumlahBayar*persenan/100;
            TotalBayar = JumlahBayar-diskon;
        }
        else {
            persenan = 15;
            diskon = JumlahBayar*persenan/100;
            TotalBayar = JumlahBayar-diskon;
        }*/
        hitungdiskon hdc = new hitungdiskon();
        
        
        model.addAttribute("NamaCus", data_dikirim_NamaCustomer);
        model.addAttribute("TanggalTrans", data_dikirim_TanggalTransaksi);
        model.addAttribute("NamaBuah", hdc.Datanamabuah(data_dikirim_NamaBuah));
        model.addAttribute("HargaKg", data_dikirim_HargaKg);
        model.addAttribute("JumlahBl", data_dikirim_JumlahBl);
        model.addAttribute("TotalHargaAwl", hdc.TotalhargaAWL(data_dikirim_HargaKg, data_dikirim_JumlahBl));
        model.addAttribute("TotalDiskon", hdc.GetDiskon(data_dikirim_HargaKg, data_dikirim_HargaKg, data_dikirim_JumlahBl));
       model.addAttribute("PersenDiskon", hdc.GetPersenan(0, data_dikirim_HargaKg, data_dikirim_JumlahBl));
        model.addAttribute("TotalBayarAhr", hdc.TotalHargaAHR(data_dikirim_HargaKg, data_dikirim_HargaKg, data_dikirim_HargaKg, data_dikirim_JumlahBl));
        model.addAttribute("UangCustommer", data_dikirim_UangCustomer);
        model.addAttribute("UangKembalian", hdc.GetKembalian(data_dikirim_JumlahBl, data_dikirim_HargaKg, data_dikirim_HargaKg, data_dikirim_HargaKg, data_dikirim_JumlahBl, data_dikirim_UangCustomer));
        
        return "raffitwo";
}
}
