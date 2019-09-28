package ngay21_8;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        BTQT r=new BTQT();
        String st=null;
        while(true){
            System.out.println("1. input a String");
            System.out.println("2. Kiem tra ma???");
            System.out.println("3. KTra Dien thoai");
            //System.out.println("4. Day nguyen to");
            System.out.println("0. exit");
            System.out.print("Moi chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:System.out.print("Nhap xau:");
                       st=in.nextLine();
                       break;
                case 2:r.ktraMa(st);
                       break;
                case 3:String dt;
                    while(true){
                        System.out.print("nhap dien thoai:");
                        dt=in.nextLine();
                        if(r.ktraDT(dt))
                            break;
                    }
                    System.out.println("DT:"+dt);
                       break;
//                case 4:x.vietNgTo();
//                       break;
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:
                    System.out.println("chi chon 0->3");
            }
        }
    }
}
