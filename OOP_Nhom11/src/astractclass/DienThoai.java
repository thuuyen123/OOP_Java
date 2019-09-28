
package astractclass;


public class DienThoai {
    //seri (2 chữ, 3 số) không trùng,tên, hãng, giá
    private String seri,ten,hang;
    private double gia;

    public DienThoai() {
    }

    public DienThoai(String seri, String ten, 
            String hang, double gia) {
        this.seri = seri;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
     public String toString(){
         return seri+"\t"+ten+"\t"+hang+"\t"+gia;
     }   
}
