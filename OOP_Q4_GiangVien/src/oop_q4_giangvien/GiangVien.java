/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q4_giangvien;

/**
 *
 * @author Thu Uyên
 */
public class GiangVien {
    private String ma;
    private String ten, email, hocham, hocvi, diachi, sdt;
    private int sogio,heslg;

    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String email, String hocham, String hocvi, String diachi, String sdt, int sogio, int heslg) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.hocham = hocham;
        this.hocvi = hocvi;
        this.diachi = diachi;
        this.sdt = sdt;
        this.sogio = sogio;
        this.heslg = heslg;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocham() {
        return hocham;
    }

    public void setHocham(String hocham) {
        this.hocham = hocham;
    }

    public String getHocvi() {
        return hocvi;
    }

    public void setHocvi(String hocvi) {
        this.hocvi = hocvi;
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

    public int getSogio() {
        return sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }

    public int getHeslg() {
        return heslg;
    }

    public void setHeslg(int heslg) {
        this.heslg = heslg;
    }

    public String toString(){
        return ma+"\t"+ten+"\t"+email+"\t"+hocham+"\t"+hocvi+"\t"+diachi+"\t"+sdt+"\t"+sogio+"\t"+heslg;
    }
    
}
