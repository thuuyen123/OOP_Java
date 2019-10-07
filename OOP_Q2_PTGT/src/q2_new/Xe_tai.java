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
public class Xe_tai extends PhuongTien{
    private int trongtai;

    public Xe_tai() {
    }

    public Xe_tai(String hangsx, int namsx, double gia, String mau,int trongtai) {
        super(hangsx, namsx, gia, mau);
        this.trongtai = trongtai;
    }

    public int getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(int trongtai) {
        this.trongtai = trongtai;
    }
    public String toString(){
        return super.getHangsx()+"\t"+super.getNamsx()+"\t"+super.getGia()+"\t"+super.getMau()+"\t"+trongtai;

    }
}
