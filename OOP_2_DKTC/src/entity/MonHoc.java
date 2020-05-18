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
public class MonHoc implements Serializable{
    private int maM, tongST;
    private String tenM, loaiM;

    public MonHoc() {
    }

    public MonHoc(int maM,  String tenM,int tongST, String loaiM) {
        this.maM = maM;
        this.tongST = tongST;
        this.tenM = tenM;
        this.loaiM = loaiM;
    }

    public int getMaM() {
        return maM;
    }

    public void setMaM(int maM) {
        this.maM = maM;
    }

    public int getTongST() {
        return tongST;
    }

    public void setTongST(int tongST) {
        this.tongST = tongST;
    }

    public String getTenM() {
        return tenM;
    }

    public void setTenM(String tenM) {
        this.tenM = tenM;
    }

    public String getLoaiM() {
        return loaiM;
    }

    public void setLoaiM(String loaiM) {
        this.loaiM = loaiM;
    }
    public Object[] toObject(){
        return new Object[]{
            maM, tenM, tongST, loaiM
        };
    }
}
