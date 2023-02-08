package BaiTapKeThuaAbstract;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public String layTenHangSanxuat() {
        return this.hangSanXuat.getHangSanXuat();
    }
    public void khoiDong() {
        System.out.println("Khoi Dong...");
    }
    public void tangToc() {
        System.out.println("Tang Toc...");
    }
    public void dungLai() {
        System.out.println("Dung Lai...");
    }
    public abstract double layVanToc();
}
