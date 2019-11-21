/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

/**
 *
 * @author mac
 */
public class SinhVien {
    private String maSV, hoTen;
    private int tuoi;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int tuoi, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public int getTuoi() {
        return tuoi;
    }
    
    public Object[] toObject(){
        return new Object[]{
            maSV, hoTen, tuoi, diem
        };
    }
    
}
