/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deth4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Thu Uyên
 */
public class DaThuc {
    public static double dt1(double[] a, int bac, double x){
        double sum = a[bac];
        for (int i = bac; i>=0; i--) {
            sum = sum*x+a[i-1];
        }
        return sum;
    }
    public static double daoham(double[] a, int bac,int x){
        
        double[] d = {0};
        for (int i =bac; i >1; i--) {
            d[i-1] = a[i]*i;
        }
        return dt1(d, bac, x);
    }
    public static void main(String[] args) throws IOException {
        double[] a;
        try {
            BufferedReader rd = new BufferedReader(new FileReader("src/deth4/input.txt"));
            String line = rd.readLine();
            int bac = Integer.parseInt(line);
            line = rd.readLine();
            String[] s = line.split("\\s+");
            a = new double[s.length];
            for (int i = 0; i <= bac; i++) {
                a[i] = Double.parseDouble(s[i]);
            }
            rd.close();
            double sum = 0, daoham=0;
//            sum = a[0]* Math.pow(1,bac) + a[1] * Math.pow(1, bac-1) + a[2]*Math.pow(1, bac-2)+a[3]*Math.pow(1, bac -3);
//            daoham = a[0]*bac*Math.pow(1, sum)
            PrintWriter w = new PrintWriter("src/deth4/output.txt");
            
            w.print("Gia tri da thuc khi x=1 la : ");
            w.println(dt1(a, bac, 1));
            w.print("Gia tri dao ham da thuc khi x=1 la : ");
//            w.println(daoham(a, bac, 1));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
       
    }
}
