package QuanLyBoPhim;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(2, 5, 2019);
        Ngay ngay2 = new Ngay(14, 2, 2023);
        Ngay ngay3 = new Ngay(21, 8, 2022);

        HangSanXuat hangSanXuat1 = new HangSanXuat("MEN", "Prance");
        HangSanXuat hangSanXuat2 = new HangSanXuat("PIPO", "Viet Nam");
        HangSanXuat hangSanXuat3 = new HangSanXuat("KING KONG", "American");

        BoPhim boPhim1 = new BoPhim("Bi mat", 2019, hangSanXuat1, 100000, ngay1);
        BoPhim boPhim2 = new BoPhim("Con Meo", 2021, hangSanXuat2, 115000, ngay2);
        BoPhim boPhim3 = new BoPhim("Qua bong vang", 2023, hangSanXuat3, 175000, ngay3);

        System.out.println("So sanh gia ve bo phim 1 va bo phim 2: " + boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println("So sanh gia ve bo phim 3 va bo phim 2: " + boPhim3.kiemTraGiaVeReHon(boPhim2));

        System.out.println("Hang san xuat bo phim 3: " + boPhim3.layTenHangSanXuat());
        System.out.println("Gia ve sau khi giam 10% cua bo phim 1 la: " + boPhim1.giaVeSauKhuyenMai(10));
        System.out.println("Gia ve sau khi giam 15% cua bo phim 2 la: " + boPhim2.giaVeSauKhuyenMai(15));
        System.out.println("Gia ve sau khi giam 30% cua bo phim 3 la: " + boPhim3.giaVeSauKhuyenMai(30));
    }
}
