/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_new;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class QLPhuongTien {
   private ArrayList<PhuongTien> list;
   private Scanner sc;

    public QLPhuongTien() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public PhuongTien nhap(){
        PhuongTien p = null;
        String hangsx;
        int namsx;
        double gia;
        String mau;
        System.out.println("Hang sx: ");
        while(true){
            hangsx = sc.nextLine();
            if(hangsx.matches("^[A-Z]{2}\\d{2}")) break;
            System.out.println("Nhap sai dinh dang");
            System.out.println("Nhap lai hang sx: ");
        }
        System.out.println("Nam sx: ");
        while(true){
            namsx = Integer.parseInt(sc.nextLine());
            if(namsx<=2019 && namsx >= 1000) break;
            System.out.println("Nhap sai dinh dang");
            System.out.println("Nhap lai nam sx: ");
        }
        System.out.println("Gia ban: ");
        gia = Double.parseDouble(sc.nextLine());
        System.out.println("Mau: ");
        mau = sc.nextLine();
        p.setHangsx(hangsx);
        p.setNamsx(namsx);
        p.setGia(gia);
        p.setMau(mau);
        return new PhuongTien(hangsx, namsx, gia, mau);
    }
    public int toitai(String hangsx){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getHangsx().equalsIgnoreCase(hangsx)) return i;
            
        }
        return -1;
    }
    public void nhapXeMay(){
        PhuongTien p = nhap();
        int congsuat;
        System.out.println("Cong suat: ");
        congsuat = Integer.parseInt(sc.nextLine());
        list.add(new Xe_may(p.getHangsx(), p.getNamsx(), p.getGia(), p.getMau(), congsuat));
    }
    public void nhapXeTai(){
        PhuongTien p = nhap();
        int trongtai;
        System.out.println("Trong tai: ");
        trongtai = Integer.parseInt(sc.nextLine());
        list.add(new Xe_tai(p.getHangsx(), p.getNamsx(), p.getGia(), p.getMau(), trongtai));
    }
    public void nhapOto(){
        PhuongTien p = nhap();
        String kieudc;
        int socn;
        System.out.println("Kieu dong co: ");
        kieudc = sc.nextLine();
        System.out.println("So cho ngoi: ");
        socn = Integer.parseInt(sc.nextLine());
        list.add(new O_to(p.getHangsx(), p.getNamsx(), p.getGia(), p.getMau(),kieudc, socn));
    }
    public void hienthiFull(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    public void hienThi(){
        int dem;
        System.out.println("-----XeTai----------");
        dem=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Xe_tai){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        System.out.println("Xe Tai = "+dem);
        System.out.println("-----Xe may----------");
        dem=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Xe_may){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        System.out.println("Xe May = "+dem);
        System.out.println("-----O to----------");
        dem=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof O_to){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        System.out.println("O to = "+dem);
    }
    public void timTheoHangsx(){
        String hangsx;
        int dem =0;
        System.out.println("Nhap hang san suat can tim: ");
        hangsx =sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getHangsx().equalsIgnoreCase(hangsx)){
                System.out.println(list.get(i).toString());
                dem++;
            }
            
        }
        if(dem==0) System.out.println("Khong co hang sx can tim");
    }
    public void timTheoNamsx(){
        int namsx;
        int dem =0;
        System.out.println("Nam sx can tim: ");
        namsx = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNamsx()==namsx){
                System.out.println(list.get(i).toString());
                dem++;
            }
            
        }
        if(dem==0) System.out.println("Khong co nam sx can tim");
    }
    public void timTheoGia(){
        int dem =0;
        double gia;
        System.out.println("Gia: ");
        gia = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGia()==gia){
                System.out.println(list.get(i).toString());
                dem++;
            }
            
        }
        if(dem==0) System.out.println("Khong co nam sx can tim");
    }
    public void timTheoSochongoi(){
        int dem =0;
        int socn;
        System.out.println("So cho ngoi: ");
        socn = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof O_to && ((O_to)list.get(i)).getSocn()==socn){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        if(dem==0) System.out.println("Khong co");
    }
    public void timKiemTuThangdenNam(){
        int namebd;
        int namkt;
        int dem=0;
        System.out.println("Tu nam: ");
        namebd = Integer.parseInt(sc.nextLine());
        System.out.println("Den nam: ");
        namkt = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).getNamsx()>=2000 && list.get(i).getNamsx()<=2019){
               System.out.println(list.get(i).toString());
               dem++;
           }
            
        }
        if(dem==0) System.out.println("Khong co");
        
    }
    public void timKiemTheoKhoangGia(){
         double giabd;
        double giakt;
        double dem=0;
        System.out.println("Tu gia: ");
        giabd = Double.parseDouble(sc.nextLine());
        System.out.println("Den gia: ");
        giakt = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).getGia()>=1000000 && list.get(i).getGia()<=10000000){
               System.out.println(list.get(i).toString());
               dem++;
           }
            
        }
        if(dem==0) System.out.println("Khong co");
        
    }
    public void timTheoPhuongTienGanDung(String hangsx){
        int dem =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getHangsx().contains(hangsx)){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        if(dem==0) System.out.println("Khong co");
    }
    public void sortTheoHangsx(){
        Collections.sort(list, new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
                return o1.getHangsx().compareTo(o2.getHangsx());
            }
        });
    }
    public void sortTheoGia(){
        Collections.sort(list, new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
                return (int)(o1.getGia()-o2.getGia());
            }
        });
    }
    public void sortTheoHangSxVaNam(){
        Collections.sort(list,new Comparator<PhuongTien>() {
            @Override
            public int compare(PhuongTien o1, PhuongTien o2) {
                if(o1.getHangsx().equalsIgnoreCase(o2.getHangsx()))
                    return o1.getNamsx()-o2.getNamsx();
                else return o1.getHangsx().compareTo(o2.getHangsx());
            }
        });
    }
    public ArrayList<String> getTheoHangsx(){
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getHangsx());
        }
        return new ArrayList<>(hs);
    }
    public void thongKeHangSx(){
        int dem;
        ArrayList<String> ar = getTheoHangsx();
        for (int i = 0; i < ar.size(); i++) {
            dem =0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).getHangsx().equalsIgnoreCase(ar.get(i))){
                    dem++;
                }
                
            }
            System.out.println("Hang sx "+ar.get(i)+": "+dem);
        }
    }
    public void xoa(){
        System.out.println("Nhap hang sx: ");
        String hangsx = sc.nextLine();
        int vt = toitai(hangsx);
        if(vt==-1) System.out.println("Khong co de xoa");
        else{
            list.remove(vt);
        }
    }
    public void sua(){
         System.out.println("Nhap hang sx: ");
        String hangsx = sc.nextLine();
        int vt = toitai(hangsx);
        if(vt==-1) System.out.println("Khong co de sua");
        else{
            int namsx;
            double gia;
            String mau;
            System.out.println("");
        }
        
    }
    
}
