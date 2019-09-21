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
public class XeTai extends PTGT{
    private int trongTai;

    public XeTai() {
    }

    public XeTai(String hangsx, int namsx, String mau, double giaban,int trongTai) {
        super(hangsx, namsx, mau, giaban);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
    public String toString(){
        return super.toString()+"\t"+trongTai;
    }
}
