package baitap;


import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        MaTran m=null; 
        HaiSo h=new HaiSo();
        while(true){
            System.out.println("1. Nhap ma trận");
            System.out.println("2. in ma trận");
            System.out.println("3. Ma trận chuyển vị");
            System.out.println("4. Tổng các hàng");
            System.out.println("5. Nhập 2 số");
            System.out.println("6. Dãy số nguyên tố");
            System.out.println("7. BSCNN");
            System.out.println("8. THuâng nguyên tố");
            System.out.println("0. Exit");
            System.out.print("Moi chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:System.out.print("n=");
                      int n=in.nextInt();
                      m=new MaTran(n);
                      m.input();
                       break;
                case 2:m.out();
                       break;
                case 3:
                       m.outChuyenVi();
                       break;
                case 4:m.outTongHang();
                       break;
                case 5:h.input();
                       break;
                case 6:h.daySoNgto();
                       break;
                case 7:System.out.println("BCNN:"+h.BSCNN());
                       break;
                case 8:if(h.thuanNgTo())
                         System.out.println("dung");
                       else
                         System.out.println("sai");
                       break;
                       
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:
                    System.out.println("chi chon 0->8");
            }
        }
    }
}
