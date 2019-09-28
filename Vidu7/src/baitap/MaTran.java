
package baitap;
import java.util.Arrays;
import java.util.Scanner;

public class MaTran {
    private int[][] a;
    public MaTran(int n){
        a=new int[n][n];
    }
    public void input(){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Nhap "+i+" "+j+": ");
                a[i][j]=in.nextInt();
            }
        }
    }
    public void out(){
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
    private int[][] chuyenvi(){
        int[][] t=new int[a.length][a.length];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                t[j][i]=a[i][j];
            }
        }
        return t;
    }
    public void outChuyenVi(){
        int[][] t=chuyenvi();
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(t[i]));
        }
    }
    private int[] tongHang(){
        int[] t=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            t[i]=0;
            for (int j = 0; j < a.length; j++) {
                t[i]+=a[i][j];
            }
        }
        return t;
    }
    public void outTongHang(){
        int[] t=tongHang();
        System.out.println(Arrays.toString(t));
    }
}
