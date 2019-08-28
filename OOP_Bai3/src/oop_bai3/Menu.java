/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai3;

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
        SoThuc s = new SoThuc();
        int choice;
        while(true){
            System.out.println("=====Menu==========");
            System.out.println("1.Nhập 3 số a,b,c");
            System.out.println("2.Tìm nghiệm ax^2 +bx +c");
            System.out.println("3.Tính diện tích của tam giác");
            System.out.println("4.Tính sin khi x=a");
            System.out.println("5.Tính cos khi x=b");
            System.out.println("6.Tính diện tích hình hộp");
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
                    s.ptb2();
                    break;
                case 3:
                    s.nhap();
                    s.dienTichtamgiac();
                    break;
                case 4:
                    s.sin();
                    break;
                case 5:
                    s.cos();
                    break;
                case 6:
                    s.nhap();
                    s.dienTichHinhhop();
                    break;
                default: System.out.println("Nhập chọn sai!Chọn lại");
            }
            if(choice == 0) break;
        }

    }
    
}
