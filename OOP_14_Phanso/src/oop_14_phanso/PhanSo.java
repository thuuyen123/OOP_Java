/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_14_phanso;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class PhanSo {
    private int tu;
    private int mau;
     public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tu = sc.nextInt();
        do{
            System.out.print("Nhập mẫu số: ");
            mau = sc.nextInt();
            if(mau == 0) System.out.println("Mẫu số phải khác 0! Nhập lại.");
        }while(mau == 0);
    }
    public void tong(PhanSo x1, PhanSo x2){
        tu  =  x1.tu * x2.mau + x2.tu * x1.mau;
        mau = x1.mau * x2 . mau;
        System.out.println(x1.tu+"/"+x1.mau+" + " +x2.tu+"/"+x2.mau + " = " + tu+"/" +mau );
    }
    public void hieu(PhanSo x1, PhanSo x2){
        tu  =  x1.tu * x2.mau - x2.tu * x1.mau;
        mau = x1.mau * x2 . mau;
        System.out.println(x1.tu+"/"+x1.mau+" - " +x2.tu+"/"+x2.mau + " = " + tu+"/" +mau );
    }
    public  void tich(PhanSo x1, PhanSo x2){
        tu = x1.tu * x2.tu;
        mau = x1.mau * x2.mau;
        System.out.println(x1.tu+"/"+x1.mau+" x " +x2.tu+"/"+x2.mau + " = " + tu+"/" +mau);
    }
    public  void thuong(PhanSo x1, PhanSo x2){
        tu = x1.tu * x2.mau;
        mau = x2.tu * x1.mau;
        System.out.println(x1.tu+"/"+x1.mau+" : " +x2.tu+"/"+x2.mau + " = " + tu+"/" +mau);
    }
}
