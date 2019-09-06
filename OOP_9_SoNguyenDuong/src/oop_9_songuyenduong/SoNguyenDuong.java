/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_9_songuyenduong;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SoNguyenDuong {
    private int n;

    public SoNguyenDuong() {
    }

    public SoNguyenDuong(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhap(){
        Scanner in  = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        n = Integer.parseInt(in.nextLine());
    }
   
    public void lkUoc(){
        System.out.print("Các ước của "+n+" :");
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(" "+i);
        }
        System.out.println("");
    }
    
    public boolean checkNgTo(int n){
        if(n<2) return false;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public void lkUocNgto(){
        System.out.print("Các ước là số nguyên tố của "+n+" :");
        int dem =0;
        for(int i =1;i<=n;i++){
            if(n%i==0 && checkNgTo(i)){
                dem++;
                System.out.print(" "+ i);
            }
        }
        if(dem==0) System.out.print("rỗng");
        System.out.println("");
    }
}


