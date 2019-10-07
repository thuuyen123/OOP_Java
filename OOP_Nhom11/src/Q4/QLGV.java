/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLGV {

    ArrayList<GV> list;
    Scanner in = new Scanner(System.in);

    public QLGV() {
        list = new ArrayList<>();
        list.add(new GVCH(1000, 30, "abc123", "BBH", "bbh@", 2, 1, "busan", "04994", 10));
        list.add(new GVCH(1000, 25, "osh121", "osh", "osh121", 1, 2, "seoull", "0283423", 10));
        list.add(new GVCH(1000, 20, "bcv121", "PCY", "pcy@", 0, 1, "seoul", "0292", 10));
        
        list.add(new GVTG("ptit", "nah121", "kai", "kai@", 1, 0, "nhakf", "9384", 20));
        list.add(new GVTG("kta", "jja433", "jun", "jasdjkf", 0, 0, "haaf", "hsdsa", 10));
    }

    public boolean tontaima(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }

    public GV nhap() {
        GV gv = null;
        String ma, ten, email;
        int hocham, hocvi;
        String diachi, sdt;
        int sogio;
        double heso;
        System.out.println("Nhap ma giang vien");
        while (true) {
            ma = in.nextLine().toUpperCase();
            if (!tontaima(ma) && ma.matches("^[A-Z]{3}\\d{3}")) {
                break;
            } else {
                System.out.println("Nhap lai ma!");
            }
        }
        System.out.println("Nhap ten giang vien:");
        ten = in.nextLine();
        System.out.println("Nhap email giang vien: ");
        email = in.nextLine();
        System.out.println("Hoc ham: ");
        System.out.println("0. Khong");
        System.out.println("1. Giao su");
        System.out.println("2. Pho giao su");
        System.out.print("Moi chon: ");
        hocham = Integer.parseInt(in.nextLine());
        System.out.println("Hoc vi: ");
        System.out.println("0. Dai hoc");
        System.out.println("1. Thac si");
        System.out.println("2. Tien si");
        System.out.print("Moi chon: ");
        hocvi = Integer.parseInt(in.nextLine());
        System.out.println("Nhap dia chi: ");
        diachi = in.nextLine();
        System.out.println("Nhap sdt: ");
        sdt = in.nextLine();
        System.out.println("Nhap so gio giang day trong thang");
        sogio = Integer.parseInt(in.nextLine());
        gv = new GV(ma, ten, email, hocham, hocvi, diachi, sdt, sogio);
        return gv;
    }

    public void nhapGVCH() {
        GV gv = nhap();
        double luongcung;
        int sogioquydinh;
        double tongluong;
        System.out.println("Nhap luong cung: ");
        luongcung = Double.parseDouble(in.nextLine());
        System.out.println("Nhap so gio quy dinh: ");
        sogioquydinh = Integer.parseInt(in.nextLine());
        tongluong = luongcung * gv.getHeso() + ((gv.getSogio() - sogioquydinh) * 50000);
        list.add(new GVCH(luongcung, sogioquydinh, gv.getMa(), gv.getTen(), gv.getEmail(),
                gv.getHocham(), gv.getHocvi(), gv.getDiachi(), gv.getSdt(),
                gv.getSogio()));
    }

    public void nhapGVTG() {
        GV gv = nhap();
        String coquan;
        double tongluong;
        System.out.println("Nhap co quan");
        coquan = in.nextLine();
        tongluong = gv.getSogio() * 200000;
        list.add(new GVTG(coquan, gv.getMa(), gv.getTen(), gv.getEmail(),
                gv.getHocham(), gv.getHocvi(), gv.getDiachi(), gv.getSdt(),
                gv.getSogio()));
    }

    public void hienthi() {
        int count = 0;
        System.out.println("======Danh sach GVCH======");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof GVCH) {
                list.get(i).display();
                count++;
            }

        }
        System.out.println("Tong so GVCH" + count);
        count = 0;
        System.out.println("=====Danh sach GVTG======");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof GVTG) {
                list.get(i).display();
                count++;
            }

        }
        System.out.println("Tong so GVTG: " + count);
    }

    public void hienthiGVCH() {
        int count = 0;
        System.out.println("======Danh sach GVCH======");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof GVCH) {
                list.get(i).display();
                count++;
            }

        }
        System.out.println("Tong so GVCH" + count);
    }

    public void hienthiGVTG() {
        int count = 0;
        System.out.println("=====Danh sach GVTG======");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof GVTG) {
                list.get(i).display();
                count++;
            }

        }
        System.out.println("Tong so GVTG: " + count);
    }

    public int timtheoma(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    public void xoa() {
        String ma;
        System.out.println("Nhap vao ma can xoa");
        ma = in.nextLine();
        int vt = timtheoma(ma);
        if (vt == -1) {
            System.out.println("Khong co ma can xoa");
        } else {
            list.remove(vt);
            System.out.println("Xoa thanh cong");
        }
    }

    public void sua() {
        String ma;
        System.out.println("Nhap vao ma can sua");
        ma = in.nextLine();
        int vt = timtheoma(ma);
        if (vt == -1) {
            System.out.println("Khong co ma can sua");
        } else {
            String ten, email;
            int hocham, hocvi;
            String diachi, sdt;
            int sogio;
            double heso;
            System.out.println("Nhap ten giang vien:");
            ten = in.nextLine();
            System.out.println("Nhap email giang vien: ");
            email = in.nextLine();
            System.out.println("Hoc ham: ");
            System.out.println("0. Khong");
            System.out.println("1. Giao su");
            System.out.println("2. Pho giao su");
            System.out.print("Moi chon: ");
            hocham = Integer.parseInt(in.nextLine());
            System.out.println("Hoc vi: ");
            System.out.println("0. Dai hoc");
            System.out.println("1. Thac si");
            System.out.println("2. Tien si");
            System.out.print("Moi chon: ");
            hocvi = Integer.parseInt(in.nextLine());
            System.out.println("Nhap dia chi: ");
            diachi = in.nextLine();
            System.out.println("Nhap sdt: ");
            sdt = in.nextLine();
            System.out.println("Nhap so gio giang day trong thang");
            sogio = Integer.parseInt(in.nextLine());
            GV gv = list.get(vt);
            gv.setTen(ten);
            gv.setEmail(email);
            gv.setHocham(hocham);
            gv.setHocvi(hocvi);
            gv.setDiachi(diachi);
            gv.setSdt(sdt);
            gv.setSogio(sogio);
            System.out.println("Sua thanh cong");
        }
    }

    public void hienthiGanDung(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().contains(ma)) {
                list.get(i).display();
            }
        }
    }

    public void sortByMa() {
        Collections.sort(list, new Comparator<GV>() {
            @Override
            public int compare(GV o1, GV o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
    }

    public void sortByHeso() {
        Collections.sort(list, new Comparator<GV>() {
            @Override
            public int compare(GV o1, GV o2) {
                return (int) (o1.tinhheso(o1.getHocham(), o2.getHocham())* 10) - (int) (o2.tinhheso(o2.getHocham(),o2.getHocvi() ) * 10);
            }

        });
    }

   

   
    public void sortByLuong(){
        Collections.sort(list, new Comparator<GV>() {
            @Override
            public int compare(GV o1, GV o2) {
                return (int) o1.tinhtongluong()-(int) o2.tinhtongluong();
            }
        });
    }

    public double tongsoluong() {
        
        double tongsoluong = 0;
        for (int i = 0; i < list.size(); i++) 
            tongsoluong+=list.get(i).tinhtongluong();
        return tongsoluong;

    }

    public double trungbinhluong() {
        double trungbinhluong = 0;
        trungbinhluong = tongsoluong() / list.size();
        return trungbinhluong;
    }

    
    private void inGVTheoVT(int vt){
        list.get(vt).display();
    }
     public void gvLuongCaoNhat(){
        double luong = 0;
        int vt = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).tinhtongluong()> luong){
                luong = list.get(i).tinhtongluong();
                vt = i;
            }
        }
        System.out.println("GV luong cao nhat la: ");
         inGVTheoVT(vt);
        System.out.println("Luong la: " + luong);
    }

}
