/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class Cau1 {
    public static void main(String[] args) {
        String filein="src/De1/input.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filein));
            String line=br.readLine();
            String [] s=line.split("\\s+");
            int [] a=new int[s.length];
            for (int i = 0; i < s.length; i++) {
                a[i]=Integer.parseInt(s[i]);
            }
            int sum=0;
            for (int i = 0; i < a.length; i++) {
               sum+= a[i];
            }
            br.close();
            PrintWriter w=new PrintWriter("src/De1/output.txt");
            w.println("Tong cua day so: "+sum);
            w.close();
        } catch (Exception e) {
        }
    }
}
