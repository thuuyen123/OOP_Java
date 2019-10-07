/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author Admin
 */
public class Sach extends TaiLieu {

    private String tentg, tens;
    private int strang;

    public Sach(String tentg, String tens, int strang) {
        this.tentg = tentg;
        this.tens = tens;
        this.strang = strang;
    }

    public Sach(String tentg, String tens, int strang, String ma, String tenNXB, int soBPH) {
        super(ma, tenNXB, soBPH);
        this.tentg = tentg;
        this.tens = tens;
        this.strang = strang;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getTens() {
        return tens;
    }

    public void setTens(String tens) {
        this.tens = tens;
    }

    public int getStrang() {
        return strang;
    }

    public void setStrang(int strang) {
        this.strang = strang;
    }
   
    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getTenNXB() + "\t" + super.getSoBPH() + "\t"
                + tentg + "\t" + tens + "\t" + strang;
    }
}
