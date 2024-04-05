/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No1;

import java.util.Random;

/**
 *
 * @author UTRIA
 */
public class Main {
    public static void main(String[] args){
        String[] NamaBulan = {
          "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
            "Juli", "Agustus", "September", "Oktober", "November", "Desember" 
    };
        Random random = new Random();
        int NoBulan = random.nextInt(12) + 1;
        
        System.out.println("Nomor Bulan : " + NoBulan);
        System.out.println("Nama Bulan : " +NamaBulan[NoBulan - 1]);
   }
}
