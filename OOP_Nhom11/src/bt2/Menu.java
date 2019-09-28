package vidu4;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLDT ql=new QLDT();
        while(true){
            System.out.println("1. nhap dien thoai");
            System.out.println("2. Hien thi ds");
            System.out.println("3. xoa");
            System.out.println("4. sua");
            System.out.println("5. Tim theo ten");
            System.out.println("6. Tim theo gia");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 1:ql.nhap();
                      break;
                case 2:ql.hthi();
                      break;
                case 3:ql.xoa();
                      break;
                case 4:ql.sua();
                      break;
                case 5:ql.timTheoTen();
                    break;
                case 6:ql.timTheoGia();
                    break;    
                case 0:System.out.println("bye!!!!");
                       System.exit(0);
                      break;
                default: System.out.println("chi nhap 0->4");      
            }
        }
    }
    
}
