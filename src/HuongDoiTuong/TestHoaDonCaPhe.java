package HuongDoiTuong;

public class TestHoaDonCaPhe {
    public static void main(String[] args) {

        HoaDonCaPhe hoaDonCaPhe = new HoaDonCaPhe("Trung Nguyen", 100000, 2.5);
        HoaDonCaPhe hoaDonCaPhe1 = new HoaDonCaPhe("Trung Nguyen", 100000, 10);

        System.out.println("Tong tien = " + hoaDonCaPhe.tinhTongTien());
        System.out.println("Kiem tra khoi luong > 2Kg: " + hoaDonCaPhe.kiemTraKhoiLuong(2));
        System.out.println("Tong tien > 500000K: " + hoaDonCaPhe.kiemTraTinhTongTienLonHon500K());
        System.out.println("So tien giam gia = " + hoaDonCaPhe1.giamGia(5));
        System.out.println("Gia tien sau khi giam gia la: " + hoaDonCaPhe1.tongTienSauGiamGia(5));
    }
}
