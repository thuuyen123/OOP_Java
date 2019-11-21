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
public class Sach implements Serializable{
    private int ma, nam, soluong;
    private String ten,tacGia, chuyenNganh;

    public Sach() {
    }

    public Sach(int ma, int nam, int soluong, String ten, String tacGia, String chuyenNganh) {
        this.ma = ma;
        this.nam = nam;
        this.soluong = soluong;
        this.ten = ten;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,tacGia,chuyenNganh,nam,soluong
        };
    }
}
