/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai2;

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
        SoNguyen s = new SoNguyen();
        int choice;
        while(true){
            System.out.println("=====Menu==========");
            System.out.println("1.Nhập 2 số nguyên m và n");
            System.out.println("2.Đưa ra UCLN và BCNN");
            System.out.println("3.Đưa ra các số nguyên tố từ m đến n");
            System.out.println("4.Đưa ra các số thuận nghịch trong khoảng m-n");
            System.out.println("0.EXIT");
            Scanner sc = new Scanner(System.in);
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 0:
                    break;
                case 1:
                    s.nhap();
                    break;
                case 2:
                    s.nhap();
                    s.UCLN_BCNN();
                    break;
                case 3:
                    s.nhap();
                    s.nguyenTo();
                    System.out.println("");
                    break;
                case 4:
                    s.nhap();//sai
                    s.thuanNghich();
                    System.out.println("");
                    break;
                default: System.out.println("Nhập chọn sai!Chọn lại");
            }
            if(choice == 0) break;
        }
    }
    
}
