/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrantest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class Matran {

    public static void main(String[] args) {
        String filein = "src/Matrantest/input.txt";

        try {

            BufferedReader br = new BufferedReader(new FileReader(filein));
            String line = br.readLine();
            String[] s = line.split("\\s+");

            int m = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);

            int[][] a = new int[m][n];
            int[][] b = new int[m][n];

//            
            for (int i = 0; i < m; i++) {
                line = br.readLine();
                s = line.split("\\s+");
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }

            }
            for (int i = 0; i < m; i++) {
                line = br.readLine();
                s = line.split("\\s+");
                for (int j = 0; j < n; j++) {
                    b[i][j] = Integer.parseInt(s[j]);
                }

            }
            br.close();
            PrintWriter w = new PrintWriter("src/Matrantest/output.txt");
            w.print(m + " " + n + "\n");

            int[][]c=new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j]=a[i][j]+b[i][j];
                    w.print(c[i][j] + " ");
                }
                w.print("\n");

            }
//             for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    w.print(b[i][j] + " ");
//                }
//                w.print("\n");
//
//            }
            w.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
