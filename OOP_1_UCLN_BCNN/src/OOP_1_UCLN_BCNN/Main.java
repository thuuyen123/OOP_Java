/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_1_UCLN_BCNN;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, m;
        System.out.print("Nhập n =  ");
        n = sc.nextInt();
        System.out.print("Nhập m = ");
        m = sc.nextInt();
        int c = m*n;
        while(m!=n){
            if(m>n) m=m-n;
            else n=n-m;
        }
        System.out.println("UCLN = " +n);
        System.out.println("BCNN = " + c/n);
    }
}
