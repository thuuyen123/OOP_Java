package classdemo;



import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLTV ql=new QLTV();
        while(true){
            System.out.println("1. Nhap 1 dau sach");
            System.out.println("2. Nhap tap chi");
            System.out.println("3. Viet ra ds sach ");
            System.out.println("4. Xoa");
            System.out.println("5. Sua");
            System.out.println("6. Thong ke theo ten nxb");
//            System.out.println("6. hieu");
//            System.out.println("7. tich");
//            System.out.println("8. Nhap xau");
//            System.out.println("9. KTRA dt");
//            System.out.println("10. KT phieu");
//            System.out.println("0. Exit");
            System.out.print("Moi chon:");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:ql.nhapSach();
                       break;
                case 2:ql.nhapTapChi();
                       break;
                case 3:ql.hthi();
                       break;
                case 4:ql.xoa();
                       break;   
                case 5:ql.suaTaiLieu();
                       break;
                case 6: ql.thongketheoTenNXB();
                     break;
                     
//                case 5:Matran b=new Matran(n);
//                       b.nhap();
//                       t=new Matran(n);
//                       t.setA(m1.tong(b.getA()));
//                       m1.viet();
//                       b.viet();
//                       t.viet();
//                       break;
//                case 6:Matran c=new Matran(n);
//                       c.nhap();
//                       t.setA(m1.hieu(c.getA()));
//                       m1.viet();
//                       c.viet();
//                       t.viet();
//                       break;
//                case 7:Matran d=new Matran(n);
//                       d.nhap();
//                       t.setA(m1.tich(d.getA()));
//                       m1.viet();
//                       d.viet();
//                       t.viet();
//                       break;
//                case 8:x.nhap();
//                       break;
//                case 9:if(x.ktDienThoat())
//                        System.out.println("dung");
//                       else
//                         System.out.println("sai");
//                       break;
//                case 10:if(x.ktPhieu())
//                        System.out.println("dung");
//                       else
//                         System.out.println("sai");
//                       break;       
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi chon 0=>10");       
                       
            }
        }
    }
    
}
