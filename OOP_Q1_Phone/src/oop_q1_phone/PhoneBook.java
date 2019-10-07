/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q1_phone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class PhoneBook {
    private ArrayList<PhoneNumber> list;
    private Scanner sc;

    public PhoneBook() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public PhoneNumber nhap(){
        int mavung;
        String sdtnv;
        System.out.println("Ma vung(3 hoac 4 so): ");
        String str;
        while(true){
            str = sc.nextLine();
            if(str.matches("\\d{3,4}")) break;
            System.out.println("Nhap sai dinh dang!");
            System.out.println("Nhap lai ma vung");
        }
        mavung = Integer.parseInt(str);
        System.out.println("So dt noi vung: ");
        while(true){
             sdtnv = sc.nextLine();
             if(sdtnv.matches("\\d+")) break;
            
                 System.err.println("Chi nhap so");
                System.out.println("Nhap lai so dt noi vung");
             
        }
        return new PhoneNumber(mavung, sdtnv);
    }
    public void nhapTrongNuoc(){
        PhoneNumber p = nhap();
        list.add(p);
    }
    public void nhapQuocTe(){
        
        System.out.println("Ma quoc gia: ");
        String maqg = sc.nextLine();
        PhoneNumber p= nhap();
        list.add(new IntlPhoneNumber(maqg, p.getMavung(), p.getSdtnv()));
    }
    public void hienThi(){
        for (int i = 0; i < list.size(); i++) {
           list.get(i).display();
            
        }
    }
    public void timKiemTheoMaVung(){
        System.out.println("Nhap ma vung can tim: ");
        int mavung = Integer.parseInt(sc.nextLine());
        int dem =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof PhoneNumber){
                if(list.get(i).getMavung()==mavung){
                    list.get(i).display();
                    dem++;
                }
            }
       }
        if(dem == 0) System.out.println("Khong co ma vung nay");
    }
    public void hienThiTrongNuoc(){
        for (int i = 0; i < list.size(); i++) {
            if(!(list.get(i) instanceof IntlPhoneNumber)){
                list.get(i).display();
            }
            
        }
    }
     public void hienThiQuocTe(){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof IntlPhoneNumber){
                ((IntlPhoneNumber)list.get(i)).display();
            }
        }
    }
    public void hienThiTuyChon(){
        int choice = 0;
        do{
            System.out.println("====Kieu hien thi=======");
            System.out.println("1.Hien thi so dien thoai trong nuoc");
            System.out.println("2.Hien thi so quoc te");
            System.out.println("3.Hien ca hai loai");
            System.out.println("Ban chon: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    hienThiTrongNuoc();
                    break;
                case 2:
                    hienThiQuocTe();
                case 3:
                    hienThi();
            }
        }while(choice<=3 && choice>0);
    }
    public ArrayList<Integer> getMaVung(){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getMavung());
        }
        return new ArrayList<>(hs);
    }
    public void tongSdtTheoMaVung(){
        ArrayList<Integer> ar = getMaVung();
        int dem;
        for (int i = 0; i < ar.size(); i++) {
            dem =0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getMavung()==ar.get(i)){
                    dem++;
                }
                
            }
            System.out.println("Ma vung "+ar.get(i)+": "+dem);
        }
    }
    public void timKiemTheoDuoi(){
        int dem =0;
        System.out.println("Nhap duoi can tim: ");
        String duoi = sc.nextLine();
        System.out.println("DS co duoi "+duoi);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSdtnv().endsWith(duoi)){
                list.get(i).display();
                dem++;
            }
        }
        if(dem==0) System.out.println("Khong co duoi nhu vay");
    }
}

