/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q1_phone;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook p = new PhoneBook();
        int choice;
        while(true){
            System.out.println("========MENU========");
            System.out.println("0.Thoat");
            System.out.println("1.Nhap so trong nuoc");
            System.out.println("2.Nhap so quoc te");
            System.out.println("3.Tim so theo ma vung");
            System.out.println("4.Liet ke cac so dien thoai");
            System.out.println("5.Tong so theo tung vung");
            System.out.println("6.Tim kiem so theo duoi");
            System.out.print("Ban chon: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 0:
                    break;
                case 1:
                    p.nhapTrongNuoc();
                    break;
                case 2:
                    p.nhapQuocTe();
                    break;
                case 3:
                    p.timKiemTheoMaVung();
                    break;
                case 4:
                    p.hienThiTuyChon();// van loi
                    break;
                case 5:
                    p.tongSdtTheoMaVung();
                    break;
                case 6:
                    p.timKiemTheoDuoi();
                    break;
            }
            if(choice==0) break;
        }
        
    }
    
}
