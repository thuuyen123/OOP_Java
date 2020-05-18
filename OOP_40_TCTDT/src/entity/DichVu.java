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
    private String ten, nhom;
    double chip, giac;

    public DichVu() {
    }

    public DichVu(int ma, String ten, String nhom, double chip, double giac) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.chip = chip;
        this.giac = giac;
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

    public double getChip() {
        return chip;
    }

    public void setChip(double chip) {
        this.chip = chip;
    }

    public double getGiac() {
        return giac;
    }

    public void setGiac(double giac) {
        this.giac = giac;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma, ten,nhom,chip,giac
        };
    }
}
