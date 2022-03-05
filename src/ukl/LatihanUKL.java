/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LatihanUKL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String masuk, keluar;
        int golongan, harga=0;
        System.out.print("Id Daerah Masuk: ");
        masuk = input.nextLine();
        System.out.print("Id Daerah keluar: ");
        keluar = input.nextLine();
        System.out.print("Golongan Kendaraaan: ");
        golongan = input.nextInt();
        if(masuk.equalsIgnoreCase("Dupak") && keluar.equalsIgnoreCase("Waru") ){
            if (golongan == 1){
                harga = 5000;
            }else if(golongan == 2 || golongan==3){
                harga = 8000; 
            }else{
                harga = 10500;
            }
        }else if(masuk.equalsIgnoreCase("Waru")&& keluar.equalsIgnoreCase("Sidoarjo")||masuk.equalsIgnoreCase("Sidoarjo")&& keluar.equalsIgnoreCase("Waru")){
            if (golongan == 1){
                harga = 6000;
            }else if(golongan == 2 || golongan==3){
                harga = 9000; 
            }else{
                harga = 12000;
            }
        }else if(masuk.equalsIgnoreCase("Waru")&& keluar.equalsIgnoreCase("Porong")||masuk.equalsIgnoreCase("Porong")&& keluar.equalsIgnoreCase("Waru")){
            if (golongan == 1){
                harga = 9000;
            }else if(golongan == 2 || golongan==3){
                harga = 14000; 
            }else{
                harga = 18500;
            }
        }else if(masuk.equalsIgnoreCase("Porong")&& keluar.equalsIgnoreCase("Sidoarjo")||masuk.equalsIgnoreCase("Sidoarjo")&& keluar.equalsIgnoreCase("Porong")){
            if (golongan == 1){
                harga = 5500;
            }else if(golongan == 2 || golongan==3){
                harga = 8500; 
            }else{
                harga = 11500;
            }
        }else if(masuk.equalsIgnoreCase("Porong")&& keluar.equalsIgnoreCase("Kejapanan")){
            if (golongan == 1){
                harga = 6000;
            }else if(golongan == 2 || golongan==3){
                harga = 8500; 
            }else{
                harga = 11500;
            }
        }else if(masuk.equalsIgnoreCase("Kejapanan")&& keluar.equalsIgnoreCase("Gempol")){
            if (golongan == 1){
                harga = 3000;
            }else if(golongan == 2 || golongan==3){
                harga = 5000; 
            }else{
                harga = 6500;
            }
        }else{
            System.out.println("Daftar Tujuan Tidak Ada");
        }
        System.out.println("Harga = "+harga);
        
    }
}
   
         
