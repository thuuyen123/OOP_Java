/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_8_fibongto;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Fibo_Ngto {
    private int n;

    public Fibo_Ngto() {
    }

    public Fibo_Ngto(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập n: ");
        n  = Integer.parseInt(sc.nextLine());
    }
    public boolean ngTo(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%2==0) return false;
        }
        return true;
    }
   public int fiBo(int n){
       if(n==0 || n==1) return n;
       return fiBo(n-1)+fiBo(n-2);
   }
   public void fiBo_ngTo(){
       int dem= 0;
       int i =0;
       while(fiBo(i)<n){
           if(ngTo(fiBo(i))){
               dem++;
               System.out.print(" "+ fiBo(i));
           }
           i++;
       }
       if(dem==0) System.out.print(" rỗng");
   }
    
}
