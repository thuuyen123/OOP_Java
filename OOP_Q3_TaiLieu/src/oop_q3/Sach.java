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
public class Sach extends TaiLieu implements CaiDai{
    private String tentg, tenS;
    private int strang;

    public Sach() {
    }

    public Sach( String maTaiLieu ,String tenS,String tentg,  String tenNhaXb,int strang, int soBanPhatHang) {
        super(maTaiLieu, tenNhaXb, soBanPhatHang);
        this.tenS = tenS;
        this.tentg = tentg;
        this.strang = strang;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public int getStrang() {
        return strang;
    }

    public void setStrang(int strang) {
        this.strang = strang;
    }

    public String toString() {
        return super.getMaTaiLieu()+"\t"+tenS+"\t"+tentg +"\t"+super.getTenNhaXb()+"\t"+strang+"\t"+super.getSoBanPhatHang();
    }
    @Override
    public String getTenNxb(){
        return null;
    }
    
}
