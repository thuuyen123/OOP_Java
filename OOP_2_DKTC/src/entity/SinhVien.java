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
public class SinhVien implements Serializable{
    private int maSV;
    private String hoten, diachi, sdt;

    public SinhVien() {
    }

    
    public SinhVien(int maSV, String hoten, String diachi, String sdt) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Object[] toObject(){
        return new Object[]{
            maSV, hoten,diachi,sdt
        };
    }
    
}
