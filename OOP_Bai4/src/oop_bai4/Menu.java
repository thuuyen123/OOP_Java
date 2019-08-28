/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai4;

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
        int choice;
        int n;
        while(true){
            System.out.println("=====Menu==========");
            System.out.println("1.Nhập 1 dãy số nguyên");
            System.out.println("2.Tổng dãy");
            System.out.println("3.Trung bình");
            System.out.println("4.Max & Min");
            System.out.println("5.Liệt kê các số nguyên tố trong dãy");
            System.out.println("0.EXIT");
            Scanner sc = new Scanner(System.in);
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 0:
                    break;
                case 1:
                    System.out.print("Nhập n = ");
                    n = sc.nextInt();
                    MangINT m = new MangINT(n);
                    m.nhap();
                    break;
                case 2:
                    System.out.print("Nhập n = ");
                    n = sc.nextInt();
                    MangINT m2 = new MangINT(n);
                    m2.nhap();
                    m2.sum();
                    break;
                case 3:
                    System.out.print("Nhập n = ");
                    n = sc.nextInt();
                    MangINT m3 = new MangINT(n);
                    m3.nhap();
                    m3.trungBinh();
                    break;
                case 4:
                     System.out.print("Nhập n = ");
                    n = sc.nextInt();
                    MangINT m4 = new MangINT(n);
                    m4.nhap();
                    m4.max_min();
                    break;
                case 5:
                     System.out.print("Nhập n = ");
                    n = sc.nextInt();
                    MangINT m5 = new MangINT(n);
                    m5.nhap();
                    m5.ngTo();
                    break;
                
                default: System.out.println("Nhập chọn sai!Chọn lại");
            }
            if(choice == 0) break;
        }
    }
    
}
