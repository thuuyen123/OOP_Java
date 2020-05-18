/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Thu Uyên
 */
public class MatHang  implements Serializable{
    private int ma;
    private String ten;
    private String nhom;
    private double gia;

    public MatHang() {
    }

    public MatHang(int ma, String ten, String nhom, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,nhom,gia
        };
    }
}
