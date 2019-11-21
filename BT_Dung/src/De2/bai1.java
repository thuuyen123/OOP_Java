/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class bai1 {

    public static void main(String[] args) {
        String finein = "src/De2/input.txt";
        double a = 0, b = 0, c = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(finein));
            String line = br.readLine();
            String[] s = line.split("\\s+");

            a = Double.parseDouble(s[0]);
            b = Double.parseDouble(s[1]);
            c = Double.parseDouble(s[2]);

            br.close();
            PrintWriter w = new PrintWriter("src/De2/output.txt");
            double sum = 0;
            sum = a + b + c;
            w.println("Tong cua 3 so thuc la: " + sum);
            w.println("Giai phuong trinh bac hai: ");
            double d=b*b-4*a*c;
            if(d<0) w.println("Vo nghiem");
            else if(d==0) w.println("PT co nghiem kep: "+ (-b/2*a));
            else {
                w.println("PT co 2 nghiem: ");
                w.println("x1= "+(-b+Math.sqrt(d))/2*a);
                w.println("x2= "+(-b-Math.sqrt(d))/2*a);
            }
            w.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
