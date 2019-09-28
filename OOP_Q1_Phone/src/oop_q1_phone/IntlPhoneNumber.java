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
    private int maqg;

    public IntlPhoneNumber() {
    }

    public IntlPhoneNumber(int maqg, int mavung, int sdtnv) {
        super(mavung, sdtnv);
        this.maqg = maqg;
    }

    public int getMaqg() {
        return maqg;
    }

    public void setMaqg(int maqg) {
        this.maqg = maqg;
    }
    public String toString(){
        return maqg+"-"+super.toString();
    }
}
