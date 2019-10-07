/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q3_new;

/**
 *
 * @author Thu Uyên
 */
public class TaiLieu implements TinhAnPham{
    private String ma, tenNxb;
    private int sobph;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNxb, int sobph) {
        this.ma = ma;
        this.tenNxb = tenNxb;
        this.sobph = sobph;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
    }

    public int getSobph() {
        return sobph;
    }

    public void setSobph(int sobph) {
        this.sobph = sobph;
    }
    public String toString(){
        return ma+"\t"+tenNxb+"\t"+sobph;
    }

    @Override
    public int getSoAnPham() {
        return 0;
    }
}
