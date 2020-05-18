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
public class SinhVien  implements Serializable{
    private int ma;
    private String hoten, diac, ngsinh, lop;

    public SinhVien() {
    }

    public SinhVien(int ma, String hoten, String diac, String ngsinh, String lop) {
        this.ma = ma;
        this.hoten = hoten;
        this.diac = diac;
        this.ngsinh = ngsinh;
        this.lop = lop;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiac() {
        return diac;
    }

    public void setDiac(String diac) {
        this.diac = diac;
    }

    public String getNgsinh() {
        return ngsinh;
    }

    public void setNgsinh(String ngsinh) {
        this.ngsinh = ngsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,hoten,diac,ngsinh,lop
        };
    }
}
