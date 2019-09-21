/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q2;

/**
 *
 * @author Thu Uyên
 */
public class XeMay extends PTGT{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(String hangsx, int namsx, String mau, double giaban,int congSuat) {
        super(hangsx, namsx, mau, giaban);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public String toString(){
        return super.toString()+"\t"+congSuat;
    }
    
}
