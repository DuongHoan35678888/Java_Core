package BaiTapKeThuaAbstract;

public class MayBay extends PhuongTienDiChuyen{
    private String tenLoaiNhienLieu;

    public MayBay(String tenLoaiPhuongTien, HangSanXuat hangSanXuat, String tenLoaiNhienLieu) {
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
        return 500;
    }
    public void catCanh() {
        System.out.println("Cat Canh");
    }
    public void haCanh() {
        System.out.println("Ha Canh");
    }

}
