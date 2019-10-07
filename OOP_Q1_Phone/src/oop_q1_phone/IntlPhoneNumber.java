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
public class IntlPhoneNumber extends PhoneNumber{
    private String maqg;

    public IntlPhoneNumber() {
    }
     public IntlPhoneNumber(String maqg) {
         this.maqg = maqg;
     }
    
    public IntlPhoneNumber(String maqg, int mavung, String sdtnv) {
        super(mavung, sdtnv);
        this.maqg = maqg;
    }

    public String getMaqg() {
        return maqg;
    }

    public void setMaqg(String maqg) {
        this.maqg = maqg;
    }

    @Override
    public void display() {
        System.out.println(maqg +"-"+super.getMavung()+"-"+super.getSdtnv());
    }
    
}