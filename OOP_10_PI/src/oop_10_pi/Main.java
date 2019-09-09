/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_10_pi;

import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void CalPi(double ep){
        double value=1;
        int i=1;
        double a=1.0/3.0;
        int sign=-1;
        while(a>ep){
            value+=sign*a;
            i++;
            a=1.0/(2*i+1);
            sign=-sign;
        }
        value=value*4;
        System.out.println("Pi:"+value);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ep;
        System.out.print("Nhập ep: ");
        ep = Double.parseDouble(sc.nextLine());
        CalPi(ep);
        
    }
    
}
