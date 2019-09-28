
package vidu1;
import java.util.Arrays;
import java.util.Scanner;

public class DaySo {
   private int[] a;
   public DaySo(int n){
       a=new int[n];
   }
   public void nhap(){
       Scanner in=new Scanner(System.in);
       for (int i = 0; i < a.length; i++) {
           System.out.print("phan tu thu "+i+": ");
           a[i]=in.nextInt();
       }
   }
   public int tong(){
       int t=0;
       for(int i:a)
           t+=i;
       return t;
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
   public int tongNgTo(){
       int t=0;
       for(int i:a)
           if(laNguyenTo(i))
             t+=i;
       return t;
   }
   private  boolean tang(){
       for (int i = 0; i < a.length-1; i++) {
           if(a[i+1]<a[i])
               return false;
       }
       return true;
   }
   private  boolean giam(){
       for (int i = 0; i < a.length-1; i++) {
           if(a[i+1]>a[i])
               return false;
       }
       return true;
   }public String daSapxep(){
       String t="";
       if(tang()||giam())
           t="da sap xep";
       else
           t="lon xon";
       return t;
   }
   public void viet(){
       System.out.println(Arrays.toString(a));
   }
   
}
