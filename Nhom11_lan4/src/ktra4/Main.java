/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra4;
import java.io.BufferedReader; //doc bo dem
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
    public  static boolean tang(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]<a[i]) return false;
        }
        return true;
    }
    public  static boolean gian(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]>a[i]) return false;
        }
        return true;
    }
    private static boolean check(int[] a){
        if(tang(a) || gian(a)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a,b;
        try {
            BufferedReader fr = new BufferedReader(new FileReader("src/ktra4/in.txt"));//doc dl tu file in.txt
            String line = fr.readLine();//đọc 1 dòng của văn bản
            String[] s = line.split("\\s+");
            a = new int[s.length];
            b = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                a[i]=Integer.parseInt(s[i]);
                
            }
            line = fr.readLine();
            s =line.split("\\s+");
            for (int i = 0; i < s.length; i++) {
                b[i]=Integer.parseInt(s[i]);
            }
              fr.close();
              PrintWriter w = new PrintWriter("src/ktra4/out.txt");//viet vao out.txt
              if(check(a)){//check xem co phai day duoc sap xep ko
                  w.println("Day so thu nhat da sap xep");
              }
              else{
                  w.println("Day so thu nhat chua sap xep");
              }
              if(check(b)){
                  w.println("Day so thu hai da sap xep");
              }
              else{
                  w.println("Day so thu hai chua sap xep");
              }
              w.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch (IOException ex) {
                System.out.println(ex);
         }
    }
}
