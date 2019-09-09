/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_18_lkxaunp;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class NhiPhan {
    private int n;
    int[] x = new int[100] ;
    public NhiPhan() {
    }
    
    public NhiPhan(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

   
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập n = ");
        n = Integer.parseInt(sc.nextLine());
    }
    public void display(){
        for (int i = 1; i <= n; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
    }
    public void Try(int i){
        for (int j = 0; j <= 1; j++) {
            x[i]=j;
            if(i==n) display();
            else Try(i+1);
        }
    }
//    public void result(){
//        nhap();
//        try{
//            Try(1);
//        }catch(NullPointerException e){
//            e.printStackTrace();
//        }
//   }
        
}
