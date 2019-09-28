/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q1_phone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thu Uyên
 */
public class PhoneBook {
    private ArrayList<PhoneNumber> list;
    private Scanner sc;

    public PhoneBook() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void nhap(){
        PhoneNumber p = null;
        int mavung, sdtnv;
        System.out.println("Ma vung: ");
        while(true){
            mavung = Integer.parseInt(sc.nextLine());
            Integer n = mavung;
            int dem=0;
            while(n >=0){
                n /= 10;
                dem++;
            }
            if(dem == 3 || dem==4) break;
            System.out.println("Khong dung dinh dang!");
            System.out.println("Nhap lai ma vung: ");
        }
        System.out.println("So dien thoai noi vung: ");
        sdtnv = Integer.parseInt(sc.nextLine());
    }
    
    
}
