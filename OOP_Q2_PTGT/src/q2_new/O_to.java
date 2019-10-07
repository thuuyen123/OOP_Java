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
public class O_to extends PhuongTien{
    private String kieudc;
    private int socn;

    public O_to() {
    }

    public O_to( String hangsx, int namsx, double gia, String mau,String kieudc, int socn) {
        super(hangsx, namsx, gia, mau);
        this.kieudc = kieudc;
        this.socn = socn;
    }

    public String getKieudc() {
        return kieudc;
    }

    public void setKieudc(String kieudc) {
        this.kieudc = kieudc;
    }

    public int getSocn() {
        return socn;
    }

    public void setSocn(int socn) {
        this.socn = socn;
    }
    public String toString(){
        return super.getHangsx()+"\t"+super.getNamsx()+"\t"+super.getGia()+"\t"+super.getMau()+"\t"+kieudc+"\t"+socn;
    }
}
