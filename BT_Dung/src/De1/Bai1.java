/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import static java.lang.Math.sqrt;

/**
 *
 * @author Admin
 */
public class Bai1 {

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String filein = "src/De1/input.txt";
        String tong = "Tong day so nguyen la: ";
        String dnt = "Day so nguyen to la: ";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filein));
            String line = br.readLine();
            String[] s = line.split("\\s+");
            int[] num = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                num[i] = Integer.parseInt(s[i]);
            }
            int sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum += num[i];
            }
            tong += sum;

            for (int i = 0; i < num.length; i++) {
                if (check(num[i])) {
                    dnt += num[i] + " ";
                }
            }
            br.close();
            PrintWriter w = new PrintWriter("src/De1/output.txt");
            w.println(tong);
            w.println(dnt);
            w.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        //String fileout="src/De1/output.txt";
//        try {
//            BufferedWriter bw=new BufferedWriter(new FileWriter(fileout));
//            bw.write(tong+"\n");
//            bw.write(dnt);
//            bw.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
