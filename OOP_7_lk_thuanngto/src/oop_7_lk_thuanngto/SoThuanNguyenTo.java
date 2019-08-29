/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_7_lk_thuanngto;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class SoThuanNguyenTo {
    private int S;

    public SoThuanNguyenTo() {
    }

    public SoThuanNguyenTo(int S) {
        this.S = S;
    }


    public int getS() {
        return S;
    }

    public void setS(int S) {
        this.S = S;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị S = ");
        S = sc.nextInt();
    }
    public boolean checkNgto(int n){
        if(n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
           if(n%i==0) return false;
        }
        return true;
    }
    public boolean tongChsoLaS(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        if(sum==S) return true;
        else return false;
    }
}
