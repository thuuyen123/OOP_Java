/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class Bai1 {
    public static void main(String[] args) {
        String filein="src/De4/input.txt";
        try {
            BufferedReader br=new BufferedReader(new FileReader(filein));
            String line=br.readLine();
            String [] s=line.split("\\s+");
            int sum=s.length;
            line=br.readLine();
            String bk=line.trim();
            double r=Double.parseDouble(bk);
            double dt=Math.PI*r*r;
            double tt=4/3 *Math.PI * r *r*r;
            br.close();
            PrintWriter w=new PrintWriter("src/De4/output.txt");
            w.println("So tu cua xau la: "+sum);
           
            w.println("Dien tich hinh tron la: "+dt);
            w.println("The tich hinh cau la: "+tt);
            w.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
