/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q1_phone;

/**
 *
 * @author Thu Uyên
 */
public class PhoneNumber {
    private int mavung;
    private int sdtnv;

    public PhoneNumber() {
    }

    public PhoneNumber(int mavung, int sdtnv) {
        this.mavung = mavung;
        this.sdtnv = sdtnv;
    }

    public int getMavung() {
        return mavung;
    }

    public void setMavung(int mavung) {
        this.mavung = mavung;
    }

    public int getSdtnv() {
        return sdtnv;
    }

    public void setSdtnv(int sdtnv) {
        this.sdtnv = sdtnv;
    }
    public String toString(){
        //return "0"+mavung+"-"+sdtnv;
        return mavung+"-"+sdtnv;
    }
}
