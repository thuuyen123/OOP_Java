/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai4;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class MangINT {
    private int[] a;
    public MangINT(int n){
        a=new int[n];
    }

    public MangINT() {
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập các phần tử trong dãy ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    public void sum(){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];            
        }
        System.out.println("Tổng dãy số là: sum = " + sum);
    }
    public void trungBinh(){
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];            
        }
        System.out.println("Trung bình dãy số trên là avg = " +(float) sum/a.length);
    }
    public void max_min(){
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max) max = a[i];
            if(a[i]<min) min = a[i];
         }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    public boolean checkNgto(int n){
        if(n<2) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public void ngTo(){
        System.out.println("Các số nguyên tố trong dãy trên là:");
        for (int i = 0; i < a.length; i++) {
            if(checkNgto(a[i])== true) System.out.print(" "+ a[i]);
        }
        System.out.println("");
    }
   
}
