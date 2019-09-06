/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_10_pi;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    
    public static float pI(int n){
        float temp = 0;
        for(int i = 0;i<=n;i++){
            temp += (float)(Math.pow(-1, i)/(2*i+1));
        }
        return temp*4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("PI = " + pI(n));
        
    }
    
}
