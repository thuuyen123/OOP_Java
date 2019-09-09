/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_15_menu_chuanhoa;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Thu Uyên
 */
public class HotenModel {
     HoTen str = new HoTen();
    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập họ tên: ");
        str.setName(sc.nextLine());
        sc.nextLine();
    }
//    public void display(){
//        System.out.println("Họ và Tên : "+str.getName());
//    }  
     public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
    public String chuanHoaDanhTuRieng(String str){
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i < temp.length -1)
                str += " ";
        }
        return str;
    }
    public void countTu(){
        StringTokenizer token = new StringTokenizer(str.getName()); 
        System.out.println("Số từ của tên : "+token.countTokens());
    }
}
