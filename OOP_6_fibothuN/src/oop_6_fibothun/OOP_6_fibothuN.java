/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_6_fibothun;

import java.util.Scanner;

/**
 * 1 1 2 3 5
 * @author Thu Uyên
 */
public class OOP_6_fibothuN {

    /**
     * @param args the command line arguments
     */
    public static int fiBo(int n){
        if(n==0 || n==1) return 1;
        else return fiBo(n-1)+fiBo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("Số fibonacci thứ "+ n+" là: "+ fiBo(n));
    }
    
}
