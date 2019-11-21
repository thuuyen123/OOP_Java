
package iodemo;
import java.io.Serializable;

public class Sach implements Serializable{
   private String ma,ten;
   private int sluong;
   private double gia;

    public Sach() {
    }

    public Sach(String ma, String ten, int sluong, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.sluong = sluong;
        this.gia = gia;
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

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
   public Object[] toObject(){
       return new Object[]{
          ma,ten,sluong,gia
       };
   }
}
