/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q3;

/**
 *
 * @author Thu Uyên
 */
public class TaiLieu {
    private String maTaiLieu, tenNhaXb;
    private int soBanPhatHang;
    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNhaXb, int soBanPhatHang) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXb = tenNhaXb;
        this.soBanPhatHang = soBanPhatHang;
    }

    
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXb() {
        return tenNhaXb;
    }

    public void setTenNhaXb(String tenNhaXb) {
        this.tenNhaXb = tenNhaXb;
    }

    public int getSoBanPhatHang() {
        return soBanPhatHang;
    }

    public void setSoBanPhatHang(int soBanPhatHang) {
        this.soBanPhatHang = soBanPhatHang;
    }
    @Override
    public String toString() {
        return "TaiLieu{" + "maTaiLieu=" + maTaiLieu + ", tenNhaXb=" + tenNhaXb + ", soBanPhatHang=" + soBanPhatHang + '}';
    }

}
