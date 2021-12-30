/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TUF GAMING
 */
public class myService {
    
    public ArrayList<List<String>> myData(){
        
        ArrayList<List<String>> tabel = new ArrayList<>();
        tabel.add(Arrays.asList("Jambu","Rp. 15000/kg"));
        tabel.add(Arrays.asList("Nanas","Rp. 10000/kg"));
        tabel.add(Arrays.asList("Mangga","Rp. 20000/kg"));
        tabel.add(Arrays.asList("Strawbery","Rp. 25000/kg"));
        
        return tabel;
}
}
