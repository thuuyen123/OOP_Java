package bai6;

import java.time.LocalDate;

public class NhanVienBanHang {
    private int idNVBH;
    private String gt;
    private LocalDate ngaylv;
    private String cadk;

    public NhanVienBanHang(int idNVBH, String gt, LocalDate ngaylv, String cadk) {
        this.idNVBH = idNVBH;
        this.gt = gt;
        this.ngaylv = ngaylv;
        this.cadk = cadk;
    }

    public NhanVienBanHang() {
    }

    public int getIdNVBH() {
        return idNVBH;
    }

    public void setIdNVBH(int idNVBH) {
        this.idNVBH = idNVBH;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public LocalDate getNgaylv() {
        return ngaylv;
    }

    public void setNgaylv(LocalDate ngaylv) {
        this.ngaylv = ngaylv;
    }

    public String getCadk() {
        return cadk;
    }

    public void setCadk(String cadk) {
        this.cadk = cadk;
    }
}
