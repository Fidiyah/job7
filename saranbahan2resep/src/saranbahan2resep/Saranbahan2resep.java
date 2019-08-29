/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saranbahan2resep;

import java.util.Scanner;

/**
 *
 * @author asd
 */
public class Saranbahan2resep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = ("Fidiyah maharani /  XR2 / 10");
        System.out.println("identitas : " + identitas);
        System.out.print("\nSaran Resep Dari Bahan Milik Anda\n");
        
        
        Scanner x = new Scanner(System.in);
        System.out.println("bahan pertama : ");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        System.out.print("masukkan pilihan anda :");
        int bahan1 = x.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("bahan kedua :");
            if(bahan1 == 1) {
                System.out.println("1.susu");
                System.out.println("2.minyak");
                System.out.println("3.tidak ada");
            } else {
                System.out.println("1.minyak goreng");
                System.out.println("2.roti");
                System.out.println("3.tidak ada");
                
            }
            System.out.print("masukkan no pilihan anda :");
            int bahan2 = x.nextInt();
            
        }else
            System.out.println("mohon maaf pilihan anda tidak dapat ditemukan" + "tidak dapat menemukan resep");
        
        int bahan2 = x.nextInt();
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1 : System.out.println("anda dapat membuat milkshake banana"); break;
                    case 2 : System.out.println("anda dapat membuat pisang goreng"); break;
                    case 3 : System.out.println("anda dapat membuat pisang rebus");
                }
            else
                switch(bahan2)
                {
                    case 1 : System.out.println("anda dapat membuat telur mata sapi"); break;
                    case 2 : System.out.println("anda dapat membuat sandwich telur"); break;
                    case 3 : System.out.println("anda dapat membuat telur rebus");
                    
                }
        }else
            System.out.println("mohon maaf pilihan tidak dapat ditemukan," + "tidak dapat menemukan resep");
    }
}
        

    
        
        
            
                    
                
                    
                       
                        
                        
                
       
        
            
        
            
            
            
            
        
        
           
       
        
        
        
   
    
    
    
   
