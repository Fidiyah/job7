/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.percabangan;

import java.util.Scanner;
/**
 *
 * @author asd
 */

public class CobaPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String identitas = " fidiyah maharani / XR2 / 10 ";
     
      System.out.println("Identitas : " + identitas);
      
      // buat Scanner baru
      Scanner baca = new Scanner (System.in);
      System.out.print("Nilai a ? ");
      int a = baca.nextInt();
      
      System.out.println("\nlF.. 1");
      if (a < 5)System.out.println("Nilai a kurang dari 5");
      
      System.out.println("\nlf.. 2");
      if ( a == 5)
          System.out.println("Nilai a sama dengan 5");
      
      System.out.println("\nlF.. 3");
      if ( a > 5) {
          System.out.println("isi variable a : " + a );
          System.out.println("Nilai a lebih dari 5");
          
        System.out.println("\nlF.. ELSE");
        if (a < 5) {
            System.out.println("isi variable a :" + a);
            System.out.println("Nilai kurang dari 5");
        } else System.out.println("Nilai a lebih dari atau sama dengan 5");
        
        System.out.println("\nlf..ELSE..IF..ELSE.. 1");
        if(a < 5) {
            System.out.println("Nilai a kurang 5");
            
        } else if(a == 5) {
            System.out.println("Nilai a sama dengan 5");
            
        } else 
            System.out.println("Nilai a sama dengan 5");
        
       System.out.println("\nlF..ELSE..IF..ELSE..2");
       if (a < 2) {
           System.out.println("NIlai a kurang dari 2");
       } else if(a < 4) {
           System.out.println("Nilai a kurang dari 4");
       } else if(a < 6) {
           System.out.println("Nilai a kurang dari 6");
       } else if(a == 6) {
           System.out.println("Nilai a sama dengan 6");
       } else {
           System.out.println("Nilai a lebih dari 6");
           
         System.out.println("nNested IF");
         if (a < 7) {
             System.out.println("Nilai a kurang dari 7");
             if (a > 2)
                 System.out.println("Nilai a lebih dari 2");
             if (a < 4)
                 System.out.println("Nilai a kurang dari 4");
             
             System.out.println("\nSWITCH..CASE");
             switch(a) {
                 case 1 : System.out.println("nilai a => 1"); break;
                 case 2 : System.out.println("nilai a => 2"); break;
                 case 3 : System.out.println("nilai a => 3 atau 4") ; break;
                 case 5 : System.out.println("nilai a => 5"); break;
                 default: System.out.println("nilai a bukan antara 1 -5");
                 
                 int nilai;
                 System.out.print("\nNilai anda ?");
                 nilai = baca.nextInt();
                 
                 String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
                 System.out.println(nilai + "=>" + grade);
                 
                 
                 
                         
                 
                 
             }
                         
         }
             
       
       }
        
      }
      
      
      
      
      
      
    
    
    
    
    
    
    }
    
}
