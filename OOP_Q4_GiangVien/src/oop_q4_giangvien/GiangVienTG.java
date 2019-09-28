package oop_q4_giangvien;


import oop_q4_giangvien.GiangVien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thu Uyên
 */
public class GiangVienTG extends GiangVien{
    private String coquanlv;

    public GiangVienTG() {
    }

    public GiangVienTG( String ma, String ten, String email, String hocham, String hocvi, String diachi, String sdt, int sogio, int heslg,String coquanlvsz) {
        super(ma, ten, email, hocham, hocvi, diachi, sdt, sogio, heslg);
        this.coquanlv = coquanlv;
    }

    public String getCoquanlv() {
        return coquanlv;
    }

    public void setCoquanlv(String coquanlv) {
        this.coquanlv = coquanlv;
    }
    
    public String toString(){
        return super.toString()+"\t"+coquanlv;
    }
}
