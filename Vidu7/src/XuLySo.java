import java.util.Scanner;

public class XuLySo {
    int n;
    public void input(){
       Scanner in=new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
       n=in.nextInt();        
    } 
    public int tong(){
        int t=0;
        for (int i = 1; i <= n; i++) {
            t+=i;
        }
        return t;
    }
    public int tich(){
        int t=1;
        for (int i = 2; i <= n; i++) {
            t*=i;
        }
        return t;
    }
    private boolean ngto(int n){
        if(n<2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void vietNgTo(){
        System.out.print("Day so nguyen to: ");
        for (int i = 1; i <n ; i++) {
            if(ngto(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
