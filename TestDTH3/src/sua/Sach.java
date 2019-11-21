/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sua;

/**
 *
 * @author Thu Uyên
 */
public class Sach {
    private String ma, ten, tgia, cnganh;
    private int nxb,slg;

    public Sach() {
    }

    public Sach(String ma, String ten, String tgia, String cnganh, int nxb, int slg) {
        this.ma = ma;
        this.ten = ten;
        this.tgia = tgia;
        this.cnganh = cnganh;
        this.nxb = nxb;
        this.slg = slg;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public int getNxb() {
        return nxb;
    }

    public void setNxb(int nxb) {
        this.nxb = nxb;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,tgia,cnganh,nxb,slg  
        };
    }
}
