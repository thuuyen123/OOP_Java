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
public class OTo extends PTGT{
    private String kieuDongco;
    private int soChoNgoi;

    public OTo() {
    }

    public OTo(String hangsx, int namsx, String mau, double giaban,String kieuDongco, int soChoNgoi) {
        super(hangsx, namsx, mau, giaban);
        this.kieuDongco = kieuDongco;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongco() {
        return kieuDongco;
    }

    public void setKieuDongco(String kieuDongco) {
        this.kieuDongco = kieuDongco;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    public String toString(){
        return super.toString()+"\t"+kieuDongco+"\t"+soChoNgoi;
    }
    
}
