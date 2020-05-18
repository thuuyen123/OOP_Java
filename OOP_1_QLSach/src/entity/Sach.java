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
public class Sach implements Serializable{
    private String ten, tgia, cnganh;
    private int ma, nsx, solg;

    public Sach() {
    }

    public Sach(int ma,String ten, String tgia, String cnganh,  int nsx, int solg) {
        this.ten = ten;
        this.tgia = tgia;
        this.cnganh = cnganh;
        this.ma = ma;
        this.nsx = nsx;
        this.solg = solg;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public String getCnganh() {
        return cnganh;
    }

    public void setCnganh(String cnganh) {
        this.cnganh = cnganh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getNsx() {
        return nsx;
    }

    public void setNsx(int nsx) {
        this.nsx = nsx;
    }

    public int getSolg() {
        return solg;
    }

    public void setSolg(int solg) {
        this.solg = solg;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, tgia,cnganh,nsx,solg
        };
    }
}
