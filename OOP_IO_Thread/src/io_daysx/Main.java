/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_daysx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thu Uyên
 */
public class Main {
    public static boolean tang(int[] s){
        for (int i = 0; i < s.length-1; i++) {
            if(s[i+1]<s[i]) return false;
        }
        return true;
    }
    public static boolean giam(int[] s){
        for (int i = 0; i < s.length-1; i++) {
            if(s[i+1]>s[i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        try {
            int[] a,b,c;
            
            BufferedReader r = new BufferedReader(new FileReader("src/io_daysx/in.txt"));
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
            line = r.readLine();
            s = line.split("\\s+");
            c = new int[s.length];
            for (int i = 0; i < c.length; i++) {
                c[i] = Integer.parseInt(s[i]);
            }
            r.close();
            PrintWriter w = new PrintWriter("src/io_daysx/out.txt" );
            if(tang(a)){
                w.println("Day thu nhat la day tang");
            }else if(giam(a)){
                w.println("Day thu nhat la day giam");
            }else{
                w.println("Day thu nhat la day ko duoc sap xep");
            }
            if(tang(b)){
                w.println("Day thu hai la day tang");
            }else if(giam(b)){
                w.println("Day thu hai la day giam");
            }else{
                w.println("Day thu hai la day ko duoc sap xep");
            }
            if(tang(c)){
                w.println("Day thu ba la day tang");
            }else if(giam(c)){
                w.println("Day thu ba la day giam");
            }else{
                w.println("Dãy thứ ba không được sắp xếp");
            }
            w.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
