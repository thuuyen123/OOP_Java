package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLGV {

    ArrayList<GV> list;

    Scanner sc = new Scanner(System.in);

    public QLGV() {
        list = new ArrayList<>();
        list.add(new GVCoHuu("BBCC14", "Hoa", "hih@gmail.com", "69duongNT", 3, 3, 1234, 100, 120000, 98));
        list.add(new GVCoHuu("BBCC12", "Anh", "hih@gmail.com", "69duongNT", 1, 2, 1234, 100, 120000, 98));
        list.add(new GVCoHuu("BBCC13", "The", "hih@gmail.com", "69duongNT", 2, 3, 1234, 100, 120000, 98));
    }

    public QLGV(ArrayList<GV> list) {
        this.list = list;
    }

    public int viTriGV(String maGV) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaGV().equals(maGV)) {
                return i;
            }
        }
        return -1;
    }

    private double tinhHeSoLuong(int hocHam, int hocVi) {
        double sum = 0;
        switch (hocHam) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 0.2;
                break;
            case 3:
                sum = 0.1;
                break;
            default:
                break;
        }

        switch (hocVi) {
            case 1:
                sum += 1;
                break;
            case 2:
                sum += 1.1;
                break;
            case 3:
                sum += 1.2;
                break;
        }
        return sum;
    }

    private GV init() {
        GV tmp = new GV();
        System.out.println("Nhap ma GV: ");
        String maGV = "", tenGV = "", email, diaChi;
        int hocHam, hocVi, soGioGiangDay, dienThoai;
        double heSoLuong;
        while (true) {
            maGV = sc.nextLine();
            if (viTriGV(maGV) != -1 || maGV.matches("^[A-Za-z]{4}\\d{2}$")) {
                break;
            } else {
                System.out.println("Nhap lai");
            }
        }
        System.out.println("Nhap ten GV: ");
        tenGV = sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
        System.out.println("Nhap hoc ham: (1. Khong, 2. Giao su, 3. PGS");
        hocHam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap hoc vi: (1. Dai hoc, 2. Tien si, 3. Tien si");
        hocVi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap so dt");
        dienThoai = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so gio giang day trong thang");
        soGioGiangDay = Integer.parseInt(sc.nextLine());
        tmp = new GV(maGV, tenGV, email, diaChi, hocHam, hocVi, dienThoai, soGioGiangDay);
        return tmp;
    }

    public void nhapGVCoHuu() {
        GV tmp = init();
        System.out.println("Nhap luong thoa thuan: ");
        double luongThoaThuan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so gio quy dinh: ");
        int soGioQuyDinh = Integer.parseInt(sc.nextLine());
        list.add(new GVCoHuu(tmp.getMaGV(), tmp.getTenGV(), tmp.getEmail(), tmp.getDiaChi(), tmp.getHocHam(), tmp.getHocVi(), tmp.getDienThoai(), tmp.getSoGioGiangDay(), luongThoaThuan, soGioQuyDinh));

    }

    public void nhapGVThinhGiang() {
        GV tmp = init();
        System.out.println("Nhap co quan lam viec: ");
        String coQuanLamViec = sc.nextLine();
        list.add(new GVThingGiang(tmp.getMaGV(), tmp.getTenGV(), tmp.getEmail(), tmp.getDiaChi(), tmp.getHocHam(), tmp.getHocVi(), tmp.getDienThoai(), tmp.getSoGioGiangDay(), tmp.getHeSoLuong(), coQuanLamViec));

    }

    public void inDSGV() {
        int count = 0;
        System.out.println("========= GV Co Huu =========");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof GVCoHuu) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("=============================");
        System.out.println("Tong so: " + count);
        count = 0;
        System.out.println("========= GV Thinh Giang =========");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof GVThingGiang) {
                count++;
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("===================================");
        System.out.println("Tong so: " + count);
        count = 0;
    }

    public void xoaGVTheoMa(String maGV) {
        if (viTriGV(maGV) != -1) {
            list.remove(viTriGV(maGV));
        } else {
            System.out.println("Khong co GV ma xoa");
        }
    }

    public void suaGVTheoMa(String maGV) {
        if (viTriGV(maGV) != -1) {
            String tenGV = "", email, diaChi;
            int hocHam, hocVi, soGioGiangDay, dienThoai;
            double heSoLuong;
            System.out.println("Nhap ten GV: ");
            tenGV = sc.nextLine();
            System.out.println("Nhap email: ");
            email = sc.nextLine();
            System.out.println("Nhap hoc ham: (1. Khong, 2. Giao su, 3. PGS");
            hocHam = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap hoc vi: (1. Dai hoc, 2. Tien si, 3. Tien si");
            hocVi = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap dia chi: ");
            diaChi = sc.nextLine();
            System.out.println("Nhap so dt");
            dienThoai = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap so gio giang day trong thang");
            soGioGiangDay = Integer.parseInt(sc.nextLine());
            GV tmp = new GV(maGV, tenGV, email, diaChi, hocHam, hocVi, dienThoai, soGioGiangDay);
            list.set(viTriGV(maGV), tmp);
        } else {
            System.out.println("Khong co GV ma sua");
        }
    }
    
    public int timKiemGVGanDung(String maGanDung){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaGV().contains(maGanDung)){
                System.out.println(list.get(i).toString());
            }
        }
        return -1;
    }
    
    public void sortByHoTen(){
        Collections.sort(list, new Comparator<GV>(){
            @Override
            public int compare(GV o1, GV o2) {
                return o1.getTenGV().compareToIgnoreCase(o1.getTenGV());
            }
            
        });
    }
    
    public void sortByHeSoLuong(){
        Collections.sort(list, new Comparator<GV>(){
            @Override
            public int compare(GV o1, GV o2) {
                double hs1 = o1.getHeSoLuong()*10;
                double hs2 = o2.getHeSoLuong()*10;
                int hso1 = (int) hs1;
                int hso2 = (int) hs2;
                return hso1 - hso2;
            }
            
        });
    }
    
    public void sortByLuongLinh(){
        Collections.sort(list, new Comparator<GV>(){
            @Override
            public int compare(GV o1, GV o2) {
                return (int) o1.getLuongLinh() - (int) o2.getLuongLinh();
            }
            
        });
    }
    
    public double tongLuongGV(){
        double sum = 0;
        for(GV gv : list){
            sum += gv.getLuongLinh();
        }
        return sum;
    }
    
    private String inGVTheoVT(int vt){
        return list.get(vt).toString();
    }
    
    public void gvLuongCaoNhat(){
        double luong = 0;
        int vt = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getLuongLinh() > luong){
                luong = list.get(i).getLuongLinh();
                vt = i;
            }
        }
        System.out.println("GV luong cao nhat la: " + inGVTheoVT(vt));
        System.out.println("Luong la: " + luong);
    }
    
}
