/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q2;

/**
 *
 * @author Thu Uyên
 */
public class PTGT {
    private String hangsx;
    private int namsx;
    private double giaban;
    private String mau;

    public PTGT() {
    }
    
    public PTGT(String hangsx, int namsx, String mau, double giaban) {
        this.hangsx = hangsx;
        this.namsx = namsx;
        this.mau = mau;
        this.giaban = giaban;

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

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String toString(){
        return hangsx+"\t"+namsx+"\t"+mau+"\t"+giaban;
    }
}
