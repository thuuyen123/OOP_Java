/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    public static void main(String[] args) throws ParseException {
        QLTV ql = new QLTV();
        while (true) {
            System.out.println("1. Nhap mot sach");
            System.out.println("2. Nhap mot tap chi");
            System.out.println("3. Nhap mot bao");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Tim theo ma");
            System.out.println("6. Tim theo tenNXB");
            System.out.println("7. Tim theo ten sach");
            System.out.println("8. Tim theo ten tac gia");
            System.out.println("9. Tim theo ngayPH");
            System.out.println("10. Tim theo khoang thang");
            System.out.println("11. Tim kiem theo khoang ngay");
            System.out.println("12. Xoa tai lieu");
            System.out.println("13. Sua tai lieu");
            System.out.println("14. Sap xep theo ten NXB");
            System.out.println("15. Sap xep theo ten sach");
            System.out.println("16. Sap xep theo ngay PH");
            System.out.println("17. Sap xep theo so BPH");
            System.out.println("18. Tinh tong so ban phat hanh");
            System.out.println("19. Thong ke theo ten NXB");
            System.out.println("0. Thoat");
            System.out.println("Moi chon");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch (chon) {
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
                    String ma;
                    System.out.println("Nhap vao ma can tim: ");
                    ma = in.nextLine();
                    ql.timtheoMa(ma);
                    ql.hienThiThongTinTheoMa(ma);
                    break;
                case 6: String tenNXB;
                    System.out.println("Nhap ten NXB can tim: ");
                    tenNXB=in.nextLine();
                    ql.hienThiThongTinTheoTenNXB(tenNXB);
                    break;
                case 7:
                    String tens;
                    System.out.println("Nhap ten sach can tim");
                    tens=in.nextLine();
                    ql.hienThiTheoTens(tens);
                  
                    break;
                case 8: String tentg;
                    System.out.println("Nhap ten tac gia can tim");
                    tentg=in.nextLine();
                    ql.hienThiTheoTentg(tentg);
                    break;
                case 9: String ngay;
                    System.out.println("Nhap ngay PH theo dinh dang dd/MM/yyyy");
                    ngay=in.nextLine();
                    ql.hienThiTheoNgayPH(ngay);
                    break;
                case 10: int thangPh1, thangPh2;
                    System.out.print("Tu thang ");
                    thangPh1=Integer.parseInt(in.nextLine());
                    System.out.print("den thang ");
                    thangPh2=Integer.parseInt(in.nextLine());
                    ql.hienThitheokhoangThang(thangPh1, thangPh2);
                    break;
                case 11:
                    String ngay1, ngay2;
                    Date ngayPH1, ngayPH2;
                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.print("Tim kiem tu ngay ");
                    ngay1=in.nextLine();
                    System.out.println("Den ngay: ");
                    ngay2=in.nextLine();
                     
                    ngayPH1= df.parse(ngay1);
                    ngayPH2=df.parse(ngay2);
                    ql.hienThitheokhoangNgay(ngayPH1, ngayPH2);
                    
                    break;
                case 12:
                    ql.xoa();
                    break;
                case 13:
                    ql.sua();
                    break;
                case 14: ql.sortByTenNXB();
                    break;
                case 15: ql.sortByTenS();
                    break;
                case 16: ql.sortByNgayPH();
                    break;
                case 17:ql.sortBySoBPH();
                    break;
                case 18: System.out.println("Tong so ban phat hanh: "+ql.tongSPH());
                    break;
                case 19: ql.thongketheoNXB();
                    break;
                case 0:
                    System.out.println("Bye");
                    System.exit(0);
                default:
                    System.out.println("Chi chon tu ");
            }
        }
    }
}
