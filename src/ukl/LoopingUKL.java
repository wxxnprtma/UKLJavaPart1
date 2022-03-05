/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author ASUS
 */
public class LoopingUKL {
    public static void main(String[] args) {
        int a=14;
        int b=3;
        int n=15; 
        int u=a; 
        int s=a; 
        System.out.println("Deret Aritmatikanya adalah"); 
        for(int i=0;i<n;i++){
            if (i>=10){
            System.out.println(u);
            s=s+u;
            } 
            u=u+b; 
        } 
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
        
        System.out.println();
        
        int x=14;
        int y=3;
        int w=x; 
        int z=x; 
        System.out.println("Deret Aritmatikanya adalah"); 
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
            System.out.print(w+"\t");
            w=w+y;
            z=z+w;
            }System.out.println();  
        }
        z=z-w;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+z);
    }
    
}
