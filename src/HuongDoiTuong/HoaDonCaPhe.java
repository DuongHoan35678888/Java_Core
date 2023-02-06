package HuongDoiTuong;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaBan1Kg;
    private double khoiLuong;

    public HoaDonCaPhe(String tenLoaiCaPhe, double giaBan1Kg, double khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaBan1Kg = giaBan1Kg;
        this.khoiLuong = khoiLuong;
    }
    public double tinhTongTien(){
        return this.giaBan1Kg * this.khoiLuong;
    }

    public boolean kiemTraKhoiLuong(double khoiLuong){
        return this.khoiLuong > khoiLuong;
    }

    public boolean kiemTraTinhTongTienLonHon500K(){
        return this.tinhTongTien() > 500000;
    }

    public double giamGia(double x){
        if (this.tinhTongTien() > 500000){
            return (x/100)*this.tinhTongTien();
        }else {
            return 0;
        }
    }

    public double tongTienSauGiamGia(double x){
        return this.tinhTongTien() - this.giamGia(x);
    }
}
