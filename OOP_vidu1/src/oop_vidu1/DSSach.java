/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_vidu1;

import java.util.Scanner;

/*
    Mỗi sách(Sach) cần quản lý mã sách(2chữ 4 số

*/
/**
 *
 * @author Thu Uyên
 */
public class DSSach {
    private Sach[] ds;
    private int n;
    public DSSach(int n){
        n=0;
        ds = new Sach[100];
    }

    DSSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        String ma;
        while(true){
            System.out.print("Nhập mã: ");
            ma = sc.nextLine();
            ma =ma.toUpperCase();
            if(ma.matches("[A-Z}{2}\\d{4}\\d{3}$")) break;
        }
        System.out.print("Nhập tên: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhập năm: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá: ");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.print("Ngoại ngữ true or false: ");
        boolean nngu = Boolean.parseBoolean(sc.nextLine());
        ds[n++] = new Sach(ma, tenSach, nam, soluong, gia, nngu);
    }
    public void vietDS(){
        System.out.println("Ma\t Ten Sach nam\t gia ");
        for (int i = 0; i < n; i++) {
            ds[i].toString();
        }
    }
}
