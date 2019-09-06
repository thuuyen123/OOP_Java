/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_vidu1;

/**
 *
 * @author Thu Uyên
 */
public class Sach {
    private String ma, tenSach;
    private int nam, soluong;
    private boolean nngu;
    private double gia;

    public Sach() {
    }

    public Sach(String ma, String tenSach, int nam, int soluong, double gia, boolean nngu) {
        this.ma = ma;
        this.tenSach = tenSach;
        this.nam = nam;
        this.soluong = soluong;
        this.nngu = nngu;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
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

    public boolean isNngu() {
        return nngu;
    }

    public void setNngu(boolean nngu) {
        this.nngu = nngu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public double getTien(){
        return (soluong*gia);
    }
    @Override
    public String toString(){
        return ma+"\t"+tenSach+"\t"+ nam+"\t"+ gia;
    }
    
    
}
