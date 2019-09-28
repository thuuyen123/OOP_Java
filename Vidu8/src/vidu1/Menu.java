
package vidu1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        HaiSo h=new HaiSo();
        DaySo d=null;
        while(true){
            System.out.println("1. Nhap 2 so");
            System.out.println("2. Dua ra so nguyen to");
            System.out.println("3. BCNN");
            System.out.println("4. Nhap day so");
            System.out.println("5. Tong");
            System.out.println("6. Tong nguyen to");
            System.out.println("7. Dua ra SX hay lon xon");
            System.out.println("8. Nhap xau");
            System.out.println("9. Ktra so dien thoai");
            System.out.println("10. KTra bien so xe");
            System.out.println("0. exit");
            System.out.print("Moi chon:");
            Scanner in=new Scanner(System.in);
            int chon;
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:h.nhap();
                       break;
                case 2:h.vietNguyenTo();
                       break;
                case 3:System.out.println("bcnn:"+h.bcnn());
                       break;
                case 4:System.out.print("n=");
                       int n=in.nextInt();
                       d=new DaySo(n);
                       d.nhap();
                       break;
                case 5:d.viet();
                    System.out.println("Tong:"+d.tong());
                       break;
                case 6:d.viet();
                    System.out.println("Tong nguyn to:"+d.tongNgTo());
                       break;
                case 7:System.out.println(d.daSapxep());
                       break;
                case 8:
                       break;
                case 9:
                       break;
                case 10:
                       break;       
                case 0:System.out.println("bye!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi nhap 0=>10");       
            }
            
        }
    }
    
}
