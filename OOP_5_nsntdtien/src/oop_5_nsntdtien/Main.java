/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_5_nsntdtien;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static boolean checkNgto(int n){
        if(n<2) return false;
        for (int i = 2; i<= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: " );
        int n = sc.nextInt();
        int dem =0;
        System.out.print(n+ " số nguyên tố đầu tiên là:");
        int i = 0;
        while(dem <= n ){
            if(checkNgto(i) == true){
                System.out.print(" " +i);
                dem++;
            }
            i++;
        }
    }
    
}
