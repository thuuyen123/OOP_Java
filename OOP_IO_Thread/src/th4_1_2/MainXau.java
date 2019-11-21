/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_1_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Thu Uyên
 */
public class MainXau {
    public static float dienTichHT(int r){
        float s = (float) (Math.PI * r *r);
        return s;
    }
    public static float theTichHC(int r){
        float v = (float) (4/3 *Math.PI * r *r*r);
        return v;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        BufferedReader rd = new BufferedReader(new FileReader("src/th4_1_2/input.txt"));
        String line = rd.readLine();
        String[] s = line.split("\\s+");
        int sum = s.length;
        line =rd.readLine();
        String bk = line.trim();
        int r;
        r = Integer.parseInt(bk);
        rd.close();
        PrintWriter w = new PrintWriter("src/th4_1_2/output.txt");
        w.println("So tu trong xau: "+sum);
        w.println("Dien tich hình tròn là: " +dienTichHT(r));
        w.println("Thể tích hình cầu là: "+theTichHC(r));
        w.close();
        
    }
}
