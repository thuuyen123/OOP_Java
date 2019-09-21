/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q3;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {
    public static void main(String[] args) {
        QLTV ql = new QLTV();
        Scanner sc = new Scanner (System.in);
        int choice;
        while(true){
                System.out.println("========MENU===========");
                System.out.println("0.Exit");
                System.out.println("1.Nhập 1 dau sach");
                System.out.println("2.Nhap 1 dau tap chi");
                System.out.println("3.Viet ra danh sach");
                System.out.println("4.Xoa");
                System.out.println("5.Sua");
                System.out.println("6.thong ke theo ten nxb");
                System.out.print("Bạn chọn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 0:break;
                    case 1:
                        ql.nhapSach();
                        break;
                    case 2:
                        ql.nhapTapChi();
                        break;
                    case 3:
                       ql.hienThi();
                        break;
                    case 4:
                         ql.xoa();
                         break;
                     case 5:
                         ql.suaTaiLieu();
                         break;
                     case 6:
                         ql.thongkeTenNhaXb();
                         break;
                    default: System.out.println("CHon sai CHon lai");
                }
            if(choice==0) break;
            }
    }       
}
