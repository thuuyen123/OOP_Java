
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai1;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {
    public static void main(String[] args) {
        OOP_Bai1 bai = new OOP_Bai1();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("===Menu====");
            System.out.println("0. Thoát");
            System.out.println("1.Nhập số nguyên dương n");
            System.out.println("2. Viết ra tổng 1+2+3+...+n ");
            System.out.println("3. Viết ra tích 1.2.3...n  ");
            System.out.println("4. Viết ra tổng 2+4+.... ");
            System.out.println("5. Viết ra tổng 1+3+5+... ");
            System.out.println("6. Viết ra các số nguyên tố <n ");
            System.out.println("7. Viết ra dãy số Fibonacci <n ");
            System.out.println("8. Viết tổng các chữ số của n (345: 3+4+5) ");
            System.out.println("9. Viết các ước của n ");
            System.out.print("Bạn chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 0:{
                    break;
                }
                case 1:{
                    bai.nhap1_1();
                    break;
                }
                case 2:{
                    bai.nhap1_1();
                    bai.tong1_2();
                    break;
                }
                case 3:{
                    bai.nhap1_1();
                    bai.tich1_3();
                    break;
                }
                case 4:{
                    bai.nhap1_1();
                    bai.tongChan1_4();
                    break;
                }
                case 5:{
                    bai.nhap1_1();
                    bai.tongLe1_5();
                    break;
                }
                case 6:{
                    bai.nhap1_1();
                    bai.ngTo1_6();
                    break;
                }
                case 7:{
                    bai.nhap1_1();
                    bai.Fibo1_7();
                    break;
                }
                case 8:{
                    bai.nhap1_1();
                    bai.sumCS1_8();
                    break;
                }
                
                case 9:{
                    bai.nhap1_1();
                    bai.Uoc1_9();
                    break;
                }
                default: System.out.println("Không có trong menu! Hãy chọn lại");
            }
        if(choice==0) break;
        }
        
    }
}
