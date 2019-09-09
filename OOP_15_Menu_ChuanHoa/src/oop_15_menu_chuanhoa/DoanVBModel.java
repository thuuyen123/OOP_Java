/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_15_menu_chuanhoa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Thu Uyên
 */
public class DoanVBModel {
    DoanVB d = new DoanVB();
    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập đoạn văn bản : ");
        d.setDoan(sc.nextLine());
    }
//    public void display(){
//        System.out.println("Đoạn văn: "+ d.getDoan());
//    }
   //Viết hoa ký tự đầu câu có dấu chấm câu

    private String toCapitalize(String para, char punctuation){
    //para là đoạn cần chuẩn hóa
    //punctuation dấu câu: . ? !
        boolean isCap = true;
        char c;    
        StringBuilder strb = new StringBuilder("");
        for (int i = 0; i < para.length()-1; i++) {
            c = para.charAt(i);
            if (c == punctuation) {
                isCap = true;
            }
            if (isCap && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                isCap = false;
            }
            strb.append(c);
        }
        return strb.toString();
    }

    public String normalText(String line) {
        String out = "";
        //dòng lệnh này có thể bỏ vì có tên riêng viết hoa
        line = line.toLowerCase();
        //mỗi từ cách 1 khoảng cách
        line = line.replaceAll("\\s+", " ");
        line = line.replaceAll("\\.", "\\. ");
        line = line.replaceAll(" \\.", "\\.");
        line = line.replaceAll("\\!", "\\! ");
        line = line.replaceAll(" \\!", "\\!");
        line = line.replaceAll("\\?", "\\? ");
        line = line.replaceAll(" \\?", "\\?");
        line = line.replaceAll(" \\,", "\\,");
        line = line.replaceAll("\\,", "\\, ");
        line = line.replaceAll("\\s+", " ");
        line = line.trim();
        out=line;
        out=toCapitalize(out,'.');
        out=toCapitalize(out, '!');
        out=toCapitalize(out, '?');
        if (out.charAt(out.length()-1) != '.') {
            out = out + ".";
        }
        return out;

    }
    public void countTuCau() throws FileNotFoundException, IOException{
        StringTokenizer token = new StringTokenizer(d.getDoan()); 
        System.out.println("Số từ của của đoan văn bản trên là : "+token.countTokens());
        BufferedReader reader = new BufferedReader(new FileReader(d.getDoan()));
        int sentenceCount = 0;
        String line;
        String delimiters = "?!.";

        while ((line = reader.readLine()) != null) { // Continue reading until end of file is reached
            for (int i = 0; i < line.length(); i++) {
                if (delimiters.indexOf(line.charAt(i)) != -1) { // If the delimiters string contains the character
                    sentenceCount++;
                }
            
            }
            reader.close();
            System.out.println("Số câu trong đoạn văn trên là:  " + sentenceCount);
        }
    }
}

