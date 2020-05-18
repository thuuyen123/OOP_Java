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
public class DichVu implements Serializable{
    private int ma;
    private String ten;
    private double gia;
    private String donv;

    public DichVu() {
    }

    public DichVu(int ma, String ten, double gia, String donv) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.donv = donv;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDonv() {
        return donv;
    }

    public void setDonv(String donv) {
        this.donv = donv;
    }
    public Object[] toObjects(){
        return  new Object[]{
            ma,ten,gia,donv
        };
    }
}
