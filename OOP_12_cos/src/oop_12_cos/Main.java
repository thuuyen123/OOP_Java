/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_12_cos;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {

    public static int giaithua(int n){
       if(n==0 || n==1) return 1;
       return n*giaithua(n-1);
    }
    
    public static double cos(double x){
        double epsilon = 0.001; 
        double c = 0;
        // đổi x thành rad
        x = x*Math.PI/180;
        int i =0;
        double temp;
        do {   
            temp = pow(x, 2*i)/giaithua(2*i);
            c += pow(-1,i)*temp;
            i++;

        } while (temp > epsilon);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x = ");
        double x = sc.nextDouble();
        System.out.println("cos("+x+")= "+cos(x));

    }
}
