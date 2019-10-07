/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Admin
 */
public class QLTV {

    private ArrayList<TaiLieu> list;
    Scanner in = new Scanner(System.in);

    public QLTV() {
        list = new ArrayList<>();
        list.add(new Sach("Nguyen Van A", "Cuoc song", 120, "ABC123", "Tuoi Tre", 34));
        list.add(new Sach("Tran Van B", "Tren duong", 200, "QLM451", "Doi Song", 12));
        list.add(new Sach("Nguyen Thi C", "Ban dang gia", 300, "TSA231", "Doi Song", 76));
        list.add(new TapChi(31, 12, "TAF431", "Nha Nam", 31));
        list.add(new TapChi(12, 06, "RA115", "Nha Nam", 80));
        list.add(new TapChi(41, 11, "AIP543", "Tuoi Tre", 35));
//        list.add(new Bao("12/02/2018", "DAS123", "Song Con", 54));
//        list.add(new Bao("24/06/1999", "KLH987", "Hieu ", 14));

    }

    public boolean tontaima(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }
//nhap vao mot TaiLieu

    public TaiLieu nhap() {
        String ma, tenNXB;
        int soBPH;
        TaiLieu t = null;
        System.out.println("Nhap ma (3 chu va 3 so): ");
        while (true) {
            ma = in.nextLine().toUpperCase();
            if (!tontaima(ma) && ma.matches("^[A-Z]{3}\\d{3}")) {
                break;
            } else {
                System.out.println("Nhap lai ma");
            }
        }
        System.out.println("Nhap ten NXB: ");
        tenNXB = in.nextLine();
        System.out.println("Nhap so BPH: ");
        soBPH = Integer.parseInt(in.nextLine());
        t = new TaiLieu(ma, tenNXB, soBPH);
        return t;
    }
// nhap vao mot Sach

    public void nhapSach() {
        TaiLieu t = nhap();
        String tentg, tens;
        int strang;
        System.out.println("Ten tac gia");
        tentg = in.nextLine();
        System.out.println("Ten sach");
        tens = in.nextLine();
        System.out.println("So trang");
        strang = Integer.parseInt(in.nextLine());
        list.add(new Sach(tentg, tens, strang, t.getMa(), t.getTenNXB(), t.getSoBPH()));
    }
//nhap vao mot TapChi

    public void nhapTapChi() {
        TaiLieu t = nhap();
        int soPH, thangPH;
        System.out.println("Nhap so phat hanh: ");
        soPH = Integer.parseInt(in.nextLine());
        System.out.println("Nhap thang phat hanh:");
        thangPH = Integer.parseInt(in.nextLine());
        list.add(new TapChi(soPH, thangPH, t.getMa(), t.getTenNXB(), t.getSoBPH()));
    }

//    public boolean ngayhople(String ngayPH) {
//
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        df.setLenient(false);
//        try {
//            df.parse(ngayPH);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//    public void nhapBao() {
//        TaiLieu t = nhap();
//        String ngayPH;
//        System.out.println("Nhap ngay phat hanh (dd/mm/yyyy):");
//        while (true) {
//            ngayPH = in.nextLine();
//            if ( ngayhople(ngayPH)) {
//                break;
//            } else {
//                System.out.println("Nhap lai!");
//            }
//        }
//        list.add(new Bao(ngayPH, t.getMa(), t.getTenNXB(), t.getSoBPH()));
//    }
    public String nhapngay() {
        String ngay;
        System.out.println("Nhap ngay phat hanh (dd/mm/yyyy):");
        ngay = in.nextLine();
        return ngay;
    }
//nhap vao mot Bao

    public void nhapBao() throws ParseException {
        TaiLieu t = nhap();
        Date ngayPH = new Date();
        String ngay = nhapngay();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            ngayPH = df.parse(ngay);

        } catch (ParseException e) {
            System.out.println("Nhap sai dinh dang.");
            nhapngay();

        }

        list.add(new Bao(ngayPH, t.getMa(), t.getTenNXB(), t.getSoBPH()));
    }
//Hien thi ra danh sach

    public void hienThi() {
        int count = 0;
        System.out.println("======Sach=====");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sach) {
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("Tong so sach: " + count);
        count = 0;
        System.out.println("======Tap Chi======");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof TapChi) {
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("Tong so tap chi la: " + count);
        count = 0;
        System.out.println("======Bao======");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Bao) {
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("Tong so bao la: " + count);
    }

    public int timtheoMa(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    public void hienThiThongTinTheoMa(String ma) {
        if (timtheoMa(ma) == -1) {
            System.out.println("Khong co ma can tim!");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public int timtheotenNXB(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTenNXB().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    public void hienThiThongTinTheoTenNXB(String tenNXB) {
        if (timtheotenNXB(tenNXB) == -1) {
            System.out.println("Khong co NXB can tim!");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTenNXB().equalsIgnoreCase(tenNXB)) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public int timtheotens(String tens) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sach) {
                if (((Sach) list.get(i)).getTens().equalsIgnoreCase(tens)) {
                    return i;
                }

            }
        }
        return -1;

    }

    public void hienThiTheoTens(String tens) {
        if (timtheotens(tens) == -1) {
            System.out.println("Khong co sach can tim!");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sach) {
                if (((Sach) list.get(i)).getTens().equalsIgnoreCase(tens)) {
                    System.out.println(((Sach) list.get(i)).toString());
                }

            }
        }
    }

    public int timtheotentg(String tentg) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sach
                    && ((Sach) list.get(i)).getTentg().equalsIgnoreCase(tentg)) {
                return i;
            }
        }
        return -1;
    }

    public void hienThiTheoTentg(String tentg) {
        if (timtheotentg(tentg) == -1) {
            System.out.println("Khong co tac gia can tim!");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sach
                    && ((Sach) list.get(i)).getTentg().equalsIgnoreCase(tentg)) {
                System.out.println(((Sach) list.get(i)).toString());
            }
        }

    }

    public int timtheoNgayPH(String ngay) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Bao
                    && ((Bao) list.get(i)).SimpleDate().equalsIgnoreCase(ngay)) {
                return i;
            }
        }
        return -1;
    }

    public void hienThiTheoNgayPH(String ngay) {
        if (timtheoNgayPH(ngay) == -1) {
            System.out.println("Khong co!");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Bao
                    && ((Bao) list.get(i)).SimpleDate().equalsIgnoreCase(ngay)) {
                System.out.println(((Bao) list.get(i)).toString());
            }
        }
    }

    public int timkiemtheokhoangThang(int thangPH1, int thangPH2) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof TapChi
                    && ((TapChi) list.get(i)).getThangPH() >= thangPH1
                    && ((TapChi) list.get(i)).getThangPH() <= thangPH2) {
                return i;
            }
        }
        return -1;
    }

    public void hienThitheokhoangThang(int thangPH1, int thangPH2) {
        if (timkiemtheokhoangThang(thangPH1, thangPH2) == -1) {
            System.out.println("Khong co!");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof TapChi
                    && ((TapChi) list.get(i)).getThangPH() >= thangPH1
                    && ((TapChi) list.get(i)).getThangPH() <= thangPH2) {
                System.out.println(((TapChi) list.get(i)).toString());
            }
        }
    }

    public void hienThitheokhoangNgay(Date ngayPH1, Date ngayPH2) {
//        if (timkiemtheokhoangThang(thangPH1, thangPH2) == -1) {
//            System.out.println("Khong co!");
//        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Bao
                    && ((Bao) list.get(i)).getNgayPH().after(ngayPH1)
                    && ((Bao) list.get(i)).getNgayPH().before(ngayPH2)) {
                System.out.println(((Bao) list.get(i)).toString());
            }
        }
    }

    public void xoa() {
        String ma;
        System.out.println("Nhap ma can xoa");
        ma = in.nextLine();
        int vt = timtheoMa(ma);
        if (vt == -1) {
            System.out.println("Khong co de xoa!");
        } else {
            list.remove(vt);
            System.out.println("Xoa thanh cong");
        }
    }

    public void sua() {
        String ma;
        System.out.println("Nhap vao ma can sua");
        ma = in.nextLine();
        int vt = timtheoMa(ma);
        if (vt == -1) {
            System.out.println("Khongg co de sua");
        } else {
            String tenNXB;
            int soBPH;
            System.out.println("Nhap ten NXB");
            tenNXB = in.nextLine();
            System.out.println("Nhap vao so BPH");
            soBPH = Integer.parseInt(in.nextLine());
            TaiLieu t = list.get(vt);
            t.setTenNXB(tenNXB);
            t.setSoBPH(soBPH);
            System.out.println("Sua thanh cong!");
        }
    }

    public void sortByTenNXB() {
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getTenNXB().compareTo(o2.getTenNXB());
            }
        });
    }

    public void sortByTenS() {
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if (o1 instanceof Sach && o2 instanceof Sach) {
                    return ((Sach) o1).getTens().compareTo(((Sach) o2).getTens());
                }
                return -1;
            }
        });
    }

    public void sortByNgayPH() {
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                if (o1 instanceof Bao && o2 instanceof Bao) {
                    return ((Bao) o1).getNgayPH().compareTo(((Bao) o2).getNgayPH());

                }
                return -1;
            }
        });
    }

    public void sortBySoBPH() {
        Collections.sort(list, new Comparator<TaiLieu>() {
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getSoBPH() - o2.getSoBPH();
            }
        });
    }

    public int tongSPH() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getSoBPH();
        }
        return sum;
    }

    public ArrayList<String> getNXB() {

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getTenNXB());
        }
        return new ArrayList<>(hs);

    }

    public void thongketheoNXB() {

        ArrayList<String> ar = getNXB();
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getTenNXB().equalsIgnoreCase(ar.get(i))) {
                    count++;
                }
            }
            System.out.println(ar.get(i) + " :" + count);
        }
    }
}
