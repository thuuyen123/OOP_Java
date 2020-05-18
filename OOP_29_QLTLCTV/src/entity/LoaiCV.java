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
public class LoaiCV implements Serializable{
    private int maCV;
    private String tenCV, kieuCV;
    private double muckp;

    public LoaiCV() {
    }

    public LoaiCV(int maCV, String tenCV, String kieuCV, double muckp) {
        this.maCV = maCV;
        this.tenCV = tenCV;
        this.kieuCV = kieuCV;
        this.muckp = muckp;
    }

    public int getMaCV() {
        return maCV;
    }

    public void setMaCV(int maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getKieuCV() {
        return kieuCV;
    }

    public void setKieuCV(String kieuCV) {
        this.kieuCV = kieuCV;
    }

    public double getMuckp() {
        return muckp;
    }

    public void setMuckp(double muckp) {
        this.muckp = muckp;
    }
    public Object[] toObjects(){
        return new Object[]{
            maCV, tenCV,kieuCV,muckp
        };
    }
}
