/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_19_tohop;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class ToHopChapKcuaN {
    private int n;
    private int k;
    int[] x = new int[100];
    public ToHopChapKcuaN() {
    }

    public ToHopChapKcuaN(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n =  ");
        n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập k = ");
        k = Integer.parseInt(sc.nextLine());
    }
    public void display(){
        for (int i = 1; i <= k; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
    }
    public void Try(int i){
        for (int j = x[i-1]+1; j <= n-k+i; j++) {
            x[i] =j;
            if(i==k) display();
            else Try(i+1);
        }
    }
    public void init(){
        x[0] =0;
    }
}
