/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_9_songuyenduong;

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
        SoNguyenDuong s = new SoNguyenDuong();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("========MENU==========");
            System.out.println("1.Liệt kê các ước số của n");
            System.out.println("2.Liệt kê các ước số là nguyên tố của n");
            System.out.println("0. EXIT");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 0:
                    break;
                case 1:
                    s.nhap();
                    s.lkUoc();
                    break;
                case 2:
                    s.nhap();
                    s.lkUocNgto();
                    break;
                default: System.out.println("Chọn sai!");
            }
           if(choice==0) break;
        }
    }
    
}
