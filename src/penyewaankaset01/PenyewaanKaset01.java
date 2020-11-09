/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyewaankaset01;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class PenyewaanKaset01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String[] genre = {"Horror","Action","Drama","Romance"};
        int[]  harga = {3000,3000,4000,3500};
        int a, pilihan,lamasewa;
        double totalharga,bayar;
        
        System.out.println("= Selamat datang di Penyewaan DVD Star Cinema =");
        System.out.println("======  Silahkan Pilih DVD Pilihan Anda  ======");
        
        for (a=0; a<harga.length;a++){
            System.out.println(a+". "+genre[a]+" Haraganya "+ harga[a]);
        }
        
        System.out.print("Masukan pilihan anda : ");              
        pilihan = input.nextInt();
        System.out.println("Jenis DVD          : " + genre[pilihan]);  
        System.out.println("Harga DVD          : " + harga[pilihan]);  
        System.out.print("Lama Sewa ( Hari )   : ");              
        lamasewa = input.nextInt();
        
        totalharga = harga[pilihan] * lamasewa;
        
        do {
            System.out.print("Masukkan uang anda : ");
            bayar = input.nextDouble();
        } while(bayar < totalharga );
        System.out.println("Kembalian          : " + (bayar - totalharga));
        
        
        
        
        
        
        
            
        
        
        
        
    }
    
}
