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
public class CongNhan implements Serializable{
    private int ma;
    private String ten, diac,sdt;
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int ma, String ten, String diac, String sdt, int bac) {
        this.ma = ma;
        this.ten = ten;
        this.diac = diac;
        this.sdt = sdt;
        this.bac = bac;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiac() {
        return diac;
    }

    public void setDiac(String diac) {
        this.diac = diac;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,diac,sdt,bac
        };
    }
}
