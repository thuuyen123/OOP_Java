/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_13_thuannghichdoc;



/**
 *
 * @author Thu Uyên
 */
public class Main {

    public static boolean checkThuanNghich(int n){
        int temp = n;
        int tg = 0;
        while(n>0){
            tg = tg*10 + n%10;
            n /= 10;
        }
        if(tg==temp) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        System.out.print("Các số thuận nghịch độc có 6 chữ số là: ");
        for(int i=100000;i<=999999;i++){
            if(checkThuanNghich(i)==true) System.out.print(" "+ i);
        }
        System.out.println("");
    }
    
}
