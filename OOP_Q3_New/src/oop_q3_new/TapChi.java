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
public class TapChi extends TaiLieu{
    private int soPh, thangPh;

    public TapChi() {
    }

    public TapChi( String ma, String tenNxb, int sobph,int soPh, int thangPh) {
        super(ma, tenNxb, sobph);
        this.soPh = soPh;
        this.thangPh = thangPh;
    }

    public int getSoPh() {
        return soPh;
    }

    public void setSoPh(int soPh) {
        this.soPh = soPh;
    }

    public int getThangPh() {
        return thangPh;
    }

    public void setThangPh(int thangPh) {
        this.thangPh = thangPh;
    }
    public String toString(){
        return super.toString()+"\t"+soPh+"\t"+thangPh;
    }
    
}
