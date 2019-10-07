/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q3_new;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        QLThuVien ql = new QLThuVien();
        Scanner sc = new Scanner (System.in);
        int choice;
        while(true){
                System.out.println("========MENU===========");
                System.out.println("0.Exit");
                System.out.println("1.Nhập 1 dau sach");
                System.out.println("2.Nhap 1 dau tap chi");
                System.out.println("3.Nhập 1 đầu báo");
                System.out.println("4.Hiển thị danh sách tài liệu");
                System.out.println("5.Xoá tài liệu");
                System.out.println("6.Sửa tài liệu");
                System.out.println("7.Tìm kiếm tài liệu theo mã");
                System.out.println("8.Tìm kiếm tài liệu theo tên nhà xuất bản");
                System.out.println("9.Tìm kiếm tài liệu theo tên tác giả");
                System.out.println("10.Tìm kiếm tài liệu theo tên sách");
                System.out.println("11.Tìm kiếm tài liệu theo ngày phát hành");
                System.out.println("12.Tìm kiếm tài liệu theo khoảng tháng phát hành");
                System.out.println("13.Tìm kiếm tài liệu theo khoảng số trang");
                System.out.println("14.Tìm kiếm tài liệu theo khoảng số bản phát hành");
                System.out.println("15.Sắp xếp theo tên nhà xuất bản");
                System.out.println("16.Sắp xếp theo số bản phát hành");
                System.out.println("17.Sắp xếp theo tên tên tác giả");
                System.out.println("18.Sắp xếp theo tên sách");
                System.out.println("19.Sắp xếp theo số trang");
                System.out.println("20.Sắp xếp theo số ngày phát hành");
                System.out.println("21.Tổng số bản phát hành");
                System.out.println("22.Tổng tháng phát hành");
                System.out.print("Bạn chọn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 0:break;
                    case 1:
                        ql.nhapSach();
                        break;
                    case 2:
                        ql.nhapTapChi();
                        break;
                    case 3:
                       ql.nhapBao();
                        break;
                    case 4:
                        ql.hienThi();
                         break;
                     case 5:
                         System.out.println("Ma: ");
                        String ma = sc.nextLine();
                         ql.xoa(ma);
                         break;
                     case 6:
                         System.out.println("Ma: ");
                         String ma1 = sc.nextLine();
                         ql.sua(ma1);
                         break;
                     case 7:
                         System.out.println("Nhập mã cần tìm: ");
                         String ma2 = sc.nextLine();
                         ql.timKiemTheoMa(ma2);
                     case 8:
                         System.out.println("Nhập tên nhà xuất bản cần tìm: ");
                        String tenNxb = sc.nextLine();
                        ql.timKiemTheoTenNXB(tenNxb);
                         break;
                     case 9:
                         System.out.println("Nhập tên tác giả cần tìm: ");
                        String tenTg = sc.nextLine();
                        ql.timKiemTheoTenTG(tenTg);
                         break;
                     case 10:
                         System.out.println("Nhập tên sách cần tìm: ");
                        String tenS = sc.nextLine();
                        ql.timKiemTheoTenSach(tenS);
                         break;
                     case 11:
                         System.out.println("Nhập ngày phát hành cần tìm: ");
                         String ngay = sc.nextLine();
                         ql.timKiemTheoNgayPhatHanh(ngay);
                         break;
                     case 12:
                         System.out.println("Từ tháng: ");
                        int thangbd = Integer.parseInt(sc.nextLine());
                        System.out.println("Đến thansg: ");
                        int thangkt = Integer.parseInt(sc.nextLine());
                        ql.timKiemTheoKhoangThangPhatHang(thangbd, thangkt);
                        break;
                     case 13:
                         System.out.println("Từ số trang: ");
                        int trangbd = Integer.parseInt(sc.nextLine());
                        System.out.println("Đến số trang: ");
                        int trangkt = Integer.parseInt(sc.nextLine());
                        ql.timKiemTrongKhoangSoTrang(trangbd, trangkt);
                        break;
                     case 14:
                          System.out.println("Từ số ban phat hanh: ");
                        int soPHbd = Integer.parseInt(sc.nextLine());
                        System.out.println("Đến số ban phat hanh: ");
                        int soPHkt = Integer.parseInt(sc.nextLine());
                        break;
                     case 15:
                         ql.sortTenNxb();
                         ql.hienThi();
                         break;
                     case 16:
                         ql.sortSobanPh();
                         ql.hienThi();
                         break;
                     case 17:
                         ql.sortTenTg();
                         ql.hienThiSach();
                         break;
                     case 18:
                         ql.sortTenSach();
                         ql.hienThiSach();
                         break;
                     case 19:
                         ql.sortSoTrang();
                         ql.hienThiSach();
                         break;
                     case 20:
                         ql.sortSoNgayPh();
                         ql.hienThiBao();
                         break;
                     case 21:
                         ql.sumBySoPhatHanh();
                         break;
                     case 22:
                         ql.sumByThangph();
                         break;
                    default: System.out.println("CHon sai CHon lai");
                }
            if(choice==0) break;
            }
    }           
}
