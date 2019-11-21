/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_nto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Thu Uyên
 */
public class Ngto {
    public static boolean checkNto(int n){
        if(n<2) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        try {
            int[] a;
            int dem =0;
            BufferedReader r = new BufferedReader(new FileReader("src/io_nto/in.txt"));
            String line = r.readLine();
            String[] s =line.split("\\s+");
            a = new int[s.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(s[i]);
            }
            r.close();
            PrintWriter w = new PrintWriter("src/io_nto/out.txt");
            for (int i = 0; i < s.length; i++) {
                if(checkNto(a[i])){
                    w.print(a[i]+" ");
                    dem++;
                }
            }
            if(dem==0) w.println("Khong co so nguyen to nao ca");
            w.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
