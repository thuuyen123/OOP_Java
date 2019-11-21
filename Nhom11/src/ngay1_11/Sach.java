/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1_11;

/**
 *
 * @author Thu Uyên
 */
public class Sach {
    private String maS, tenS;
    private Double giaS;

    public Sach() {
    }

    public Sach(String maS, String tenS, Double giaS) {
        this.maS = maS;
        this.tenS = tenS;
        this.giaS = giaS;
    }

    public String getMaS() {
        return maS;
    }

    public void setMaS(String maS) {
        this.maS = maS;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public Double getGiaS() {
        return giaS;
    }

    public void setGiaS(Double giaS) {
        this.giaS = giaS;
    }
    public Object[] toObjects(){
        return new Object[]{
            maS, tenS, giaS
        };
    }
}
