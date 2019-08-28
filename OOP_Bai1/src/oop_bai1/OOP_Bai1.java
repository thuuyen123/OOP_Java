/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_bai1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class OOP_Bai1 {
    private int n;//so nguyen duong n;

    public OOP_Bai1() {
    }

    public OOP_Bai1(int n) {
        this.n = n;
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void nhap1_1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = sc.nextInt();
    }
    public void tong1_2(){
        int sum=0;
        while(n>0){
            sum+=n;
            n--;
        }
        System.out.println("Tong = "+sum);
    }
    public void tich1_3(){
        int mul =1;
        while(n>1){
            mul*=n;
            n--;
        }
        System.out.println("Tich = "+ mul);
    }
    public void tongChan1_4(){
        int sum = 0;
        while(n>0){
            if(n%2!=0) n--;
            else{
               sum+=n;
               n-=2;
            }
        }
        System.out.println("Tổng các số chẵn từ 2 đến n là: "+sum);
    }
    public void tongLe1_5(){
        int sum = 0;
        while(n>0){
            if(n%2==0) n--;
            else{
                sum +=n;
                n-=2;
            }
        }
        System.out.println("Tổng các số lẻ nguyên dương nhỏ hơn n là: "+sum);
    }
    public boolean checkNgto(int x){
        if(x<2) return false;
        for (int i = 2; i <= sqrt(x); i++)
            if(x%i==0) return false;
        return true;
    }
    public void ngTo1_6(){
        System.out.print("Các số nguyên tố nhỏ hơn n là: ");
        for (int i = 1; i < n; i++) {
            if(checkNgto(i)) System.out.print(i+" ");
        }
        System.out.println("");
    }
    public void Fibo1_7(){
        int fn, f0=0, f1=1;
	int i;
        System.out.print("Dãy fibo < n: ");
	for(i=1; i<= n; i++)
        {
            fn=f0;
            f0=f1;
            f1=f1+fn;
       	    System.out.print(fn + " ");
	}
        System.out.println("");
    }
    public void sumCS1_8(){
        int sum=0;
        while(n>0){
            int temp = n%10;
            sum +=temp;
            n/=10;
        }
        System.out.println("Tổng các chữ số của n là: "+ sum);
    }
    public void Uoc1_9(){
        System.out.print("Các ước của n là");
        for (int i = 1; i <=n; i++) {
           if(n%i==0) System.out.print(i+" ");
        }
        System.out.println("");
    }

}
