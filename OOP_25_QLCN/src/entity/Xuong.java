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
public class Xuong implements Serializable{
    private int ma;
    private String ten, mota;
    private int hes;

    public Xuong() {
    }

    public Xuong(int ma, String ten, String mota, int hes) {
        this.ma = ma;
        this.ten = ten;
        this.mota = mota;
        this.hes = hes;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHes() {
        return hes;
    }

    public void setHes(int hes) {
        this.hes = hes;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma, ten,mota,hes
        };
    }
}
