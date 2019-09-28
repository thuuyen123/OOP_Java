/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q2;

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
        
        QLPTGL ql=new QLPTGL();
        while(true){
            System.out.println("1. Nhap vao 1 xe may");
            System.out.println("2. nhap vao 1 oto");
            System.out.println("3.Nhap vao 1 xe tai");
            System.out.println("4. Hien thi ds PTGT");
            System.out.println("5. Xoa");
            System.out.println("6. Sua");
            System.out.println("7.Tim xe theo hang sx");
            System.out.println("8. Tim xe theo nam sx");
            System.out.println("9.Tim xe theo mau sac");
            System.out.println("10. Tim xe theo gia ban");
            System.out.println("11. Tim xe theo so cho ngoi");
            System.out.println("12. Tim xe trong khoang gia ban");
            System.out.println("13.Thong ke theo mau sac");
            System.out.println("14.Thong ke theo nam sx");
            System.out.println("15.Sx theo hang sx");
            System.out.println("16.Sx theo mau sac");
            System.out.println("17.Sx theo nam sx");
            System.out.println("18.Sx theo hang sx va mau sac");
            System.out.println("0. Exit");
            System.out.print("Moi chon: ");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0: break;
                case 1:ql.nhapXeMay();
                       break;
                case 2:ql.nhapOto();
                       break;
                case 3:
                       ql.nhapXeTai();
                       break;
                case 4:ql.hienThi();
                       break;
                case 5:ql.xoa();
                       break;
                case 6:ql.sua();
                        break;
                case 7:
                    System.out.println("Nhap hang can tim: ");
                    String hangsx = sc.nextLine();
                    ql.timTheoHangSX(hangsx);
                    break;
                case 8:
                     System.out.println("Nhap nam sx can tim: ");
                    int namsx = Integer.parseInt(sc.nextLine());
                    ql.timTheoNamSX(namsx);
                    break;
                
                case 9:
                    System.out.println("Nhap mau sac can tim: ");
                    String mau = sc.nextLine();
                    ql.timTheoMauSac(mau);
                    break;
                case 10:
                     System.out.println("Nhap gia can tim: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    ql.timTheoGia(gia);
                    break;  
                case 11:
                    System.out.println("Nhap so cho ngoi can tim: ");
                    int soChoNgoi = Integer.parseInt(sc.nextLine());
                    ql.timTheoSoChoNgoi(soChoNgoi);
                    break;
                case 12:
                     System.out.println("Gia Min: ");
                    double giaMin = Double.parseDouble(sc.nextLine());
                    System.out.println("Gia Max: ");
                    double giaMax = Double.parseDouble(sc.nextLine());
                    ql.timXeTheoKhoangGia(giaMin, giaMax);
                    break;
                case 13:
                    ql.thongKeTheoMausac();
                    break;
                case 14:
                    ql.thongKeTheoNamSx();
                    break;
                case 15:
                    ql.sortByHangSx();
                   ql.hienThiFull();
                    break;
                case 16:
                    ql.sortByMauSac();
                    ql.hienThiFull();
                    break;
                case 17:
                    ql.sortByNamsx();
                    ql.hienThiFull();
                    break;
                case 18:
                    ql.sortByHangsxAndMauSac();
                    ql.hienThiFull();
                    break;
                default:
                    System.out.println("chi chon 0->18");
            }
            if(chon==0) break;
        }
    }
    
}
