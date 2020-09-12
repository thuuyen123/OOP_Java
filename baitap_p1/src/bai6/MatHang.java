package bai6;

public class MatHang {
    private int idHH;
    private String tenHH;
    private String ploai;
    private double gia;

    public MatHang() {

    }

    public MatHang(int idHH, String tenHH, String ploai, double gia) {
        this.idHH = idHH;
        this.tenHH = tenHH;
        this.ploai = ploai;
        this.gia = gia;
    }

    public int getIdHH() {
        return idHH;
    }

    public void setIdHH(int idHH) {
        this.idHH = idHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public String getPloai() {
        return ploai;
    }

    public void setPloai(String ploai) {
        this.ploai = ploai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
