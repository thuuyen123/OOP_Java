/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class QLTV {
    private ArrayList<TaiLieu> list;
    private Scanner sc;
    public QLTV(){
       list = new ArrayList<>();
       sc = new Scanner(System.in);
       list.add(new Sach("BN123","bbbb","ttggg","tttt",5,6));
       list.add(new Sach("BO334","bbbb","ttggg","tttt",5,6));
       list.add(new Sach("BP253","bbbb","ttggg","tttt",5,6));
       list.add(new TapChi("GH243", "tacgia", 9, 6, 8));
       list.add(new TapChi("GM113", "tacgia", 9, 6, 8));
    }
    private boolean tontaiSach(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaTaiLieu().equalsIgnoreCase(ma)) return true;
        }
        return false;
    }
    public TaiLieu nhap(){
        String maTaiLieu, tenNhaXb;
        int soBanPhatHang;
        TaiLieu t = null;
        System.out.print("Nhap ma: ");
        while(true){
            maTaiLieu = sc.nextLine().toUpperCase();
            if(!tontaiSach(maTaiLieu) && maTaiLieu.matches("^[A-Z](2)\\d{3}")) break;
            else System.out.println("Nhap lai!");
        }
        System.out.println("Ten nha xb: ");
        tenNhaXb = sc.nextLine();
        System.out.println("So ban phat hanh: ");
        soBanPhatHang = sc.nextInt();
        t = new TaiLieu(maTaiLieu, tenNhaXb, soBanPhatHang);
        return t;
    }
    public void nhapSach(){
        TaiLieu t = nhap();
         String tentg, tenS;
         int strang;
         System.out.println("Nhap ten sach: ");
         tenS = sc.nextLine();
         System.out.println("Nhap ten tg: ");
         tentg =sc.nextLine();
         System.out.println("Nhap so trang: ");
         strang = Integer.parseInt(sc.nextLine());
         list.add(new Sach(t.getMaTaiLieu(),tenS,tentg, t.getTenNhaXb(),strang, t.getSoBanPhatHang()));
    }
    public void nhapTapChi(){
        TaiLieu t  = nhap();
        int soph, thang;
        System.out.println("Nhap so phat hanh: ");
        soph = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang: ");
        thang = Integer.parseInt(sc.nextLine());
        list.add(new TapChi(t.getMaTaiLieu(), t.getTenNhaXb(), thang, soph, thang));
    }
    public void hienThi(){
        int count = 0;
        System.out.println("===========Sach========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Sach){
                System.out.println(list.get(i).toString());
                count++;
            }
            
        }
        System.out.println("Tong so sach la: "+count);
        int count1 = 0; 
         System.out.println("===========Tap chi========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof TapChi){
                System.out.println(list.get(i).toString());
                count1++;
            }
            
        }
        System.out.println("Tong so tap chi la: "+count1);
    }
    private int TimTaiLieuTheoMa(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaTaiLieu().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    public void xoa(){
        System.out.println("Nhap ma can xoa: ");
        String ma = sc.nextLine();
        int vt = TimTaiLieuTheoMa(ma);
        if(vt ==-1) System.out.println("Co dau ma xoa");
        else{
            list.remove(vt);
            System.out.println("Xoa thanh cong");
        }
    }
    public void suaTaiLieu(){
        System.out.println("Nhap ma tapchi can sua: ");
        String ma = sc.nextLine();
        int vt = TimTaiLieuTheoMa(ma);
        if(vt ==-1) System.out.println("Co dau ma sua");
        else{
             String tenNhaXb;
            int soBanPhatHang;
            System.out.println("ten nxb can sua: ");
            tenNhaXb =sc.nextLine();
            
            System.out.println("So ban phat hang can sua: ");
            soBanPhatHang = Integer.parseInt(sc.nextLine());
            TaiLieu t = list.get(vt);
            t.setTenNhaXb(tenNhaXb);
            t.setSoBanPhatHang(soBanPhatHang);
            System.out.println("Sua thanh cong");
        }
    }
    public void suaSach(){
        
    }
    public void suaTapChi(){
        
    }
    private ArrayList<String> getTenNhaXb(){
        HashSet <String> hs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getTenNhaXb());
            
        }
        return new ArrayList<>(hs);
    }
    public void thongkeTenNhaXb(){
        ArrayList<String> ar = getTenNhaXb();
        int count= 0;
        for (int i = 0; i < ar.size(); i++) {
            count =0;
            for (int j = 0; j<list.size() ; j++) {
                if(list.get(j).getTenNhaXb().equalsIgnoreCase(ar.get(i)))
                    count++;
                
            }
        System.out.println(ar.get(i)+": "+count );

        }
    }
}
