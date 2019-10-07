/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q3_new;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class QLThuVien {
    private ArrayList<TaiLieu> list;
    private Scanner sc;

    public QLThuVien() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
        list.add(new Sach("AA11", "DHQG", 200, "TS.TVC", "Mua he", 100));
        list.add(new Sach("AA22", "DHQGHN", 10, "Nguyen van A", "Hoa", 50));
        list.add(new Sach("AA33", "HVCNBC", 100, "Tran VAn", "He ve", 120));
        list.add(new TapChi("TT11", "Hoang Ha", 10, 20, 12));
        list.add(new TapChi("TT22", "New", 15, 30, 52));

    }
    private boolean tontaiTL(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)) return true;
        }
        return false;
    }
    public TaiLieu nhapTaiLieu(){
        TaiLieu t = null;
        String ma, tenNxb;
        int sobph;
        System.out.println("Ma tai lieu: ");
        while(true){
            ma = sc.nextLine().toUpperCase();
            if(!tontaiTL(ma) && ma.matches("^[A-Z]{2}\\d{2}")) break;
            else System.out.println("Nhap lai ma: ");
        }
        System.out.println("Ten nha xuat ban: ");
        tenNxb = sc.nextLine();
        System.out.println("So ban phat hang: ");
        sobph = Integer.parseInt(sc.nextLine());
        t = new TaiLieu(ma, tenNxb, sobph);
        return t;
    }
    public void nhapSach(){
        TaiLieu t = nhapTaiLieu();
        String tenTg, tenS;
        int soTr;
        System.out.println("Ten tac gia: ");
        tenTg = sc.nextLine();
        System.out.println("Ten sach: ");
        tenS = sc.nextLine();
        System.out.println("So trang: ");
        soTr = Integer.parseInt(sc.nextLine());
        list.add(new Sach(t.getMa(), t.getTenNxb(), t.getSobph(), tenTg, tenS, soTr));
        
    }
    public void nhapTapChi(){
        TaiLieu t = nhapTaiLieu();
        int soPh, thangPh;
        System.out.println("So phat hanh: ");
        soPh = Integer.parseInt(sc.nextLine());
        System.out.println("Thang phat hanh: ");
        thangPh =Integer.parseInt(sc.nextLine());
        list.add(new TapChi(t.getMa(), t.getTenNxb(), t.getSobph(), soPh, thangPh));
    }
    private String nhapNgay(){
        System.out.println("Date(dd/MM/yyyy): ");
        String dateString = sc.nextLine();
        return dateString;
    }
    public void nhapBao(){
        TaiLieu t = nhapTaiLieu();
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String dateString= nhapNgay();
        sp.setLenient(false);
        try{
            date = sp.parse(dateString);
        }catch(ParseException e){
            System.out.println("Sai dinh dang date");
            nhapNgay();
        }
        list.add(new Bao(date, t.getMa(), t.getTenNxb(), t.getSobph()));
     }
    public void hienThi(){
        int dem=0;
        System.out.println("===Sach====");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Sach){
                System.out.println(list.get(i));
                dem++;
            }
        }
        System.out.println("So sach = "+ dem);
        dem=0;
        System.out.println("===Tap chi====");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof TapChi){
                System.out.println(list.get(i));
                dem++;
            }
        }
        System.out.println("So tap chi= "+ dem);
        dem=0;
        System.out.println("===Bao====");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Bao){
                System.out.println(list.get(i));
                dem++;
            }
        }
        System.out.println("So bao= "+ dem);
    }
    public int tonTaiTaiLieu(String ma){
//        System.out.println("Ma: ");
//        ma = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)) return i;
        }
        return -1;
    }
    public void xoa(String ma){
        
        int vt = tonTaiTaiLieu(ma);
        if(vt==-1){
            System.out.println("Ma tai lieu ko ton tai!");
        }
        else {
            list.remove(vt);
            System.out.println("Xoa thanh cong");
        }
    }
    public void sua(String ma){
        
        int vt = tonTaiTaiLieu(ma);
        if(vt==-1){
            System.out.println("Ma tai lieu ko ton tai!");
        }
        else {
            TaiLieu t = list.get(vt);
            String tenNxb;
            int sobph;
            System.out.println("Ten nha xuat ban: ");
            tenNxb = sc.nextLine();
            System.out.println("So ban phat hang: ");
            sobph = Integer.parseInt(sc.nextLine());
            t.setSobph(sobph);
            t.setTenNxb(tenNxb);
            System.out.println("Sửa thành công!");
        }
    }
    public void timKiemTheoMa(String ma){
        
        int dem = 0;
         for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)) {
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
         if(dem==0) System.out.println("Không có tài liệu có mã cần tìm");
    }
    public void timKiemTheoTenNXB(String tenNxb){
        
        int dem = 0;
         for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTenNxb().equalsIgnoreCase(tenNxb)) {
                System.out.println(list.get(i).toString());
                dem++;
            }
        }
         if(dem==0) System.out.println("Không có tài liệu có tên nhà xuất bản cần tìm");
    }
    public void timKiemTheoTenTG(String tenTg){
        
        int dem = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof  Sach){
                if(((Sach) list.get(i)).getTenTg().equalsIgnoreCase(tenTg)){
                    System.out.println(list.get(i).toString());
                    dem++;
                }
            }
        }
         if(dem==0) System.out.println("Không có tài liệu có tên tác giả cần tìm");
    }
    public void timKiemTheoTenSach(String tenS){
        
        int dem = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof  Sach){
                if(((Sach) list.get(i)).getTenS().equalsIgnoreCase(tenS)){
                    System.out.println(list.get(i).toString());
                    dem++;
                }
            }
        }
        if(dem==0) System.out.println("Không có tài liệu có tên tác giả cần tìm");
    }
    public void timKiemTheoNgayPhatHanh(String ngayPh) throws ParseException{
        
        int dem =0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Bao
                    && ((Bao) list.get(i)).SimpleDate().equalsIgnoreCase(ngayPh)) {
                System.out.println(((Bao) list.get(i)).toString());
                dem++;
            }
        }
        if(dem==0) System.out.println("Khong co!");
    }
    public void timKiemTheoKhoangThangPhatHang(int thangbd, int thangkt){
        
        int dem =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof TapChi){
                if(((TapChi)list.get(i)).getThangPh()>=thangbd 
                     && ((TapChi)list.get(i)).getThangPh()<=thangkt) {
                    System.out.println(list.get(i).toString());
                    dem++;
                }
            }
            
        }
        if(dem==0 ) System.out.println("Khong co");
    }
    public void timKiemTrongKhoangSoTrang(int trangbd, int trangkt){
        
        int dem=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Sach){
                if(((Sach)list.get(i)).getSoTr()>= trangbd &&
                        ((Sach)list.get(i)).getSoTr()<= trangkt){
                    System.out.println(list.get(i).toString());
                    dem++;
                }
            }
            
        }
        if(dem==0) System.out.println("Khong co");
    }
    public void timKiemTrongKhoangSoBanPh(int soPHbd, int soPHkt){
        
        int dem=0;
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i)).getSobph()>= soPHbd &&
                list.get(i).getSobph()<= soPHkt){
                    System.out.println(list.get(i).toString());
                    dem++;
                }
        }
        if(dem==0) System.out.println("Khong co");
    }
    public void sortTenNxb(){
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getTenNxb().compareTo(o2.getTenNxb());
            }
        });
    }
    public void sortSobanPh(){
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getSobph()-o2.getSobph();
            }
        });
        
    }
    public void sortTenTg(){
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if(o1 instanceof Sach && o2 instanceof Sach )
                    return ((Sach)o1).getTenTg().compareTo(((Sach)o2).getTenTg());
                else return -1;
            }
        });
    }
    public void sortTenSach(){
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if(o1 instanceof Sach && o2 instanceof Sach )
                    return ((Sach)o1).getTenS().compareTo(((Sach)o2).getTenS());
                else return -1;
            }
        });
    }
    public void sortSoTrang(){
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if(o1 instanceof Sach && o2 instanceof Sach){
                    return ((Sach)o1).getSoTr()-((Sach)o2).getSoTr();
                }
                else return -1;
             }
        });
    }
    public void sortSoNgayPh(){
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if(o1 instanceof Bao && o2 instanceof Bao){
                    return ((Bao)o1).getNgayPh().compareTo(((Bao)o2).getNgayPh());
                }
                return -1;
            }
        });
        
    }
    //tinh toan
    private ArrayList<Integer> getSoPhatHanh(){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getSobph());
        }
        return new ArrayList<>(hs);
    }
    public void sumBySoPhatHanh(){
        ArrayList<Integer> ar = getSoPhatHanh();
        int c;
        for (int i = 0; i < ar.size(); i++) {
            c=0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getSobph() == ar.get(i)){
                    c++;
                }
            }
            System.out.println("So ban phat hanh: "+ar.get(i)+": "+c);
        }
    }
    private ArrayList<Integer> getThagph(){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i) instanceof TapChi){
               hs.add(((TapChi)list.get(i)).getThangPh());
           }
            
        }
        return new ArrayList<>(hs);
    }
    public void sumByThangph(){
        ArrayList<Integer> ar = getThagph();
        int dem;
        for (int i = 0; i < ar.size(); i++) {
            dem =0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) instanceof TapChi){
                    if(((TapChi)list.get(j)).getThangPh()==ar.get(i)){
                        dem++;
                    }
                }
                
            }
            System.out.println("Thang phat hanh: "+ar.get(i)+": "+dem);
        }
    }
    public void hienThiSach(){
        System.out.println("=======Sach======");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof  Sach){
                System.out.println(list.get(i).toString());
            }
            
        }
    }
    public void hienThiTapChi(){
        System.out.println("=======Tap Chi======");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof  TapChi){
                System.out.println(list.get(i).toString());
            }
            
        }
    }
    public void hienThiBao(){
        System.out.println("=======Bap======");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof  Bao){
                System.out.println(list.get(i).toString());
            }
            
        }
    }
}
   
