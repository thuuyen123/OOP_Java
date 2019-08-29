/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_7_lk_thuanngto;

/**
 *
 * @author Thu Uyên
 */
public class OOP_7_lk_thuanngto {

    
    public static void main(String[] args) {
        int dem =0;
        SoThuanNguyenTo s = new SoThuanNguyenTo();
        s.nhap();
        System.out.print("Các số nguyên tố có 5 chữ số mà tổng của các chữ số nguyên tố đó bằng S là:");
        for (int i = 10000; i <= 99999; i++) {
            if(s.checkNgto(i) && s.tongChsoLaS(i)){
                dem++;
                System.out.print(" "+ i);
            }
        }
        System.out.println("");
        if(dem==0) System.out.println("Rỗng");
    }
    
}
