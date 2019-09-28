

package ngay21_8;
import java.util.Random;
import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
//        Random r=new Random();
//        System.out.println("so:"+(r.nextInt(8)+1));
//        System.out.println("E:"+Math.E);
//        System.out.println("sin 30:"+Math.sin(Math.PI/6));
//        System.out.println("ceil:"+Math.ceil(8.2));
//        System.out.println("floor:"+Math.floor(8.8));
//        System.out.println("round:"+Math.round(8.2));
//        int x=9;
//        Integer y=new Integer("67");
//        Integer c=45;
        
        String ma=null,ten="";
        int tuoi=0;
        boolean ut=false;
        double diem=0.0;
        char chon;
        Scanner in=new Scanner(System.in);
     while(true){
        System.out.print("Ma:");
        ma=in.nextLine();
        System.out.print("Tuoi:");
        tuoi=Integer.parseInt(in.nextLine());
        System.out.print("Ten:");
        //in.nextLine();
        ten=in.nextLine();
        System.out.print("uu tien:");
        ut=Boolean.parseBoolean(in.nextLine());
        System.out.print("Diem:");
        diem=Double.parseDouble(in.nextLine());
         System.out.print("co nhap nua hay khong?(C/K):");
         if((chon=in.nextLine().trim().toUpperCase().charAt(0))=='K')
             break;
     }
        System.out.println("Ma:"+ma+" ten:"+ten+" tuoi:"+tuoi+" utien:"+ut);
    }
}
