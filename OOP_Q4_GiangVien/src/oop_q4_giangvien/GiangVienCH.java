package oop_q4_giangvien;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thu Uyên
 */
public class GiangVienCH extends GiangVien{
    private double luongTT; 
    private int sogioQD;

    public GiangVienCH() {
    }

    public GiangVienCH( String ma, String ten, String email, 
            String hocham, String hocvi, String diachi, String sdt, 
            int sogio, int heslg,double luongTT, int sogioQD) {
        super(ma, ten, email, hocham, hocvi, diachi, sdt, sogio, heslg);
        this.luongTT = luongTT;
        this.sogioQD = sogioQD;
    }

    public double getLuongTT() {
        return luongTT;
    }

    public void setLuongTT(double luongTT) {
        this.luongTT = luongTT;
    }

    public int getSogioQD() {
        return sogioQD;
    }

    public void setSogioQD(int sogioQD) {
        this.sogioQD = sogioQD;
    }
     public String toString(){
        return super.toString()+"\t"+luongTT+"\t"+sogioQD;
    }
}
