
package baitap;
import java.util.Scanner;

public class HaiSo {
     private int a,b;
     public void input(){
         Scanner in=new Scanner(System.in);
         System.out.print("a=");
         a=in.nextInt();
         System.out.print("b=");
         b=in.nextInt();
     }
     private boolean ngTo(int n){
         if(n<2)
             return false;
         for (int i = 2; i <= Math.sqrt(n); i++) {
             if(n%i==0)
                 return false;
         }
         return true;
     }
     public void daySoNgto(){
         int min=Math.min(a, b);
         int max=Math.max(a, b);
         System.out.print("Day so:");
         for (int i = min; i <= max; i++) {
             if(ngTo(i))
                 System.out.print(i+" ");
         }
         System.out.println();
     }
     
     public int BSCNN(){
        int t=0;
        int max=Math.max(a, b);
         for (int i =max ; i <= (a*b); i++) {
             if((i%a)==0&&(i%b==0)){
                 t= i;
                 break;
             }
         }
        return t;
     }
     public boolean thuanNgTo(){
         if(ngTo(a)&&ngTo(b)&&ngTo(a+b))
             return true;
         return false;
     }
     
}
