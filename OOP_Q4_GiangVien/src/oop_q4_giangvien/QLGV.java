/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q4_giangvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class QLGV {
    private ArrayList<GiangVien> list;
    private Scanner sc;

    public QLGV() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public GiangVien nhap(){
        GiangVien g = null;
        String ma;
        String ten, email, hocham, hocvi, diachi, sdt;
        int sogio,heslg;
        System.out.print("Ma: ");
        while(true){
            ma = sc.nextLine();
            if(ma.matches("^[A-Za-z]{4}\\d{2}")) break;
            System.out.println("Nhap lai ma!");
        }
        System.out.print("Ten: ");
        ten = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Hoc ham:\n1.Khong\n2.Giao su\n3.Pho giao su");
        hocham =sc.nextLine();
        System.out.println("Hoc vi (dai hoc, thac si, tien si): ");
        hocvi = sc.nextLine();
        System.out.print("Dia chi: ");
        diachi = sc.nextLine();
        System.out.print("So dien thoai: ");
        sdt = sc.nextLine();
        System.out.print("So gio day trong thang");
        sogio =Integer.parseInt(sc.nextLine());
        System.out.print("He so luong: ");
        heslg =Integer.parseInt(sc.nextLine());
        g = new GiangVien(ma, ten, email, hocham, hocvi, diachi, sdt, sogio, heslg);
        return g;
    } 
    public void nhapgvCH(){
        GiangVien g = nhap();
        double luongTT; 
        int sogioQD;
        System.out.println("Luong thoan thuan: ");
        luongTT = Double.parseDouble(sc.nextLine());
        System.out.println("So gio quy dinh chung trong thang: " );
        sogioQD = Integer.parseInt(sc.nextLine());
        list.add(new GiangVienCH(g.getMa(), g.getTen(), g.getEmail(),
                g.getHocham(), g.getHocvi(), g.getDiachi(), g.getSdt(), g.getSogio(), g.getHeslg(), luongTT, sogioQD));
    }
    public void nhapgvTG(){
        GiangVien g = nhap();
        String coquanlv;
        System.out.println("Co quan lam viec: ");
        coquanlv = sc.nextLine();
        list.add(new GiangVienTG(g.getMa(), g.getTen(), g.getEmail(),
                g.getHocham(), g.getHocvi(), g.getDiachi(), g.getSdt(), g.getSogio(), g.getHeslg(),coquanlv));
    }
    public void hienThi(){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof GiangVienCH){
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("So giang vien co huu: "+ count);
        count =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof GiangVienTG){
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("So giang vien thinh giang: "+ count);
    }
    public int timKiemMa(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)) return i;
        }
        return -1;
    }
    public void xoa(){
        System.out.println("Nhap ma can xoa: ");
        String ma = sc.nextLine();
        int vt = timKiemMa(ma);
        if(vt== -1 ) System.out.println("Không có!");
        else{
            list.remove(vt);
        }
    }
    public void suaGV(){
        System.out.print("Nhap ma can sua: ");
        String ma = sc.nextLine();
        int vt = timKiemMa(ma);
        if(vt== -1 ) System.out.println("Không có!");
        else{
            GiangVien g = list.get(vt);
            String ten, email, hocham, hocvi, diachi, sdt;
            int sogio,heslg;
            System.out.print("Ten: ");
            ten = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Hoc ham:\n1.Khong\n2.Giao su\n3.Pho giao su");
            hocham =sc.nextLine();
            System.out.print("Hoc vi (dai hoc, thac si, tien si): ");
            hocvi = sc.nextLine();
            System.out.print("Dia chi: ");
            diachi = sc.nextLine();
            System.out.print("So dien thoai: ");
            sdt = sc.nextLine();
            System.out.print("So gio day trong thang");
            sogio =Integer.parseInt(sc.nextLine());
            System.out.print("He so luong: ");
            heslg =Integer.parseInt(sc.nextLine());
            g.setTen(ten);
            g.setEmail(email);
            g.setHocham(hocham);
            g.setHocvi(hocvi);
            g.setDiachi(diachi);  
            g.setSdt(sdt);
            g.setSogio(sogio);
            g.setHeslg(heslg);
        }
    }
    public void timKiemTheoMa(String ma){
        if(timKiemMa(ma)>0) System.out.println(timKiemMa(ma));
        else System.out.println("Khong co ma nay!");
    }
}
