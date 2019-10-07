/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class QLPTGL {
    private ArrayList<PTGT> list;
    private Scanner sc;
    private ArrayList<OTo> listOto;
    public QLPTGL() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
        listOto = new ArrayList<>();
        list.add(new XeMay("dsss32", 1999, "xanh", 10000000, 2110));
        list.add(new XeMay("dsss42", 1922, "do", 10000000, 2110));
        list.add(new XeMay("dsss32", 1999, "tim", 10000000, 2110));
        list.add(new XeTai("dttt21", 2000, "do", 2999900, 123));
        list.add(new XeTai("dttt23", 2002, "xanh", 2999900, 133));
        list.add(new XeTai("dttt22", 2001, "tim", 4000000, 111));
        list.add(new OTo("oooo34", 1997, "vang", 1000000, "dot trong", 12));
    }
    public PTGT nhap(){
        PTGT p = null;
        String hangsx;
        int namsx;
        double giaban;
        String mau;
        
        System.out.println("Hang sx: ");
        while(true){
            hangsx = sc.nextLine();
            if(hangsx.matches("^[A-Za-z]{4}\\d{2}")) break;
            System.out.println("Nhap lai hang sx!");
        }
        System.out.println("Nam sx: ");
        while(true){
            namsx = Integer.parseInt(sc.nextLine());
            if(namsx>999 && namsx < 2020) break;
            System.out.println("Nhap lai nam san xuat!");
        }
        System.out.println("Nhap mau sac: " );
        mau = sc.nextLine();
        System.out.println("Gia: ");
        giaban = sc.nextDouble();
        p = new PTGT(hangsx, namsx, mau, giaban);
        return p;
    }
    public void nhapXeMay(){
        PTGT p = nhap();
        int congSuat;
        System.out.println("Cong suat: ");
        sc.nextLine();
        congSuat = Integer.parseInt(sc.nextLine());
        list.add(new XeMay(p.getHangsx(), p.getNamsx(), p.getMau(), p.getGiaban(), congSuat));
    }
    public void nhapOto(){
        PTGT p = nhap();
        String kieuDongco;
        int soChoNgoi;
        System.out.println("Kieu dong co: ");
        sc.nextLine();
        kieuDongco = sc.nextLine();
        System.out.println("So cho ngoi: ");
        soChoNgoi = Integer.parseInt(sc.nextLine());
        list.add(new OTo(p.getHangsx(), p.getNamsx(), p.getMau(), p.getGiaban(), kieuDongco, soChoNgoi));
        listOto.add(new OTo(p.getHangsx(), p.getNamsx(), p.getMau(), p.getGiaban(), kieuDongco, soChoNgoi));
    }
    public void nhapXeTai(){
        PTGT p = nhap();
        int trongTai;
        System.out.println("Trong tai: ");
        sc.nextLine();
        trongTai = Integer.parseInt(sc.nextLine());
        list.add(new XeTai(p.getHangsx(), p.getNamsx(), p.getMau(), p.getGiaban(), trongTai));
        
    }
    public void hienThi(){
        int dem=0;
        System.out.println("==============Xe may=========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof XeMay){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        System.out.println("So xe may la: "+ dem);
        dem=0;
         System.out.println("==============O To=========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof OTo){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        System.out.println("So o to la: "+ dem);
        dem=0;
         System.out.println("==============Xe Tai=========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof XeTai){
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
        System.out.println("So xe tai la: "+ dem);
    }
    public void hienThiFull(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            
        }
    }
    public int timKiemTheoHang(String hang){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getHangsx().equalsIgnoreCase(hang)) return i;            
        }
        return -1;
    }
    public void xoa(){
        System.out.println("Nhap hang can xoa: ");
        String hangsx = sc.nextLine();
        int vt = timKiemTheoHang(hangsx);
        if(vt == -1) System.out.println("Khong co!");
        else{
            list.remove(vt);
        }
    }
    public void sua(){
        System.out.println("Nhap hang can sua: ");
        String hangsx = sc.nextLine();
        int vt = timKiemTheoHang(hangsx);
        if(vt == -1) System.out.println("Khong co!");
        else{
            int namsx;
            String mau;
            double giaban;
            PTGT p = list.get(vt);
            System.out.println("Nam sx: ");
            while(true){
                namsx = Integer.parseInt(sc.nextLine());
                if(namsx>999 && namsx < 2020) break;
                System.out.println("Nhap lai nam san xuat!");
            }
            System.out.println("Nhap mau sac: " );
            mau = sc.nextLine();
            System.out.println("Gia: ");
            giaban = sc.nextDouble();
            p.setMau(mau);
            p.setNamsx(namsx);
            p.setGiaban(giaban);            
        }
    }
    public void timTheoHangSX(String hangsx){
         int temp=0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getHangsx().equalsIgnoreCase(hangsx)) {
                System.out.println(list.get(i));
                temp++;
            }
        }
        if(temp==0) System.out.println("Ko co!");
    }
     public void timTheoNamSX(int namsx){
         int temp=0;
       
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNamsx() == namsx){
                 System.out.println(list.get(i));
                 temp++;
            }
        }
        if(temp==0) System.out.println("Ko co!");
    }
     public void timTheoGia(double gia){
         int temp=0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGiaban() == gia){
                 System.out.println(list.get(i));
                 temp++;
            }
        }
        if(temp==0) System.out.println("Ko co!");
     }
     public void timTheoMauSac(String mau){
          int temp=0;
      
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMau().equalsIgnoreCase(mau)){
                 System.out.println(list.get(i));
                 temp++;
            }
        }
        if(temp==0) System.out.println("Ko co!");
     }
     public void timTheoSoChoNgoi(int soChoNgoi){//bi sai
        int temp=0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof OTo){
                if(((OTo)list.get(i)).getSoChoNgoi()==soChoNgoi){
                    System.out.println(list.get(i));
                    temp++;
                }
            }
        }
        if(temp==0) System.out.println("Ko co!");
     }
     public void timXeTheoKhoangGia(double  giaMin, double giaMax){
         int temp=0;
       
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGiaban()>= giaMin && list.get(i).getGiaban()<=giaMax){
                 System.out.println(list.get(i));
                 temp++;
            }
        }
        if(temp==0) System.out.println("Ko co!");
     }
     private ArrayList<String> getTheoMausac(){
         HashSet<String> hs = new HashSet<>();
         for (int i = 0; i < list.size(); i++) {
             hs.add(list.get(i).getMau());
             
         }
         return new ArrayList<>(hs);
     }
     public void thongKeTheoMausac(){
         ArrayList<String> ar = getTheoMausac();
         int dem=0;
         for (int i = 0; i < ar.size(); i++) {
             dem=0;
             for (int j = 0; j < list.size(); j++) {
                 if(list.get(j).getMau().equalsIgnoreCase(ar.get(i))){
                     dem++;
                 }
             }  
             System.out.println(ar.get(i)+": "+ dem);   
         }
     }
     private ArrayList<Integer> getTheoNamsx(){
         HashSet<Integer> hs = new HashSet<>();
         for (int i = 0; i < list.size(); i++) {
             hs.add(list.get(i).getNamsx());
         }
         return new ArrayList<>(hs);
     }
     public void thongKeTheoNamSx(){
         int dem=0;
         ArrayList<Integer> ar = getTheoNamsx();
         for (int i = 0; i < ar.size(); i++) {
             dem=0;
             for (int j = 0; j < list.size(); j++) {
                 if(list.get(j).getNamsx() == ar.get(i)) {
                     dem++;
                 }
             }
             System.out.println(ar.get(i)+": "+ dem);
         }
     }
     public void sortByHangSx(){
         Collections.sort(list, new Comparator<PTGT>(){
             @Override
             public int compare(PTGT o1, PTGT o2) {
                 return o1.getHangsx().compareTo(o2.getHangsx());
             }
        });
     }
     public void sortByMauSac(){
         Collections.sort(list, new Comparator<PTGT>(){
             @Override
             public int compare(PTGT o1, PTGT o2) {
                 return o1.getMau().compareTo(o2.getMau());
             }
             
         });
     }
     public void sortByNamsx(){
         Collections.sort(list, new Comparator<PTGT>(){
             @Override
             public int compare(PTGT o1, PTGT o2) {
                 return o1.getNamsx()-o2.getNamsx();
             }
             
         });
     }
     public void sortByHangsxAndMauSac(){
         Collections.sort(list, new Comparator<PTGT>(){
             @Override
             public int compare(PTGT o1, PTGT o2) {
                 if(o1.getHangsx().equalsIgnoreCase(o2.getHangsx()))
                     return o1.getNamsx()-o2.getNamsx();
                 else return o1.getHangsx().compareTo(o2.getHangsx());
             }
         
        });
     }
}
