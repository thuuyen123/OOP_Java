/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_new;

/**
 *
 * @author Thu Uyên
 */
public class Xe_may extends PhuongTien{
    private int congsuat;

    public Xe_may() {
    }

    public Xe_may( String hangsx, int namsx, double gia, String mau,int congsuat) {
        super(hangsx, namsx, gia, mau);
        this.congsuat = congsuat;
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }
    public String toString(){
        return super.getHangsx()+"\t"+super.getNamsx()+"\t"+super.getGia()+"\t"+super.getMau()+"\t"+congsuat;
    }
}
