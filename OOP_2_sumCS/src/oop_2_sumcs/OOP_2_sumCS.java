/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2_sumcs;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class OOP_2_sumCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n = ");
        int n = sc.nextInt();
        int sum =0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        System.out.println("Tổng các chữ số của số nguyên đó là: " + sum );
    }
    
}
