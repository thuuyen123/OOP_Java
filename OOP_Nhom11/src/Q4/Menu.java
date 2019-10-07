/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    public static void main(String[] args) {
        QLGV ql=new QLGV();
        while (true) {
            System.out.println("1. Nhap giang vien co huu");
            System.out.println("2. Nhap giang vien thinh giang");
            System.out.println("3. In danh sach");
            System.out.println("4. Danh sach GVCH");
            System.out.println("5. Danh sach GVTG");
            System.out.println("6. Xoa giang vien");
            System.out.println("7. Sua giang vien");
            System.out.println("8. Tim gan dung theo ma");
            System.out.println("9. Sap xep theo ma");
            System.out.println("10. Sap xep theo he so luong");
            System.out.println("11. Sap xep theo tong luong ");
            System.out.println("13. Tinh tong tien luong");
            System.out.println("14. Tinh trung binh luong");
            System.out.println("15. Tim GV luong cao nhat");
            System.out.println("0. Thoat");
            System.out.println("Ban chon");
            int chon;
            Scanner in = new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch (chon) {
                case 1:ql.nhapGVCH();
                    
                    break;
                case 2: ql.nhapGVTG();
                    
                    break;
                case 3:ql.hienthi();
                    
                    break;
                case 4:ql.hienthiGVCH();
                    
                    break;
                case 5: ql.hienthiGVTG();
                    
                    break;
                case 6: ql.xoa();
                    
                    break;
                case 7: ql.sua(); 
                    
                    break;
                case 8: String ma2;
                    System.out.println("Nhap ma can tim");
                    ma2=in.nextLine().toUpperCase();
                    ql.hienthiGanDung(ma2);
                    
                    break;
                case 9: ql.sortByMa();
                ql.hienthi();
                    
                    break;
                case 10:ql.sortByHeso();
                ql.hienthi();
                    
                    break;
                case 11: ql.sortByLuong();
                    
                
                   
                    
                    break;
                case 12:
                    break;
                case 13: System.out.println("Tong so luong la:");
                    System.out.println(ql.tongsoluong());
                    
                    break;
                case 14: System.out.println("Trung binh luong la: ");
                    System.out.println(ql.trungbinhluong());
                    
                    break;
                
                case 15:ql.gvLuongCaoNhat();
                    
                    break;
                default:
                    System.out.println("Chi con tu ");
            }
        }
    }
}
