/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cindy;

/**
 *
 * @author THINKPAD
 */
import java.util.Scanner;
public class Latihan_02 {
    public static void main(String [] args){
        Scanner dt = new Scanner (System.in);
        int i,n, jumlah=0;
        System.out.print("Masukan Banyak Bilangan:");
        n = dt.nextInt();
        for(i=1; i<=n; i++ ){
            jumlah =jumlah+ i;
        }
        System.out.println("Jumlah"+ jumlah);
    }
    
}
