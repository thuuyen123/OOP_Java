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
public class KhachHang implements Serializable{
    private int ma;
    private String ten, diac;
    private String loai;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String diac, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.diac = diac;
        this.loai = loai;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    public Object[] toObjects(){
        return  new Object[]{
            ma,ten,diac,loai
        };
    }
}
