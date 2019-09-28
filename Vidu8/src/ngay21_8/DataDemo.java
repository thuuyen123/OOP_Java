
package ngay21_8;
import java.util.Scanner;

public class DataDemo {
    public static void main(String[] args) {
        int x;
        double y;
        float u;
        char chon;
        String ten;
        boolean ut;
        Scanner in=new Scanner(System.in);
        while(true){
        System.out.print("nhap x=");
        x=Integer.parseInt(in.nextLine());
        System.out.print("nhap y=");
        y=Double.parseDouble(in.nextLine());
        //in.nextLine();
        //next()   nextLine()
        System.out.print("ten:");
        ten=in.nextLine();
        System.out.print("UU tien:");
        ut=Boolean.parseBoolean(in.nextLine());
            System.out.print("co nhap nua hay khong?(C/K):");
            if((chon=in.next().trim().toUpperCase().charAt(0))=='K')
                break;
        }
        System.out.println("ten:"+ten+" x="+x+" uu tien"+ut);
//        
//        
//      Random r=new Random();
//        System.out.println("tu 1-7:"+(r.nextInt(7)+1));
//        System.out.println(Math.E);
//        System.out.println("sin 30:"+Math.sin(Math.PI/6));
//        System.out.println(Math.ceil(8.1));
//        System.out.println(Math.floor(8.9));
//        System.out.println(Math.round(5.6));
//        int o1;
//        Integer o2=new Integer("546");
//        Integer n=567;
//        
    }
}
