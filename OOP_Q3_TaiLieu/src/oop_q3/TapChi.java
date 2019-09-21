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
public class TapChi extends TaiLieu{
    private int soph, thang;

    public TapChi() {
        super();
    }

    public TapChi( String maTaiLieu, String tenNhaXb, int soBanPhatHang,int soph, int thang) {
        super(maTaiLieu, tenNhaXb, soBanPhatHang);
        this.soph = soph;
        this.thang = thang;
    }

    public int getSoph() {
        return soph;
    }

    public void setSoph(int soph) {
        this.soph = soph;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }
    
    public String toString(){
        return super.toString() +"\t"+soph+"\t"+thang;
    }
}
