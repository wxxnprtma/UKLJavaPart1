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
public class SeleksiKondisiUKL {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        int id,pendapatan,spp,dsp;
        System.out.print("Masukkan Id: ");
        id = input.nextInt();
        System.out.print("Pendapatan orang tua: ");
        pendapatan = input.nextInt();
        System.out.print("Jumlah SPP: ");
        spp = input.nextInt();
        if(id==1){
            System.out.println("Nama : Mira");
            System.out.println("Jalur masuk : SBMPTN");
            System.out.println("Alamat : Sawojajar");
            if(pendapatan<2000000){
                dsp = 5000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : A");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else if(pendapatan>=2000000 && pendapatan<=10000000){             
                dsp = 15000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : B");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else{
                dsp = 30000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : c");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }
        }else if(id==2){
            System.out.println("Nama : Nina");
            System.out.println("Jalur masuk : SNMPTN");
            System.out.println("Alamat : Kedung Kandang");
            if(pendapatan<2000000){
                dsp = 7000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : A");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else if(pendapatan>=2000000 && pendapatan<=10000000){             
                dsp = 17000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : B");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else{
                dsp = 35000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : c");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }
        }else if(id==3){
            System.out.println("Nama : Oemar");
            System.out.println("Jalur masuk : Mandiri");
            System.out.println("Alamat : Ijen");
            if(pendapatan<2000000){
                dsp = 10000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : A");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else if(pendapatan>=2000000 && pendapatan<=10000000){             
                dsp = 25000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : B");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else{
                dsp = 50000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : c");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }
        }else if(id==4){
            System.out.println("Nama : Pena");
            System.out.println("Jalur masuk : SBMPTN");
            System.out.println("Alamat : Dinoyo");
            if(pendapatan<2000000){
                dsp = 5000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : A");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else if(pendapatan>=2000000 && pendapatan<=10000000){             
                dsp = 15000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : B");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }else{
                dsp = 30000000;
                int jumlah = spp+dsp;
                 System.out.println("Kategori pendapatan : c");
                 System.out.println("Jumlah Biaya yang dibayar = "+ jumlah);
            }
        }else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
}
