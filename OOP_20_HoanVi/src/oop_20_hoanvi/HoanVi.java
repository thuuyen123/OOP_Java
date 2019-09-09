/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_20_hoanvi;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class HoanVi {
    private int n;
    int[] x = new int[100];
    int[] usu = new int[100]; 
    public HoanVi() {
    }

    public HoanVi(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        n = Integer.parseInt(sc.nextLine());
    }
    public void display(){
        for (int i = 1; i <= n; i++) {
            System.out.print(x[i]);
        }
        System.out.println("");
    }
//    public int init(){
//        for (int i = 1; i <= n; i++) {
//            usu[i] = 0;
//        }
//    }
}
