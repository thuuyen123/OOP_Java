/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_4_lksnt;

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
        System.out.print("Nhập số nguyên n: " );
        int n = sc.nextInt();
        System.out.print("Các số nguyên tố nhỏ hơn n là:");
        for (int i = 0; i < n ; i++) {
            if(checkNgto(i)) System.out.print(" "+ i);
        }
        System.out.println("");
    }
    
}
