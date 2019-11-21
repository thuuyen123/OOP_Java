/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De2;

/**
 *
 * @author Admin
 */
public class Sach {
    private String ma,ten,tacgia,chuyennganh;
    private int nam,soluong;

    public Sach() {
    }

    public Sach(String ma, String ten, String tacgia, String chuyennganh, int nam, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.tacgia = tacgia;
        this.chuyennganh = chuyennganh;
        this.nam = nam;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,tacgia,chuyennganh,nam,soluong
        };
    }
}
