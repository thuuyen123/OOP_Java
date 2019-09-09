/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_15_menu_chuanhoa;

/**
 *
 * @author Thu Uyên
 */
public class DoanVB {
    private String doan;

    public DoanVB() {
    }

    public DoanVB(String doan) {
        this.doan = doan;
    }

    public String getDoan() {
        return doan;
    }

    public void setDoan(String doan) {
        this.doan = doan;
    }

    @Override
    public String toString() {
        return "DoanVB{" + "doan=" + doan + '}';
    }

    
}
