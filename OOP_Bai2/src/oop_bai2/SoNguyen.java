/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai2;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SoNguyen {
    private int n;
    private int m;

    public SoNguyen() {
    }

    public SoNguyen(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
     public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập m: ");
        m = sc.nextInt();
        System.out.print("Nhập n: ");
        n = sc.nextInt();
    }
     public void UCLN_BCNN(){
        int c = m *n;
        while(m!=n){
           if(m>n) m=m-n;
           else n=n-m;
        }
        System.out.println("UCLN = " + m);
        System.out.println("BCNN = " + c/m);
    }
    public boolean checkNgto(int n){
        if(n<2) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public void nguyenTo(){
        if(n<m){
             int temp = n;
             n=m;
             m= temp;
        }
        int dem =0;
        System.out.print("Các số nguyên tố từ m đến n là:");
        for (int i = m; i <= n; i++) {
            if(checkNgto(i)==true){
                dem++;
                System.out.print(" "+ i);           
            }
        }
        if(dem==0) System.out.print("rỗng");
    }
    public boolean checkThuanNghich(int n){
        int temp = n;
        int tg = 0;
        while(n>0){
            tg = tg*10 + n%10;
            n /= 10;
        }
        if(tg==temp) return true;
        else return false;
       
    }
    public void thuanNghich(){
        if(n<m){
             int temp = n;
             n=m;
             m= temp;
        }
        int dem = 0;
        System.out.print("Các số thuận nghịch trong khoảng từ m đến n là: ");
        for (int i = m; i <= n; i++) {
           if(checkThuanNghich(i)==true){
               dem++;
               System.out.print(" "+ i);
           }
        }
        if(dem==0) System.out.print("rỗng");
    }
}
