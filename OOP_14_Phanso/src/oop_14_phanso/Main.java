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
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        PhanSo x = new PhanSo();;
        int choice;
        while (true){
            System.out.println("====MENU_Phân Số ======");
            System.out.println("1.Nhập");
            System.out.println("2.Tổng 2 phân số");
            System.out.println("3.Hiệu 2 phân số");
            System.out.println("4.Tích 2 phân số");
            System.out.println("5.Thương 2 phân số");
            System.out.println("0.Exit");
            System.out.print("Bạn chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 0:
                    break;
                case 1:
                    a.nhap();
                    b.nhap();
                    break;
                case 2:
                    x.tong(a,b);
                    break;
                case 3:
                    x.hieu(a,b);
                    break;
                case 4:
                    x.tich(a,b);
                    break;
                case 5:
                    x.thuong(a,b);
                    break;
                default:
                    System.out.println("Chọn sai! Mời nhập lại!");
            }
            if(choice==0) break;
        }
    }

    
}
