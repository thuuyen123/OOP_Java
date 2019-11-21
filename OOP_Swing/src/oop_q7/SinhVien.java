/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q7;

/**
 *
 * @author Thu Uyên
 */
public class SinhVien {
    private String maSV;
    private String hoten;
    private int tuoi;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoten, int tuoi, double diem) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public Object[] toObject(){
        return new Object[]{
            maSV, hoten,tuoi,diem
        };
    }
}
