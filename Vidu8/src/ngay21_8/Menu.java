
package ngay21_8;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        while(true){
            System.out.println("1. nhap");
            System.out.println("2. q1");
            System.out.println("3. q1");
            //System.out.println("4. q1");
            //System.out.println("5. q1");
            System.out.println("0. exit");
            System.out.print("Moi chon:");
            Scanner in=new Scanner(System.in);
            int chon;
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:System.out.println("nnnn");
                       break;
                case 2:System.out.println("mmmddddd");
                       break;
                case 3:System.out.println("7777777");
                       break;
                case 0:System.out.println("bye!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi nhap 0=>3");       
            }
            
        }
    }
    
}
