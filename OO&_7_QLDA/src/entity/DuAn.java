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
public class DuAn implements Serializable{
    private int ma;
    private String ten,kieu;
    private double kphi;

    public DuAn() {
    }

    public DuAn(int ma, String ten, String kieu, double kphi) {
        this.ma = ma;
        this.ten = ten;
        this.kieu = kieu;
        this.kphi = kphi;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public double getKphi() {
        return kphi;
    }

    public void setKphi(double kphi) {
        this.kphi = kphi;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,kieu,kphi
        };
    }
}
