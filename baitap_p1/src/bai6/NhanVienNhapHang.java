package bai6;

import java.time.LocalDate;

public class NhanVienNhapHang {
    private int maNVBH;
    private String gt;
    private LocalDate ngaylv;
    private int thamnien;

    public NhanVienNhapHang() {
    }

    public NhanVienNhapHang(int maNVBH, String gt, LocalDate ngaylv, int thamnien) {
        this.maNVBH = maNVBH;
        this.gt = gt;
        this.ngaylv = ngaylv;
        this.thamnien = thamnien;
    }

}
