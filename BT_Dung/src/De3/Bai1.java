/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class Bai1 {
    private static boolean tang(int []a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]<a[i]) return false;
        }
        return true;
    }
    private static boolean giam(int []a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]>a[i] ) return false;
        }
        return true;
    }
    private static boolean check(int []a){
        if(tang(a) || giam(a)) return true;
        return false;
    }
    private static void sapxeptang(int[]a ){
        int tg;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/De3/input.txt"));
            String line=br.readLine();
            String [] s=line.split("\\s+");
            int [] a=new int[s.length];
            int [] b =new int[s.length];
            for (int i = 0; i < s.length; i++) {
                a[i]=Integer.parseInt(s[i]);
            }
            line=br.readLine();
            s=line.split("\\s+");
            for (int i = 0; i < s.length; i++) {
               b[i]=Integer.parseInt(s[i]);
            }
            br.close();
            PrintWriter w=new PrintWriter("src/De3/output.txt");
            if(check(a)){
                w.println("Day thu nhat da duoc sap xep");
            }else{
                w.println("Day thu nhat chua duoc sap xep");
                w.print("Day thu nhat sau khi duoc sap xep la: ");
                sapxeptang(a);
                for (int i = 0; i < a.length; i++) {
                    w.print(a[i]+" ");
                }
                w.print("\n");
            }
            if(check(b)){
                w.println("Day thu hay da duoc sap xep");
            }else{
                w.println("Day thu hai chua duoc sap xep");
                w.print("Day thuc hai sau khi duoc sap xep la: ");
                sapxeptang(b);
                for (int i = 0; i < b.length; i++) {
                    w.print(a[i]+" ");
                }
                w.write("\n");
            }
            w.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
            
}
