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
public class ThietBi implements Serializable{
    private int ma;
    private String ten, xuatx;
    private int nam;

    public ThietBi() {
    }

    public ThietBi(int ma, String ten, String xuatx, int nam) {
        this.ma = ma;
        this.ten = ten;
        this.xuatx = xuatx;
        this.nam = nam;
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

    public String getXuatx() {
        return xuatx;
    }

    public void setXuatx(String xuatx) {
        this.xuatx = xuatx;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,xuatx,nam
        };
    }
}
