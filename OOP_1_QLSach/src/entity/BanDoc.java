/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Thu Uyên
 */
public class BanDoc implements Serializable{
    private String hoten, dchi, sodt;
    private int ma;

    public BanDoc() {
    }

    public BanDoc(int ma,String hoten, String dchi, String sodt) {
        this.ma = ma;
        this.hoten = hoten;
        this.dchi = dchi;
        this.sodt = sodt;
       
    }

    

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,hoten,dchi,sodt
        };
    }
}
