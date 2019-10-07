/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_new;

/**
 *
 * @author Thu Uyên
 */
public class PhuongTien {
    private String hangsx;
    private int namsx;
    private double gia;
    private String mau;

    public PhuongTien() {
    }

    public PhuongTien(String hangsx, int namsx, double gia, String mau) {
        this.hangsx = hangsx;
        this.namsx = namsx;
        this.gia = gia;
        this.mau = mau;
    }
    
    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
    public String toString(){
        return hangsx+"\t"+namsx+"\t"+gia+"\t"+mau;
    }
}
