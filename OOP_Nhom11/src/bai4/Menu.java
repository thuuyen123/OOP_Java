/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Menu {
    public static void main(String[] args) {
        QLGV ql = new QLGV();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Nhap vao thong tin giang vien");
            System.out.println("2. In ds toan bo gv");
            System.out.println("3. Xoa GV theo ma");
            System.out.println("4. Sua GV theo ma");
            System.out.println("5. In ds GV co huu");
            System.out.println("6. In ds GV thinh giang");
            System.out.println("7. Sap xep theo ho ten");
            System.out.println("8. Sap xep theo he so luong");
            System.out.println("9. Sap xep theo luong linh");
            System.out.println("10. Tinh tong so luong cua toan bo giang vien");
            System.out.println("11. Tim gv co luong cao nhat");
            System.out.println("12. Thoat");
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1: {
                    System.out.println("1. Nhap GV co huu");
                    System.out.println("2. Nhap GV thinh giang");
                    int chon1 = Integer.parseInt(sc.nextLine());
                    if(chon1 == 1){
                        ql.nhapGVCoHuu();
                    } else {
                        ql.nhapGVThinhGiang();
                    }
                    break;
                }
                case 2: {
                    System.out.println("Danh sach GV: ");
                    ql.inDSGV();
                    break;
                }
                case 3: {
                    System.out.println("Nhap ma GV can xoa: ");
                    String maGV = sc.nextLine();
                    ql.xoaGVTheoMa(maGV);
                    break;
                }
                case 4: {
                    System.out.println("Nhap ma GV can sua: ");
                    String maGV = sc.nextLine();
                    ql.suaGVTheoMa(maGV);
                    break;
                }
                case 5: {
                    
                    break;
                }
                case 6: {
                    
                    break;
                }
                case 7: {
                    ql.sortByHoTen();
                    ql.inDSGV();
                    break;
                }
                case 8: {
                    ql.sortByHeSoLuong();
                    ql.inDSGV();
                    break;
                }
                case 9: {
                    
                    break;
                }
                case 10: {
                    
                    break;
                }
                case 11: {
                    ql.gvLuongCaoNhat();
                    
                    break;
                }
                case 12: {
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                }
                default: break;
            }
        }
    }
}
