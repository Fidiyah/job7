/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author asd
 */
import java.util.Scanner;
public class Program_Pembayaran_tagihan_listrik {
    public static void main(String [] args) {
        System.out.println("--PROGRAM PEMBAYARAN TAGIHAN LISTRIK--");
        int kWh;
        double Total;
        double biaya;
        
        //Scanner
        Scanner baca = new Scanner(System.in);
        
        //Input
        System.out.print("input pemakaian : ");
        kWh = baca.nextInt();
        
        
        if(kWh <= 450) {
            System.out.println("anda termasuk Golongan c");
            biaya = 20000 + (kWh * 1000);
            System.out.println("Biaya : " + biaya);
            
            Total =((biaya * 10 / 100)+ biaya);
            System.out.println("Total : " + Total);
            
        }  else if(kWh <= 900) {
            System.out.println("anda termasuk Golongan B");
           biaya = 35000 + (kWh * 2500);
           System.out.println("Biaya : " + biaya);
           
           Total = ((biaya * 15 / 100)+ biaya);
           System.out.println("Total : " + Total);
           
        } else if(kWh <= 1200) {
            System.out.println("anda termasuk Golongann A");
            biaya = 50000 + (kWh * 3000);
            System.out.println("Biaya :" + biaya);
            
            Total = ((biaya * 20 / 100) + biaya);
            System.out.println("total : " + Total);
            
        } else {
    System.out.println("MAAF INPUT YANG ANDA MASUKKAN TIDAK SESUAI");
           
            
            
            
           
           
                    
                    }
           
            
        }
        
        
        
        
        
        
       
    }
    


