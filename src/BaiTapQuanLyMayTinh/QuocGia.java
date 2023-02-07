package BaiTapQuanLyMayTinh;

public class QuocGia {
    private String maQuocGia, tenQuocGia;

    public QuocGia(String tenQuocGia, String maQuocGia) {
        this.tenQuocGia = tenQuocGia;
        this.maQuocGia = maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }
}
