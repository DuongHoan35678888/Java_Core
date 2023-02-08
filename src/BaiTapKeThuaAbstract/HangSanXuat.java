package BaiTapKeThuaAbstract;

public class HangSanXuat {
    private String hangSanXuat, tenQuocGia;

    public HangSanXuat(String hangSanXuat, String tenQuocGia) {
        this.hangSanXuat = hangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
