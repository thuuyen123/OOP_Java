/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_1_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Thu Uyên
 */
public class MainDaySo {
    public static boolean tang(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]<a[i]) return false;
        }
        return true;
    }
    public static boolean giam(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]>a[i]) return false;
        }
        return true;
    }
    public static boolean ckeckSX(int[] a){
        if(tang(a)|| giam(a)) return true;
        return false;
    }
    public static void sapXepTangDan(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }
            
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] a,b;
        BufferedReader r = new BufferedReader(new FileReader("src/th4_1_1/input.txt"));
        String line = r.readLine();
        String[] s = line.split("\\s+");
        a = new int[s.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        line = r.readLine();
        s = line.split("\\s+");
        b = new int[s.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(s[i]);
        }
        r.close();
        PrintWriter w = new PrintWriter("src/th4_1_1/output.txt");
        if(ckeckSX(a)){
            w.println("Day thu nhat da duoc sap xep");
        }else{
            w.println("Day thu nhat chua duoc sap xep");
            w.println("Day thu nhat duoc sap xep lai nhu sau: ");
            sapXepTangDan(a);
            for (int i = 0; i < a.length; i++) {
                w.print(a[i] + " ");
                
            }
        }
        if(ckeckSX(b)){
            w.println("Day thu hai da duoc sap xep");
        }else{
            w.println("Day thu hai chua duoc sap xep");
            w.println("Day thu hai duoc sap xep lai nhu sau: ");
            sapXepTangDan(b);
            for (int i = 0; i < b.length; i++) {
                w.print(b[i] + " ");
                
            }
        }
        w.close();
    }
}
