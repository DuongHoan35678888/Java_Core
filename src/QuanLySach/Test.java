package QuanLySach;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(6,2,2023);
        Ngay ngay2 = new Ngay(5,2,2022);
        Ngay ngay3 = new Ngay(6,2,2021);

        TacGia tacGia1 = new TacGia("Duong Hoan", ngay1);
        TacGia tacGia2 = new TacGia("Le Phong", ngay2);
        TacGia tacGia3 = new TacGia("Quoc Trung", ngay3);

        Sach sach1 = new Sach("Lap trinh Java", 1500, 2019, tacGia1);
        Sach sach2 = new Sach("Lap trinh C", 2000, 2016, tacGia2);
        Sach sach3 = new Sach("Lap trinh Python", 1800, 2016, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("So sanh NXB sach 1 va sach 3: " + sach1.kiemTraNamXuatBan(sach3));
        System.out.println("So sanh NXB sach 2 va sach 3: " + sach2.kiemTraNamXuatBan(sach3));

        System.out.println("Gia sau khi sach 1 giam 10% la: " + sach1.giaSauKhiGiam(10));
        System.out.println("Gia sau khi sach 2 giam 15% la: " + sach2.giaSauKhiGiam(15));
        System.out.println("Gia sau khi sach 3 giam 20% la: " + sach3.giaSauKhiGiam(20));
    }
}
