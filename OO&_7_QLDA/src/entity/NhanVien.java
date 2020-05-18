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
public class NhanVien implements Serializable{
    private int ma;
    private String ten,diac, chuyenm;

    public NhanVien() {
    }

    public NhanVien(int ma, String ten, String diac, String chuyenm) {
        this.ma = ma;
        this.ten = ten;
        this.diac = diac;
        this.chuyenm = chuyenm;
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

    public String getDiac() {
        return diac;
    }

    public void setDiac(String diac) {
        this.diac = diac;
    }

    public String getChuyenm() {
        return chuyenm;
    }

    public void setChuyenm(String chuyenm) {
        this.chuyenm = chuyenm;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,diac,chuyenm
        };
    }
}
