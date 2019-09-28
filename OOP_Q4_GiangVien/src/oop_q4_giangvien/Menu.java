/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q4_giangvien;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {

    
    public static void main(String[] args) {
       QLGV ql=new QLGV();
        while(true){
            System.out.println("1. Nhap vao giang vien co huu");
            System.out.println("2. nhap vao giang vien thinh giang");
            System.out.println("3.Hien thi danh sach giang vien");
            System.out.println("4.Xoa giang vien");
            System.out.println("5.Sua giang vien");
            System.out.println("6.Tim giang vien theo ma");
            System.out.println("0. Exit");
            System.out.print("Moi chon: ");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0: break;
                case 1:ql.nhapgvCH();
                       break;
                case 2:ql.nhapgvTG();
                       break;
                case 3:ql.hienThi();
                       break;
                case 4:ql.xoa();
                       break;
                case 5:ql.suaGV();
                       break;
                case 6:
                    String ma = null;
                    ql.timKiemTheoMa(ma);
                        break;
                
                default:
                    System.out.println("chi chon 0->12");
            }
            if(chon==0) break;
        }
    }
    
    
}
