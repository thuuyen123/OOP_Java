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
public class Sach extends TaiLieu{
    private String tenTg, tenS;
    private int soTr;

    public Sach() {
    }

    public Sach( String ma, String tenNxb, int sobph,String tenTg, String tenS, int soTr) {
        super(ma, tenNxb, sobph);
        this.tenTg = tenTg;
        this.tenS = tenS;
        this.soTr = soTr;
    }

    public String getTenTg() {
        return tenTg;
    }

    public void setTenTg(String tenTg) {
        this.tenTg = tenTg;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public int getSoTr() {
        return soTr;
    }

    public void setSoTr(int soTr) {
        this.soTr = soTr;
    }
    public String toString(){
        return super.toString()+"\t"+tenTg+"\t"+tenS+"\t"+soTr;
    }
    
}
