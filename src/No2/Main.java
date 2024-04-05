/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No2;

import java.util.Scanner;

/**
 *
 * @author UTRIA
 */
public class Main {
    public static void main (String[] args) {
        int total = 0;
        int jmlpos = 0;
        int jmlneg = 0;
        int jmlbil = 0;
        
        Scanner inputBaru = new Scanner(System.in);
        
        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukkan nilai 0:");
        while (true){
            int bilangan = inputBaru.nextInt();
            
            if (bilangan == 0) {
                break;
            }
            total += bilangan;
            
            if(bilangan>0){
                jmlpos++;
            } else if (bilangan < 0){
                jmlneg++;
            }
            jmlbil++;
        } 
        double RataRata;
        if(jmlbil > 0){
            RataRata = (double) total / jmlbil;
        } else {
            RataRata = 0.0;
        }
        
        System.out.println("Jumlah bilangan positif adalah " + jmlpos);
        System.out.println("Jumlah bilangan negatif adalah " + jmlneg);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata adalah " + RataRata);
   
         inputBaru.close();
    }  
}
