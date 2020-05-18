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
public class VitriThidau implements Serializable{
    private int ma;
    private String ten;
    private double mucthg;

    public VitriThidau() {
    }

    public VitriThidau(int ma, String ten, double mucthg) {
        this.ma = ma;
        this.ten = ten;
        this.mucthg = mucthg;
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

    public double getMucthg() {
        return mucthg;
    }

    public void setMucthg(double mucthg) {
        this.mucthg = mucthg;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,mucthg
        };
    }
}
