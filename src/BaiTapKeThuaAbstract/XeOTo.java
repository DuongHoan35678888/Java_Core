package BaiTapKeThuaAbstract;

public class XeOTo extends PhuongTienDiChuyen{
    private String tenLoaiNhienLieu;

    public XeOTo(String tenLoaiPhuongTien, HangSanXuat hangSanXuat, String tenLoaiNhienLieu) {
        super(tenLoaiPhuongTien, hangSanXuat);
        this.tenLoaiNhienLieu = tenLoaiNhienLieu;
    }

    public String getTenLoaiNhienLieu() {
        return tenLoaiNhienLieu;
    }

    public void setTenLoaiNhienLieu(String tenLoaiNhienLieu) {
        this.tenLoaiNhienLieu = tenLoaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 60;
    }
}
