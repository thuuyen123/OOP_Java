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
    private String sdtnv;

    public PhoneNumber() {
    }

    public PhoneNumber(int mavung, String sdtnv) {
        this.mavung = mavung;
        this.sdtnv = sdtnv;
    }

    public int getMavung() {
        return mavung;
    }

    public void setMavung(int mavung) {
        this.mavung = mavung;
    }

    public String getSdtnv() {
        return sdtnv;
    }

    public void setSdtnv(String sdtnv) {
        this.sdtnv = sdtnv;
    }
    
    public void display(){
        System.out.println(mavung+"-"+sdtnv); 
    }
}
