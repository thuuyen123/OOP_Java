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
public class NhanVien implements Serializable {
    private int ma;
    private String hoten, diac, sdt;

    public NhanVien() {
    }

    public NhanVien(int ma, String hoten, String diac, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.diac = diac;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiac() {
        return diac;
    }

    public void setDiac(String diac) {
        this.diac = diac;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,hoten, diac, sdt
        };
    }
}
