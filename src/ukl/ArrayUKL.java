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
public class ArrayUKL {
    public static void main(String[]args){
        int a[][]={{-7,5,8,-2},{2,4,8,7},{1,2,9,-6},{2,3,-6,0},{6,3,2,8}};  
        int b[][]={{1,1,7,-6},{6,-4,9,0},{3,7,1,-1},{4,1,5,-4},{4,1,7,-2}};
        System.out.println("Hasil A-B");
        for(int i=0;i<5;i++){ 
            for(int j=0;j<4;j++){ 
                System.out.print(a[i][j]-b[i][j]+"\t"); 
            } System.out.println(); 
        }
        
        
        System.out.println();
        
        
        int y[][] ={{1,2},{2,3},{3,7},{4,5}};
        int x[][] ={{6,3,2,8},{4,1,7,-2}};
        int h[][] =new int[4][4];
        System.out.println("Hasil AXB");
        for (int i=0; i<4; i++){
            for (int j=0;j<4; j++){
                for (int k=0; k<2; k++){
                    h [i][j]=h[i][j]+y[i][k]*x[k][j];
            }
                System.out.print(h[i][j]+"\t");
            } System.out.println();
        }    
    }
    
}
