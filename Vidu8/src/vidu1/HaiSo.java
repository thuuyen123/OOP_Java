
package vidu1;
import java.util.Scanner;

public class HaiSo {
    private int n1,n2;
    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("so thu nhat:");
        n1=in.nextInt();
        System.out.print("so thu hai:");
        n2=in.nextInt();
    }
    private boolean laNguyenTo(int n){
        if(n<2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void vietNguyenTo(){
        int min=Math.min(n1, n2);
        int max=Math.max(n1, n2);
        System.out.print("Day:");
        for (int i = min; i <= max; i++) {
            if(laNguyenTo(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public int bcnn(){
        int t=1;
        int max=Math.max(n1, n2);
        for (int i = max; i <= (n1*n2); i++) {
            if((i%n1==0)&&(i%n2==0)){
                t=i;
                break;
            }
                
        }
        return t;
    }
    
}
