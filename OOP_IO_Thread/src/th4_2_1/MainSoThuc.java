/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th4_2_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Thu Uyên
 */
public class MainSoThuc {
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        float a=0,b=0,c=0;
        BufferedReader r = new BufferedReader(new FileReader("src/th4_2_1/input.txt"));
        String line = r.readLine();
        String[] s = line.split("\\s+");
        
        for (int i = 0; i < s.length; i++) {
            a = Float.parseFloat(s[0]);
            b = Float.parseFloat(s[1]);
            c = Float.parseFloat(s[2]);
        }
        r.close();
        
        PrintWriter w = new PrintWriter("src/th4_2_1/output.txt");
        float sum =0;
        sum = a+b+c;
        w.println("Tong 3 so = "+sum);
        w.println("Phuong trinh bac hai: ");
        float delta = b*b - 4*a*c;
        if(delta<0) w.println("Vo nghiem ");
        else if(delta == 0){
            w.println("pT co nghiem kep x1=x2="+(-b/(2*a)));
        }
        else{
            w.println("PT co 2 nghiem phan biet x1="+(-b+Math.sqrt(delta))/(2*a)+
                    " x2= "+(-b-Math.sqrt(delta))/(2*a));
        }
        w.close();
    }
}
