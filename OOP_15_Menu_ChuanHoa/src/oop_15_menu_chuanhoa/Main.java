/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_15_menu_chuanhoa;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        HoTen h = new HoTen();
        HotenModel hmodel = new HotenModel();
        DoanVB doanVB = new DoanVB();
        DoanVBModel dmodel = new DoanVBModel();
        while(true){
            System.out.println("===Menu====");
            System.out.println("0. Thoát");
            System.out.println("1.Nhâp họ tên");
            System.out.println("2.Chuẩn hóa họ tên");
            System.out.println("3.Số từ trong họ tên");
            System.out.println("4.Nhập đoạn văn bản");
            System.out.println("5.Chuẩn hóa đoạn văn");
            System.out.println("6.Số câu, số từ trong đoạn văn");
            System.out.print("Bạn chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 0:{
                    break;
                }
                case 1:{
                    hmodel.nhap();
                    break;
                }
                case 2:{
                    hmodel.chuanHoaDanhTuRieng(h.getName());
                    System.out.println("Họ tên đã được chuẩn hóa: ");
                    h.toString();
                    break;
                }
                case 3:{
                    hmodel.countTu();
                    break;
                }
                case 4:{
                    dmodel.nhap();
                    break;
                }
                case 5:{
                    dmodel.normalText(doanVB.getDoan());
                    System.out.println("Đoạn văn đã được chuẩn hóa là: ");
                    doanVB.toString();
                    break;
                }
                case 6:{
                    dmodel.countTuCau();
                    break;
                }
               
                default: System.out.println("Không có trong menu! Hãy chọn lại");
            }
        if(choice==0) break;
        }
    }
    
}
