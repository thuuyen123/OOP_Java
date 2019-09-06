/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_11_sin;

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
    
    public static double sin(double x){
        double epsilon = 0.001; 
        double s = 0;
        // đổi x thành rad
        x = x*Math.PI/180;
        int i =0;
        double temp;
        do {   
            temp = pow(x, 2*i+1)/giaithua(2*i+1);
            s += pow(-1,i)*temp;
            i++;

        } while (temp > epsilon);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x = ");
        double x = sc.nextDouble();
        System.out.println("sin("+x+")= "+sin(x));

    }
    
}
