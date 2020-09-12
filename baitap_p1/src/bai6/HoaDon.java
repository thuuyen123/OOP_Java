package bai6;

import java.time.LocalDate;
import java.util.List;

public class HoaDon {
    private int maHD;
    private NhanVienBanHang nvbh;
    private KhachHang khachHang;
    private List<MatHang> listmh;
    private double tong;
    private LocalDate ngaymua;

    public HoaDon() {
    }

    public HoaDon(int maHD, NhanVienBanHang nvbh, KhachHang khachHang, List<MatHang> listmh,
                  double tong, LocalDate ngaymua) {
        this.maHD = maHD;
        this.nvbh = nvbh;
        this.khachHang = khachHang;
        this.listmh = listmh;
        this.tong = tong;
        this.ngaymua = ngaymua;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public List<MatHang> getListmh() {
        return listmh;
    }

    public void setListmh(List<MatHang> listmh) {
        this.listmh = listmh;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }

    public LocalDate getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(LocalDate ngaymua) {
        this.ngaymua = ngaymua;
    }
}
