import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       double r,s;
       char ans;
       while(true){
         System.out.print("r=");
         r=in.nextDouble();
         s=Math.PI*r*r;
         System.out.println("Area:"+s);
         System.out.print("co lam tiep khong?(c/k):");
         if((ans=in.next().trim().toUpperCase().charAt(0))=='K')
             break;
       }  
         
     }
   
}
