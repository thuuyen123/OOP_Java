import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        XuLySo x=new XuLySo();
        while(true){
            System.out.println("1. input");
            System.out.println("2. Tong");
            System.out.println("3. Tich");
            System.out.println("4. Day nguyen to");
            System.out.println("0. exit");
            System.out.print("Moi chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 1:x.input();
                       break;
                case 2:System.out.println("Tong:"+x.tong());
                       break;
                case 3:System.out.println("Tich:"+x.tich());
                       break;
                case 4:x.vietNgTo();
                       break;
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:
                    System.out.println("chi chon 0->3");
            }
        }
    }
}
