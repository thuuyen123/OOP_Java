
package ngay28_8;

import java.util.Scanner;
public class RegDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String ma;
        String re="^[Bb]{1}\\d{2}[A-Za-z]{4}\\d{3}$";
        while(true){
            System.out.print("nhap ma:");
            ma=in.nextLine();
            if(ma.matches(re))
                break;
        }
        System.out.println("ma:"+ma);
        
    }
    
}
