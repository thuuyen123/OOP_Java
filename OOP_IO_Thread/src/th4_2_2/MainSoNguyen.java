/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_2_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Thu Uyên
 */
public class MainSoNguyen {
    public static boolean checkNto(int n){//nguyen to
        if(n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
           if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] a;
        BufferedReader r = new BufferedReader(new FileReader("src/th4_2_2/input.txt"));
        String line = r.readLine();
        String[] s = line.split("\\s+");
        a = new int[s.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        r.close();
        
        PrintWriter w = new PrintWriter("src/th4_2_2/output.txt");
        int sum =0;
        for (int i = 0; i < a.length; i++) {
           sum += a[i];
        }
        w.println("Tong =" + sum);
        w.print("Day so nguyen to : ");
        for (int i = 0; i < a.length; i++) {
           if(checkNto(a[i])){
               w.print(a[i]+" ");
           }
        }
        w.close();
    }
}
