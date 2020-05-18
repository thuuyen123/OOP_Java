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
public class Phong implements Serializable{
    private int map;
    private String tenp,loaip;

    public Phong() {
    }

    public Phong(int map, String tenp, String loaip) {
        this.map = map;
        this.tenp = tenp;
        this.loaip = loaip;
    }

    public int getMap() {
        return map;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public String getTenp() {
        return tenp;
    }

    public void setTenp(String tenp) {
        this.tenp = tenp;
    }

    public String getLoaip() {
        return loaip;
    }

    public void setLoaip(String loaip) {
        this.loaip = loaip;
    }
    public Object[] toObjects(){
        return new Object[]{
            map, tenp, loaip
        };
    }
}
