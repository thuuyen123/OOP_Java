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
public class CauThu implements Serializable{
    private int ma;
    private String hoten;
    private int tuoi;
    private double mucluog;

    public CauThu() {
    }

    public CauThu(int ma, String hoten, int tuoi, double mucluog) {
        this.ma = ma;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.mucluog = mucluog;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getMucluog() {
        return mucluog;
    }

    public void setMucluog(double mucluog) {
        this.mucluog = mucluog;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,hoten,tuoi,mucluog
        };
    }
}
